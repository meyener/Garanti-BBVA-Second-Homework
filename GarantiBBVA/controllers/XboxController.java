package controllers;
public class XboxController implements GameController {
    private String name="Xbox Kontrolcusu";

    @Override
    public String getName() {
       return "Xbox";
    }
}
