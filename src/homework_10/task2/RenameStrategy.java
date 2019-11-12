package homework_10.task2;

import java.io.File;

public enum RenameStrategy {
    TO_LOWER_CASE() {
        @Override
        public void rename(File fileToRename) {
            String oldName = fileToRename.getName();
            String newName = oldName.toLowerCase();
            File newNameFile = new File(fileToRename.getParent(), newName);
            boolean ddd = fileToRename.renameTo(newNameFile);

        }
    },
    FIRST_LETTER_TO_UPPER_CASE {
        @Override
        public void rename(File fileToRename) {

        }
    },
    TO_UPPER_CASE {
        @Override
        public void rename(File fileToRename) {

        }
    };

    public abstract void rename(File fileToRename);
}
