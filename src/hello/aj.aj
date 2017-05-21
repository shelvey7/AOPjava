package hello;

import java.util.*;

public aspect aj {
	Stack<String> stack=new Stack<String>();
	pointcut BeginPoint() : execution(* make.*(..));//截取所有函数的切面
	before() : BeginPoint() {//所有函数调用前
		for(int i=1;i<stack.size();i++){
			System.out.print('\t');
		}
		if(!stack.empty()){
			System.out.print("第"+stack.size()+"层调用");
			System.out.print(stack.peek()+"-->");
			System.out.println(thisJoinPoint.getSignature().getName());//方法签名
		}
		stack.push(thisJoinPoint.getSignature().getName());//入栈
		
	}
	after() : BeginPoint() {//所有函数调用后
		stack.pop();//出栈
	}
}


