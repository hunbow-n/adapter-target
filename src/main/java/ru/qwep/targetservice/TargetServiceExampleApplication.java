package ru.qwep.targetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TargetServiceExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(TargetServiceExampleApplication.class, args);


//        System.out.println(new VendorManagerService().doOrder());
        VendorManagerService vendorManagerService = new VendorManagerService();
    }

}
