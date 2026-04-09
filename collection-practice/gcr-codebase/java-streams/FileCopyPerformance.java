import java.io.*;

class FileCopyPerformance {
    static void copyUnbuffered(String src, String dest) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);
        byte[] buffer = new byte[4096];
        int bytesRead;
        long start = System.nanoTime();
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }
        long end = System.nanoTime();
        fis.close();
        fos.close();
        System.out.println("Unbuffered Time (ns): " + (end - start));
    }

    static void copyBuffered(String src, String dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        byte[] buffer = new byte[4096];
        int bytesRead;
        long start = System.nanoTime();
        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        long end = System.nanoTime();
        bis.close();
        bos.close();
        System.out.println("Buffered Time (ns): " + (end - start));
    }

    public static void main(String[] args) {
        try {
            copyUnbuffered("largefile.dat", "copy_unbuffered.dat");
            copyBuffered("largefile.dat", "copy_buffered.dat");
        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}
