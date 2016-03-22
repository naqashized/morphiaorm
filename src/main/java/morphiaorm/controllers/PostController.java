package morphiaorm.controllers;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import morphiaorm.models.Post;
import morphiaorm.models.User;
import morphiaorm.util.MorphiaUtil;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tahirmacbook on 02/03/2016.
 */
public class PostController {

    MorphiaUtil morphiaUtil = new MorphiaUtil();

    public void save(Post post){

        Datastore ds = morphiaUtil.getMorphiaSource();
        ds.save(post);
    }

    public List<Post> getAll(){

        //Using Morphia
        Datastore ds = morphiaUtil.getMorphiaSource();
        return ds.createQuery(Post.class).asList();
    }

    public void saveUser(User user){


        Datastore ds = morphiaUtil.getMorphiaSource();
        ds.save(user);
    }
}
