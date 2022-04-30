public class Main {
    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        while (i<=10) {
            System.out.print(i + " " );
            i=i+1;
        };
        System.out.print("\n");

        for(int a = 10; a>=1; a=a-1 ) {
            System.out.print(a + " ");}

        System.out.println("\n");

        //Задание 2
        int a = 1;
        for (;a <= 31;a=a+7) {
                System.out.println("Сегодня пятница, " + a + " число. Необходимо подготовить отчет.");
            }
        System.out.println("\n");

        //Задание 3
        int year = 2022;
        int cometyear = 79;
        int startyear = year - 200;
        int endyear = year + 100;
        for (;startyear<=endyear; startyear++){
            if(startyear % cometyear == 0){
                System.out.println(startyear);
            }

        }

    }

}