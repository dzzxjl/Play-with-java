package com.dzzxjl.optional;

import java.util.Optional;

class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}
public class Main {


    public static String getName(User user) {
        if (user == null) {
            return "unknown";
        }
        return user.name;
    }

    public static String newGetName(User user) {
        return Optional.ofNullable(user)
                .map(u->u.name)
                .orElse("Unkown");
    }
    public static void main(String[] args) {
        Optional<String> string = Optional.of("hello");
        string.ifPresent(System.out::println);
//        Optional<String> nullString  = Optional.of(null);
        Optional empty = Optional.ofNullable(null);
//        nullString.ifPresent(System.out::println);
        empty.ifPresent(System.out::println);
    }
}
