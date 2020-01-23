package _00_Text_Funkifier;

public class CustomString extends SpecialString{
	
		public CustomString(String s) {
			super(s);
		}

		@Override
		public String funkifyText(String s) {
			String ns="";
			String partsplus="";
			for (int i = 0; i < s.length(); i++) {
				if(i%3==0) {
				partsplus=s.substring(i,i+1);
				}else {
				partsplus="funky";
				}
				ns=ns+partsplus;
			}
			
			String reversed = "";
			for (int i = ns.length()-1; i >=0; i--) {
		reversed=reversed+ns.charAt(i);	
			}
			
			String ts="";
			String plus="";
			for (int i = 0; i < s.length(); i++) {
				if(i%2==0) {
				plus=reversed.substring(i,i+1).toLowerCase();	
				}else {
				plus=reversed.substring(i,i+1).toUpperCase();
				}
				ts=ts+plus;
			}
			return ts;
		}
		

}
