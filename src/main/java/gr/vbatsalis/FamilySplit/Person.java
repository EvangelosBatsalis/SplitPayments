package gr.vbatsalis.FamilySplit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    //one to many relation
    private List<Payment> paymentList;

    private String firstName;
    private String lastName;
    private String email;

}
