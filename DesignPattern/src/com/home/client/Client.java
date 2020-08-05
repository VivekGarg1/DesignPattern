package com.home.client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.home.singleton.SingletonDestroyUsingReflection;
import com.home.singleton.SingletonUsingEnum;
import com.home.singleton.SingletonWithBillPugh;
import com.home.singleton.SingletonWithEagerLazy;
import com.home.singleton.SingletonWithLazyInitialization;
import com.home.singleton.SingletonWithStaticInstantiation;

public class Client {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println("Singleton with EagerLazy Approach");
		SingletonWithEagerLazy eagerLazy=SingletonWithEagerLazy.getInstance();
		SingletonWithEagerLazy eagerLazy2=SingletonWithEagerLazy.getInstance();
		System.out.println(eagerLazy.hashCode());
		System.out.println(eagerLazy2.hashCode());
		
		System.out.println("Singleton with LazyInitialization Approach");
		SingletonWithLazyInitialization lazyInitialization=SingletonWithLazyInitialization.getInstance();
		SingletonWithLazyInitialization lazyInitialization1=SingletonWithLazyInitialization.getInstance();
		System.out.println(lazyInitialization.hashCode());
		System.out.println(lazyInitialization1.hashCode());
		
		System.out.println("Singleton with StaticInstantiation Approach");
		SingletonWithStaticInstantiation staticInstantiation=SingletonWithStaticInstantiation.getInstance();
		SingletonWithStaticInstantiation staticInstantiation1 =SingletonWithStaticInstantiation.getInstance();
		System.out.println(staticInstantiation.hashCode());
		System.out.println(staticInstantiation1.hashCode());
		
		System.out.println("Singleton with BillPugh Approach");
		SingletonWithBillPugh billPugh=SingletonWithBillPugh.getInstance();
		SingletonWithBillPugh billPugh2=SingletonWithBillPugh.getInstance();
		System.out.println(billPugh.hashCode());
		System.out.println(billPugh2.hashCode());
		
		System.out.println("Singleton destroy  using Reflection");
		SingletonDestroyUsingReflection reflection=SingletonDestroyUsingReflection.getInstance();
		SingletonDestroyUsingReflection reflection2=null;
		
		Constructor<?>[] constructors = SingletonDestroyUsingReflection.class.getDeclaredConstructors();
		for(Constructor<?> constructor:constructors) {
			constructor.setAccessible(true);
			Object object = constructor.newInstance();
			reflection2=(SingletonDestroyUsingReflection)object;
			break;
		}
		System.out.println(reflection.hashCode());
		System.out.println(reflection2.hashCode());
		
		System.out.println("Singleton using Enum");
		SingletonUsingEnum enum1=SingletonUsingEnum.GETINSTANCE;
		SingletonUsingEnum enum2=SingletonUsingEnum.GETINSTANCE;
		System.out.println(enum1.hashCode());
		System.out.println(enum2.hashCode());
		String welcome = enum1.welcome();
		System.out.println(welcome);
	}

}
