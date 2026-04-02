package Part135.Translator;

public class Main {

    public static void main(String[] args){

        Dictionary test = new Dictionary();

        test.addTranslation("Kupa","dupa");
        test.addTranslation("karpia","darpia");
        test.addTranslation("klaun","daln");

        System.out.println(test.getTranslation("Kupa"));
        System.out.println(test.getTranslation("darpia"));
        System.out.println(test.getRandomWord());

    }
}
