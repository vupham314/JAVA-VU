import java.util.*;

public class IntArray {
    Scanner scn = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();

    IntArray(){
        System.out.print("enter size of array");
        int size = Integer.parseInt(scn.nextLine());
        for(int x = 0; x < size; x++){
            this.arr.add((int) (Math.random()*101));
        }

    }

    void queue_arr(){
        System.out.println("Queue:");

        for(int ele : this.arr){
            System.out.print(ele+" ");
        }
    }

    void stack_arr(){
        System.out.println("Stack");

        for(int x = this.arr.size()-1;x >= 0; x--){
            System.out.print(this.arr.get(x)+" ");
        }
    }
    public static void main(String[] args) {
        var show = new IntArray();
        show.queue_arr();
        System.out.println();
        show.stack_arr();
    }

}
