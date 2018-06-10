/**
 * 
 */
package com.ds.user.management.service.model;

import java.util.UUID;

import com.ds.utils.Random;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Sarvesh
 *
 */
@Builder
@Getter
@ToString
public class User {

    private final UUID id;

    private final String firstName;

    private final String lastName;

    private final int age;

    public static User random() {
        return new UserBuilder().id(Random.uuid())
                                .firstName(Random.firstName.get())
                                .lastName(Random.lastName.get())
                                .age(Random.age(14, 80))
                                .build();
    }

}
