package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String ns="";
		String partsplus="";
		for (int i = 0; i < s.length(); i++) {
			if(i%2==0) {
			partsplus=s.substring(i,i+1).toLowerCase();	
			}else {
			partsplus=s.substring(i,i+1).toUpperCase();
			}
			ns=ns+partsplus;
		}
		return ns;
	}

}
