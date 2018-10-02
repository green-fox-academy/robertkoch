package greenfox.groot;

public class GrootTranslate {
    private String received;
    private String translated;
    private String error;



    public GrootTranslate() {
    }

    public GrootTranslate(String error) {
        this.error = error;
    }

    public GrootTranslate(String received, String translated) {
        this.received = received;
        this.translated = translated;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
