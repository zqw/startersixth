package com.johney.fifth.endpoint;

import java.util.List;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.johney.fifth.service.ApiBaseService;




@RestController
public class ApiBaseEndpoint {
	
	@Autowired
	private ApiBaseService service;

	

	
	
	@GetMapping("/hello")
	public ResponseEntity<String> helloWorld() {
		return new ResponseEntity<>(service.hello(), HttpStatus.OK);
	}

	@GetMapping(path = "/date/now")
	@ResponseBody
	public String localDateNow() {
		return service.localDate();
	}

	

	

	

}
