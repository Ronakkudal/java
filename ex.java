public class ex {
    public static void printLetters(String str){
        for(int i =0; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

    }
    public static void main(String args []){
        String fullName = "Hey I am Ronak kudal form kanore udaipur ";
        printLetters(fullName);
    }

}
