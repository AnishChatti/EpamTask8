package epam.TDD;

public class RemoveChar_A {

	public String removea(String input) {
		int deleteCount=0;
StringBuffer inputBuffer=new StringBuffer(input);
for(int index=0;(index<inputBuffer.length()&&index<2);index++)
{
	if(inputBuffer.charAt(index)=='A')
	{
		inputBuffer.deleteCharAt(index);
		deleteCount++;
		index--;
}
	if(deleteCount==2)
		break;
	
}
		return inputBuffer.toString();
	}

}
