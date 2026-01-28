package Part102;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LiteracyImport {

//    ArrayList<Literacy> literacyList;
//
//    public LiteracyImport(){
//        this.literacyList = new ArrayList<>();
//    }

    public static ArrayList<Literacy> fileImport(String path){

        ArrayList<Literacy> literacyList = new ArrayList<>();

        try(Stream<String> lines = Files.lines(Paths.get(path))){
            lines
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length == 5)
                    .map(parts -> new Literacy(parts[0],parts[1],parts[2],parts[3],Integer.valueOf(parts[4]),Double.valueOf(parts[5])))
                    .forEach(literacy -> literacyList.add(literacy));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return literacyList;
    }

    public static void sortLiteracyList(ArrayList<Literacy> literacyList){

        literacyList.stream()
                .sorted(Literacy::compareTo)
                .forEach(p-> System.out.println(p));
    }


}
