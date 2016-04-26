package chintan.rathod.databindingdemo.Model;

/**
 * Created by Rathod on 19-Mar-16.
 */
public class User  {

    public String displayName;
    public int age;
    public String profileImage;

    public User(String displayName, int age, String profileImage){
        this.displayName = displayName;
        this.age = age;
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }
}
