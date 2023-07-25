package platforms;
import controllers.GameController;

public abstract class GamePlatform {
   
    protected String name;
    protected boolean state;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void open() throws Exception {
        
        if (state==true) {
            throw new Exception("The "+this.name+" is already open ! "); 
        } else {
            System.out.println("The "+this.name+" started !");
            this.state=true;
        }
    }

    public void shutdown() throws Exception {
        if (state==false) {
            throw new Exception("The "+this.name+" already turned off ! "); 
        } else {
            System.out.println("The "+this.name+" turned off !");
            this.state=false;
        }
    }

    public void addController(GameController gameController) {
        if (gameController.getName()==name) {
            System.out.println(gameController.getName()+" controller added successfuly !");
        } else {
            System.out.println("incompatible controller !!! ");
            
        }
    }
    public void playGame() throws Exception {
        if (state==true) {
            System.out.println("Game has been started !!!");
        } else {
            throw new Exception("Platform is not open, please turn it on !! ");
        }
    }
}
