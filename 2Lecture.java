// Main.java / Name

public class Main {
    public static final String TEXT = "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesetest";
    public static final String PATTERN = "test";
    
    public static void main(String[] args) {
        int count = 0;
    
        for (int i = 0; i < TEXT.length(); i++) {
           char ch = TEXT.charAt(i);
          
         
          for (int a = 0; a < PATTERN.length(); a++) {
            char c1 = PATTERN.charAt(a);
            if (ch == c1) {
            count++;
            }
        }
          }
    
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}


// pal.java

// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом.

public class pal {
    public static void main (String[] args) {
        String s = " z  --abc  67876 ..cba Z";
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        if (s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
            System.out.println("Палиндром! " + s);
        else
            System.out.println("Не палиндром! :( " + s);
        }
    }

