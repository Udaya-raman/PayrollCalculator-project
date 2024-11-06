import java.util.Scanner;
public class PayrollCalculator {
    public static double monthlySalary=0;
    public static int detectSalary(int hours){
        return (8-hours)*100;//detecting 100/- per hour
    }
    public static int overTime(int hours){
        return (hours-8)*400;//adding 400/- per hour
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=22;i++){
        double salary=2500;
        System.out.println("Enter the number of hours worked in "+i+" day:");
        int hours=sc.nextInt();
        if(hours==8){
            System.out.println("Salary is:"+salary);
            monthlySalary+=salary;
        }
        else if(hours>=0 && hours<8){
            int res=detectSalary(hours);
            System.out.println("Ammount detected is:"+res);
            salary-=res;
            System.out.println("Salary is:"+salary);
            monthlySalary+=salary;
        }
        else if(hours>8){
            int res=overTime(hours);
            System.out.println("Ammount added is:"+res);
            salary+=res;
            System.out.println("Salary is:"+salary);
            monthlySalary+=salary;
        }
    }
       sc.close();
        System.out.println("Monthly Salary is:"+monthlySalary);
    }
}