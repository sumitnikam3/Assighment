import java.util.*;
public class FirstLast {
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
        System.out.println(list);
        System.out.println("Add elemet at last : ");
        list.add(sc.nextInt());
        System.out.println("Add elemet at last : ");
        list.add(0,sc.nextInt());
        System.out.println(list);
    }
}

