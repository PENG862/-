import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckFileSame {
    public boolean checkFileSame(String sourceFilePath,String mergedFilePath){
        File sourceFile = new File(sourceFilePath);
        File mergedFile = new File(mergedFilePath);
        if (sourceFile.length()!=mergedFile.length())
            return false;
        try {
            FileInputStream fis1=new FileInputStream(sourceFile);
            FileInputStream fis2=new FileInputStream(mergedFile);
            byte[] box1 = new byte[1024*8];
            byte[] box2 = new byte[1024*8];
            int len1,len2;
            while ((len1=fis1.read(box1))!=-1){
                len2=fis2.read(box2);
                for (int i=0;i<len1;i++){
                    if (box1[i]!=box2[i])
                        return false;
                }
            }

        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
