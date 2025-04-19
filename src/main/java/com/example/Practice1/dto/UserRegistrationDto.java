package com.example.Practice1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {

	private String name;
	private String email;
	private String password;
	private String contactNumber;
}




/*package com.example.Stud.TeachWork.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {
	private String name ;
	private String email;
	private String password;

}*/