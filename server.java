package RMI;

import java.rmi.Naming;

public class server {
    public static void main(String[] args) {
        String registryHost = System.getenv().getOrDefault("RMI_HOST", "localhost");
        String registryPort = System.getenv().getOrDefault("RMI_PORT", "1099");
        String serviceName = "calculator";

        try {
            calculatorImpl service = new calculatorImpl();
            String serviceUrl = "rmi://" + registryHost + ":" + registryPort + "/" + serviceName;
            Naming.rebind(serviceUrl, service);
            System.out.println("RMI calculator registered at " + serviceUrl);
        } catch (Exception e) {
            System.err.println("Unable to start RMI server: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
