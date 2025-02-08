package intro.observerPattern.interfaces;

public interface Observer {
    /**
     * Updates the observer with the latest measurements from the
     * weather monitoring station.
     *
     * @param temp the current temperature
     * @param humidity the current humidity
     * @param pressure the current atmospheric pressure
     */
    void update(float temp, float humidity, float pressure);
}
