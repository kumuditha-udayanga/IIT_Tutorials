package Tutorial5.Q7;
import java.time.LocalTime;

public class Clock {
  public int getHours () {
    return LocalTime.now().getHour();
  }

  public int getMinutes () {
    return LocalTime.now().getMinute();
  }

  public String getTime () {
    String hours = String.valueOf(getHours());
    String minutes = String.valueOf(getMinutes());
    return hours+":"+minutes;
  }

  public String setAlarm (int hours, int minutes) {
    String alarmTime = hours + ":" +minutes;
    String time = getTime();

    while (!alarmTime.equals(time)) {
      time = getTime();
    }

    return time + " Alarm!!";
  }

  public static void main(String[] args) {
    Clock al = new Clock();
    System.out.println(al.setAlarm(0, 31));

  }
}
