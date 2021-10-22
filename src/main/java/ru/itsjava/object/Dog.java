package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Dog {
    private final String nickname;
    private int pawsCount;

//    public Dog(String nickname, int pawsCount){
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return nickname.equals(dog.nickname);
    }

    @Override
    public int hashCode() {
        return nickname.hashCode();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                ", pawsCount=" + pawsCount +
                '}';
    }
}
