package com.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
	public static Logger logger = LoggerFactory.getLogger(UserTest.class);

	public void testUser() {
		logger.info("Test case executing");
		logger.info("Test case executing");
		
		logger.info("Test case for jenkins run");

		assertEquals(true, true);
	}
}
