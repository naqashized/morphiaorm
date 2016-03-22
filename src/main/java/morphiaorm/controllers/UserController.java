package morphiaorm.controllers;

import morphiaorm.models.Post;
import morphiaorm.models.User;
import morphiaorm.util.MorphiaUtil;
import org.mongodb.morphia.Datastore;

import java.util.List;

/**
 * Created by tahirmacbook on 10/03/2016.
 */
public class UserController {

    MorphiaUtil morphiaUtil = new MorphiaUtil();

    public void saveUser(User user){


        Datastore ds = morphiaUtil.getMorphiaSource();
        ds.save(user);
    }

    public List<User> getAllUsers(){

        Datastore ds = morphiaUtil.getMorphiaSource();
        return ds.createQuery(User.class).asList();
    }
}
