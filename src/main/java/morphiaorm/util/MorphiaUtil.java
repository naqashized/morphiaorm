package morphiaorm.util;

import com.mongodb.MongoClient;
import morphiaorm.models.Post;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by tahirmacbook on 02/03/2016.
 */
public class MorphiaUtil {

    final Morphia morphia = new Morphia();;
    final MongoClient mongo = new MongoClient();
    final String dbName = "cms";

    public MorphiaUtil(){
        init();
    }

    public void init(){
    }

    public Datastore getMorphiaSource(){

        Datastore ds = morphia.createDatastore(mongo, dbName);
        return ds;
    }

    public void closeMongo(){

    }
}
