/**
 * This class define the frames of the comic
 *
 * @author: Ricardo
 */

public class Marco{

    private String text;
    private String image;

    /**
     * This constructor receive the text of the frame of the comic
     *
     * @param text
     */
    public Marco(String text, String image){
        this.image = image;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
