import java.util.*;
public class Comparee {
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
    public static boolean contains(ArrayList<Integer> list,ArrayList<Integer> list1){
        if(list.size()!=list1.size())
            return false;
        for(int i=0;i<list.size();i++){
            if (!list.get(i).equals(list1.get(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = getArray();
        ArrayList<Integer> list1 = getArray();
        if (contains(list,list1)) {
            System.out.println("List is equal ");
        } 
        else
            System.out.println("List is Not equal ");
}
}
