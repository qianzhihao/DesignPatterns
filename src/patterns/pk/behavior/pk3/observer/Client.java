package patterns.pk.behavior.pk3.observer;

import patterns.pk.behavior.pk3.responsibilityChain.Recorder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        DnsServer sh = new SHDnsServer();
        DnsServer china = new ChinaTopDnsServer();
        DnsServer top = new GlobalTopDnsServer();
        china.setUpperServer(top);
        sh.setUpperServer(china);
        System.out.println("===DNS Simulate===");
        while (true) {
            System.out.println("\nPlease Insert a Domain(Press N to Exit)!");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if (domain.equalsIgnoreCase("n")) {
                return;
            }
            Recorder recorder = new Recorder();
            recorder.setDomain(domain);
            sh.update(null, recorder);
            System.out.println("===DNS Result===");
            System.out.println(recorder);
        }
    }
}
