package ru.shmvsky.hellotestcontainers;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String street;

    private String zipCode;

    private String city;

    private String state;

}
