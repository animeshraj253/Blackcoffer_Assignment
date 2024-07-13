package raj.animesh.internshipprogramapp1;

public class listType {

    private String name;

    private String location;

    private String distance;

    private String activity;

    private String status;

    private int progress;

    private int image;

    private String cardName;

    public String getName() {
        return name;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public listType(String name, String cardName,String location, String distance, String activity, String status, int progress, int image) {
        this.name = name;
        this.cardName = cardName;
        this.location = location;
        this.distance = distance;
        this.activity = activity;
        this.status = status;
        this.progress = progress;
        this.image = image;
    }
}
