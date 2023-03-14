package net.javaguides.sms;

import net.javaguides.sms.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TeacherManagementSystemApplication.class, args);
    }

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
