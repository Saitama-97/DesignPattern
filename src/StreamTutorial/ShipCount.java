package StreamTutorial;

/**
 * @Time   : 2023/7/5 14:51
 * @File   : ShipCount.java
 * @Type   : Class
 * @Package: StreamTutorial
 * @Project: DesignPatterns
 * @Author : Saitama
 * @IDE    : IntelliJ IDEA
 * @Des    :
 */

public class ShipCount {
    public int upCount;
    public int downCount;
    public int totalCount;
    public String markerId;

    public ShipCount() {
    }

    public String getMarkerId() {
        return markerId;
    }

    public void setMarkerId(String markerId) {
        this.markerId = markerId;
    }

    public int getTotalCount() {
        return this.upCount+this.downCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public ShipCount(String markerId, int upCount, int downCount) {
        this.markerId = markerId;
        this.upCount = upCount;
        this.downCount = downCount;
    }

    public int getUpCount() {
        return upCount;
    }

    public void setUpCount(int upCount) {
        this.upCount = upCount;
    }

    public int getDownCount() {
        return downCount;
    }

    public void setDownCount(int downCount) {
        this.downCount = downCount;
    }
}
