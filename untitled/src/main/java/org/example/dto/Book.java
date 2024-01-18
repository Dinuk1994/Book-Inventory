package org.example.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    private String isbn;
    private String name;
    private String aurthor;
    private String category;
    private int qty;

}
