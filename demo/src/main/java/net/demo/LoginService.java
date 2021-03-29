package net.demo;


import org.springframework.security.core.userdetails.UserDetailsService;


public interface LoginService extends UserDetailsService{
	User save(UserDto registrationDto);
}
