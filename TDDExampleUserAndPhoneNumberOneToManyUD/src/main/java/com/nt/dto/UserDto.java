package com.nt.dto;

import java.util.Set;

import org.hibernate.validator.constraints.NotBlank;

public class UserDto {
	@NotBlank(message = "Name must not be blank")
	private String name;
	private Integer age;
	private String address;
	private String email;
	private String password;
	private Set<PhoneNumberDto> phoneDto;

}
