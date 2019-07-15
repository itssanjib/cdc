package com.gl.cdcproducer;

import org.junit.Before;

import com.gl.cdcproducer.controller.EmployeeController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

public class BaseTest {
	
	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(new EmployeeController());
	}

}
