package com.example.validatingforminput;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PersonForm {

	@NotNull
	@Size(min=2, max=30)
	@Getter
	@Setter
	private String name;

	@NotNull
	@Min(18)
	@Getter
	@Setter
	private Integer age;

	
	@NotNull
	@NotBlank
	@Email
	@Getter
	@Setter
	private String email;
}
