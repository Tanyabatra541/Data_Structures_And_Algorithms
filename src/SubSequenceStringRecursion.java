public class SubSequenceStringRecursion {
  public static void main(String[] args) {
      subSeq("", "abc");
  }
  static void subSeq(String subString, String original){
     if(original.isEmpty()) {
       System.out.println(subString);
       return;
     }
     char ch = original.charAt(0);
     subSeq(subString+ch,original.substring(1));
     subSeq(subString,original.substring(1));
  }
}
