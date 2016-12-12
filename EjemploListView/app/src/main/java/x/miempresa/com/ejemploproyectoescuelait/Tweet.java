package x.miempresa.com.ejemploproyectoescuelait;

/**
 * Created by jose on 12/12/16.
 */

public class Tweet {
    public  int image;
    public String title;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Tweet(){
        super();
    }

    public Tweet(int image, String title){
        super();
        this.image = image;
        this.title = title;

    }
}
