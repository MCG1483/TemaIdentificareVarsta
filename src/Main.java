public class Main {
    public static void main(String[] args) {
        String birthDate   = "07/04/14/08/1983";
        String currentDate = "21/30/18/03/2023";

        String[] birthDateFormatted = birthDate.split("/");
        for (int i = 0; i < birthDateFormatted.length; i++)
        {System.out.println("Index value at i = " + i + " is " + birthDateFormatted[i]);}

        int hourOfBirth = Integer.parseInt(birthDateFormatted[0]);
        int minutesOfBirth = Integer.parseInt(birthDateFormatted[1]);
        int dayOfBirth = Integer.parseInt(birthDateFormatted[2]);
        int monthOfBirth = Integer.parseInt(birthDateFormatted[3]);
        int yearOfBirth = Integer.parseInt(birthDateFormatted[4]);
        System.out.println();

        String [] currentDateFormatted = currentDate.split("/");
        for (int i=0; i< currentDateFormatted.length; i++)
        {
            System.out.println("Index value at i = " + i + " is " + currentDateFormatted[i]);
        }

        int currentHour = Integer.parseInt(currentDateFormatted[0]);
        int currentMinutes = Integer.parseInt(currentDateFormatted[1]);
        int currentDay = Integer.parseInt(currentDateFormatted[2]);
        int currentMonth = Integer.parseInt(currentDateFormatted[3]);
        int currentYear = Integer.parseInt(currentDateFormatted[4]);
        System.out.println();

        int age = currentYear - yearOfBirth;

        if (monthOfBirth > currentMonth)
        {
            age = age - 1;
            System.out.println("The current age is: " + age);
        }
        if (monthOfBirth<currentMonth)
        {
            System.out.println("The current age is: " + age);
        }

        if (monthOfBirth == currentMonth)
        {
            if (dayOfBirth > currentDay)
            {
                age = age - 1;
                System.out.println("The current age is: " + age);
            }
            else if (dayOfBirth < currentDay)
            {
                System.out.println("The current age is: " + age);
            }
        }
        if (dayOfBirth == currentDay)
        {
            if (hourOfBirth > currentHour)
            {
                age -= 1;
                System.out.println("The current age is: " + age);
            }
            else if (hourOfBirth < currentHour)
            {
                System.out.println("The current age is: " + age);
            }
        }
        if (hourOfBirth == currentHour)
        {
            if (minutesOfBirth > currentMinutes)
            {
                age -= 1;
                System.out.println("The current age is: " + age);
            }
            else if (minutesOfBirth < currentMinutes)
            {
                System.out.println("The current age is: " + age);
            }

        }
        if ((monthOfBirth == currentMonth) && (dayOfBirth == currentDay) && (hourOfBirth == currentHour)
                && (minutesOfBirth == currentMinutes))
        {
                    System.out.println("La Multi Ani!!!");
        }





    }
}