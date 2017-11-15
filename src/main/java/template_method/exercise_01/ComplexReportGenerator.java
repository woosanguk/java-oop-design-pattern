package template_method.exercise_01;

import java.util.List;

public class ComplexReportGenerator extends ReportGenerator{
    protected boolean customerReportCondition(Customer customer) {
        return customer.getPoint() >= 100;
    }

    protected String getReportHeader(List<Customer> customer) {
        return String.format("Number of customer : %d\n", customer.size());
    }

    protected String getReportForCustomer(Customer customer) {
        return String.format("%s: %d\n", customer.getName(), customer.getPoint());
    }

    protected String getReportFooter(List<Customer> customers) {
        int totalPoint = 0;
        for (Customer customer:customers){
            totalPoint += customer.getPoint();
        }
        return String.format("Total Point : %d", totalPoint);
    }
}
