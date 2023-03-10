package euics.restfulwebservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 HTTP Status Code
 2XX -> OK
 4XX -> Client
 5XX -> Server
*/
@ResponseStatus(HttpStatus.NOT_FOUND) // 500 Error가 아닌 NOT_FOUND 오류를 뜨게 만듭니다.
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
