package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("John@gmail.com ", "qwertY1@");
        System.out.println(user);
        System.out.println();
        user.setEmail(" jOhn@gmx.de");

        user.setPassword("qwertY1@");
        System.out.println(user);
    }
}
