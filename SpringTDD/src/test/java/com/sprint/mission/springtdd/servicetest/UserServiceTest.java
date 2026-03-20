package com.sprint.mission.springtdd.servicetest;

import static org.junit.jupiter.api.Assertions.*;

import com.sprint.mission.springtdd.service.UserService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

  private UserService userService;

  @BeforeEach
  void setUp() {
    System.out.println("BeforeEach 실행");
    userService = new UserService();
  }

  @AfterEach
  void tearDown() {
    System.out.println("AfterEach 실행");
  }

  @Test
  void createUser_shouldReturnName() {
    String result = userService.create("kim");

    assertEquals("kim", result);
    System.out.println("createUser_shouldReturnName 실행");
  }

  @Test
  void createUser_shouldNotReturnNull() {
    String result = userService.create("lee");

    assertNotNull(result);
    System.out.println("createUser_shouldNotReturnName 실행");
  }

}
