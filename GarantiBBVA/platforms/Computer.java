package platforms;

import controllers.GameController;

public class Computer extends GamePlatform {

    public Computer() {
        this.name="Computer";
    }
    @Override
    public void addController(GameController gameController) {
        System.out.println(gameController.getName()+" controller added ! ");
    }
    
}
