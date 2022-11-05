import java.util.*;

public class hrpro  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enetr Array Size");
        int a = s.nextInt();
        int arr[];
        arr = new int[a];
        System.out.println("Enetr Array Elements");
        for(int i = 0 ; i < a ; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enetr the No. of optrations");
        int op = s.nextInt();
        for(int i = 0 ; i<op ; i++) {
            System.out.println("Enter Optration ");
            String opr = s.next();
            if((opr).equals("insert")) {
                System.out.println("Enetr index to change No");
                int swipe = s.nextInt();
                System.out.println("Enetr nuber to Change");
                int ch = s.nextInt();
                arr[swipe-1] = ch;
            }
            if((opr).equals("delete")) {
                System.out.println("Enetr index to delete");
                int del = s.nextInt();
                for(int v = del; v<a ;v++) {
                    arr[del -1] = arr[del];
                }
            }
            else {
                System.out.println("Wrong input");
            }
        }
        for (int sh : arr) {
            System.out.println(sh+" ");
        }
        s.close();
    }
}
