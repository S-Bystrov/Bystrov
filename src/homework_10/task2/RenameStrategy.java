package homework_10.task2;

import java.io.File;
 // +
public enum RenameStrategy {
    TO_LOWER_CASE() {
        @Override
        public String rename(File fileToRename) {
            String oldName = fileToRename.getName();
            String newName = oldName.toLowerCase();
            return newName;
        }
    },
    FIRST_LETTER_TO_UPPER_CASE {
        @Override
        public String rename(File fileToRename) {
            String oldName = fileToRename.getName();
            String newName = oldName.substring(0, 1).toUpperCase() + oldName.substring(1).toLowerCase();
            return newName;
        }
    },
    TO_UPPER_CASE {
        @Override
        public String rename(File fileToRename) {
            String oldName = fileToRename.getName();
            String newName = oldName.toUpperCase();
            return newName;

        }
    };

    public abstract String rename(File fileToRename);

    public boolean renameFile(File file) {
        return file.renameTo(new File(file.getParentFile().getAbsolutePath() + "\\" + rename(file)));
    }
}
