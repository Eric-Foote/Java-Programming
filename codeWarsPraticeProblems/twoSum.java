/* Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different items in the array that, when added together, give the target value.
 * The indices of these items should then be returned in a tuple like so: (index1, index2).
 * For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
 * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target will always be the sum of two different items from that array).
 * Based on: http://oj.leetcode.com/problems/two-sum/
 * twoSum [1, 2, 3] 4 === (0, 2) 
 */

public class twoSum {

public static int[] twoSum(int[] numbers, int target)
{
        int[] solution = new int[2];
        int newtarget;
        for(int i = 0; i < numbers.length; i++)
        {
                newtarget = target - numbers[i];
                for (int j = i + 1; j < numbers.length; j++) {
			 if((newtarget - j) == 0){       
				 solution[0] = i;
                                 solution[1] = j;
			 } 
		}
	}
	return solution;
}
       	public static void main (String[] args) 
    {
	int [] test = {1,2,3};
	int testTarget = 4;
	int [] solution = twoSum(test,testTarget);
	for(int i = 0; i <= solution.length; i++)
		System.out.println(solution[i]);
    }

}





