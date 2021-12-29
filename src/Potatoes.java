public class Potatoes {
    public static void main (String[] args){
//        have a string to store the sentance
//        function to return number of times potato is in the sentance
//        add a variable for a counter
//        loop through the string to find potato

        String sentance = "potatoapplepotato";
        int counter = 0;

        int length = sentance.length();
        System.out.println("the length of the string is " + length);

        char p = 'p';
        char o = 'o';
        char t = 't';
        char a = 'a';

for(int i=0; i<length; i=i+6) {

//   if(sentance.charAt(i) + sentance.charAt(i+1) + sentance.charAt(i+2) + sentance.charAt(i+3) + sentance.charAt(i+4) + sentance.charAt(i+5) + sentance.charAt(i+6) == p + o + t + a + t + o){
    if(sentance.charAt(i)==p && sentance.charAt(i+1)==o && sentance.charAt(i+2)==t && sentance.charAt(i+3)==a && sentance.charAt(i+4)==t && sentance.charAt(i+5)==o){
       counter++;
       System.out.println("inside if");
   }
else {
       System.out.println("do nothing");
   }

//    if (sentance.contains("p" + "o" + "t" + "a" + "t" + "o")) {
//        counter++;
//    }

}
        System.out.println("The number of times potato comes in the sentance is " + counter);
    }
}
