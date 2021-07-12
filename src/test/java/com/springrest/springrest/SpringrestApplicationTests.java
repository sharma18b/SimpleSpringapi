package com.springrest.springrest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.BDDMockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringrestApplicationTests {

	@Test
	void contextLoads() {
	}
	//@Mock
//	private RemoteService remoteService = new RemoteService();//
//
//	@Autowired
//	private Reverser reverser = new Reverser();
//
//	@Test
//	public void exampleTest() {
//		// RemoteService has been injected into the reverser bean
//		SpringrestApplicationTests mock;
//		when(mock.remoteService.someCall("mock")).willReturn("mock");
//		String reverse = reverser.reverseSomeCall("mock");
//		assertThat(reverse).isEqualTo("mock");
//	}

}
