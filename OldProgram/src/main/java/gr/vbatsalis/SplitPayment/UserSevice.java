package gr.vbatsalis.SplitPayment;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserSevice {

    @Autowired
    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository){
        this.userRepository = userRepository;
    }

        public User getUserById(int id){
        return userRepository.findUserById(id);
        }

        public void saveUser(User user){
            userRepository.save(user);
        }

}
