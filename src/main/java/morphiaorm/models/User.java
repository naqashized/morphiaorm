package morphiaorm.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 * Created by tahirmacbook on 02/03/2016.
 */


    @Entity("users")
    @Indexes(
            @Index(value = "name", fields = @Field("name"))
    )
    public class User {
        @Id
        private ObjectId id;
        private String name;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

