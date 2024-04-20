import java.util.ArrayList;
import java.util.Scanner;

public class Position {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> getArray(){
        ArrayList<Integer> llist = new ArrayList<>();
        System.out.println("Enter how many element you wnat to add : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enetr Element at "+i+" position ");
            llist.add(sc.nextInt());
        }
        return llist;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = Position.getArray();
        System.out.println("Eneter element to find it's index : ");
        int key = sc.nextInt();
        if(list.contains(key)){
            int ind = list.indexOf(key);
            System.out.println("Element "+key+" Found at index : "+ind);
        }
        else{
            System.out.println(key+" Not Found In List");
        }
    }
}
