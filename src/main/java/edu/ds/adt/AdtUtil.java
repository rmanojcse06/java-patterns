package edu.ds.adt;

public class AdtUtil {
	public static void main(String[] args) {
		{
			Stack s = new Stack();
			for(int i=0; i<10; i++)
				s.push(100*(i+1));
			for(int i=0; i<11; i++)
				System.out.println(" Stack:: popping "+s.pop());
			s.push(100*2);
			System.out.println(" Stack:: popping "+s.pop());
			System.out.println(" Stack:: popping "+s.pop());
		}
		System.out.println("\n\n\n\n\n");
		{
			Queue s = new Queue();
			for(int i=0; i<10; i++)
			s.add(100*(i+1));
			for(int i=0; i<15; i++)
			System.out.println(" Queue:: polling "+s.poll());
			s.add(100*2);
			System.out.println(" Queue:: polling "+s.poll());
			System.out.println(" Queue:: polling "+s.poll());
		}
		
	}
}
