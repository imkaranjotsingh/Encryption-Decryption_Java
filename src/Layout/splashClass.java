/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

/**
 *
 * @author KARANJIT SINGH
 */
public class splashClass extends Thread{
    
    @Override
    public void run(){
        splashLayout sp = new splashLayout();
        sp.setVisible(true); 
        SelectionFrame ss = new SelectionFrame();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                sp.jProgressBar1.setValue(i);
                if(i==100){
                    sp.setVisible(false);
                    ss.setVisible(true);
                }
            }
        }
            catch(Exception e){
                System.out.println(e);
                    
            }    
    }
    
}
