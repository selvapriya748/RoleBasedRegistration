package com.SuccessHire.UserRegistrartion.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.SuccessHire.UserRegistrartion.Model.UserAdmin;

public interface UserRepository extends JpaRepository<UserAdmin, Long>{

	
}
