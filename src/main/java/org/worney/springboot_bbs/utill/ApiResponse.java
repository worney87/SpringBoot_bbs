package org.worney.springboot_bbs.utill;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ApiResponse {

    public static <T> ResponseEntity<Map<String, Object>> of(boolean success, HttpStatus status, Object data) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", success);
        response.put("status", status);
        if (data != null) {
            response.put("data", data);
        }
        return new ResponseEntity<>(response, status);
    }
}
