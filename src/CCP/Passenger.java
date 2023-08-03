package CCP;
import java.util.Date;

public class Passenger implements Runnable{
    String name;
    Date inTime;
    
    public String getName() {
        return name;
    }
 
    public Date getInTime() {
        return inTime;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }
    
    public void run(){
        
    }
}
