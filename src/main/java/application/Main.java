package application;

import domain.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Blair Waldorf", "blair@gmail.com");
        Pessoa p2 = new Pessoa(2, "Serena van der Woodsen", "serena@gmail.com");
        Pessoa p3 = new Pessoa(3, "Chuck Bass", "chuck@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}