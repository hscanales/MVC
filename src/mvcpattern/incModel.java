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
public class incModel implements iModel {
int value;

    public incModel() {
        this.value=0;
    }


    @Override
    public void increment() {
        value++;
    }

    @Override
    public void setValue(int v) {
        this.value=v;
    }

    @Override
    public int getValue() {
        return value;
    }
    
}
