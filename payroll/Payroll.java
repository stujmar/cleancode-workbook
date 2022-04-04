package payroll;
import static payroll.Constants.*;
import static payroll.Utils.*;

public class Payroll {

  public Money CalculatePay(Employee e) throws InvalidEmployeeType {
    switch (e.type) {
      case COMMISSIONED:
        return CalculateCommissionedPay(e);
      case HOURLY:
        return CalculateHourlyPay(e);
      case SALARIED:
        return CalculateSalariedPay(e);
      default:
        throw new InvalidEmployeeType();
    }
  }
  
}
