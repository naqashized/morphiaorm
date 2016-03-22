package morphiaorm.models;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 * Created by tahirmacbook on 02/03/2016.
 */
@Entity("posts")
@Indexes(
        @Index(value = "title", fields = @Field("title"))
)
public class Post {

    @Id
    private ObjectId id;
    private String title;
    private String description;
    @Reference
    private User user;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
