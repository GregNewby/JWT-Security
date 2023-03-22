package com.cogent.security.helper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

	private @Getter String firstname;
	private @Getter String lastname;
	private @Getter String email;
	private @Getter String password;
	
}
