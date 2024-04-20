import java.util.*;
public class Swap {
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
    public static void swapEle(ArrayList<Integer> list ,int index,int index2){
        if (index<0 || index>=list.size() ||index2<0 || index2>=list.size()) {
            System.out.println("Invalid Index ");
            return;
        }
        else 
            Collections.swap(list,index,index2);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = Position.getArray();
        System.out.println(list);
        System.out.println("Enter two index for swapping : ");
        swapEle(list,sc.nextInt(),sc.nextInt());
        System.out.println(list);
}
}

