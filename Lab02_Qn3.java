

public class Lab02_Qn3 {
    public static void main(String[] args) {
        long totalMilliseconds;
        long totalSeconds;
        long currentSeconds;
        long totalMinutes;
        long currentMinutes;
        long totalHours;
        long currentHour;

        totalMilliseconds = System.currentTimeMillis();
        totalSeconds = totalMilliseconds/1000;
        currentSeconds = totalSeconds%60;
        totalMinutes = totalSeconds/60;
        currentMinutes  = totalMinutes%60;
        totalHours = totalMinutes/60;
        currentHour = totalHours%24;

        System.out.println("Current time is " + currentHour +":"
        +currentMinutes + ":" + currentSeconds+" GMT");
        
        }





        
    }
    

