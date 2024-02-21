package com.SuccessHire.UserRegistrartion.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SuccessHire.UserRegistrartion.Model.LoginRequest;
import com.SuccessHire.UserRegistrartion.Model.UserAdmin;
import com.SuccessHire.UserRegistrartion.Service.UserAdminService;

@RestController
@RequestMapping
public class UserController {

	
	 @Autowired
	    private UserAdminService userService;

	    public UserController(UserAdminService userService) {
	        this.userService = userService;
	    }
	    
	    @PostMapping("/login")
	    public UserAdmin Login(LoginRequest login,UserAdmin user)
	    {
	    	return Login(login,user);
	    }

	    @GetMapping("/user")
	    public List<UserAdmin> getAllUsers(){
	        return userService.getAllUsers();
	    }

	    @GetMapping("user/{id}")
	    public Optional<UserAdmin> getById(@PathVariable Long id){
	        return userService.getById(id);
	    }
	    
	    @PostMapping("/createNewUser")
	  //  @PreAuthorize("hasAuthority('Admin','Hr')")
	    public UserAdmin addNewUser(@RequestBody UserAdmin user){
	        return userService.addNewUser(user);
	    }
	    
	    @PutMapping("/updateUser/{id}")
	   // @PreAuthorize("hasAuthority('Admin','Hr')")
	    public
	    ResponseEntity<UserAdmin> updateById(@PathVariable Long id, @RequestBody UserAdmin updateUser){
	    	UserAdmin updated = userService.updateById(id, updateUser);
	        return ResponseEntity.ok(updated);
	    }
	    
	    @DeleteMapping("/deleteUser/{id}")
	   // @PreAuthorize("hasAuthority('Admin','Hr')")
	    public void deleteById(@PathVariable Long id){
	    	userService.deleteById(id);
	        System.out.print("User deleted successfully .");
	    }
	}

