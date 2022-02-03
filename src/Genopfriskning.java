
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Genopfriskning {
    /*
    1.
    Skriv en metodemed navnet doesArraylistContainString,
    dermodtager 2parametrer: enarraylisteog enstreng.

    Metoden returnerer en boolean:

    •Hvis strengen ikke findes i arraylistenindsættes strengen i listen og metoden returnerer false

    •Hvis strengen findes i arraylisten returnerer metodentrue og printer ”The String has been found”

     3.
      Om sommerenvokser græsset ca. 0,8 cm om dagen.
      Skriv en metode,der tager imod 2 inputparametre:

      hvor langt græsset er lige nu og hvor højt det må være for at skulle slås.

      Metoden skal beregne og returnere hvor mange dage der er til,at græsset skal slås næste gang.

      Hvor højt græsset er,når det skal slås,kan forstås på 2 måder.

      1.Græsset skal overstige denne værdi,før vi starter græsslåmaskinen

      2.Græsset skal slås,inden værdien overstiges

      Du vælger selv hvilken løsning du vil implementere.

      Benyt en Scanner til at få input fra brugeren, ogudskrivresultatetpå skærmen.


      4.
      Skriv en metode, der som parameter modtager et heltal.
      Metoden skal udskrive et kvadrat på skærmen svarende til heltallet.
      I det følgende eksempel er tallet 6 modtaget som parameter til metoden:

      ******
      ******
      ******
      ******
      ******
      ******

      •Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen


      5.
      Skriv en metode,der tager imod en sætning af ord med mellemrum imellem.
      Sætningen ændres efter følgende regler:

      •Ord,som udelukkende er skrevet medstore bogstaver,skal ikke ændres.

      •Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.

      •Ord på max.3 bogstaver skal skrives med småt


      6.
      SorteringSkriven metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen
      i alfabetisk faldende orden på skærmen.

      Hvis der indlæses:
      abekat
      musefælde
      ananas
      slut
      solskin

      skal der udskrives følgende på skærmen:

      solskin
      slut
      musefælde
      ananas
      abekat


      7.
      Skriv en metode, der som parametre modtager et array af typen String samt en String.
      Metoden skal undersøge om strengen findes i arrayet. Metoden skal returnere indekspositionen,
      hvis strengen findes i arrayet og–1 hvis strengen ikke findes i arrayet.

      Lav en alternativ fejlhåndtering, hvis strengen ikke findes i arrayet, hvor du istedet kaster en exception.


        Ops. opgave 2 er i en anden klasse (Book, Library)


     */

    //1. Arraylist
    static ArrayList<String> stringArrayList = new ArrayList<String>();

    public boolean doesArrayListContainString(ArrayList stringArrayList, String str) {
        if (stringArrayList.contains(str)) {
            System.out.println("String found");
            return true;
        } else {
            return false;
        }
    }


    //3 Mowing

    public int mowingTheLawn(double howMuchIsItNow,double howMuchItCanBe) {
        double growingGrassPerDay = 0.8;
        int days = 0;

        for (int i = 0; i < howMuchItCanBe; i++) {
            if (howMuchIsItNow < howMuchItCanBe) {
                howMuchIsItNow = howMuchIsItNow + growingGrassPerDay;
                days++;
            }
        }
        return days ;
    }

    //4 Square
    public void square(int n) {

        int i = 1;
        int j;

        while (i <= n) {
            j = 1;
            while (j <= n) {
                System.out.print("#");
                j++;
            }
            i++;
            System.out.print("\n");
        }

    }


    //5 Proper Case     (inspiration fra jacob)
    static ArrayList<String> clusterOfWordsArraylist = new ArrayList<>();

    public String wordCluster(String str) {

        String[] clusterOfwords = str.split(" ");

        for (int i = 0; i < clusterOfwords.length; i++){
            String string = checkCase(clusterOfwords[i]);
            clusterOfWordsArraylist.add(string);
        }

        return clusterOfwords.toString();
    }



    public String checkCase(String str) {

        int length = str.length();
        if (str.matches("[A-Z]{" + length + "}")) {
            return str;
        } else if (str.length() > 3) {
            String newStr = "";
            newStr += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            return newStr;
        } else {
            return str.toLowerCase();
        }
    }


    //6 Sorting
    public void words(String[] strings) {
        Arrays.sort(strings);
        System.out.println("sorted: " + Arrays.toString(strings));
    }

    //7 Search
    public String search(String[] strings, String str) {


        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(str)) {
                return String.valueOf(i+1) ;
            }
        }
        return String.valueOf(-1);
    }



    //Main Class ⬇️⬇️⬇️⬇️⬇️

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Genopfriskning genopfriskningsClass = new Genopfriskning();

        //1.

        stringArrayList.add("Welcome back");


        System.out.println(genopfriskningsClass.doesArrayListContainString(stringArrayList, "Welcome back")); //true
        System.out.println(genopfriskningsClass.doesArrayListContainString(stringArrayList,"im back"));       //false


        //3.
        System.out.println("-------------------------");
        System.out.println("input below");
        System.out.println(genopfriskningsClass.mowingTheLawn(sc.nextDouble(), sc.nextDouble())); //based on users input



        //4.
        System.out.println("------------------------");
        System.out.println("input below");
        genopfriskningsClass.square(sc.nextInt());
        System.out.println();

        //5.
        System.out.println(genopfriskningsClass.checkCase("ANXIETY"));  //ANXIETY
        System.out.println(genopfriskningsClass.checkCase("mad"));      //mad
        System.out.println(genopfriskningsClass.checkCase("Poop"));     //Poop
        System.out.println();



        //6.
        genopfriskningsClass.words(new String[]{"abekat", "musefælde", "ananas", "slut", "solskin"});

        //7.
        System.out.println(genopfriskningsClass.search(new String[]{"abekat", "musefælde", "ananas", "slut", "solskin"},"solskin")); //   5
        System.out.println(genopfriskningsClass.search(new String[]{"abekat", "musefælde", "ananas", "slut", "solskin"},"computer")); // -1



    }
}

