package gr.vbatsalis.FamilySplit;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonService {

    private Person person;

    public void addPayment(Payment payment){
        person.setPaymentList((List<Payment>) payment);
    }

}
