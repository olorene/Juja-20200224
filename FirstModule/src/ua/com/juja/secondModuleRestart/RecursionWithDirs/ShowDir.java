package ua.com.juja.secondModuleRestart.RecursionWithDirs;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class ShowDir {
    public static void main(String[] args) {

//        String dirPath = "D:\\tmp2";
        String dirPath = "C:\\Java";
//        String dirPath = "C:\\Java\\maxtabletop";
        recursionListDir(dirPath);
    }

    private static void recursionListDir(String dirPath) {
//        Output files
        System.out.println(dirPath + "\\");
        printAllFileInDir(dirPath);


//        Base case
        ArrayList<String> listDir = showListDir(dirPath);
        if (listDir.isEmpty()) {
            return;
        }
//        Recursion
        for (int i = 0; i < listDir.size(); i++) {
            recursionListDir(listDir.get(i));
        }

    }

    private static void printAllFileInDir(String dirPath) {
        ArrayList<String> allFileInDir = showFilesInDir(dirPath);
        for (int file = 0; file < allFileInDir.size(); file++) {
            System.out.println(dirPath + "\\" + allFileInDir.get(file));
        }
    }

    private static ArrayList<String> showListDir(String dirPath) {
        File file = new File(dirPath);
        ArrayList<String> listDirectory = new ArrayList<>();

        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isDirectory()) {
//                System.out.println(listFiles[i].getName());
//                System.out.println(listFiles[i].getAbsolutePath());
                listDirectory.add(listFiles[i].getAbsolutePath());
            }
        }

        return listDirectory;
    }

    private static ArrayList<String> showFilesInDir(String dirPath) {
        ArrayList<String> listFiles = new ArrayList<>();
        File file = new File(dirPath);
        File[] listElements = file.listFiles();

        for (int i = 0; i < listElements.length; i++) {
            if (listElements[i].isFile()) {
                listFiles.add(listElements[i].getName());
            }
        }


        return listFiles;
    }
}
