package com.test.app;

import java.util.LinkedList;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	 TreeMap<String, IoBean> hshmap=new TreeMap<String, IoBean>();
		 System.out.println(hshmap.isEmpty());
		 System.out.println(hshmap.size());
		 IoBean ibn=new IoBean(101, "abc");
		 IoBean ibn2=new IoBean(102, "akhil");
		 hshmap.put(ibn.getName(),ibn );
		 hshmap.put(ibn2.getName(),ibn2 );
		// System.out.println(hshmap);
		 
		 
		 System.out.println(hshmap.isEmpty());
		 for (Map.Entry<String, IoBean>
         entry : hshmap.entrySet())
    System.out.println(
       
        entry.getValue() );
}*/
		
	
	LinkedList<IoBean> list = new LinkedList<IoBean>();
	  
	 IoBean ibn=new IoBean(101, "abc");
	 IoBean ibn2=new IoBean(102, "akhil");
	 IoBean ibn3=new IoBean(103, "munna");
    list.add(ibn);
    list.add(ibn2);
    list.add(ibn3);
  

    // Displaying the list
    System.out.println("LinkedList:" + list);
    IoBean ion=null;
    ion=list.get(2);
    System.out.println(ion.hashCode());
    
    
    StringBuffer sb=new StringBuffer();
    for (IoBean ioBean : list) {
		sb.append(list);
	}
  String sc=sb.toString();
  System.out.println("appended string "+sc);
      
	
	
	
	}
	
	

	}





