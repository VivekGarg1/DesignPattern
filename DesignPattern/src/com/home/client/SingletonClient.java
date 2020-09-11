package com.home.client;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.home.creational.singleton.SingletonDestroyUsingReflection;
import com.home.creational.singleton.SingletonDistributedUsingSerialization;
import com.home.creational.singleton.SingletonPreventionWithClone;
import com.home.creational.singleton.SingletonUsingEnum;
import com.home.creational.singleton.SingletonWithBillPugh;
import com.home.creational.singleton.SingletonWithEagerLazy;
import com.home.creational.singleton.SingletonWithLazyInitialization;
import com.home.creational.singleton.SingletonWithStaticInstantiation;

public class SingletonClient {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, CloneNotSupportedException {
		
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
		
		System.out.println("Singleton using Serializable");
		ObjectOutput objectOutput=null;
		SingletonDistributedUsingSerialization serialization=SingletonDistributedUsingSerialization.getInstance();
		try {
			objectOutput=new ObjectOutputStream(new FileOutputStream("abc.ser"));
			objectOutput.writeObject(serialization);
			objectOutput.flush();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (objectOutput!= null)
				objectOutput.close();
		}
		
		ObjectInput objectInput=null;
		SingletonDistributedUsingSerialization serialization2=null;
		try {
			objectInput= new ObjectInputStream(new FileInputStream("abc.ser"));
			Object readObject = objectInput.readObject();
			serialization2=(SingletonDistributedUsingSerialization)readObject;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(objectInput != null)
				objectInput.close();
		}
		
		System.out.println(serialization.hashCode());
		System.out.println(serialization2.hashCode());
		
		System.out.println("Singleton using clone");
		SingletonPreventionWithClone withClone=SingletonPreventionWithClone.getInstance();
		SingletonPreventionWithClone withClone2=(SingletonPreventionWithClone) withClone.clone();
		System.out.println(withClone.hashCode());
		System.out.println(withClone2.hashCode());
	}

}
