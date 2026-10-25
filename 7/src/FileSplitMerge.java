import java.io.*;

public class FileSplitMerge {
    public void fileSplit(String sourceFilePath,String outputDirPath,long chunkSize) throws IOException {
        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists() || !sourceFile.isFile()) {
            System.out.println("原始文件不存在");
            return;
        }
        File  dir = new File(outputDirPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String filename = sourceFile.getName();
        int partNumber=1;
        try(FileInputStream fis = new FileInputStream(sourceFile)){
            byte[] box = new byte[1024*8];
            int len;
            long currentWriting = 0;
            FileOutputStream fos = null;
            while ((len=fis.read(box))!=-1){
                if (fos==null){
                    String partName = filename+".part"+partNumber;
                    File partFile = new File(dir, partName);
                    fos = new FileOutputStream(partFile);
                    partNumber++;
                }
                fos.write(box,0,len);
                currentWriting+=len;
                if (currentWriting>= chunkSize){
                    if (fos != null)
                        fos.close();
                    String partName = filename+".part"+partNumber;
                    File partFile = new File(dir, partName);
                    fos = new FileOutputStream(partFile);
                    partNumber++;
                    currentWriting = 0 ;
                }
            }
            if(fos!=null)
                fos.close();
            System.out.println("文件分片完成，一共生成"+(partNumber-1)+"个分片");
        }

    }
}
