package org.example;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

    @Entity
    @Table(name = "USERS")
    @Data
    @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Size(min = 2, message = "Не меньше 2 знаков")
        private String name;

        @Size(min = 2, message = "Не меньше 2 знаков")
        private String surname;

        private Double balance;

        public User(Long id, String name, String surname, Double balance) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.balance = balance;
        }
}
