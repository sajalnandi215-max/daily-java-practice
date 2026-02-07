public class CountCharacters {
    public static void main(String[] args){
        String s = "hello world";
        int letters=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) letters++;
        }
        System.out.println("Letters: "+letters);
    }
}