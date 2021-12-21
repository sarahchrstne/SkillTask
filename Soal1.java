// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        System.out.println("Input String: ");
        Scanner input = new Scanner(System.in);
        String exampleString = input.nextLine();

        int s = 0;
        int i = 0;
        int p = 0;
        int a = 0; 
        
        char temp;
        for (int j = 0; j < exampleString.length(); j++) {

            temp = exampleString.charAt(j);
            if (temp == 'S')
                s++;
            else if (temp == 'I')
                i++;
            else if (temp == 'P')
                p++;
            else if (temp == 'A')
                a++;
        }
        
        List<Integer> list = new ArrayList<>();
        list.add(s);
        list.add(i);
        list.add(a/2);
        list.add(p);
        
        int c = a/2;
        
        if(s == i && s == p && s == c){
            System.out.println(s);
        }
        else
        System.out.println(Collections.min(list));
    }
}