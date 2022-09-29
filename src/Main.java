public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int agePolz = 17;
        if (agePolz >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if(agePolz < 18){
            System.out.println("Вы еще малолетнее школоло)))");
        }

        System.out.println("Задание 2");
        int ageMen = 25;
        if(ageMen >= 7 && ageMen < 18){
            System.out.println("Ребенок уже пошел в школу");
        } else if (ageMen >= 18 && ageMen <24) {
            System.out.println("Человек пошел в университет");
        } else if (ageMen >=24) {
            System.out.println("Вэлком в программисты))");
        }
        System.out.println("Задание 3");
        int vashNomerVagone = 103;
        if(vashNomerVagone <=60){
            System.out.println("Вы сможете присесть ");
        } else if (vashNomerVagone > 60 && vashNomerVagone < 103) {
            System.out.println("Придется тебе дружище постоять");

        } else if (vashNomerVagone > 102) {
            System.out.println("Сорян мест нет жди другой вагон");
        }

        System.out.println("Задание 4");
        int agePolzz = 17;
        if (agePolzz >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else{
            System.out.println("Вы еще малолетнее школоло)))");
        }
        System.out.println("Задание 5");
        int ageMenn = 25;
        if(ageMenn >= 7 && ageMenn < 18){
            System.out.println("Ребенок уже пошел в школу");
        } else if (ageMenn >= 18 && ageMenn <24) {
            System.out.println("Человек пошел в университет");
        } else if (ageMenn >=24) {
            System.out.println("Вэлком в программисты))");
        }
        System.out.println("Задание 6");
        int vashNomerVagonee = 103;
        if(vashNomerVagonee <=60){
            System.out.println("Вы сможете присесть ");
        } else if (vashNomerVagonee > 60 && vashNomerVagonee < 103) {
            System.out.println("Придется тебе дружище постоять");

        } else if (vashNomerVagonee > 102) {
            System.out.println("Сорян мест нет жди другой вагон");
        }

        System.out.println("Задание 7");
        int age = 22;
        boolean goToDetsad = age >= 2 && age <=6;
        boolean goToScool = age > 6 && age < 18;
        boolean goToUniver = age >=18 && age < 24;
        if(goToDetsad){
            System.out.println("Человек ходит в детсад");
        } else if (goToScool) {
            System.out.println("Человек ходит в школу");
        } else if (goToUniver) {
            System.out.println("Человек ходит в университет");
        }
        else{
            System.out.println("Человек ходит на работу");
        }
        System.out.println("Задание 8");
        age = 6;
        boolean roditel = false;

        if(age < 5){
            System.out.println("ребенок не может кататься");
        } else if (age > 5 && roditel == true && age < 14) {
            System.out.println("ребенок может кататься только со взрослым");
        } else if (age > 5 && roditel == false && age < 14) {
            System.out.println("ребенок не может кататься т.к. без взрослых");
        } else{
            System.out.println("ребенок уже взрослый и может кататься один");
        }

        System.out.println("Задание 8");

        int one = 5;
        int two = 4;
        int free = 3;
        if(one > two && one > free){
            System.out.println("one самое большое значение");
        } else if (two > one && two > free) {
            System.out.println("two самое большое значение");
        }else{
            System.out.println("free самое большое значение");
        }
    }
}