package hello;

import java.util.Scanner;

public class make {
	
	public static int flag,i=0,j=0;
	public static double temp=0,Tp=0,Tf=0;
	static double[] c= new double[]{5.0,15.0,6.6,3.9,14.7,25.34,13.45,13.65,11.7,30.449999999999996,8.2,17.2,3.45,3.0,19.1,23.0};
	static double[] failed= new double[]{1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,2,0,2,0,0,0,1,0,0,0,1,2,3,2,1,1};
	static double[] passed= new double[]{1,1,1,1,0,0,0,1,1,1,0,1,0,0,1,0,0,0,0,1,0,1,1,1,6,1,1,1,5,1,1,1,0,0,4,0,0,0};
	
	static int[] p=new int[]{2,3,4,6,7,8,11,12,13,14,15};		//保存正确用例
	static int[] f=new int[]{1,5,9,10,16};		//保存错误用例
	static double[] T=new double[40];		//缺陷定位
	public static void main(String[] args) {
		int n=1;
		System.out.println("hello world");
		//Scanner input = new Scanner(System.in);
	       
		 while(n<17){
			
			 //flag = input.nextInt();
			 flag=n;
			 temp=0;
				switch (flag)
				{
					case 1:test();
					break;
					case 2:test();
					break;
					case 3:boom();
					break;
					case 4:red();
					break;
					case 5:play();
					break;
					case 6:ye();
					break;
					case 7:winter();
					break;
					case 8:sky();
					break;
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
				 n++;
		}
		 
		 //缺陷定位
		 Tf=f.length;Tp=p.length;
		 for(int k=0;k<37;k++){
			
			 T[k]=(failed[k]/Tf)/(passed[k]/Tp+failed[k]/Tf);
			 System.out.println(T[k]);
		 }
		
	}
public static void test(){
	temp=temp*2;
	switch (flag)
	{
	case 1:Test();break;
	case 2:Test();break;
	}
	
	}
	public static void Test() {
		temp=temp+5;
		
		switch (flag)
		{
		case 1:System.out.println(temp);
			
		break;
		case 2:Test3();break;
		}
	}

	public static void Test2(){
		temp=temp+10;
		switch (flag)
		{
		
		case 2:System.out.println(temp);
		
		break;
		}
	}
	public static void Test3(){
		temp=temp+0;
		switch (flag)
		{
		
		case 2:Test2();break;
		}
	}

public static void math(){
	temp=temp+8;
	switch(flag){
	case 16 : software();
	break;}
	}
public static void software(){
	temp=temp*3;
	switch(flag){
	case 16 : lunch();
	break;}
}
public static void lunch(){
	temp=temp-1;
	switch(flag){
	case 16 : System.out.println(temp);

	break;}
	}
public static void eat(){
	temp=temp/2;
	switch (flag)
	{
	
	case 3:System.out.println(temp);
	
	break;
	
	}
}

public static void boom(){
	temp=temp+4.8;
	switch (flag)
	{
	
	case 3:noodle();break;
	case 15 : noodle();
	break;
	
	}
}
public static void noodle(){
	temp=temp+6.1;
	switch (flag)
	{
	
	case 3:wahh();break;
	case 15 : wine();
	break;
	}
}
public static void drink(){
	temp=temp*4;
	switch(flag){
	case 15 : boom();
	break;}
}
public static void wahh(){
	temp=temp+2.3;
	switch (flag)
	{
	
	case 3:eat();break;
	case 15 : drink();
	break;
	}
}
public static void wine(){
	temp=temp-1;
	switch(flag){
	case 15 : System.out.println(temp);
	
	break;}
	
}
public static void yinyang(){
	temp=temp-1;
	switch(flag){
	case 14 : System.out.println(temp);
	
	break;}
}

public static void red(){
	temp=temp+1.5;
	switch (flag)
	{	
	case 4:green();break;	
	}
}
public static void blue(){
	temp++;
	switch(flag)
	{
	case 13: System.out.println(temp);
	
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
public static void white(){
	temp++;
	switch(flag){
	case 9 : earth();
	break;
	case 13 : blue();
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
public static void green(){
	temp=temp+2.4;
	switch (flag)
	{
	case 4:System.out.println(temp);
	
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
public static void sky(){
	temp=temp+3.9;
	switch (flag)
	{
	
	case 8:earth();break;
	case 13 : orange();
	break;
	}
}
public static void earth(){
	temp=temp*3.5;
	switch (flag)
	{
	
	case 8:System.out.println(temp);
	
	break;
	case 9 : summer();
	break;
	case 10: System.out.println(temp);
	break;
	}
}

public static void autem(){
	temp=temp/2;
	switch (flag)
	{
	
	case 7:summer();break;
	case 12 : summer();
	break;
	}
}
public static void summer(){
	temp=temp+8.2;
	switch (flag)
	{
	
	case 7:System.out.println(temp);
	
	break;
	case 9 : System.out.println(temp);
	
	break;
	case 11 :System.out.println(temp);
	
	break;
	case 12 :System.out.println(temp);
	
	break;
	}
}
public static void spring(){
	temp=temp+5.6;
	switch (flag)
	{
	
	case 7:autem();break;
	case 12 : autem();
	break;
	}
}
public static void winter(){
	temp=temp+4.9;
	switch (flag)
	{
	
	case 7:spring();break;
	case 12 : spring();
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
	temp=temp+2;
	switch(flag){
	case 11 : summer();
	break;
	case 12 : kid();
	break;
	}
}
public static void gan(){
	temp=temp+8;
	switch (flag)
	{
	
	case 6:zhi();break;
	
	}
}
public static void ye(){
	temp=temp+10.1;
	switch (flag)
	{
	
	case 6:gan();break;
	
	}
}
public static void zhi(){
	temp=temp*1.4;
	switch (flag)
	{
	
	case 6:System.out.println(temp);
	
	break;
	
	}
}

public static void man(){
	temp=temp+0.8;
	switch (flag)
	{
	
	case 5:System.out.println(temp);
	
	break;
	
	}
}
public static void woman(){
	temp=temp-1.9;
	switch (flag)
	{
	
	case 5:man();break;
	case 10 : earth();
	break;
	}
}
public static void kid(){
	temp=temp+7;
	switch (flag)
	{
	
	case 5:laugh();break;
	case 10 : laugh();
	break;
	case 12 : summer();
	break;
	}
}
public static void laugh(){
	temp=temp+3.6;
	switch (flag)
	{
	
	case 5:woman();break;
	case 10 : woman();
	break;
	case 12 : winter();
	break;
	}
}
public static void rough(){
	temp=temp+1.2;
	switch (flag)
	{	
	case 5:kid();break;
	}
}
public static void play(){
	temp=temp+4.0;
	switch (flag)
	{
	
	case 5:rough();break;
	
	}
}

}
