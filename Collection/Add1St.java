import java.util.ArrayList;
import java.util.Scanner;


public class Add1St {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("At postion : "+i);
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println("Enter Element At Starting : ");
        list.add(0,sc.nextInt());
        System.out.println(list);
    }
}
