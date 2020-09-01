package internetShop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //UUID id = UUID.randomUUID();

    private long id;
    private String name;
    private int age;
}

