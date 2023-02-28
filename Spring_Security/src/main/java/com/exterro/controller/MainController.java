package com.exterro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exterro.model.User;

@RestController
public class MainController {

	@GetMapping("/getHomePage")
	public String getHome() {
		System.out.println("Call get home page....");
		return "index.html";
	}
	
	@GetMapping("/welcome")
	public String getWelcome() {
		System.out.println("Call welcome page by filter2....");
		return "Welcome page....";
	}

	@PostMapping("/welcome")
	public String userLogin(@RequestBody User info) {
		try {
			System.out.println("hello@!#!@#!@#!@@!");
			System.out.println("info is @#@!#!@# ---> " + info.getuName());
			//		JSONParser jsonparse = new JSONParser();
			//		JSONObject jsonobj = (JSONObject) jsonparse.parse(info);
			//		Object obj = jsonparse.parse(info);
			//		JSONArray jarray = new JSONArray();
			//		jarray.add(obj);
			//		for(int i = 0;i<jarray.size();i++) {
			//			JSONObject jobj = (JSONObject) jarray.get(i);
			//			System.out.println("Name!@#!@#!@"+jobj.get("name"));
			//			System.out.println("Pass#@$%@#%@$#%#$@"+jobj.get("pass"));
			//		}

			/*
			 * JSONArray jarray = new JSONArray(); jarray.add(pojoobj);
			 */

		} catch (Exception e) {
			System.out.println("Error!!!!" + e.getMessage());
		}

		return "welcome.html";
	}

}
