import java.util.Arrays;



// 2,40,30,50,60,70

//x = 5
//Find the next highest number after x and return the index 
// if we don't have any elements with the value which is greater than x  then return -1

public class HighestNumber {
	public static void main(String[] arg){
		int number=new HighestNumber().gethighestnumber();
		System.out.println("HighestNumber : "+number);
	}
	public int gethighestnumber() {
		int temp=0,x=5;
		int array[] = { 2,3,30, 40, 50, 60, 20 };
		Arrays.sort(array);
		for (int i = 0; i < array.length;i++) {
			if (x < array[i]) {
				temp = i;
				return temp;
			} else {
				temp= -1;
			}
		}
		System.out.println(temp);
		return temp;
		
	}

}
