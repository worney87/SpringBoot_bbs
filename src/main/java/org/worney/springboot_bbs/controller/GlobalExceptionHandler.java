package org.worney.springboot_bbs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.worney.springboot_bbs.utill.ApplicationException;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(ApplicationException.class)
    public ModelAndView handleCustomException(ApplicationException ex, Model model) {
        ModelAndView mav = new ModelAndView("500");
        mav.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        model.addAttribute("errorMessage", ex.getMessage());
        return mav;
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ModelAndView handleValidationException(MethodArgumentNotValidException ex, Model model){
        ModelAndView mav = new ModelAndView("500");

        StringBuilder errorMessege = new StringBuilder();
        ex.getBindingResult().getFieldErrors().forEach(error->{
            errorMessege.append(error.getField()).append(": ").append(error.getDefaultMessage()).append("<br>");
        });
        model.addAttribute("errorMessege", errorMessege.toString());
        mav.setStatus(HttpStatus.BAD_REQUEST);
        return mav;
    }

}
