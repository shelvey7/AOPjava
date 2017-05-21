package hello;
import java.util.Scanner;


public class test {
	public static int flag, s=1;
	public static float temp=0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while (s==1){
		flag=sc.nextInt();
		switch (flag){
		case 9: white();
		break;
		case 10: kid();
		break;
		case 11:cird();
		break;
		case 12: tree();
		break;
		case 13:flower();
		break;
		case 14:black();
		break;
		
		case 15: wahh();
		break;
		case 16: math();
		break;
		}
		}
	}
	
public static void white(){
	temp++;
	switch(flag){
	case 9 : earth();
	break;
	case 13 : blue();
	break;
	}
	
}
public static void earth(){
	temp=temp+2;
	switch(flag){
	case 9 : summer();
	break;
	case 10: System.out.println(temp);temp=0;
	break;
	}
}
public static void summer(){
	temp=temp+3;
	switch(flag){
	case 9 : System.out.println(temp);temp=0;
	break;
	case 11 :System.out.println(temp);temp=0;
	break;
	case 12 :System.out.println(temp);temp=0;
	break;
	}
}
public static void kid(){
	temp=temp*2;
	switch(flag){
	case 10 : laugh();
	break;
	case 12 : summer();
	break;
	}
}
public static void laugh(){
	temp=temp*3;
	switch(flag){
	case 10 : woman();
	break;
	case 12 : winter();
	break;
	}
}
public static void woman(){
	temp=temp+2;
	switch(flag){
	case 10 : earth();
	break;
	}
}
public static void cird(){
	temp=temp-2;
	switch(flag){
	case 11 : tree();
	break;
	}
}
public static void tree(){
	temp=temp-1;
	switch(flag){
	case 11 : summer();
	break;
	case 12 : kid();
	break;
	}
}
public static void spring(){
	temp=temp*2;
	switch(flag){
	case 12 : autem();
	break;
	}
}
public static void autem(){
	temp=temp-1;
	switch(flag){
	case 12 : summer();
	break;
	}
}
public static void winter(){
	temp=temp-1;
	switch(flag){
	case 12 : spring();
	break;
	}
}
public static void flower(){
	temp=temp-1;
	switch(flag){
	case 13 : sky();
	break;
	}
}
public static void orange(){
	temp=temp/2;
	switch(flag){
	case 13 : white();
	break;
	}
}
public static void sky(){
	temp=temp+9;
	switch(flag){
	case 13 : orange();
	break;
	}
}
public static void blue(){
	temp++;
	switch(flag)
	{
	case 13: System.out.println(temp);temp=0;
	break;
	}
}
public static void black(){
	temp=temp+4;
	switch(flag){
	case 14 : yinyang();
	break;
	}
}
public static void yinyang(){
	temp=temp-1;
	switch(flag){
	case 14 : System.out.println(temp);temp=0;
	break;}
	
}
public static void wahh(){
	temp=temp-1;
	switch(flag){
	case 15 : drink();
	break;}
	
}
public static void drink(){
	temp=temp*4;
	switch(flag){
	case 15 : boom();
	break;}
}
public static void noodle(){
	temp=temp+3;
	switch(flag){
	case 15 : wine();
	break;}
}
public static void boom(){
	temp=temp-1;
	switch(flag){
	case 15 : noodle();
	break;}
}
public static void wine(){
	temp=temp-1;
	switch(flag){
	case 15 : System.out.println(temp);temp=0;
	break;}
}
public static void software(){
	temp=temp*3;
	switch(flag){
	case 16 : lunch();
	break;}
}
public static void math(){
	temp=temp+8;
	switch(flag){
	case 16 : software();
	break;}
}
public static void lunch(){
	temp=temp-1;
	switch(flag){
	case 16 : System.out.println(temp);temp=0;
	break;}
}
}
