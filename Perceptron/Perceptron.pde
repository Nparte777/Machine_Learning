Simple_Perceptron P;

void setup(){
  size(200,200);
  P = new Simple_Perceptron();
  float[] inputs = {-1,0.5};
  int guess = P.guess(inputs);
  println(guess);


}
void draw(){}
