
package Controller;

import Repository.PersonRepository;
import View.Menu;


public class FileHandler extends Menu<String>{
    static String[] mc = {"Find person info", "Copy Text to new file", "Exit"};
    PersonRepository program;

    public FileHandler() {
        super("\nFile Processing", mc);
        program = new PersonRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.findPersonInfo();
                break;
            case 2:
                program.copyNewFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}