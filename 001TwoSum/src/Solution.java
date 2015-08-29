public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 1;
	int index2 = 1;
	for(int i = 0 ; i< numbers.length;i++) {
		for(int j= i+1 ; j< numbers.length;j++) {
			if(numbers[i]+numbers[j] == target) {
				index1 = i+1;
				index2 = j+1;
				break;
			}
		}
	}
	int[] result = new int[2];
	result[0] = index1;
	result[1] = index2;
	return result;
    }
}