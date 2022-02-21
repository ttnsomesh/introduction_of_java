package com.assignment2;

import java.util.Scanner;
import java.io.*;
public class MainAccount {

    public static void main(String[] args) throws FileNotFoundException {
          int op;
        String tt;
        String nm;
        long ll;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.SBI");
        System.out.println("2.ICICI");
        System.out.println("3.BOI");

        System.out.println("choose your bank");
        op = sc.nextInt();

        switch(op){
            case 1:
                FileOutputStream fout=new FileOutputStream("testout6.txt ");
                PrintStream pout=new PrintStream(fout);
                System.out.println("Enter your name : ");
                nm = sc.next();
                System.out.println("Enter your Account number : ");
                ll = sc.nextLong();
                System.out.println("Enter your withdrawl amount : ");
                d = sc.nextDouble();
                System.out.println("Enter your account type : ");
                tt = sc.next();
                AccountTYpe aa = AccountTYpe.valueOf(tt);
                SBI ss = new SBI(ll , nm , aa);
                System.out.println("bank interest : "+ss.get_rateofInterest());
                ss.withdrawlAmount(d);
                ss.printDetails();
                ss.customer_details();
                pout.println("Bank name : "+ss.getName());
                pout.println("SBI rate interest "+ss.get_rateofInterest());
                if(ss.getBalance() > 0){
                    pout.println("your balance amount "+ss.getBalance());
                }
                String datetime = ss.fetchDateTime();
                pout.println(datetime);
                break;
            case 2:
                FileOutputStream fout1=new FileOutputStream("testout7.txt ");
                PrintStream pout1=new PrintStream(fout1);
                String nm2;
                long ll2;
                double d1;
                String mm;
                System.out.println("Enter your name : ");
                nm2 = sc.next();
                System.out.println("Enter your Account number : ");
                ll2 = sc.nextLong();
                System.out.println("Enter your withdrawl amount : ");
                d1 = sc.nextDouble();
                System.out.println("Enter your account type : ");
                mm = sc.next();
                AccountTYpe a2 = AccountTYpe.valueOf(mm);
                ICICI ss1 = new ICICI(ll2 , nm2 , a2);
                System.out.println("bank interest : "+ss1.get_rateofInterest());
                ss1.withdrawlAmount(d1);
                ss1.printDetails();
                ss1.customer_details();
                pout1.println("Bank name : "+ss1.getName());
                pout1.println("SBI rate interest "+ss1.get_rateofInterest());
                if(ss1.getBalance() > 0){
                    pout1.println("your balance amount "+ss1.getBalance());
                }
                String datetime1 = ss1.fetchDateTime();
                pout1.println(datetime1);

                break;
            case 3:
                FileOutputStream fout2=new FileOutputStream("testout7.txt ");
                PrintStream pout2=new PrintStream(fout2);
                String nm3;
                long ll3;
                double d2;
                String mm1;
                System.out.println("Enter your name : ");
                nm3 = sc.next();
                System.out.println("Enter your Account number : ");
                ll3 = sc.nextLong();
                System.out.println("Enter your withdrawl amount : ");
                d2 = sc.nextDouble();
                System.out.println("Enter your account type : ");
                mm1 = sc.next();
                AccountTYpe a3 = AccountTYpe.valueOf(mm1);
                BOI ss2 = new BOI(ll3 , nm3 , a3);
                System.out.println("bank interest : "+ss2.get_rateofInterest());
                ss2.withdrawlAmount(d2);
                ss2.printDetails();
                ss2.customer_details();
                pout2.println("Bank name : "+ss2.getName());
                pout2.println("SBI rate interest "+ss2.get_rateofInterest());
                if(ss2.getBalance() > 0){
                    pout2.println("your balance amount "+ss2.getBalance());
                }
                String datetime2 = ss2.fetchDateTime();
                pout2.println(datetime2);
                break;
            default:
                System.out.println("you choose wrong option");
        }
    }
}
