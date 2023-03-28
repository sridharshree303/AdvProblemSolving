package adv1_Arrays_day3;

import java.util.ArrayList;
import java.util.Iterator;


class Interval{
	int start;
	int end;
	
	public Interval() {
		this.start = 0;
		this.end = 0;
	}
	
	public Interval(int start, int end) {
		// TODO Auto-generated constructor stub
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
}

public class OverlappingIntervals {
	
	//if sorted intervals it will work
	public static void main(String[] args) {
		ArrayList<Interval> list = new ArrayList<>();
		list.add(new Interval(2,3));
		list.add(new Interval(2,6));
		
		list.add(new Interval(8,10));
		list.add(new Interval(15,18));
		
		//list.add(new Interval(1,7));
		
		System.out.println(merge(list));
		
		Iterator<Interval> lt = merge(list).iterator();
		
		while(!lt.hasNext()) {
			System.out.println(lt.toString());
		}
		
	}

	//TC = O(n)
	//SC = O(n)
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		int l = intervals.get(0).start;
		int r = intervals.get(0).end;
		int n = intervals.size();
		
		//output arraylist
		ArrayList<Interval> out = new ArrayList<>();
		
		
		
		for(int i=1;i<n;i++) {
			int lt = intervals.get(i).start;
			int rt = intervals.get(i).end;
			if(lt < r) {
				r = max(r, rt);
				l = min(l,lt);
			}else {
				//save to out
				out.add(new Interval(l,r));
				l = lt;
				r = rt;
			}
		}
		
		if(n != 0 ) {
			out.add(new Interval(l,r));
		}
		return out;
    }
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	
	public static int min(int a,int b) {
		if(a > b) {
			return b;
		}
		return a;
	}
}
