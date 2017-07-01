package com.javarush.task.task14.task1414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Movie movie = null;
        String mKey;
        /*while (mKey.equals("soapopera") || mKey.equals("cartoon") || mKey.equals("thriller")) {
            movie = MovieFactory.getMovie(mKey);
            System.out.println(movie.getClass().getSimpleName());
            mKey = scanner.nextLine().toLowerCase();
        }*/
        do {
            mKey = scanner.nextLine().toLowerCase();
            movie = MovieFactory.getMovie(mKey);
            if (movie != null) System.out.println(movie.getClass().getSimpleName());
        } while (movie != null);
        scanner.close();
    }

    static class MovieFactory {
        static Movie getMovie(String key) {
            if ("soapopera".equals(key)) return new SoapOpera();
            else if ("cartoon".equals(key)) return new Cartoon();
            else if ("thriller".equals(key)) return new Thriller();
            else return null;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
