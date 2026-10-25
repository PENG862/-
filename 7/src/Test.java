import java.io.IOException;

public class Test {
    public static void main() throws IOException {
        String sourceFilePath = "总.docx";
        String outputDirPath = "文件分块";
        String mergedFilePath="新.docx";
        long chunkSize = 1024;
        FileSplitMerge f1 = new FileSplitMerge();
        f1.fileSplit(sourceFilePath,outputDirPath,chunkSize);
        MergeFile m1 = new MergeFile();
        m1.mergeFile(outputDirPath,sourceFilePath,mergedFilePath);
        CheckFileSame c1 = new CheckFileSame();
        boolean  same=c1.checkFileSame(sourceFilePath,mergedFilePath);
        if (same)
            System.out.println("校验通过：原始文件 和 合并后的文件 完全相同！");
        else
            System.out.println("校验失败：文件内容不一致！");
    }
}
