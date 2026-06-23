package toper_world;

public class SplitExample39 {
    public static void main(String[] args) {
        String str="java string split method by Technolamror";
        System.out.println(str);
       String[]res= str.split("\\s");
       for (String s:res){
           System.out.println(s);
       }
    }
}
