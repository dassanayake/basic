package org.lux.service.personal.basic.spring.boot.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserBean {
    private int id;
    private String firstName;
    private String lastName;
}
