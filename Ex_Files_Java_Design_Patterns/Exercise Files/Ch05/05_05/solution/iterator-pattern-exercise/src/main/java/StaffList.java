public class StaffList implements Iterable {

  private Employee[] employees;

  public StaffList(Employee...employees) {
    this.employees = employees;
  }

  public Employee[] getEmployees() {
    return employees;
  }

  public StaffListIterator iterator() {
    return new StaffListIterator(this);
  }
}
