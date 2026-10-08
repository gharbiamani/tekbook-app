package tn.tekup.tekbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TekbookApplication {

    private static final String LAB_VERSION = "Lab3-hot";

    public static void main(String[] args) {
        SpringApplication.run(TekbookApplication.class, args);
    }
}
