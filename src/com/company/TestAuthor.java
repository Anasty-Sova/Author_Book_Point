package com.company;

public class TestAuthor {

    public static void main(String[] args) {
Author Ivanov = new Author("Иванов"," ivan@nikida.com");
        System.out.println(Ivanov);
        Ivanov.setEmail("ivan@nikida@com");
        System.out.println("имя:"+Ivanov.getName());
        System.out.println("email:"+Ivanov.getEmail());
    }
}
