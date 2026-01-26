package Part102;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyImport {

//    ArrayList<Literacy> literacyList;
//
//    public LiteracyImport(){
//        this.literacyList = new ArrayList<>();
//    }

    public ArrayList<Literacy> fileImport(String path){

        ArrayList<Literacy> literacyList = new ArrayList<>();
        String input = "";

        try{
            Files.lines(Paths.get(path))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length == 6)
                    .map(parts -> new Literacy(parts[0],parts[1],parts[2],parts[3],Integer.valueOf(parts[4]),Double.valueOf(parts[5])))
                    .forEach(literacy -> literacyList.add(literacy));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return literacyList;
    }

}
