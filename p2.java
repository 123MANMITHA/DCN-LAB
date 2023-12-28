
import java.math.*;
import  java.util.*;
import java.util.Random;
import java.io.*;
import java.lang.*;
public class p2{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int drop=0,mini,i,o_rate,b_size,nsec,p_remain=0;
int packet[]=new int[100];
System.out.println("enter the bucket size");
b_size=s.nextInt();
System.out.println("enter the output rate");
o_rate=s.nextInt();
System.out.println("enter the number of seconds to simulate");
nsec=s.nextInt();
Random rand=new Random();
for(i=0;i<nsec;i++)
packet[i]=(rand.nextInt(1000));
System.out.println("seconds | packet recieved | packet sent | packets left | packets dropped");
System.out.println("------------------------------------------------------------------------");
for(i=0;i<nsec;i++){
p_remain+=packet[i];
if(p_remain>b_size){
drop=p_remain-b_size;
p_remain=b_size;
System.out.print(i+1+"                ");
System.out.print(packet[i]+"               ");

mini=Math.min(p_remain,o_rate);
System.out.print(mini+"              ");
p_remain=p_remain-mini;
System.out.print(p_remain+"            ");
System.out.print(drop+"                ");
System.out.println("                ");
drop=0;
}
}
while(p_remain!=0){
if(p_remain>b_size){
drop=p_remain-b_size;
}
mini=Math.min(p_remain,o_rate);
System.out.println(" "+p_remain+" "+mini);
p_remain=p_remain-mini;
System.out.println(" "+p_remain+" "+drop);
drop=0;
}
}
}

