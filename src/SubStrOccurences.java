
class Recursive{
	int total = 0;
   	public int subsrting_rec(String str, String sub, String mstr){
   	  //sub = "1";
   		//System.out.println(str);
   		//System.out.println(sub);
      //if ((sub.length() != mstr.length()) && (str.contains(sub) == true)){
    	  
    	  if(str.contains(sub)) {
    		  System.out.println(str);
         	 total +=1;
          }
         if( (sub.length() == mstr.length()) && (str.contains(sub) == false) ) {
        	 return total;
         }
         else if(str.contains(sub) == false ) {
        	 System.out.println(sub);
        	 sub = String.valueOf((Integer.parseInt(sub) * 10) + 1);
        	 
         }
         
         subsrting_rec(str.substring(str.indexOf(sub)+1), sub, mstr);
     // }
      
      return total;
   }
}

public class SubStrOccurences {

	public static void main(String[] args) {
		String str1 = "0110111", str2 = "1";
		Recursive r = new Recursive();
		System.out.println(r.subsrting_rec(str1,"11",str1));
	}

}
