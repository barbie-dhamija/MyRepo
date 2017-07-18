import java.util.ArrayList;

import org.apache.xpath.operations.Lt;

public class TargetProgram extends GenericProgram {

	public static void main(String[] args) {
		
		int array[]={1,7,3,9,3,2,7,1,0,1,4};
		int l = array.length;
		int count=0;
		
		ArrayList<Integer> lt = new ArrayList<Integer>();
		lt.add(array[i]);
		
		
		/*0....r(int i=0;i<l-1;i++)
		{
			count=0;
			
			for(int j=0;j<l;j++)
			{ 
				
				if(array[i]==array[j])
				{
					count=count+1;
				}
			}
			*/
			//System.out.println(array[i]+ " comes " + count + " times ");
			//ArrayList<Integer> lt = new ArrayList<Integer>();
			//lt.add(array[i]);
			
			/*if(lt.contains(array[i+1]))
			{
		continue;
			}
		
			*/
		}
		
	
}
