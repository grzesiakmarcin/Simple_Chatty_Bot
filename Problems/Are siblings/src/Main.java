import java.io.File;
import java.util.*;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        return f1.getParent().equals(f2.getParent());
    }
}

class Inna {
    public void deleteOldFiles(File rootDir, long thresholdDate) {
        Deque<File> files = new ArrayDeque<>(getChildren(rootDir));

        while (files.size() != 0) {
            File file = files.pop();
            if (file.isFile()) {
                if (file.lastModified() < thresholdDate) {
                    file.delete();
                }
            } else {
                files.addAll(getChildren(file));
            }
        }
    }

    private List<File> getChildren(File dir) {
        File[] children = dir.listFiles();

        return children == null || children.length == 0 ?
                Collections.emptyList() :
                Arrays.asList(children);
    }
}