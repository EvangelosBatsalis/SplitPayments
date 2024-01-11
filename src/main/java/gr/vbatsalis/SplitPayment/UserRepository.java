package gr.vbatsalis.SplitPayment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserById(int id);
    User findUserByEmail(String email);


}
