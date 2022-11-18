package kr.yh.exceptionHandler.controller_level;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FooController {
    @ExceptionHandler({CustomException1.class, CustomException2.class})
    public void handleException(){

    }

}
