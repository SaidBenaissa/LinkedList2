import java.util.*;

public class LinkedListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] noms={"said","hicham","mohammed","lahsen","anouar"};
		List<String> List1=new LinkedList<String>();
		for(String x:noms){
			List1.add(x);
		}
		
		String[] prenom={"Benaissa","Benaissa","Benaissa","Benaissa","Benaissa"};
		List<String> List2=new LinkedList<String>();
		for(String y: prenom)
		{
			List2.add(y);
		}
			List1.addAll(List2);
			List2=null;
			
			printMe(List1);
			// In next tutorial////////
			// 2- printMe(Liste1);
			// 3- reverseMe(Liste1);
		
	}
	
	// 1- printMe method (Liste1);
private static void printMe(List<String> l){
	for(String b:l ){
	System.out.printf("%s",l);
}
}
	// 2- removeStuff method (List1,2,5);

private static void removeStuff(List<String> l, int  from, int to){
	l.subList(from, to).clear();
}

	// 3- reverseMe method
private static void reverseMe(List<String> l){
	ListIterator<String> boby=l.listIterator(l.size());
	while(boby.hasPrevious())
	{
		System.out.printf("%s", boby);
	}
	
}
}


