package hello;

import java.util.*;

public aspect aj {
	Stack<String> stack=new Stack<String>();
	pointcut BeginPoint() : execution(* make.*(..));//��ȡ���к���������
	before() : BeginPoint() {//���к�������ǰ
		for(int i=1;i<stack.size();i++){
			System.out.print('\t');
		}
		if(!stack.empty()){
			System.out.print("��"+stack.size()+"�����");
			System.out.print(stack.peek()+"-->");
			System.out.println(thisJoinPoint.getSignature().getName());//����ǩ��
		}
		stack.push(thisJoinPoint.getSignature().getName());//��ջ
		
	}
	after() : BeginPoint() {//���к������ú�
		stack.pop();//��ջ
	}
}


