package example.ch01.servicelocatorpattern;

/**
 * https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService(("Service1"));
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
