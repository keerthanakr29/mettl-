import java.util.*;
class Alphabets{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	char i1,i2;
	i1=s.next().charAt(0);
	i2=s.next().charAt(0);
	System.out.println("Enter the alphabetical:");
	if(i1>i2){
	System.out.println(i2+","+i1);
	}	
	else{
	System.out.println(i1+","+i2);
	}
}
}