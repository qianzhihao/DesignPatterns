package patterns.pk.behavior.pk3.responsibilityChain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        DnsServer sh = new SHDnsServer();
        DnsServer china = new ChinaTopDnsServer();
        DnsServer top = new TopDnsServer();
        china.setUpperServer(top);
        sh.setUpperServer(china);
        System.out.println("===Domain Simulate===");
        while (true) {
            System.out.println("\nPlease Enter Domain(Press N to exit)!");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (domain.equalsIgnoreCase("n")) {
                return;
            }
            Recorder recorder = sh.resolve(domain);
            System.out.println("===DNS Result:===");
            System.out.println(recorder);
        }
    }
}
