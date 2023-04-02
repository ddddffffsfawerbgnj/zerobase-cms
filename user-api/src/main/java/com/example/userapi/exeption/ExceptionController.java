package com.example.userapi.exeption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@Slf4j
public class ExceptionController {

    @ExceptionHandler({
            CustomException.class
    })
    public ResponseEntity<ExceptionResponse> customRequestException(final CustomException customException){
        log.warn("api Exception : {}", customException.getErrorCode());
        return ResponseEntity.badRequest().body(new ExceptionResponse(customException.getMessage(), customException.getErrorCode()));
    }

    @Getter
    @ToString
    @AllArgsConstructor
    public static class ExceptionResponse{
        private String message;
        private ErrorCode errorCode;
    }

}
