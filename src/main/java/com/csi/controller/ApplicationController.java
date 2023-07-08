package com.csi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.loading.PrivateClassLoader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/", method = RequestMethod.GET)
public class ApplicationController {

	@GetMapping

	private String sayHello() {

		return "Welcome To Fintech Credit System India ";

	}

	@GetMapping("/services")

	private String sayServices() {

		return "Credit System India Services";
	}

	@GetMapping("/addresses")

	private String sayAddress() {

		return "Inspiriaa Mall Pune";

	}

	@GetMapping("/listofemployeedata")

	private List<Employee> sayListofEmployeeData() {

		return Stream.of(new Employee(101, "Akshay", 65000.00), new Employee(102, "mahesh", 60000.00))
				.collect(Collectors.toList());
	}

}
