package net.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService service;
	
	public UserController(UserService service) {
		super();
		this.service = service;
	}
	@GetMapping("v1/user")
	public List<User> list(){
		return service.listAll();
	}
	@GetMapping("v1/user/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id){
		try {
			User user= service.get(id);
			return new ResponseEntity<User>(user, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("v1/user")
	public void add(@RequestBody User user) {
		service.save(user);
	}
	
	
	
	
	@PutMapping("v1/user/{id}")
	public ResponseEntity<?> update(@RequestBody User user, @PathVariable Integer id) {
		try {
		User existUser = service.get(id);
		service.save(user);
		return new ResponseEntity<>(HttpStatus.OK);
		
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			
		}
	}
	
	@DeleteMapping("v1/user/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}
	
	
}

