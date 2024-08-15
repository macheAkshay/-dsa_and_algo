package com.git;

public class Service {
    public static void findFirstNonRepeatedCharacter(String input){
        for (int i = 0; i < input.length(); i++){
            if (input.indexOf(input.charAt(i), input.indexOf(input.charAt(i)) + 1) == -1){
                System.out.println("First non-repeated letter : "+input.charAt(i));

                break;
            }
        }
    }
}
