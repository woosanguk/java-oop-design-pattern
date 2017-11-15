package template_method.exercise_01;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]){
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("hong", 150));
        customers.add(new Customer("woo", 350));
        customers.add(new Customer("bu", 50));
        customers.add(new Customer("jeoun", 450));
        customers.add(new Customer("cho", 550));

        SimpleReportGenerator simpleReportGenerator = new SimpleReportGenerator();
        System.out.println(simpleReportGenerator.generate(customers));

        ComplexReportGenerator complexReportGenerator = new ComplexReportGenerator();
        System.out.println(complexReportGenerator.generate(customers));

    }
}
