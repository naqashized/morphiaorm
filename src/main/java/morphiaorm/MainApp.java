package morphiaorm;

import morphiaorm.controllers.PostController;
import morphiaorm.controllers.UserController;
import morphiaorm.models.Post;
import morphiaorm.models.User;
import org.apache.camel.main.Main;

import java.util.List;

/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
//        Main main = new Main();
//        main.enableHangupSupport();
//        main.addRouteBuilder(new MyRouteBuilder());
//        main.run(args);
//        PostController postController = new PostController();
//        Post post = new Post();
//        post.setTitle("first post");
//        post.setDescription("description goes here");
//        User user = new User();
//        user.setName("Tahir");
//        postController.saveUser(user);
//        post.setUser(user);
//        postController.save(post);
//        List<Post> posts = postController.getAll();
//        System.out.println("Posts =>"+posts.size());
        getUsers();
    }

    public static void getUsers(){

        UserController userController = new UserController();
        List<User> users = userController.getAllUsers();
        for(User user : users){
            System.out.println("users =>"+user.getName());
        }
    }

}

