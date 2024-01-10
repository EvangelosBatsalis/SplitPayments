package gr.vbatsalis.SplitPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {

    private User user;

    private final UserSevice userSevice;

    public Controller(UserSevice userSevice) {
        this.userSevice = userSevice;
    }

    @GetMapping("/get/{userName}")
    public ResponseEntity<User> getUser(@PathVariable String userName){
        User user = userSevice.

        if()
    }

}
