package org.worney.springboot_bbs.utill;

// ApplicationException.java
public class ApplicationException extends RuntimeException {
    
    private ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    // 정적 팩토리 메서드: raise
    public static ApplicationException raise(String message, Throwable cause) {
        return new ApplicationException(message, cause);
    }
}
