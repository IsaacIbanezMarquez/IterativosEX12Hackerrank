
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;









// ENUNCIADO:

// El quadrat ple:

/* Seguint l'exemple de la línia, ara consisteix en realitzar un quadrat d'asteriscs de N posicions. Si s'entra un nombre negatiu missatge d'error "N ha de ser NO negatiu".

Input Format

N és un nombre enter que marca quants asteriscs té el quadrat.

Constraints

N és un nombre NO negatiu.

Output Format

Quadrat de N x N asteriscs ple.

Sample Input 0

-5
Sample Output 0

N ha de ser NO negatiu
Sample Input 1

5
Sample Output 1

*****
*****
*****
*****
*****
Submissions: 43
Max Score: 1
Difficulty: Easy
Rate This Challenge:


More

 */
















public class Solution
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = N;
        String a = "";

        if (N < 0){System.out.print("N ha de ser NO negatiu");}

        while (count > 0)
        {
            a= a +"*";
            count--;
        }

        count = N;
        while (count > 0)
        {
            System.out.println(a);
            count--;
        }

    }
}
