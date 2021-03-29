package net.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class LoginServiceImpl implements LoginService{
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	public LoginServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserDto registrationDto) {
		User user = new User(null,  registrationDto.getTckn(),  registrationDto.getEmail(),
				passwordEncoder.encode(registrationDto.getPassword()),registrationDto.getGsm(),registrationDto.getAddress());
		
		return userRepository.save(user);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		User user = userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("Kullanıcı adı ya da şifre girilmedi.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), null);		
	}
	
}
