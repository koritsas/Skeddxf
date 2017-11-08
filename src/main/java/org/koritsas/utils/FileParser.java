package org.koritsas.utils;

import org.koritsas.datatypes.Metadata;
import org.koritsas.datatypes.Point;
import org.koritsas.datatypes.Status;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileParser {

    private File mFile;
    private Path mPath;
    private String mRegex;
    private Object[][] mData;


    public FileParser(Path path, String regex){
        this.mPath = path;
        this.mRegex = regex;
    }

    public FileParser(File file,String regex){
        this.mFile = file;
        this.mRegex = regex;
    }


    private void readFile() throws IOException{


        int[][] arr =
                Files.lines(mPath)
                        .map(item -> item.chars().filter(i -> (char) i != ' ').map(Character::getNumericValue).toArray())
                        .toArray(int[][]::new);


        Object[][] a = Files.lines(mPath).map(s -> s.trim().split(mRegex)).filter()


    }




}
