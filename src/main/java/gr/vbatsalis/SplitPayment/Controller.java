package gr.vbatsalis.SplitPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    private User user;

    private final UserSevice userSevice;

    public Controller(UserSevice userSevice) {
        this.userSevice = userSevice;
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable int id){
        return userSevice.getUserById(id);
    }

    @PostMapping("/new")
    public void saveUser(@RequestBody User user){
        userSevice.saveUser(user);
    }



}
