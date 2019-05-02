package com.envers.example;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main Class for Dao layer methods
 * @author 13354
 *
 */
public class AppMain {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        try {
            ctx.scan("com.envers.example");
            ctx.refresh();
            ctx.register(AppConfig.class);
            ctx.register(HibernateConfiguration.class);

            User newUser = new User();
            newUser.setId(1l);
            newUser.setUserName("NAME");
            newUser.setUserAddress("userAddress");
            
            UserDaoImpl userDao = ctx.getBean(UserDaoImpl.class);
            
            // save user
            userDao.addUser(newUser);
            
            // update user info
            newUser.setUserAddress("newAddress");
            userDao.updateUser(newUser);
        }
        catch (Exception sqlException) {
            sqlException.printStackTrace();
        }
        finally {
            ctx.close();
        }
    }
}
