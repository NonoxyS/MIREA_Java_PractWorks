package PractWork_19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryListing {
    public List<String> listFilesInDirectory(String dirPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(dirPath);
        File[] files = directory.listFiles();

        try {
            if (files == null) {
                throw new FileNotFoundException("Указанный путь не является каталогом или не существует.");
            } else {
                fileList = Arrays.asList(directory.list());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return fileList;
    }

    public void printFirstFiveElementsInDir(String dirPath) {
        List<String> list = listFilesInDirectory(dirPath);

        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        String dirPath = "D:\\";

        DirectoryListing dirList = new DirectoryListing();

        dirList.printFirstFiveElementsInDir(dirPath);
    }
}
