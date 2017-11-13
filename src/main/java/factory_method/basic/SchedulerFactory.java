package factory_method.basic;

import java.util.Calendar;

/**
 * Created by sanguk on 13/11/2017.
 */
public class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStrategyId strategyId) {
        ElevatorScheduler scheduler = null;
        switch (strategyId) {
            case RESPONSE_TIME:
                scheduler = ResponseTimeScheduler.getInstance(); //new ResponseTimeScheduler();
                break;
            case THROUGHPUT:
                scheduler = ThroughputScheduler.getInstance(); //new ThroughputScheduler();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12) {
                    scheduler = ResponseTimeScheduler.getInstance(); //new ResponseTimeScheduler();
                } else {
                    scheduler = ThroughputScheduler.getInstance(); //new ThroughputScheduler();
                }
                break;
        }
        return scheduler;
    }
}
