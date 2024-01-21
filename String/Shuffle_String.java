package String;

public class Shuffle_String {
    static String restore_string(int[] indices, String inputString)
    {
        int string_length=inputString.length();

        char[] arranged_character= new char[string_length];

        for (int i = 0; i < string_length; ++i) {
            arranged_character[indices[i]]=inputString.charAt(i);
        }
        return new String(arranged_character);
    }

    public static void main(String[] args) {
        String input="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        System.out.println(restore_string(indices,input));
    }
}
