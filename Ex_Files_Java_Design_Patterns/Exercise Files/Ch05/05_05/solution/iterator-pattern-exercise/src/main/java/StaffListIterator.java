import java.util.Iterator;

public class StaffListIterator implements Iterator {

  private StaffList staffList;
  private int index;

  public StaffListIterator(StaffList staffList) {
    this.staffList = staffList;
    index = 0;
  }

  public boolean hasNext() {
    Employee[] employees = staffList.getEmployees();
    if (index < employees.length) {
      return true;
    } else {
      return false;
    }
  }

  public Employee next() {
    Employee[] employees = staffList.getEmployees();
    if (hasNext()) {
      return employees[index++];
    } else {
      return null;
    }
  }

  public void remove() {

  }
}
