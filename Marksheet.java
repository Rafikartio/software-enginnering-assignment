import java.util.*;
class Marksheet{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String subject;
        String subject1;
        String subject2;
        String subject3;
        String subject4;
        int submarks,sub1marks,sub2marks,sub3marks,sub4marks,total;
        double percentage;
        
        
        System.out.println("Enter first subject");
        subject=sc.nextLine();
        System.out.println("Enter Second subject");
        subject1=sc.nextLine();
        System.out.println("Enter third subject");
        subject2=sc.nextLine();
        System.out.println("Enter fourth subject");
        subject3=sc.nextLine();
        System.out.println("Enter fifth subject");
        subject4=sc.nextLine();

        System.out.println("Enter " +subject+ " marks");
        submarks=sc.nextInt();
        System.out.println("Enter " +subject1+ " marks");
        sub1marks=sc.nextInt();
        System.out.println("Enter " +subject2+ " marks");
        sub2marks=sc.nextInt();
        System.out.println("Enter " +subject3+ " marks");
        sub3marks=sc.nextInt();
        System.out.println("Enter " +subject4+ "marks");
        sub4marks=sc.nextInt();

        System.out.println("subject\t\t\t\ttotal_marks\t\t\tobtained_marks");
        System.out.println(subject+"\t\t\t\t100"+"\t\t\t\t"+submarks);
        System.out.println(subject1+"\t\t\t\t100"+"\t\t\t\t"+sub1marks);
        System.out.println(subject2+"\t\t\t\t100"+"\t\t\t\t"+sub2marks);
        System.out.println(subject3+"\t\t\t\t100"+"\t\t\t\t"+sub3marks);
        System.out.println(subject4+"\t\t\t\t100"+"\t\t\t\t"+sub4marks);

        
        
        total=submarks+sub1marks+sub2marks+sub3marks+sub4marks;
       
       

        percentage=total*100/500;
        
        
       
        if(percentage>=80){
        System.out.println("Your grade is A1");
         System.out.println("Total obt marks are =" +total);
       System.out.println("Your percentage is " +percentage);
       }
       else if(percentage>=70){
        System.out.println("Your grade is A");
         System.out.println("Total obt marks are =" +total);
       System.out.println("Your percentage is " +percentage);

       }
       else if(percentage>=60){
        System.out.println("Your grade is B");
         System.out.println("Total obt marks are =" +total);
       System.out.println("Your percentage is " +percentage);
       }
       else if(percentage>=50){
        System.out.println("Your grade is C");
         System.out.println("Total obt marks are =" +total);
       System.out.println("Your percentage is " +percentage);
       }
       else if(percentage>=40){
        System.out.println("Your grade is D");
         System.out.println("Total obt marks are =" +total);
       System.out.println("Your percentage is " +percentage);
       }
       else{
        System.out.println("You are Fail");
       }
       
        

    }
}