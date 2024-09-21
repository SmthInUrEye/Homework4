//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача №1
        int age = 21;
        System.out.print ( " Если возраст человека равен " + age );
        if ( age > 18 ) {
            System.out.print ( ", то он совершеннолетний" );
        } else {
            System.out.print ( ", то возраст совершеннолетия еще не наступил, нужно немного подождать" );
        }

        //Задача №2
        int Toc = 7;
        System.out.print ( "\n На улице " + Toc + " градусов" );
        if ( Toc > 5 ) {
            System.out.print ( ", нужно надеть шапку" );
        } else {
            System.out.print ( ", можно идти без шапки" );
        }

        //Задача №3
        int velocity = 75;
        System.out.print ( "\n Если скорость " + velocity + " км/ч" );
        if ( velocity > 60 ) {
            System.out.print ( ", то придётся заплатить штраф" );
        } else {
            System.out.print ( ", можно ехать спокойно" );
        }

        //Задача №4
        int humanAge = 18;
        System.out.print ( "\n Если возраст человека равен " + humanAge );
        if ( humanAge >= 2 && humanAge <= 6 ) {
            System.out.print ( ", то ему нужно ходить в детский сад" );
        } else if ( humanAge >= 7 && humanAge <= 17 ) {
            System.out.print ( ", то ему нужно ходить в школу" );
        } else if ( humanAge >= 18 && humanAge <= 24 ) {
            System.out.print ( ", то его место в университете" );
        } else if ( humanAge > 24 ) {
            System.out.print ( ", то ему нужно ходить на работу" );
        } else System.out.print ( ", то пока сказать нечего" );

        //Задача №5
        int childAge = 16;
        System.out.print ( "\n Если возраст ребенка равен " + childAge );
        if ( childAge < 5 ) {
            System.out.print ( ", то он не может кататься на аттракционе" );
        } else if ( childAge >= 5 && childAge <= 14 ) {
            System.out.print ( ", то он может кататься только в сопровождении взрослого" );
        } else if ( childAge > 14 ) {
            System.out.print ( ", то он может кататься без сопровождения взрослого" );
        } else System.out.print ( ", то пока сказать нечего" );

        //Задача №6
        int capacity = 102;
        int seatingCapacity = 60;
        int passangerCount = 64;
        System.out.print ( "\n Если количество пассажиров равно " + passangerCount );
        if ( passangerCount > capacity ) {
            System.out.print ( ", то вагон полностью забит" );
        } else if ( passangerCount > seatingCapacity && passangerCount <= capacity ) {
            System.out.print ( ", то в вагоне есть только стоячие места" );
        } else if ( passangerCount <= seatingCapacity ) {
            System.out.print ( ", то в вагоне есть сидячее место" );
        } else System.out.print ( ", то пока сказать нечего" );

        //Задача №7
        int one = 45;
        int two = 34;
        int three = 34;
        System.out.print ( "\n Между числами " + one + "," + two + "," + three);
        if ( one > two && one > three ) {
            System.out.print ( ", большее " + one );
        } else if ( two > one && two > three ) {
            System.out.print ( ", большее " + two  );
        } else System.out.print ( ", большее " + three  );

    }
    }
