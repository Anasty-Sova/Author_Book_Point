package com.company;

public class TestBook {
    public static void main(String[] args) {
        Author Ivanov=new Author("Иван Иванов","ivanov@kuda.com");
        System.out.println(Ivanov);
        Book dommyBook=new Book("Java для чайников",Ivanov,200,99);
        System.out.println(dommyBook);
        dommyBook.setPrice((int) 300.75);
        dommyBook.setQty(88);
        System.out.println(dommyBook);
        System.out.println("Название:"+dommyBook.getName());
        System.out.println("Цена:"+dommyBook.getPrice());
        System.out.println("Количество:"+dommyBook.getQty());
        System.out.println("Автор:"+dommyBook.getAuthor());
        System.out.println("имя автора:"+dommyBook.getAuthor().getName());
        System.out.println("email автора:"+dommyBook.getAuthor().getEmail());
        Book moreDummyBook = new Book("Java для опытных",new Author("Петр Петров","petrov@nikuda.com"),19.99,8);
        System.out.println(moreDummyBook);
    }
}
