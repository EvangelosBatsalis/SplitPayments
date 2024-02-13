package gr.vbatsalis.SplitPayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    private User user;

    private final UserSevice userSevice;

    public Controller(UserSevice userSevice) {
        this.userSevice = userSevice;
    }

//    @GetMapping("/get/{id}")
//    public User getUser(@PathVariable int id){
//        System.out.println("ok");
//        return userSevice.getUserById(id);
//    }
    @GetMapping("/get/{id}")
    public String getUserById(@PathVariable int id, Model model){
        User user = userSevice.getUserById(id);
        model.addAttribute("user", user);
        return "dataView";
    }
    @PostMapping("/new")
    public void saveUser(@RequestBody User user){
        userSevice.saveUser(user);
    }
}
