package com.home.client;

import com.home.behavioral.iterator.CollectionImpl;
import com.home.behavioral.iterator.Iterator;

public class IteratorClientTest {

	public static void main(String[] args) {
       
		CollectionImpl collectionImpl=new CollectionImpl();
		Iterator iterator = collectionImpl.getIterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			String name=(String) object;
			System.out.println("Name: "+name);
		}
	}
}
