package uk.co.andymccall.docker.model;

public class PingJsonResponse extends JsonResponse {

    private Ping result;

    public Ping getResult() {
        return result;
    }

    public void setResult(Ping result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "PingJsonResponse{" +
                "status=" + super.getStatus() +
                ", result='" + result + '\'' +
                ", error='" + super.getError() +
                '}';
    }
}