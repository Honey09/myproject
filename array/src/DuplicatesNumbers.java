import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesNumbers {

	/**
	 * @param args
	 */
	public static int[] rmDuplicates(int[] num){
		//int [] num={25,52,25,65,8,96,8,25};
		String s="";
		for (int i = 0; i < num.length; i++) {
		if(!s.contains(String.valueOf(num[i])))
		s+=num[i]+",";
		}
		System.out.println(s+"\n");
		String stringArray[]=s.split(",");
		int [] uniqnum=new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) 
		uniqnum[i]=Integer.parseInt(stringArray[i]);
		return uniqnum;
	}

	public static int[] removeDuplicates(int[] input){
        
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }    
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1] TYPE 1
	        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
	        int[] output1 = removeDuplicates(input1);
	        for(int i:output1){
	            System.out.print(i+" ");
	        }
	        
	    // 2] TYPE 2
	        int[] input2={25,52,25,65,8,96,8,25};
	        int[] output2 = rmDuplicates(input2);
	        for(int i:output2){
	            System.out.print(i+" ");
	        }
		
		// 3] TYPE 3 
		int[] array = { 2, 2, 3, 4, 5, 5, 6, 6, 6, 7 };
		Map<Integer, Integer> map = new Hashtable<Integer, Integer>();
		for (int ch : array) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		Iterator<?> iterator=map.entrySet().iterator();
		while(iterator.hasNext()){
		Map.Entry<Integer, Integer> enrty=(Entry<Integer, Integer>) iterator.next();
		if(enrty.getValue()>1){
			iterator.remove();
		}else{
			System.out.println("uniquvalue "+enrty.getKey());
		}
		}
		
		

	}

}
