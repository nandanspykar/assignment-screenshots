import java.util.Scanner;
class studentResults {public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter maths marks");
int m=sc.nextInt();
System.out.println("enter physics marks");
int p=sc.nextInt();
System.out.println("enter chemistry marks");
int c=sc.nextInt();
if(m>60 && p>60 && c>60)
{
System.out.println("candidate passed");
}
else if((m>60&&p>60) || (p>60&&c>60) || (m>60&&c>60)){
System.out.println("candidate promoted");
}
else {System.out.println("candidate failed");
}
}
}

