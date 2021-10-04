import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VampireNumber {

	
	public static void main(String[] args) {
		
		int vampireNumber,firstNumber,secondNumber;
		firstNumber=1;
		secondNumber=1;
		
		System.out.println("Printing first 100 vampier numbers");
		
		int count=1;
		
		Vector<Integer> vNumbers = new Vector<Integer>();
		
		for(int j=1;j<1000;j++){
			int order=0,m=j;
			while(m>0){		// to check for order of j
				m=m/10;
				order++;
			}
			int i = j;
			int limit = (int) Math.pow(10, order);
			
			//checks for i,j whether they have same number of digits or not.
			for(;i<limit;i++){		
				firstNumber=j;
				secondNumber=i;
				
				vampireNumber=firstNumber*secondNumber;
				
				
				//both the numbers can't have zeros at the end
				if(firstNumber%10 == 0 && secondNumber%10==0){		
					continue;
				}
				
				Vector<Integer> bothNumbers = new Vector<Integer>();
				Vector<Integer> vampNumber = new Vector<Integer>();
				
				int fNum=firstNumber, sNum=secondNumber, vNum=vampireNumber;
				
				// Adding digits of first number in bothNumbers vector
				while(fNum>0){
					bothNumbers.addElement(new Integer(fNum%10));
					fNum=fNum/10;
				}
				

				while(sNum>0){
					bothNumbers.addElement(new Integer(sNum%10));
					sNum=sNum/10;
				}
				
				while(vNum>0){
					vampNumber.addElement(new Integer(vNum%10));
					vNum=vNum/10;
				}
				

				if(vampNumber.size() != vampNumber.size()){
					continue;
				}
				
				
				Collections.sort(bothNumbers);
				Collections.sort(vampNumber);
				
				

				if(bothNumbers.equals(vampNumber)){
					vNumbers.addElement(new Integer(vampireNumber));
					count++;
				}
				
				
				
				if(count==125){		
					break;
				}
				
				
			}
			if(count==125){
				break;
			}
						
		}
		//sort the vampire numbers
		Collections.sort(vNumbers);
		Iterator<Integer> itr = vNumbers.iterator();
		count=1;
		while(itr.hasNext()){
			System.out.println(count + ". " + itr.next());
			count++;
			if(count>100){
				break;
			}
			
		}
		
	}

}
