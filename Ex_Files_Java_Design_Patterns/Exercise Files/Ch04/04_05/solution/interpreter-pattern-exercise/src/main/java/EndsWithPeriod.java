public class EndsWithPeriod implements Expression {

  public String interpret(String context) {
    context = HelperMethods.endsWithPeriod(context);
    return context;
  }
}
