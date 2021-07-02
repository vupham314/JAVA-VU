import java.util.*;

public class StudentIDArray {
    Scanner scn = new Scanner(System.in);

    ArrayList<Integer> ID = new ArrayList<Integer>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Float> mark = new ArrayList<Float>();

    void menu(){
        System.out.print("""
                1: show all
                2: searching
                3: add
                4: exit
                """);

        int fun = Integer.parseInt(scn.nextLine());
        switch(fun){
            case 1 -> {show_student();}
            case 2 -> {search_student();}
            case 3 -> {add_student();}
            case 4 -> {
                return;
            }
        }
        menu();

    }

    void show_student(){
        if (this.ID.size() == 0){
            System.out.println("null");
        }
        for(int x = 0; x < this.ID.size(); x++){
            System.out.printf("%3d   %10s   %.2f", this.ID.get(x), this.name.get(x), this.mark.get(x));
            System.out.println();
        }
    }

    void search_student(){
        System.out.print("nhap ID");
        int id = Integer.parseInt(scn.nextLine());
        for(int x = 0; x < this.ID.size(); x++){
            if (this.ID.get(x) == id){
                System.out.println(this.ID.get(x)+this.name.get(x)+this.mark.get(x));
            }
        }
    }

    void add_student(){
        System.out.print("nhap ID");
        int id = Integer.parseInt(scn.nextLine());
        this.ID.add(id);

        System.out.print("nhap ten");
        String name = scn.nextLine();
        this.name.add(name);

        System.out.print("nhap diem");
        float mark = Float.parseFloat(scn.nextLine());
        this.mark.add(mark);

    }

    public static void main(String[] args) {
        var hm = new StudentIDArray();
        hm.menu();
    }

}
