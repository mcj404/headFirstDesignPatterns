package intro.observerPattern.interfaces;

public interface Subject {
    /**
     * Registers an observer to receive updates from this subject.
     *
     * @param o the observer to be registered
     */
    void registerObserver(Observer o);
    /**
     * Removes an observer so that it no longer receives updates from this subject.
     *
     * @param o the observer to be removed
     */
    void removeObserver(Observer o);
    /**
     * Notifies all registered observers of a change in the subject.
     *
     * @see #registerObserver(Observer)
     */
    void notifyObservers();
}
