public class mathOps {


        /*//1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello\nAlex!");

        // 2. Printati rezultatul sumei a doua numere(orice numere)
        System.out.println("\n2. Printati rezultatul sumei a doua numere(orice numere)");
        int a = 10;
        int b = 3;
        int rezultat1 = a + b;
        System.out.println("Rezultatul sumei = " + rezultat1);

        // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        System.out.println("\n3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.");
        float rezultat2 = (float) a / b;
        System.out.println("Rezultatul impartirii = " + rezultat2);

        //4. Printati rezultatul urmatoarelor operatiuni:
        // a. -5 + 8 * 6
        System.out.println("\n4. Rezultatul operatiunilor:\n");
        System.out.println("-5 + 8 * 6 = " + (-5 + 8 * 6));

        // b. (55+9) % 9
        int x = 55 + 9;
        int y = 9;
        int rezultat3 = x % y;
        System.out.println("(55+9) % 9 = " + rezultat3);

        // c. 20 + -3*5 / 8
        float z = (float) -3 * 5 / 8;
        x = 20;
        float rezultat4 = x + z;
        System.out.println("20 + -3*5 / 8 = " + rezultat4);

        // d. 5 + 15 / 3 * 2 - 8 % 3
        int rezultat5 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("5 + 15 / 3*2 - 8 % 3 = " + rezultat5);


        // 5. Publicati ca raspuns la aceasta tema link-ul de la repository-ul din GitHub. Atasat video de urcare a proiectului in Github.

         */
        public static void main(String[] args) {
            System.out.println("Lab2 - Methods\n");
            System.out.println("Lab2 1.\n");
            printMyName();
            System.out.println("The result of the addition is: "+addition(100,20));
            System.out.println("The result of the subtraction is: "+subtraction(100,20));
            System.out.println("The result of the division is: "+division(100,20));
            System.out.println("The result of the multiplication is: "+multiplication(10,20));
            System.out.println("\nLab2 2.\n");
            javaPattern();
            System.out.println("\nLab2 3.\n");
            System.out.println("The result of the average is: "+average(10,5,5));
            System.out.println("Lab2 4.\n");
            patternFrankenstein();
            System.out.println("Lab2 5.");
            System.out.println("The rest of the division is: "+modulo(10,3));
            System.out.println("");
            System.out.println("Lab2 6.");
            System.out.println("Conversion from Fahrenheint to Celsius is: "+fahrenheitToCelsius(100));
            System.out.println("");
            System.out.println("Lab2 7.");
            System.out.println("Conversion from Inch to Meters is: "+inchToMeters(100));


        }
        //1. Scrieti cate o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
        //Fiecare metoda ar trebui sa primeasca doi parametrii de tip numar, sa execute operatia, si sa returneze rezultatul.
        // Apoi apelati metoda in main cu valorile cu care doriti sa executati operatia.
        public static void printMyName(){
            System.out.println("\nHello\nAlex\n");
        }
        public static int addition (int firstNr, int secondNr){
            int result = firstNr + secondNr;
            return result;
        }
        public static int subtraction(int firstNr, int secondNr){
            int result = firstNr - secondNr;
            return result;
        }
        public static int division (int firstNr, int secondNr){
            int result = firstNr / secondNr;
            return result;
        }
        public static int multiplication (int firstNr, int secondNr){
            int result = firstNr * secondNr;
            return result;
        }

        //2. Scrieti o metoda java, care sa afiseze urmatorul model: JAVA
        public static void javaPattern(){
            System.out.println("   J    a  v     v  a");
            System.out.println("   J   a a  v   v  a a");
            System.out.println("J  J  aaaaa  V V  aaaaa");
            System.out.println(" JJ  a     a  V  a     a");
        }

        //3. Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
        public static float average(float a, float b, float c){
            float result = (a+b+c)/3;
            return result;
        }

        //4. Scrieti o metoda java, care sa afiseze urmatorul model: Frankenstein
        public static void patternFrankenstein(){
            String Fran ="  +'''''''''+ ";
            String ken ="[ |  o   o  | ]";
            String st ="  |    ^    | ";
            String e ="  |   '_'   | ";
            String in = "  +_________+";
            System.out.println(Fran+"\n"+ken+"\n"+st+"\n"+e+"\n"+in+"\n");
        }

        //5. Scrieti o metoda java, care sa returneze restul impartirii a doua numere
        public static int modulo (int a, int b){
            int result = a%b;
            return result;
        }
        //6. Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit,
        // si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
        public static float fahrenheitToCelsius(float temp_fahrenheit) {
            float a = 5;
            float b = 9;
            float temp_celsius = a/b * (temp_fahrenheit -32);
            return temp_celsius;
        }
        //7. Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
        // care sa reprezinte distanta in inch, si sa returneze distanta in metrii
        public static float inchToMeters(float inch){
            float a = 39.370f;
            float convert = inch/a;
            return convert;
        }
        //.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde),
        // si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)

        public static int getSeconds(int ora, int minute, int secunde) {
            return secunde + minute * 60 + ora * 3600;
        }
        public static float speedmps(float m, int h, int min, int sec) {
            int time = getSeconds(h, min, sec);
            float viteza = m / time;
            return viteza;
        }
        public static float mpsToKmph(float mps) {
            return mps * 3.6f;
        }
        public static float mpsToMph(float mps) {
            return mps * 2.2369362921f;
        }
        // Publicati ca raspuns la aceasta tema link-ul de la repository-ul din GitHub.

    }


