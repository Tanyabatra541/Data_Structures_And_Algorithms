public class LinearSearchString {
  public static void main(String[] args) {
    String str = "Tanya";
    int flag = 0;
    char target = 't';
    for(int i=0;i<str.length();i++){
      if(str.charAt(i) == target){
        flag = 1;
      }
    }
    if(flag == 0){
      System.out.println("Character not found");
    }
    else {
      System.out.println("Character found");
    }
  }
}
