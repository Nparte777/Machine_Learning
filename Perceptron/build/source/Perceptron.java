import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Perceptron extends PApplet {

Simple_Perceptron P;

public void setup(){
  
  P = new Simple_Perceptron();
  float[] inputs = {-1,0.5f};
  int guess = P.guess(inputs);
  println(guess);


}
public void draw(){}
public int sign(float n){

  if (n>=0){
    return 1;
  }
  else{
    return -1;
  }
}

class Simple_Perceptron{
  float[] weights =new float[2];
  //Constructor
  Simple_Perceptron(){
    //Initialize weights Randomly
    for(int i = 0; i< weights.length;i++){
      weights[i] = random(-1,1);
    }
   }
   public int guess( float[] inputs){
      float sum = 0;
      for (int i=0;i<weights.length;i++){
        sum += inputs[i]*weights[i];
      }
     int output = sign(sum);
     return output;
   }
}
  public void settings() {  size(200,200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Perceptron" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
