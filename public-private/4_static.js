class Item {
  
  constructor (name, quantity){
    this.name = name;
    this.quantity = quantity;
    this.constructor.count++;
  }

  static count = 0;
  static getCount() {
    return Item.count;
  }
}

let pen = new Item('Pen', 5);
let pencil = new Item('Pencil', 5);

console.log(Item.getCount());