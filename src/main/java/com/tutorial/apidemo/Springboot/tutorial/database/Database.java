package com.tutorial.apidemo.Springboot.tutorial.database;


import com.tutorial.apidemo.Springboot.tutorial.repositories.ProductRepository;
import com.tutorial.apidemo.Springboot.tutorial.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                Product productA = new Product("Macbook Pro 16", 2020, 2400.0, "");
//                Product productB = new Product("Dell 5570", 2018, 1800.0, "");
//                logger.info("insert data: " + productRepository.save(productA));
//                logger.info("insert data: " + productRepository.save(productB));
            }

        };

    }

    @Bean
    CommandLineRunner initDBUser(UserService userService){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                userService.saveRole(new Role(null, "ROLE_USER"));
//                userService.saveRole(new Role(null, "ROLE_ADMIN"));
//
//                userService.saveUser(new User(null, "Vu Dang Dai", "admin", "1234", new ArrayList<>()));
//                userService.saveUser(new User(null, "Ngo Trong Hoang", "user", "1234", new ArrayList<>()));
//
//
//                userService.addRoleToUser("admin", "ROLE_ADMIN");
//                userService.addRoleToUser("user", "ROLE_USER");

//                userService.saveRole(new Role(null, "ROLE_USER"));
//                userService.saveRole(new Role(null, "ROLE_MANAGER"));
//                userService.saveRole(new Role(null, "ROLE_ADMIN"));
//                userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//                userService.saveUser(new User(null, "Vu Dang Dai", "daivu", "1234", new ArrayList<>()));
//                userService.saveUser(new User(null, "Ngo Trong Hoang", "hoangngo", "1234", new ArrayList<>()));
//                userService.saveUser(new User(null, "Nguyen Xuan Huong", "huongxuan", "1234", new ArrayList<>()));
//                userService.saveUser(new User(null, "Nguyen Lam Son", "sonnguyen", "1234", new ArrayList<>()));
//
//
//                userService.addRoleToUser("daivu", "ROLE_USER");
//                userService.addRoleToUser("hoangngo", "ROLE_MANAGER");
//                userService.addRoleToUser("daivu", "ROLE_MANAGER");
//                userService.addRoleToUser("huongxuan", "ROLE_ADMIN");
//                userService.addRoleToUser("sonnguyen", "ROLE_SUPER_ADMIN");
//                userService.addRoleToUser("sonnguyen", "ROLE_ADMIN");
//                userService.addRoleToUser("sonnguyen", "ROLE_USER");

            }
        };
    }

}
