import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;  
import java.time.LocalDate;

public class App {
    private static AirlineReservasionSystem airline = new AirlineReservasionSystem();
    public static boolean validChoice(int choice ,int limit) {
        if (choice > limit || choice < 1) {
            return false;
        } else {
            return true;
        }
    }

    public static int choose(int limit) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        while (!validChoice(choice ,limit)) {
            System.out.println("Enter a number in a given range!");
            System.out.print("Your Choice =");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public static void showMenu(ArrayList<String> menu) {
        for (String choice : menu) {
            System.out.println(choice);
        }
    }
    public static void loadDataBase(AirlineReservasionSystem airline){
        Address address1 ,address2 ,address3;
        Airport airport1, airport2;
        Flight flight;
        ScheduledFlight scheduledFlight;
        Passenger passenger;
        FlightReservation flightReservation;
        
        address3 = new Address("Menoufia" ,"Egypt" ,"201965");
        passenger = new Passenger("Abdelrahman Sheheen", address3, "7700225VH");

        address1 = new Address("Alexandria" ,"Egypt" ,"21934");
        airport1 = new Airport("Borg El Arab Airport" ,address1);

        address2 = new Address("Los Angeles" ,"USA" ,"326999");
        airport2 = new Airport("Los Angeles Airport" ,address2);

        airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("1","Egypt" ,"USA" ,airport2 ,airport1 ,25,FlightStatus.ACTIVE);
        airline.addFlight(flight);
        scheduledFlight = new ScheduledFlight("04-01-2023" ,flight);
        
        flightReservation = new FlightReservation();
        flightReservation.setDate("01-01-2023");
        flightReservation.setPassenger(passenger);
        flightReservation.setScheduledFlight(scheduledFlight);
        airline.addFlightReservation(flightReservation);

        airline.addScheduleFlight(scheduledFlight);
        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        scheduledFlight = null;
        address3 = null;
        passenger = null;
        flightReservation = null;
        /****************************************************************************************/
        address3 = new Address("cairo" ,"Egypt" ,"533333");
        passenger = new Passenger("Mohamed Salah", address3, "5452407DH");

        address1 = new Address("Cairo" ,"Egypt" ,"233333");
        airport1 = new Airport("Cairo International Airport" ,address1);

        address2 = new Address("Dammam" ,"Saudi Arabia" ,"111111");
        airport2 = new Airport("King Fahd International Airport" ,address2);

        airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("2","Egypt" ,"Saudi Arabia" ,airport2 ,airport1 ,50, FlightStatus.ACTIVE);
        airline.addFlight(flight);
        scheduledFlight = new ScheduledFlight("29-12-2022" ,flight);
        
        flightReservation = new FlightReservation();
        flightReservation.setDate("01-12-2022");
        flightReservation.setPassenger(passenger);
        flightReservation.setScheduledFlight(scheduledFlight);
        airline.addFlightReservation(flightReservation);
        
        airline.addScheduleFlight(scheduledFlight);
        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        scheduledFlight = null;
        address3 = null;
        passenger = null;
        flightReservation = null;
        /****************************************************************************************/
        address3 = new Address("Sharqia" ,"Egypt" ,"201965");
        passenger = new Passenger("Fatma Koshary", address3, "6993459TH");

        address1 = new Address("Port Said" ,"Egypt" ,"79855");
        airport1 = new Airport("Port Said Airport" ,address1);

        address2 = new Address("Al Ain" ,"UAE" ,"444444");
        airport2 = new Airport("Al Ain International Airport" ,address2);

        airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("3","Egypt" ,"UAE" ,airport2 ,airport1 ,40 ,FlightStatus.ACTIVE);
        airline.addFlight(flight);
        scheduledFlight = new ScheduledFlight("01-02-2023" ,flight);
        
        flightReservation = new FlightReservation();
        flightReservation.setDate("20-12-2022");
        flightReservation.setPassenger(passenger);
        flightReservation.setScheduledFlight(scheduledFlight);
        airline.addFlightReservation(flightReservation);

        airline.addScheduleFlight(scheduledFlight);
        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        scheduledFlight = null;
        address3 = null;
        passenger = null;
        flightReservation = null;
        /****************************************************************************************/
        address3 = new Address("Alexandria" ,"Egypt" ,"844848");
        passenger = new Passenger("Abdul Ghafoor Al-Burai", address3, "4835734QA");

        address1 = new Address("Hurghada" ,"Egypt" ,"797979");
        airport1 = new Airport("Hurghada International Airport" ,address1);

        address2 = new Address("Barcelona" ,"Spain" ,"101010");
        airport2 = new Airport("Barcelona International Airport" ,address2);

        airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("4","Egypt" ,"Spain" ,airport2 ,airport1 ,12 ,FlightStatus.ACTIVE);
        airline.addFlight(flight);
        scheduledFlight = new ScheduledFlight("17-01-2023" ,flight);
        
        flightReservation = new FlightReservation();
        flightReservation.setDate("01-01-2023");
        flightReservation.setPassenger(passenger);
        flightReservation.setScheduledFlight(scheduledFlight);
        airline.addFlightReservation(flightReservation);

        airline.addScheduleFlight(scheduledFlight);

        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        scheduledFlight = null;
        address3 = null;
        passenger = null;
        flightReservation = null;
        /****************************************************************************************/
        address1 = new Address("Hurghada" ,"Egypt" ,"797979");
        airport1 = new Airport("Hurghada International Airport" ,address1);

        address2 = new Address("Moscow" ,"Russia" ,"909090");
        airport2 = new Airport("Sheremetyevo International Airport" ,address2);

        // airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("5","Egypt" ,"Russia" ,airport2 ,airport1 ,6 ,FlightStatus.NON_ACTIVE);
        airline.addFlight(flight);
        
        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        /****************************************************************************************/
        address1 = new Address("Hurghada" ,"Egypt" ,"797979");
        airport1 = new Airport("Hurghada International Airport" ,address1);

        address2 = new Address("Odesa" ,"Ukraine" ,"77777");
        airport2 = new Airport("Odesa International Airport" ,address2);

        // airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("6","Ukraine" ,"Egypt" ,airport1 ,airport2 ,60 ,FlightStatus.NON_ACTIVE);
        airline.addFlight(flight);
        
        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        /****************************************************************************************/
        address1 = new Address("Hurghada" ,"Egypt" ,"797979");
        airport1 = new Airport("Hurghada International Airport" ,address1);

        address2 = new Address("Wuhan" ,"China" ,"0000000");
        airport2 = new Airport("Wuhan Tianhe International Airport" ,address2);

        // airline.addAirport(airport1);
        airline.addAirport(airport2);

        flight = new Flight("7","Egypt" ,"China" ,airport2 ,airport1 ,12 ,FlightStatus.NON_ACTIVE);
        airline.addFlight(flight);
        
        address1 = null;
        address2 = null;
        airport1 = null;
        airport2 = null;
        flight = null;
        /****************************************************************************************/

        
    }
    
    public static void listAllFlights(ArrayList<Flight>flights){
        System.out.println("All the flights in the system :");
        for(Flight flight : flights){
            System.out.println(flight);
        }
    }

    public static void listAllSchedules(ArrayList<ScheduledFlight>scheduledFlights){
        System.out.println("All active flights in the system :");
        for(ScheduledFlight scheduledFlight : scheduledFlights){
            System.out.println(scheduledFlight);
        }
    }

    public static void listAllPassengers(ArrayList<FlightReservation>reservations){
        System.out.println("All passengers in the system :");
        int cnt = 0;
        for(FlightReservation flightReservation : reservations){
            System.out.println((++cnt)+"-"+ flightReservation.getPassenger());
        }
    }

    public static void listAllReservations(ArrayList<FlightReservation>reservations){
        System.out.println("All Reservations in the system :");
        int cnt = 0;
        for(FlightReservation flightReservation : reservations){
            System.out.println((++cnt)+"-");
            System.out.println("The passenger is:");
            System.out.println(flightReservation.getPassenger());
            System.out.println("About his flight:");
            System.out.println(flightReservation.getScheduledFlight());
            System.out.println("Made this reservation at:");
            System.out.println(flightReservation.getDate());
            System.out.println("\n");
        }
    }
    
    public static void makeReservation(AirlineReservasionSystem airline){
        Scanner scanner = new Scanner(System.in);
        System.out.println("To make this operation you've to complete the 2 steps :");
        System.out.println("STEP1: Choose one of these scheduled flights:\n");
        listAllSchedules(airline.getAllScheduledFlights());
        System.out.println("\nEnter a valid flight number :");
        int flightNumber = choose(airline.getAllScheduledFlights().size());
        ScheduledFlight scheduledFlight = null;
        try {
            scheduledFlight = airline.getScheduledFlightByFlightNumber(flightNumber+"");
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("STEP2: Enter the coming information about the passenger :");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Passport Number: ");
        String passportNum = scanner.nextLine();
        System.out.println("Enter the address of the passenger :");
        System.out.print("\tEnter City: ");
        String city = scanner.nextLine();

        System.out.print("\tEnter Country: ");
        String country = scanner.nextLine();

        System.out.print("\tEnter Postal code of his city: ");
        String postalCode = scanner.nextLine();

        Address address = new Address(city ,country ,postalCode);
        Passenger passenger = new Passenger(name, address, passportNum);
        FlightReservation flightReservation = new FlightReservation(passenger ,scheduledFlight);
        airline.addFlightReservation(flightReservation);
        System.out.println("Reservation confirmed :)");
    }
    
    public static void cancelReservation(AirlineReservasionSystem airline){
        while(true){
            try {
                System.out.print("Enter the Passport number of the passenger you wanna cancel his reservation: ");
                Scanner scanner = new Scanner(System.in);
                FlightReservation flightReservation = airline.getFlightReservationByPassport(scanner.nextLine());
                System.out.println(flightReservation);
                System.out.println("Is this the reservation you wanna cancel ? if yes ,Enter \"confirm\" ");
                if(scanner.nextLine().equals("confirm")){
                    airline.removeFlightReservation(flightReservation);
                    System.out.println("Cancelation confirmed :(");
                    return;
                }
                System.out.println("Cancelation not done");
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void scheduleFlight(AirlineReservasionSystem airline){
        while(true){
            try {
                System.out.println("Here are the flights that not scheduled yet ,choose one of them :");
                ArrayList<Flight>flights = airline.getAllFlights();
                for(Flight flight : flights){
                    if(flight.getStatus() != FlightStatus.ACTIVE)
                    System.out.println("\t" + flight);
                }
                System.out.print("Enter the number of the flight you choose: ");
                Scanner scanner = new Scanner(System.in);
                String flightNumber = scanner.nextLine();
                Flight flight = airline.getFlightByNumber(flightNumber);
                if(flight.getStatus() == FlightStatus.ACTIVE)
                throw new Exception("Please enter flight that is not scheduled");
                flight.setStatus(FlightStatus.ACTIVE);
                System.out.println("Enter a date after this date " + LocalDate.now() + " :");
                String date = scanner.nextLine();
                ScheduledFlight scheduledFlight = new ScheduledFlight(date ,flight);
                airline.addScheduleFlight(scheduledFlight);
                System.out.println("Here is the flight you just schedule :");
                System.out.println(scheduledFlight);
                System.out.println("\n\t\tDone!");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public static void removeScheduleFlight(AirlineReservasionSystem airline){
    while(true){
        try {
            System.out.println("Here are all the scheduled flights ,choose one of them :");
            ArrayList<Flight>flights = airline.getAllFlights();
            for(Flight flight : flights){
                if(flight.getStatus() == FlightStatus.ACTIVE)
                System.out.println("\t" + flight);
            }
            System.out.print("Enter the number of the flight you choose: ");
            Scanner scanner = new Scanner(System.in);
            String flightNumber = scanner.nextLine();
            ScheduledFlight scheduledFlight = airline.getScheduledFlightByFlightNumber(flightNumber);
            if(scheduledFlight.getFlight().getStatus() != FlightStatus.ACTIVE)
            throw new Exception("Please enter flight that is scheduled");
            scheduledFlight.getFlight().setStatus(FlightStatus.NON_ACTIVE);
            airline.removeScheduleFlight(scheduledFlight);
            System.out.println("Here is the flight you just remove from schedules:");
            System.out.println(scheduledFlight);
            System.out.println("\n\t\tDone!");
            scanner = null;
            break;
        } catch (Exception e) {
            System.out.println(e.getMessage());
    }
    }
    }
    public static void run() {
        // AirlineReservasionSystem airline = new AirlineReservasionSystem();
        loadDataBase(airline);
        ArrayList<String> menu = new ArrayList<String>();
        System.out.print("\n\n\n");
        System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("******************** Welcome to Expedia.com site for reserving flights ************************");
        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------------");
            menu.add("Menu:");
            menu.add("\t1) List all flights (Active / Non Active)");
            menu.add("\t2) List all Scheduled flights(Active)");
            menu.add("\t3) List all passengers from all flights");
            menu.add("\t4) List all reservations");
            menu.add("\t5) Make a reservation for a passenger");
            menu.add("\t6) Cancel a reservation for a passenger");
            menu.add("\t7) Schedule a flight");
            menu.add("\t8) Deactivate a scheduled flight(Scheduled -> Not Scheduled)");
            menu.add("\t9) Exit");
            menu.add("Enter a number in range 1 - 9");
            showMenu(menu);
            System.out.print("Your Choice =");
            int choice = choose(menu.size());
            if (choice == 1) {
                listAllFlights(airline.getAllFlights());
            } else if (choice == 2) {
                listAllSchedules(airline.getAllScheduledFlights());
            } else if (choice == 3) {
                listAllPassengers(airline.getAllReservations());
            }
            else if(choice == 4){
                listAllReservations(airline.getAllReservations());
            }
            else if(choice == 5){
                makeReservation(airline);
            }
            else if(choice == 6){
                cancelReservation(airline);
            }
            else if(choice == 7){
                scheduleFlight(airline);
            }
            else if(choice == 8){
                removeScheduleFlight(airline);
            }
            else{
                break;
            }
            System.out.print("\n\tWanna continue ?(Y/N) :");
            Scanner scanner = new Scanner(System.in);
            String c = scanner.nextLine();
            if(c.charAt(0) == 'N') break;
            menu.clear();
            //Clearing the console...
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                // TODO: handle exception
            }  
            //........................
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException{
        run();
    }
}
