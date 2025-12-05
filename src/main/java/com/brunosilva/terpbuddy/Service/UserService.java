package com.brunosilva.terpbuddy.Service;

import com.brunosilva.terpbuddy.Entities.User;
import com.brunosilva.terpbuddy.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    /*BUSINESS LOGIC CLASS */

    //Creating an instance of our repository to be able to interact with DB
    private final UserRepository userRepository;

    //Constructor
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Register a new user
    public User registerUser(User user){
        /* If user exists throw an error */
        if(user.getEmail() == null || userRepository.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        //Taking the user object and saving it to the database
        return userRepository.save(user);
    }

    //Finding the user by id
    public Optional<User> getUserById(Long id){
        if(userRepository.existsById(id)){
            return userRepository.findById(id);
        } else{
            return Optional.empty();
        }
    }

    // Update user profile fields (bio, major, etc.)
    public User updateUser(Long id, User updatedUser) {

        User updatingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        updatingUser.setName(updatedUser.getName());
        updatingUser.setMajor(updatedUser.getMajor());
        updatingUser.setYear(updatedUser.getYear());
        updatingUser.setBio(updatedUser.getBio());

        return userRepository.save(updatingUser);

    }


}
