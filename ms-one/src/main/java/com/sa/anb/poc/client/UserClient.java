package com.sa.anb.poc.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.sa.anb.poc.model.User;

@FeignClient(value = "${user.feign.client.value}", url = "${user.feign.client.url}")
public interface UserClient {

	@GetMapping(value = "")
	public List<User> getUsers();

	@GetMapping(value = "/{id}")
	public User getUserById(@PathVariable("id") String id);
	
	@PostMapping(value = "")
	public User createUser(User user);
	
	@PutMapping(value = "")
	public User updateUser(User user);
	
	@DeleteMapping(value = "/{id}")
	public void deleteUserById(@PathVariable("id") String id);
	
}
