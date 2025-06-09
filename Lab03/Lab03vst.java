package Lab03;

public class Lab03vst
{
    public static void main(String[] args)
{
    int starting_milliseconds =  10000123;
    int hours  = starting_milliseconds/3600000;
    int left_over = hours % 3600;
    int minutes = left_over/60;
    int seconds_left = left_over % 60;
    int MilliSeconds = seconds_left/1000;
        System.out.println("Lab 03, 80 Point Version\n");
        System.out.println("Starting Milliseconds: " + starting_milliseconds);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds_left);
        System.out.println("MilliSeconds: " + MilliSeconds);
}

}
