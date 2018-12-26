package observer.step2;

/**
 * Author : Jongchan Kim - ace.kim@navercorp.com
 * Created date : 14/12/2018
 */
public interface Subject {
    public void registerObserver (Observer o);
    public void removeObserver (Observer o);
    public void notifyObservers();
}
