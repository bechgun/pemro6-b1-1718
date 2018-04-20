/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

/**
 *
 * @author STUDENT
 */
public class Caller {
    
    public void register(CallBack callback){
        callback.methodToCallBack();
    }
    
    public static void main(String[] args) {
        // example 1
        Caller c = new Caller();
        CallBack callback = new CallBackimpl();
        c.register(callback);
        
        // example 2
        c.register(new CallBack(){
           @Override
           public void methodToCallBack(){
               System.out.println("CallBack Lagi");
           }
        });
    }
}
