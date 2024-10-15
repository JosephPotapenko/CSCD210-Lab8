package cscd210classes;

import java.text.DecimalFormat;

public class Clock
{

   private int hour;
   private int minute;
   private int second;
   
  /* This is gonna be a DVC (Default Value 
     Constructor) to follow these instructions 
     in the API:
    "DVC that sets the hour to 12 and minutes and seconds to 0
     Must use the this method"*/  
   public Clock()
   {
      this.hour = 12;
      this.minute = 0;
      this.second = 0; 
   }
   
  /* This is a EVC (Explicit Value Constructor)
     built according to these instructions in 
     the API:
    "The EVC that sets the hour, minute 
     and second to the values passed in." */
   public Clock(final int hour, final int minute, final int second)
   {
      if(hour < 0 || minute < 0 || second < 0 || hour > 23 || minute > 59 || second > 59)
         throw new IllegalArgumentException("Bad parameters Clock");
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   
   //this method returns hours when referenced
   public int getHour(){return this.hour;}
   
   //this method returns minutess when referenced
   public int getMinutes(){return this.minute;}
   
   //this method returns seconds when referenced
   public int getSeconds(){return this.second;}
   
   //this method sets hour to a new value
   public void setHour(final int hour)
   {
      if(hour < 0)
         throw new IllegalArgumentException("Bad parameters setHour");
      
      if(this.hour + hour < 23)
      {     
         this.hour = this.hour + hour;
      } 
      if(this.hour + hour > 23)
      {
         int temp = (this.hour + hour) / 24;
         this.hour = this.hour + hour - (24 * temp);
      }
   }
   
   //this method sets minute to a new value
   public void setMinutes(final int minute)
   {
      if(minute < 0)
         throw new IllegalArgumentException("Bad parameters setminute");
      if(this.minute + minute < 59)
      {
         this.minute = minute + this.minute;
      }
      else if(this.minute + minute > 59)
      {
         int temp = (this.minute + minute) / 60;
         this.minute = (this.minute + minute) - (60 * temp);
         this.hour = hour + temp;
         if(hour > 23)
         {
            int temp2 = hour / 24;
            this.hour = hour - (24 * temp2);
         }
      }
   }
   
   /*The toString will set the right format for the time andthe @Override will 
   check for overriding between the two classes which have the same class but 
   different params. (reference Overriding)*/
   @Override
   public String toString()
   {
      DecimalFormat fmt = new DecimalFormat("00");
      String temp = fmt.format(hour) + ":" + fmt.format(minute) + ":" + fmt.format(second);
      return temp;
   }
}