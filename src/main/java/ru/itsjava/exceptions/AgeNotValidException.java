package ru.itsjava.exceptions;

public class AgeNotValidException extends RuntimeException {

    public AgeNotValidException(String message) {
        super(message);
    }
}

//alt + ins для вставки конструктора или гет, сет
// alt + enter если подчеркивает красным
// ctrl + alt + l формат кода
//shift f6  переименовать переменные
//зажать ctrl + правая кнопка -- провалиться в метод