package week1.day3;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//We learn Java basics as part of java sessions in java week1
			
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		
			
		for (int i = 0; i < split.length; i++) {
			
			for (int j = i; j < split.length; j++) {
				
			if(split[i].equalsIgnoreCase(split[j])); {
				count++;
			}
						}
			System.out.println(count);
			
			
			
		}
		
	}

}
		
