package RemovingDuplicates;

public class DuplicateGENERALMethod {

	public static void main(String[] args) {
		String[] str={"java","c","c++","java","python","c"};
		
		for(int i=0;i<str.length;i++){
			
			for(int j=i+1;j<str.length;j++){
				
				if(str[i].equals(str[j])){
					
					System.out.println("Duplicate is   "  +str[i]);
				}
							}
		}

	}

}
