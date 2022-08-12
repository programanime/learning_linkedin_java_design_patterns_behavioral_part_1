public class FirstLetterIsUpperCase implements Expression {

  private NoRepeatedWords noRepeatedWords = new NoRepeatedWords();

  public String interpret(String context) {

    context = HelperMethods.firstLetterLowerCase(context);
    return noRepeatedWords.interpret(context);


  }
}
