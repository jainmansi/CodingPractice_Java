package javaquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval_II {
	
	public class Interval{
		int start;
		int end;
		Interval() {
			start = 0;
			end = 0;
		}
		public Interval(int s, int e) { 
			start = s; 
			end = e; 
		}
	}

	public static void main (String args[]) {
		List<Interval> intervals = new ArrayList<>();
		MergeInterval_II mi = new MergeInterval_II();
		intervals.add(mi.new Interval(8, 10));
		intervals.add(mi.new Interval(2, 6));
		intervals.add(mi.new Interval(15, 18));
		intervals.add(mi.new Interval(16, 20));
		intervals.add(mi.new Interval(1, 3));
		
		List<Interval> result = merge(intervals);
		
		for(Interval res : result) {
			System.out.print(res.start + " ,");
			System.out.print(" " +res.end);
			System.out.println();
		}
	}
	
	public static List<Interval> merge (List<Interval> intervals) {
		List<Interval> result = new ArrayList<>();
		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});
		
		Interval prev = null;
		
		for (Interval inter : intervals) {
			if(prev == null || inter.start > prev.end) {
				result.add(inter);
				prev = inter;
			} else if (inter.end > prev.end) {
				prev.end = inter.end;
			}
		}
		return result;
	}
}
