package controllers;
public class PlaystationController implements GameController {
    private String name="Playstation Kontrolcusu";

    @Override
    public String getName() {
        return "Playstation";
    }

}
