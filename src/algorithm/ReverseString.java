package algorithm;
class ReverseString {
    public static void main (String[] args){
    	ReverseString a = new ReverseString();
    	char [] s ={'h','e','l','l','o','w'};
    	a.reverseString(s);
    }
	
	public void reverseString(char[] s) {
        int limit = 0 ;
        if(s.length%2 == 0){
        	limit = s.length/2 -1;
        }else{
        	limit = s.length;
        }
        for(int i = 0; i <=limit; i++){
            char a = s[i];
            char b = s[s.length-1-i];
            s[i] = b;
            s[s.length-1-i] = a;
        }
    }
}