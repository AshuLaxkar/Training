package day4;

import day4V2.FakeAvatar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
//        Actor[] arr= new Actor[2];
        TomHanks tomHanks = new TomHanks();
        LeonardoDiCaprio leonardoDiCaprio = new LeonardoDiCaprio();
        List<Actor> actor = new ArrayList<Actor>();
//        arr[0] = tomHanks;
//        arr[1] = leonardoDiCaprio;
        actor.add(tomHanks);
        actor.add(leonardoDiCaprio);

        for(Actor a : actor){
            a.act();
        }

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a movie Star Name");
        String name = scn.nextLine();
        System.out.println("Enter age");
        int age = scn.nextInt();
        System.out.println("Enter income");
        int income = scn.nextInt();
        MovieStar movieStar = new MovieStar();
        movieStar.setName(name);
        movieStar.setAge(age);
        movieStar.setIncome(income);

        System.out.println("Movie Star's name: " +movieStar.getName());
        System.out.println("its Income: "+movieStar.getIncome());
        System.out.println("Its Age: "+movieStar.getAge());

    }
}
