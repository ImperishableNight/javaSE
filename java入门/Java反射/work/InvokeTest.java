package work;

import java.lang.reflect.Method;

import entity.Character;

public class InvokeTest {


	public static void main(String[] args) throws Exception{
		Character c3=new Character();
		Class<Character> c2=(Class<Character>) c3.getClass();
		Class<Character> c=(Class<Character>) Class.forName("entity.Character");
		Class<Character> c1=Character.class;	
		Object o1=c1.newInstance();
			Object o=c.newInstance();
			Method method=c.getMethod("eat");
			method.invoke(o);
			Method m1=c.getMethod("attack",new Class[]{int.class});//第一个参数表示方法名，第二个表示方法的参数类型,可用数组表示多个类型的参数
			m1.invoke(o,10);//
			Method methodc2=c2.getMethod("eat");
			methodc2.invoke(o1);
		
	}

}
