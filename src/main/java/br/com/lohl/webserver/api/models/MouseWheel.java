package br.com.lohl.webserver.api.models;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MouseWheel {
    private Robot robot;

    /**
     * Method: constructor
     * @throws AWTException
     */
    public MouseWheel() throws AWTException {
        robot = new Robot();
    }

    /**
     * Method: up
     * Description: move window's roll bar up
     */
    public void up(){
        robot.mouseWheel(-1);
    }

    /**
     * Method: down
     * Description: move window's roll bar down
     */
    public void down(){
        robot.mouseWheel(1);
    }

    /**
     * Method: test
     * Description: implement an automatic test to go down and up on an active window
     * @throws AWTException
     * @throws InterruptedException
     */
    public void test() throws AWTException, InterruptedException {
        MouseWheel mouseWheel = new MouseWheel();

        // Message to choose a window
        System.out.println("Posicione o cursor na tela que deseja rolar...");
        for (int i = 5; i >= 0; i--){
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }

        // Screen Down
        for (int i = 0; i < 10; i++){
            mouseWheel.down();
            TimeUnit.SECONDS.sleep(1);
        }

        // Screen Up
        for (int i = 0; i < 10; i++){
            mouseWheel.up();
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
