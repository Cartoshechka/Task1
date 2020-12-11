package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String stopWord = reader.readLine();
            if (stopWord.equals("стоп"))
                break;
            int userNum = Integer.parseInt(stopWord);
            sum = sum + userNum;


        }
        System.out.println(sum);



    }
}
