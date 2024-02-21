package com.SuccessHire.UserRegistrartion.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SuccessHire.UserRegistrartion.Model.LoginRequest;
import com.SuccessHire.UserRegistrartion.Model.UserAdmin;
import com.SuccessHire.UserRegistrartion.Repository.UserRepository;

@Service
public class UserAdminService {

	private UserRepository userRepository;
	
	public UserAdminService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public UserAdmin Login(LoginRequest login,UserAdmin user)
    {
    	login.setUsername(user.getUsername());
    	login.setPassword(user.getPassword());
    	login.setRolename(user.getRole());
    	return user;  
    }

	public List<UserAdmin> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserAdmin> getById(Long id) {
        return userRepository.findById(id) ;
    }

    public UserAdmin addNewUser(UserAdmin user) { 
        return userRepository.save(user);
    }

    public UserAdmin updateById(Long id, UserAdmin user) {
    	UserAdmin existingUser = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student ID not found ."));
    	existingUser.setUsername(user.getUsername());
    	existingUser.setPassword(user.getPassword());
    	existingUser.setEmail(user.getEmail());
    	existingUser.setEmail(user.getEmail());
    	
        return userRepository.save(existingUser);
    }

    public void deleteById(Long id) {
    	userRepository.deleteById(id);

    }
	
	
	
}
