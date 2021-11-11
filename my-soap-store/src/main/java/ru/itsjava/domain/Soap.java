package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Soap {
    private final String firm; //title
    private final String forWhat; //author
}
