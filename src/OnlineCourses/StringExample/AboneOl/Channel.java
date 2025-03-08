package OnlineCourses.StringExample.AboneOl;

public class Channel {
    private int subscribers;
    private String name;

    Channel(String name, int subscribers) {
        this.name = name;
        this.subscribers = subscribers;
    }

    public void subscribe() {
        subscribers++;
        System.out.println("thanks");
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public int getSubscribers() {
        return subscribers;
    }

}
