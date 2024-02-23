//package hiber;
//
//import web.config.AppConfig;
//import web.model.User;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import web.service.UserService;
//
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        UserService userService = context.getBean(UserService.class);
//
////        userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
////        userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
////        userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
////        userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
//
//        List<User> users = userService.listUser();
//
//        for (User user : users) {
//            System.out.println("Id = " + user.getId());
//            System.out.println("First Name = " + user.getFirstName());
//            System.out.println("Last Name = " + user.getLastName());
//            System.out.println("Email = " + user.getEmail());
//            System.out.println();
////            userService.deleteUser(user);
//        }
//        User user1 = new User("User7", "Lastname7", "user7@mail.ru");
//        userService.add(user1);
//
//        context.close();
//    }
//}