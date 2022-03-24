package ru.itsjava.iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {
    private final String login;
    private transient String password;
}
