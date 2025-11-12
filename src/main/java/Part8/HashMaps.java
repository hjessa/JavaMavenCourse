package Part8;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args){

//        HashMap<String,String> nicknames = new HashMap<>();
//        nicknames.put("matthew","matt");
//        nicknames.put("michael","mix");
//        nicknames.put("arthur","artie");
//
//        String mattNickName = nicknames.get("matthew");
//        System.out.println(mattNickName);

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }
}
