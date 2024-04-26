import java.util.*;
public class Bus {
    void details(){
        System.out.println("------------------------------------------------------------------------------- ------------------------------------------------------------------------------------------");
        System.out.println(" WELCOME TO BOOK THE TICKET");
        System.out.println("------------------------------------------------------------------------------- ------------------------------------------------------------------------------------------");
    }
}
class book extends Bus{
    public static void main(String[] args) {
        Bus p=new Bus();
        p.details();
        Scanner in=new Scanner(System.in);
        System.out.print("FROM: ");
        String f=in.nextLine();
        System.out.print("TO: ");
        String T=in.nextLine();
        Scanner t=new Scanner(System.in);
        System.out.print("ONWARD JOURNEY DATE: (DD/MM/YYYY):");
        String o=t.nextLine();
        System.out.print("RETURN JOURNEY DATE: (DD/MM/YYYY): ");
        String r=t.nextLine();
        System.out.print("NUMBER OF SEATS:");
        int n=in.nextInt();
        System.out.print("SERVICE CLASS:");
        String s=t.nextLine();
        route di=new route();
        di.district(f,s,T);
        details d=new details();
        d.bus_timing(f,T,n,s);
        System.out.print("ENTER THE NUMBER OF PASSENGER: ");
        int pn=in.nextInt();
        details pr[]=new details[pn];
        for(int i=0;i<pn;i++){
            pr[i]=new details();
            pr[i].passenger();
        }
        id.display();
        pass.print1(o,f,T,s,n);
    }
}
class details extends Bus {
    void bus_timing(String s, String d, int se, String c) {
        Scanner in = new Scanner(System.in);
        String b = in.nextLine();
        if (b.equals("BOOK1")) {
            System.out.println("PICKUP POINT:" + s + " DROP OFF POINT:" + d);
            System.out.println("TIME: 20:00 TIME:05:00 ");
        } else {
            System.out.println("PICKUP POINT:" + s + " DROP OFF POINT:" + d);
            System.out.println("TIME: 20:30 TIME:05:30 ");
        }
        System.out.println("CONCESSION : GENERAL PUBLIC NO.OF SEATS:" + se);
    }
    void passenger(){
        Scanner in1=new Scanner(System.in);
        Scanner in2=new Scanner(System.in);
        System.out.print("PASSENGER NAME: ");
        String name= in1.nextLine();
        System.out.print("AGE: ");
        int age=in2.nextInt();
        System.out.print("GENDER: ");
        String gender= in1.nextLine();
        System.out.print("ADULT / CHILDREN :");
        String type=in1.nextLine();
        System.out.print("ID CARD TYPE : ");
        String idtype= in1.nextLine();
        System.out.print("ID CARD NO: ");
        long idtypeno=in2.nextInt();
        System.out.print("MOBILE NO: ");
        long no=in2.nextInt();
        seat sc=new seat();
        sc.seat_layout();
        System.out.print("SELECT YOUR SEATS:");
        int sel=in1.nextInt();
        System.out.println("TO PAY ONLY UPI");
        System.out.print("ENTER YOUR UPI ID : ");
        String u=in2.nextLine();
        System.out.println("YOUR'S TICKET WAS BOOKED");
        store_data sb=new store_data();
        sb.assign_data(name,age,type,idtype,idtypeno,gender);
    }
}
class store_data extends Bus{
    void assign_data(String na,int ag,String ty,String idt,long no,String gen){
        String n,t,it,g;
        int a;
        long idn;
        n=na;
        a=ag;
        t=ty;
        it=idt;
        idn=no;
        g=gen;
        pass.print2(n,a,t,it,idn,g);
    }
}
class seat extends Bus{
    static void seat_layout(){
        System.out.println("Seat Layout");
        System.out.println(" | [DRIVER] ");
        System.out.println(" 1 W 2 A | 3 A 4 W");
        System.out.println(" 8 W 7 A | 6 A 5 W");
        System.out.println(" 9 W 10 A | 11 A 12 W");
        System.out.println(" 16 W 15 A | 14 A 13 W");
        System.out.println(" 17 W 18 A | 19 A 20 W");
        System.out.println(" 24 W 26 A | 27 A 28 W");
        System.out.println(" 32 W 31 A | 30 A 29 W");
        System.out.println(" 33 W 34 A | 35 A 36 W");
        System.out.println(" 40 W 39 A | 38 A 37 W");
    }
}
class route extends Bus{
    void district(String p,String c,String T){
        Scanner r=new Scanner(System.in);
        if(p.equals("RAMNAD")){
            if(c.equals("ULTRA DELUXE")) {
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | DHARAPURAM,MADURAI |
                                        636UD | 20:00 HRS | " + p+ " | " + T+ " | 385 | 285 | BOOK1
                        |");
                System.out.println("|21766 | " + c + " | MADURAI | 676UD |
                        20:30 HRS | " + p+ " | " + T+ " | 385 | 285 | BOOK2 |");
            }
            else if(c.equals("AC")){
                System.out.println("TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE |
                        ROUTE_NO | DEPT.TIME | SERVICE_START_POINT | DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("__________|_____________________|________________________|__
                                __________|___________|__________________________|_________________|_________
                                ____|____________|___________________|");
                                System.out.println("21765 | " + c + " | DHARAPURAM,MADURAI |
                                        636UD | 20:00 HRS | " + p + " | " + T + " | 450 | 300 | BOOK1
                        |");
            }
            else if(c.equals("SEMI SLEEPER")){
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | DHARAPURAM,MADURAI |
                                        636UD | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1
                        |");
                System.out.println("|21766 | " + c + " | MADURAI | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
        }
        else if(p.equals("CHENNAI")){
            if(c.equals("ULTRA DELUXE")) {
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
            else if(c.equals("AC")){
                System.out.println("TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE |
                        ROUTE_NO | DEPT.TIME | SERVICE_START_POINT | DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("__________|_____________________|________________________|__
                                __________|___________|__________________________|_________________|_________
                                ____|____________|___________________|");
                                System.out.println("21765 | " + c + " | SALEM,TRICHY | 636UD |
                                        20:00 HRS | " + p + " | " + T + " | 450 | 300 | BOOK1 |");
            }
            else if(c.equals("SEMI SLEEPER")){
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
        }
        else if(c.equals("PERAMBALUR")){
            if(c.equals("ULTRA DELUXE")) {
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
            else if(c.equals("AC")){
                System.out.println("TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE |
                        ROUTE_NO | DEPT.TIME | SERVICE_START_POINT | DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("__________|_____________________|________________________|__
                                __________|___________|__________________________|_________________|_________
                                ____|____________|___________________|");
                                System.out.println("21765 | " + c + " | SALEM,TRICHY | 636UD |
                                        20:00 HRS | " + p + " | " + T + " | 450 | 300 | BOOK1 |");
            }
            else if(c.equals("SEMI SLEEPER")){
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
        }
        else if(c.equals("KANYAKUMARI")){
            if(c.equals("ULTRA DELUXE")) {
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
            else if(c.equals("AC")){
                System.out.println("TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE |
                        ROUTE_NO | DEPT.TIME | SERVICE_START_POINT | DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("__________|_____________________|________________________|__
                                __________|___________|__________________________|_________________|_________
                                ____|____________|___________________|");
                                System.out.println("21765 | " + c + " | SALEM,TRICHY | 636UD |
                                        20:00 HRS | " + p + " | " + T + " | 450 | 300 | BOOK1 |");
            }
            else if(c.equals("SEMI SLEEPER")){
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
        }
        else if(p.equals("MADURAI")){
            if(c.equals("ULTRA DELUXE")) {
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
            else if(c.equals("AC")){
                System.out.println("TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE |
                        ROUTE_NO | DEPT.TIME | SERVICE_START_POINT | DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("__________|_____________________|________________________|__ __________|___________|__________________________|_________________|_________ ____|____________|___________________|");
                                System.out.println("21765 | " + c + " | SALEM,TRICHY | 636UD |
                                        20:00 HRS | " + p + " | " + T + " | 450 | 300 | BOOK1 |");
            }
            else if(c.equals("SEMI SLEEPER")){
                System.out.println("|TRIP_CODE | CLASS_OF_SERVICE |VIA_ROUTE
                                | ROUTE_NO | DEPT.TIME | SERVICE_START_POINT |DESTINATION
                                |ADULT_FARE | CHILD_FARE | SELECT_SERVICE |");

                        System.out.println("|__________|_____________________|_________________________|_
                                ____________|____________|__________________________|_______________________|
                                        ____________|_____________|_________________|");
                                System.out.println("|21765 | " + c + " | SALEM,TRICHY | 636UD
                                        | 20:00 HRS | " + p + " | " + T + " | 385 | 285 | BOOK1 |");
                System.out.println("|21766 | " + c + " | TRICHY | 676UD |
                        20:30 HRS | " + p + " | " + T + " | 385 | 285 | BOOK2 |");
            }
        }
        else{
            System.out.print("NOT FOUND");
        }
    }
}
interface pdf{
    String e="E-TICKET / RESERVATION VOUCHER";
}
class id implements pdf{
    static void display(){
        System.out.println(pdf.e);
    }
}
class pass implements pdf {
    static void print1(String d,String sp,String st,String service,int sn) {
        System.out.println("------------CORPORATION : KRH TRAVELS PVT LTD.------------
                        ----");
                System.out.println();
        System.out.println("DATE OF JOURNEY :"+d+" PNR NUMBER:T378098");
        System.out.println("SERVICE START PLACE :"+sp+" ROUTENO:636UD");
        System.out.println("SERVICE START TIME :"+st+" SERVICE END PLACE:
                "+st);
                System.out.println("PASSENGER START PLACE :"+sp+" PASSENGER END
                        PLACE: "+st);
        System.out.println("PASSENGER PICKUP POINT : "+st+" PASSENGER PICKUP TIME: "+d);
        System.out.println("TRIP CODE : 2000CBE01"+" PASSENGER CATEGORY:
                GENERAL PUBLIC");
                System.out.println("BUS ID NO. : E-7629 BANK
                        TXN.NO:YHD414182234");
        System.out.println("CLASS OF SERVICE: "+service+" OP REFERENCE
                NO.:OB187623");
        System.out.println("SEAT NO'S : "+sn);
    }
    static void print2(String name,int age,String type,String idcard,long idcardno,String
            gender) {
        System.out.println(" PASSENGER INFORMATION ");
        System.out.println();
        System.out.println("NAME: "+name+" AGE: "+age+" ADULT/CHILD
:"+type+" GENDER :"+gender);
        System.out.println();
        System.out.println("ID CARD TYPE: "+idcard+" ID CARD NUMBER:
                "+idcardno);
                System.out.println("TOTAL FARE : RS. 350"); }
}
