package kz.bitlab.spring1.db;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Student {
    private Long id;
    private String name;
    private String surname;
    private int exam;
}
