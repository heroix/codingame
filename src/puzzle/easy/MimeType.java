package puzzle.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by heroix on 2016-01-31.
 */
public class MimeType {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.

        Map<String, String> extensionToMimeType = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            if (EXT.length() <= 10 && MT.length() <= 50) {
                extensionToMimeType.put(EXT.toLowerCase(), MT);
            }
            in.nextLine();
            //System.err.println(EXT + " " + MT);
        }

        for (int i = 0; i < Q; i++) {
            String filename = in.nextLine(); // One file name per line.

            int pointerToExtension = filename.lastIndexOf('.');
            String extension = filename.substring(pointerToExtension + 1).toLowerCase();

            //System.err.println(i + " filename=" + filename + ",extension=" + extension);
            String mime = extensionToMimeType.get(extension);
            if (pointerToExtension == -1) { // if no '.' in filename
                System.out.println("UNKNOWN");
            } else if (mime != null && !mime.isEmpty()) {
                System.out.println(mime);
            } else {
                System.out.println("UNKNOWN");
            }
        }
    }

}
