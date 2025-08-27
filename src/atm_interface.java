import java.lang.*;
import java.util.Scanner;
public class atm_interface {
    public static void main(String args[])
    {
        String uid,pw; int opr,n=5,wdm=0,dpm=0,tfm=0; long accn=0;
        int flagW=0,flagD=0,flagT=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("!! WELCOME TO THE ATM INTERFACE !! ");
        System.out.print("Please Enter Your User ID = ");
        uid = sc.nextLine();
        System.out.print("Please Enter Your Password = ");
        pw = sc.nextLine();
        for(int i=0;i<n;i++) {
            System.out.println("Please Select One Of The Following Operation You Want To Perform on ATM ");
            System.out.println("Press 1 To See Transaction History ");
            System.out.println("Press 2 To Withdraw Money ");
            System.out.println("Press 3 To Deposit The Money ");
            System.out.println("Press 4 To Transfer Money To Other Account ");
            System.out.println("Press 5 To Exit The ATM Interface ");
            opr = sc.nextInt();
            switch (opr) {
                case 1:
                    System.out.println("---> You Have Chosen To See Transaction History <--- ");
                    System.out.println("Your Transaction History Are As Follows ");
                    if(flagW>0)
                    {
                        System.out.println("Transaction Type: Withdrawal ");
                        System.out.println("Current Withdrawal Amount: "+wdm);
                    }
                     if(flagD>0)
                    {
                        System.out.println("Transaction Type: Deposit ");
                        System.out.println("Current Deposited Amount: "+dpm);
                    }
                    if(flagT>0)
                    {
                        System.out.println("Transaction Type: Transfer ");
                        System.out.println("Current Recipient Account Number: "+accn);
                        System.out.println("Current Transfer Amount: "+tfm);
                    }
                    if((flagW==0&&flagD==0)&&(flagT==0))
                    {
                        System.out.println("No Transaction Has Been Found ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("---> You Have Chosen To Withdraw Money <--- ");
                    System.out.print("Please Enter Amount Of Withdrawal Money = ");
                    wdm = sc.nextInt();
                    System.out.println("THE AMOUNT OF MONEY "+wdm+" HAS BEEN WITHDRAWN SUCCESSFULLY ");
                    flagW++;
                    n++;
                    System.out.println();
                    break;
                case 3:
                    System.out.println("---> You Have Chosen To Deposit The Money <--- ");
                    System.out.print("Please Enter Amount Of Deposit Money = ");
                    dpm = sc.nextInt();
                    System.out.println("THE AMOUNT OF MONEY "+dpm+" HAS BEEN DEPOSITED SUCCESSFULLY ");
                    flagD++;
                    n++;
                    System.out.println();
                    break;
                case 4:
                    System.out.println("---> You Have Chosen To Transfer Money To Other Account <--- ");
                    System.out.print("Please Enter Recipient Account Number = ");
                    accn = sc.nextLong();
                    System.out.print("Please Enter Amount Of Transfer Money = ");
                    tfm = sc.nextInt();
                    System.out.println("THE AMOUNT OF MONEY "+tfm+" HAS BEEN TRANSFERRED SUCCESSFULLY TO ACCOUNT NUMBER "+accn);
                    flagT++;
                    n++;
                    System.out.println();
                    break;
                case 5:
                    System.out.println("---> You Have Chosen To Exit The ATM Interface <--- ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice ");
                    System.out.println("Please Read The Instructions Carefully And Then Make A Choice  ");
                    System.out.println();
                    break;
            }
            sc.nextLine();
        }

    }
}