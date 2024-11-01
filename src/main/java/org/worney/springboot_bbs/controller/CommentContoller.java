package org.worney.springboot_bbs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.worney.springboot_bbs.utill.ApiResponse;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/comment")
public class CommentContoller {
    
    @GetMapping("path")
        public ResponseEntity<Map<String,Object>>MethodName(@RequestParam String param) {
            //TODO: implement method
        return ApiResponse.of(false, HttpStatus.OK, null);
    }
    
}
