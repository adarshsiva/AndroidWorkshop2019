class Fruit {
  String _color;
  String _shape;
  int _price;
  Fruit(this._color, this._shape, this._price);//unnamed constructor
  Fruit.fruit(this._color, this._shape);//named constructor
   Fruit.lil(this._color);
  @override
  String toString() => "Color :$_color,Shape:$_shape,Price: $_price";
}

main(List<String> args) {
  var fruit = Fruit("red", "round", 100);
  var fruits=Fruit.fruit("orange","flat");
  var fruity=Fruit.lil("yellow");
  print(fruit);
  print(fruits);
  print(fruity);
}
