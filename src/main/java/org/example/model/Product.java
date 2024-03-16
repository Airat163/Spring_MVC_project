package org.example.model;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor(force = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {

    private int id;
    private final String name;
    private final double price;

}
