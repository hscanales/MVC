/*
 * 
 * 
 * 
 */
package mvcpattern;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class incController implements iController{
    
    private iView view;
    private iModel model;

    public incController(iView view, iModel model) {
        this.view = view;
        this.model = model;
        view.setController(this);
    }
    
    

    @Override
    public void incValue() {
        System.out.println("ENTRO");
        //model.increment();
        //view.setValue(Integer.toString(model.getValue()));
    }

    @Override
    public void setModelValue(int i) {
        model.setValue(i);
    }
    
}
