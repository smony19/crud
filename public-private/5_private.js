class Circle {
    #radius = 0; //private class variable
  
    constructor(radius) {
      this.#radius = radius;
    }
  
    get radius() {
      return this.#radius;
    }
  
    set radius(value) {
        if (typeof value === "number" && value > 0) {
          this.#radius = value;
        } else {
          throw "The radius must be a positive number";
        }
      }
  
    get area() {
      return Math.PI * Math.pow(this.radius, 2);
    }
  }
  
  let shape = new Circle(4);
  console.log(shape.area);  
  console.log(shape.radius);