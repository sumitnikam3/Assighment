import java.util.ArrayList;
import java.util.Scanner;

public class Colour{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many colour you wanted to add");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Enter colur at "+i+" Position");
            list.add(sc.nextLine());
        }
       
            System.out.println("Color : "+list);
        
        sc.close();
    }
}