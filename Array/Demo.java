package Array;

public class Demo {
    static String interpret(String command) {
//        String s=new String();
//
//        for (int i = 0; i < command.length()-1; i++) {
//            if(command.charAt(i)=='(' & command.charAt(i+1)==')'){
//                s += '0';
//            }else{
//                s+=command.charAt(i);
//            }
//        }
//        return s;
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        String str="G()(al)";
        System.out.println(interpret(str));
    }
}
