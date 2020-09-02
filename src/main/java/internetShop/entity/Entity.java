package internetShop.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Entity implements Serializable {
    private static final long serialVersionUID = -1633567076247765575L;

    private Long id;
}
