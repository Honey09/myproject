import java.util.Arrays;



// 2,40,30,50,60,70

//x = 5
//Find the next highest number after x and return the index 
// if we dont have any elements with the value which is greater than x  then return -1

public class gethighestnumber {
	public static void main(String[] arg){
		int t=new gethighestnumber().gethighestnumber();
		System.out.println("HighestNumber : "+t);
	}
	public int gethighestnumber() {
		int temp=0,x=5;
		int a[] = { 2,3,30, 40, 50, 60, 20 };
		Arrays.sort(a);
		for (int i = 0; i < a.length;i++) {
			if (x < a[i]) {
				temp = i;
				return temp;
			} else {
				temp= -1;
				//return 0;
			}
		}
		System.out.println(temp);
		return temp;
		
	}

}
