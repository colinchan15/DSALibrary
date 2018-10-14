public class Configuration {


    String config;
    int score;
    Configuration next;

    public Configuration(String config, int score) {
        this.config = config;
        this.score = score;
    }

    public String getStringConfiguration() {
        return config;
    }

    public int getScore() {
        return score;
    }


}
