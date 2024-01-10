package gr.vbatsalis.SplitPayment;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSevice {

    @Autowired
    private final UserRepository userRepository;

    public UserSevice(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void userFind(User user){
        userRepository.findUserByUserName();
    }

    public void userSave(User user){
        userRepository.save(user);
    }
    public void userSaveToList(User user){
        userRepository.addToList(user);
    }
}
