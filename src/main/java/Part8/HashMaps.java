package Part8;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args){

        HashMap<String,String> nicknames = new HashMap<>();
        nicknames.put("matthew","matt");
        nicknames.put("michael","mix");
        nicknames.put("arthur","artie");

        String mattNickName = nicknames.get("matthew");
        System.out.println(mattNickName);
    }
}
