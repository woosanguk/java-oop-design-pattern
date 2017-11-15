package template_method.exercise_01;

import java.util.List;

public class SimpleReportGenerator extends ReportGenerator{

    protected boolean customerReportCondition(Customer customer) {
        return true;
    }

    protected String getReportHeader(List<Customer> customer) {
        return String.format("Number of customer : %d\n", customer.size());
    }

    protected String getReportForCustomer(Customer customer) {
        return String.format("%s: %d\n", customer.getName(), customer.getPoint());
    }

    protected String getReportFooter(List<Customer> customers) {
        return "";
    }
}
