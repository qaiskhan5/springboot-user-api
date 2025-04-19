package com.example.Practice1.serviceImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Practice1.dto.UserProfileDto;
import com.example.Practice1.dto.UserRegistrationDto;
import com.example.Practice1.entity.User;
import com.example.Practice1.repository.UserRepository;
import com.example.Practice1.serviceInterface.UserServiceInterface;

@Service
public class UserServiceImplement implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void registerUser(UserRegistrationDto userRegistration) {
	    User user = new User();
	    user.setName(userRegistration.getName());
	    user.setEmail(userRegistration.getEmail());
	    user.setPassword(userRegistration.getPassword());
	    user.setContactNumber(userRegistration.getContactNumber());

	    // ✅ Save user to DB
	    userRepository.save(user);
	}

	@Override
	public UserProfileDto getUserById(Long id) {
		
		 User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		 return new UserProfileDto(user.getName(), user.getEmail());
	}
}



/*package com.example.Stud.TeachWork.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Stud.TeachWork.DTO.UserProfileDto;
import com.example.Stud.TeachWork.DTO.UserRegistrationDto;
import com.example.Stud.TeachWork.entities.User;
import com.example.Stud.TeachWork.repo.UserRepo;
import com.example.Stud.TeachWork.serviceInterface.UserServiceInterface;

@Service
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserRepo userRepo;

    @Override
    public void registerUser(UserRegistrationDto dto) {
        // Convert DTO to entity
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole("USER"); // Default role
        userRepo.save(user);
        
    }

    @Override
    public UserProfileDto getUserById(int id) {
        // Find user by ID
        User user = userRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        // Return data as UserProfileDto
        return new UserProfileDto(user.getName(), user.getEmail());
    }
}
*/