package gr.vbatsalis.FamilySplit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String description;
    private BigInteger value;
    private LocalDate localDate;
}
