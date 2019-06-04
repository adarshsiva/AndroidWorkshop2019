import 'dart:io';
int counter = 0;
main(List<String> args){
  print("Hello, ${args[0]} ${args[1]} ${++counter+5}");
  for (int i = 0; i < 10; i++) {
    print(i);
    
  }
  List<String> fruits = ["watermelon","apple","orange","pineapple"];
  for (int i = 0; i < fruits.length; i++) {
    print(fruits[i]);
    
  }
  var i=10;
  while (i-- >0) {
  
    stdout.write(" hijo $i");
  }
}