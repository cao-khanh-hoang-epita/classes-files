package Revision;

import java.util.Scanner;

public class ConcatenateString {

public static void main(String[] args) {
System.out.println("");
Scanner sc = new Scanner(System.in);

String str = sc.nextLine();

for (int i = 0; i < str.length(); i++) {

char ch = str.charAt(i);

if (Character.isAlphabetic(ch)) {

System.out.print(ch);

} else if (ch == '.' || ch == ',' || ch == ';') {

System.out.println();

}

}

sc.close();

}
}
