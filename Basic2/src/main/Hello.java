package main;

import java.util.Scanner;

//Say what needs to be changed rather than what to do
public class Hello 
{
	private static void printArray(int[] b) 
	{
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
	}
	
	public static void main(String[] args) 
	{
		//System.out.println("Enter any word");
		Scanner in = new Scanner(System.in);/*
        String word = in.next();
        printPattern(word);
        
        int[] a = {2,3,4,5,1,2,3,7,8,3,1};
        int[] b = sumConsecutive(a);
        printArray(b);
        
        int[] ar = {2,4,5,6,23,45,67,0,0,0,0,0,0,0};
        int n = 7;
        int x = 26, pos = 2;
        
        System.out.println("After inserting x : "+x + " at index : "+pos);
        insertAtPos(ar,n,pos,x);
        printArray(ar);
        
        int[] kr = {234,435,324,465,7,455,4,67,45,3,0,0,0};
        int idx = 2;
        deleteAtPos(kr,idx);
        System.out.println("After deleting at index : "+idx);
        printArray(kr);
        
        int[] set1 = {1,2,3,4,5,6,7,8,9,10};
        int[] set2 = {2,4,6,8,10,11,12,13,14,15};
        int[] intersect = intersection(set1,set2);
        System.out.print("Intersection : ");
        printArray(intersect);
        */
        
        int[] nums = {234,324,0,0,23,0,0,10,12,0,56,0,0};
        System.out.println("Total Zeroes : "+ countZeros(nums));
        System.out.println("Elements before first Zero : "+ countElementsBeforeFirstZero(nums));
        shiftZerosToEnd(nums);
        printArray(nums);
        int[] arr = {101,10,30,33,0,100};
        System.out.println("Total Zeros in digit : "+ countZerosInDigits(arr));
        in.close();
	}
	
	private static int countZerosInDigits(int[] nums)
	{
		int count=0;
		
		for(int i=0;i<nums.length;i++)
		{
			int n = nums[i];
			if(n==0)
			{
				count++;
				continue;
			}
			while(n>1)
			{
				int temp = n%10;
				if(temp==0) count++;
				n/=10;
			}
		}
		return count;
	}
	
	private static void shiftZerosToEnd(int[] nums)
	{
		if (nums == null || nums.length == 0) 
		{
            return;
        }
        
        int index = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != 0) 
            {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) 
        {
            nums[index++] = 0;
        }
	}
	
	private static int countElementsBeforeFirstZero(int[] nums)
	{
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0) break;
			count++;
		}
		return count;
	}
	
	private static int countZeros(int[] nums)
	{
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0) count++;
		}
		return count;
	}
	/* 
	private static int[] intersection(int[] set_a,int[] set_b)
	{
		
		return null;
	}

	private static void deleteAtPos(int[] kr, int idx) 
	{
		if(idx >= kr.length)
		{
			ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
			throw e;
		}
		for(int i=idx;i<kr.length-2;i++)
		{
			kr[i] = kr[i+1];
		}
		kr[kr.length-1] = 0;
	}

	private static void insertAtPos(int[] ar, int n, int pos, int x) 
	{
		for(int i=n;i>pos-1;i--)
		{
			ar[i] = ar[i-1];
		}
		ar[pos] = x;
	}

	
	
	private static void printPattern(String word)
	{
		for(int i=0;i<word.length();i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(word.charAt(j));
			System.out.println();
		}
	}

	private static int[] sumConsecutive(int[] a) 
	{
		int length = a.length;
		int[] b;
		if(length%2==0) b = new int[length/2];
		else 
		{
			b = new int[length/2+1];
			b[length/2] = a[length-1];
		}
		for(int i=0;i<length/2;i++)
		{
			b[i] = a[2*i] + a[2*i+1];
		}
		return b;
	}*/
}
