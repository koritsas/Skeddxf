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


    public FileParser(Path path, String regex) throws IOException {
        this.mPath = path;
        this.mRegex = regex;
        readFile();
    }


    public Object[][] getmData() {
        return mData;
    }

    private void readFile() throws IOException{


        String[][]  st = Files.lines(mPath).map(s -> s.trim().split(mRegex)).toArray(String[][]::new);


        //Arrays.stream(st).forEach(strings -> System.out.println(strings));
        // mData = Files.lines(mPath).map(s -> s.trim().split(mRegex)).filter(strings -> strings.toString().contains(":") == false).toArray(Object[][]::new);

        mData = Files.lines(mPath).filter(s -> s.toString().contains(":")).map(s -> s.trim().split(mRegex)).toArray(Object[][]::new);

        mData = Arrays.stream(mData).map(objects -> Arrays.stream(objects).filter(o -> !o.toString().contains(":")).toArray(Object[]::new)).toArray(Object[][]::new);



    }




}
