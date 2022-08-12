public class NoRepeatedWords implements Expression {

  EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

  public String interpret(String context) {

    context = HelperMethods.noRepeatedWords(context);

    return endsWithPeriod.interpret(context);
  }

}
