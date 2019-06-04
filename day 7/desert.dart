class Dessert {
  String _type;
  factory Dessert(int price) {
    if(price > 50000) {
      return Dessert._produceDessert("Expensive");
    }else if(price<=50000 && price >=25000) {
      return Dessert._produceDessert("Okayish");
    }else {
      return Dessert._produceDessert("Very Cheap");
    }
  }
  Dessert._produceDessert(this._type);
  @override
  String toString() => "Type: $_type";
}
main(List<String> args) {
  var dessert =Dessert(1000000);
  var des = Dessert(30000);
  var dess=Dessert(30);
  print(dessert);
  print(des);
  print(dess);
}