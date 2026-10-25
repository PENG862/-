import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeFile {
     public void mergeFile(String targetDirPath, String originalFileName, String mergedFilePath) throws IOException {
         File dir = new File(targetDirPath);
         if (!dir.exists()||!dir.isDirectory()){
             System.out.println("分片目录不存在！");
             return;
         }
         File[] allFiles = dir.listFiles();
         List<File> partList = new ArrayList<>();
         if (allFiles != null){
             for (File f : allFiles){
                 String name = f.getName();
                 if (name.startsWith(originalFileName+".part")){
                     partList.add(f);
                 }
             }
         }
         if (partList.isEmpty()){
             System.out.println("没有找到对应的分片文件！");
             return;
         }
         partList.sort(new Comparator<File>() {
             @Override
             public int compare(File o1, File o2) {
                 String numString1 = o1.getName().split("\\.part")[1];
                 String numString2 = o2.getName().split("\\.part")[1];
                 int num1=Integer.parseInt(numString1);
                 int num2=Integer.parseInt(numString2);
                 return num1-num2;
             }
         });
         try(FileOutputStream fos = new FileOutputStream(mergedFilePath)){
             byte[] box = new byte[1024*8];
             int len;
             for (File part : partList){
                 try(FileInputStream fis = new FileInputStream(part)){
                     while ((len = fis.read(box))!=-1){
                         fos.write(box,0,len);
                     }
                 }
             }
             System.out.println("文件合并完成");
             for(File part : partList)
                 part.delete();
         }catch (IOException e){
             e.printStackTrace();
         }

     }
}
