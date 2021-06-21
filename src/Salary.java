/*
 I updated last exe, add using level to calculate allowence
*/

import java.util.Scanner;
class Salary {
    double DA = 0.12d;
    double HRA = 150.0d;
    double TA = 120.0d;
    double other = 450.0d;
    double tax_PF = 0.14d;
    double tax_IT = 0.15d;
    double allow = 0.0d;
    double net_salary = 0.0d; // to store the salary after calculating

    void level(String lev){
        switch (lev) {
            case "A" -> this.allow = 300.0;
            case "B" -> this.allow = 250.0;
            default -> this.allow = 100.0;
        }
    }

    double calculate_net_salary(double basic_salary){
        this.net_salary = Math.floor(basic_salary + this.allow
                            + this.HRA + this.TA + this.other
                            - (this.tax_IT + this.tax_PF - this.DA)*basic_salary);
        return this.net_salary;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Salary ob = new Salary();

        double basic_salary = 0.0d;
        double net_salary = 0.0d;
        String level;

        System.out.println("enter your basic salary: ");
        basic_salary = Double.parseDouble(scn.nextLine());
        System.out.println("enter your level");
        level = scn.nextLine();

        ob.level(level);
        net_salary = ob.calculate_net_salary(basic_salary);

        System.out.println("here is you salary ");
        System.out.println("Basic salary: " + basic_salary + "$");
        System.out.println("Tax:\n" +
                "     PF(" + Math.floor(ob.tax_PF*100) +"% of basic salary): -" + Math.floor(ob.tax_PF*basic_salary) + "$\n" +
                "     IT(" + Math.floor(ob.tax_IT*100) +"% of basic salary): -" + Math.floor(ob.tax_IT*basic_salary) + "$");

        System.out.println("HRA: +" + ob.HRA + "$");
        System.out.println("TA: +" + ob.TA + "$");
        System.out.println("Others: +" + ob.other + "$");
        System.out.println("allowence: +" + ob.allow + "$");
        System.out.println("total: " + net_salary + "$");

    }
}
