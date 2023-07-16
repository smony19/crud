class Circle {
  #radius = 0;
  static #count = 0;

  constructor(radius) {
    this.radius = radius;
    Circle.#count++;
  }

  get area() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  set radius(value) {
    if (typeof value === "number" && value > 0) {
      this.#radius = value;
    } else {
      throw "The radius must be a positive number";
    }
  }
  // get radius() {
  //   return this.#radius;
  // }
  
  static get count() {
    return Circle.#count;   
  }
}

let circles = [new Circle(10), new Circle(20), new Circle(30)];
let circle1 = new Circle(10);
console.log(circle1.radius);
console.log(Circle.count);
