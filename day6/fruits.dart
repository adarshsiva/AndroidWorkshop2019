List<String> getFruitList() {
  return["apple","orange","lemon"];
}
//switch is same as in java
String getFruit()=>"apple";
String para ='''This is just for testing out the para in dart
and this has to be
 really really
  really really really really
  longggg''';
main(List<String> args){
  getFruitList().forEach((fruit)=> print(fruit));
  print(para);
  print("I am an ${getFruit()} fanboy");
   
}
