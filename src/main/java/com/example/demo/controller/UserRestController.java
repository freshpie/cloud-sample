package com.example.demo.controller;

import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1")
@RestController
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    /**
     * User 상세 조회
     *
     * @return 사번
     */
    @GetMapping(value = "/user")
    public ResponseEntity<?> getUserId() {
        return ResponseEntity.ok(userService.getUser());
    }


}
