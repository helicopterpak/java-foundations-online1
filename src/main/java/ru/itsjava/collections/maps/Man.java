package ru.itsjava.collections.maps;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Man implements Serializable {
    private final String name;

    public int length() {
        return name.length();
    }

    public boolean startsWith(String firstLetter) {
        if (name.startsWith(firstLetter));
        return true;
    }
}
