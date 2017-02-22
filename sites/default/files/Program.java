//Main program class
public class Program
{

//Declares the Arduino object field
public static ArduinoComm myArduino;

   //Main method
   public static void main(String args[]) 
   {
      myArduino = new ArduinoComm();
      myArduino.start("/dev/ttyUSB0",115200);
   }

}
