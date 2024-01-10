package gr.vbatsalis.SplitPayment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> list = new ArrayList<>();

    User addToList(User user);
    User findUserByUserName(String username);

}
