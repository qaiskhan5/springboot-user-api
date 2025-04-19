package com.example.Practice1.serviceInterface;

import com.example.Practice1.dto.UserProfileDto;
import com.example.Practice1.dto.UserRegistrationDto;

public interface UserServiceInterface {
      
	void registerUser(UserRegistrationDto userRegistration);
	
	UserProfileDto getUserById(Long id);
}



/*package com.example.Stud.TeachWork.serviceInterface;

import com.example.Stud.TeachWork.DTO.UserProfileDto;
import com.example.Stud.TeachWork.DTO.UserRegistrationDto;

public interface UserServiceInterface {
	 void registerUser(UserRegistrationDto dto);

	    UserProfileDto getUserById(int id);

}*/