package com.rest.api.user;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserModel> getUsers() {
        return userService.getAllUsers();
    }
    
    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("mensaje", "Hola, conectado a Spring Boot");
    }
    
    @GetMapping("/welcome")
    public String welcome() {
		return "Welcome to Azure Spring Boot Application";
	}
}
