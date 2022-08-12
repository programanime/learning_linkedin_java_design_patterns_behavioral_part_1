public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence sentence";
    FirstLetterIsUpperCase firstLetterIsUpperCase = new FirstLetterIsUpperCase();
    context = firstLetterIsUpperCase.interpret(context);
    System.out.println(context);

  }

}
