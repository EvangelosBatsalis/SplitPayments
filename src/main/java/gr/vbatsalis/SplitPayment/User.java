package gr.vbatsalis.SplitPayment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable = false)
//    @JsonIgnore
    private int id;
    @Column(name="USER_NAME")
    private String userName;
    @Column(name="EMAIL")
    private String email;
//    @Column(name="DESCRIPTION")
//    private String description;
//    @Column(name="DATE")
//    private LocalDate localDate;
//    @Column(name="AMOUNT")
//    private BigDecimal amount;




}
