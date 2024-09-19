package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    
    /**
     * 전체 User 목록 가져오기
     *
     * @return 사번
     */
    @Transactional(readOnly = true)
    public String getUser() {

        return "82023143";
    }
}
