package com.example.chatserver;

import com.example.chatserver.controller.ChatServerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;



@SpringBootTest
class ChatServerControllerTests {

	@Autowired
	private ChatServerController chatServerController;

	@Test
	void contextLoads() {
		assertNotNull(chatServerController);
	}

}
