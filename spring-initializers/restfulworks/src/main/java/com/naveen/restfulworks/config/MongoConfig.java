package com.naveen.restfulworks.config;

import com.naveen.restfulworks.beans.Employee;
import com.naveen.restfulworks.repo.EmployeeRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
// the EmployeeRepo.class shall have CRUD operation + custom code +
// it is possible to have multiple repo then you code shall look like this
//@EnableMongoRepositories(basePackageClasses ={ EmployeeRepo.class, UserRepo.class})
@EnableMongoRepositories(basePackageClasses = EmployeeRepo.class)
public class MongoConfig {

//    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepo repo) {
       return args ->  repo.insert(new Employee(101, "Naveen",
                1234, "naveen@naveen.com"));

//        return null;
    }
}
