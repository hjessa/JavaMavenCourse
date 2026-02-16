package Part112;

import Part112.mooc.logic.ApplicationLogic;
import Part112.mooc.ui.UserInterface;
import Part112.mooc.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
