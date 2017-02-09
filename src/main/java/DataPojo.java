import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataPojo {

    private int co;
    private int idx;
    private int pm10;
    private int timestamp;
    private int t;
    private int p;
    private int so2;
    private int no2;
    private int w;
    private int h;
    private int o3;
    private int pm25;
    private int d;

    public int getCo() {
        return co;
    }

    public void setCo(int co) {
        this.co = co;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getPm10() {
        return pm10;
    }

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getO3() {
        return o3;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public int getPm25() {
        return pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "DataPojo{" +
                "co=" + co +
                ", idx=" + idx +
                ", pm10=" + pm10 +
                ", timestamp=" + timestamp +
                ", t=" + t +
                ", p=" + p +
                ", so2=" + so2 +
                ", no2=" + no2 +
                ", w=" + w +
                ", h=" + h +
                ", o3=" + o3 +
                ", pm25=" + pm25 +
                ", d=" + d +
                '}';
    }
}
