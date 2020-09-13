package example.ch01.servicelocator;

/**
 * https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
 */
public class Service2 implements Service{
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
