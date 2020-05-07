package com.occamsrazor.web.user;

import java.util.List;

import com.occamsrazor.web.util.Messenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired UserService userService;
	@Autowired User user;
	
	@PostMapping("")
	public Messenger post(@RequestBody User user) {
		userService.register(user);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("")
	public List<User> list(User user){
		return userService.findAll();
	}
	
	@GetMapping("/{userid}")
	public User detail(@PathVariable String userid){
		return userService.findOne(userid);
	}
	
	@PutMapping("/{userid}")
	public Messenger update(@RequestBody User user) {
		userService.modify(user);
		return Messenger.SUCCESS;
	}
	
	@DeleteMapping("/{userid}")
	public Messenger delete(@RequestBody User user) {
		userService.remove(user);
		return Messenger.SUCCESS;
	}
	
}