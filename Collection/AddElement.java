import java.util.ArrayList;
import java.util.Scanner;

public class AddElement {
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
        System.out.println("Enter position where you wanted to add element : ");
        int a = sc.nextInt();
        if(a>n){
            System.out.println("Enter Valid postition : ");
        }
        else{
            System.out.print("Enter element you wanted to add : ");
            int element = sc.nextInt();
            list.add(a,element);
            System.out.println(list);
        }
    }
}
