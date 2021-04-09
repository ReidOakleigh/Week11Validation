package edu.dmacc.week11validation.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * Rumbi Chinhamhora rchinhamhora
 * CIS 175 - Spring 2021
 * Apr 5, 2021
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "friends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String address;
    String city;
    String state;
    String zip;
    String phone;
    String email;
}