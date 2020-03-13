package com.nisum.zipcode.filter;

//A program for merging overlapping intervals

import java.util.Arrays;
import java.util.Stack;

public class ZIPCodeIntervals {
	
	// The main function that takes a set of intervals, merges  
    // overlapping intervals and prints the result  
	public  Stack<CodeRange> zipCodeRanges(CodeRange zipCodes[]) 
		{ 	
			// Test if the given set has at least one interval 
			if (zipCodes.length <= 0) 
				return null; 
			
			// Create an empty stack
			Stack<CodeRange> stack=new Stack<>(); 

			// sort the intervals in increasing order
			Arrays.sort(zipCodes,(i1,i2)->i1.start-i2.start); 

			// push the first interval to stack 
			stack.push(zipCodes[0]); 

			// Start from the next interval and merge if necessary
			for (int i = 1 ; i < zipCodes.length; i++) 
			{ 
				
				CodeRange top = stack.peek(); 

				// if current interval is not overlapping with stack top, 
				// push it to the stack 
				if (top.end < zipCodes[i].start) 
					stack.push(zipCodes[i]); 

				// Otherwise update the ending time of top if ending of current 
				// interval is more 
				else if (top.end < zipCodes[i].end) 
				{ 
					top.end = zipCodes[i].end; 
					stack.pop(); 
					stack.push(top); 
				} 
			} 
		
			// Print. 
			System.out.print("The Merged ZipCodeRanges are: "); 
			CodeRange arrMerged[];
			if(!stack.isEmpty()) {
				arrMerged=new CodeRange[stack.size()];
				int index = 0;
				while (!stack.isEmpty()) 
				{ 
					CodeRange t = stack.pop(); 
					arrMerged[index++]=t;					
				} 
				Arrays.sort(arrMerged,(i1,i2)->i1.start-i2.start);
				for(CodeRange code:arrMerged)
					System.out.print("["+code.start+","+code.end+"] "); 
			}
			return stack;
		} 
	
		
	public static void main(String[] args) {

		ZIPCodeIntervals zipCodeIntervals = new ZIPCodeIntervals();
		
		CodeRange zipRanges[]=new CodeRange[3]; 
		
		zipRanges[0] = new CodeRange(94133,94133); 
		zipRanges[1] = new CodeRange(94200,94299); 
		zipRanges[2] = new CodeRange(94226,94399); 
	 
		zipCodeIntervals.zipCodeRanges(zipRanges); 

	}

}

