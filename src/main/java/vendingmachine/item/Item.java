package vendingmachine.item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //getters and setters
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    private String name;
    private double price;
}
