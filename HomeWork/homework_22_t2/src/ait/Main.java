package ait;

public class Main {
    public static void main(String[] args) {
        /*
        Придумайте свою иерархию классов в которой будет родительский класс и классы наследники, расширяющих его функционал
         */

        CockpitCrew c1 = new Captain("John Connor","B-738",60);
        Captain c2 = new Captain("Bruce Willis","B-735",84);
        Captain c3 = new Captain("George Washington","B-734",45);

        CockpitCrew f4 = new FirstOfficer("Bill Clinton","B-735",68);
        FirstOfficer f5 = new FirstOfficer("George Bush","B-734",70);
        FirstOfficer f6 = new FirstOfficer("Sahra Connor","B-738",88);
        FirstOfficer f7 = new FirstOfficer("James Cameron","B-734",75);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println(f7);
        System.out.println();

        c3.giveMeRest();
        c3.limitsToFlight(45);
        System.out.println();

        c2.wantToFly();
        c2.limitsToFlight(84);
        System.out.println();



        CockpitCrew[]cockpitCrews={c1,c2,c3,f4,f5,f6,f7};
        for (CockpitCrew h:cockpitCrews){
            h.work();
        }

    }
}
