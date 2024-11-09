package org.example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;

}
