class Animal {
    constructor(legs) {
        this.legs = legs;
    }
    walk() {
        console.log('walking on ' + this.legs + ' legs');
    }
}

//Bird
class Bird extends Animal {
    constructor(legs){
        super(legs);
    }

    fly() {
        console.log('I cn fly');
    }
}

let bird = new Bird(2);

bird.walk();
bird.fly();

//Dog

class Dog extends Animal {
    constructor() {
        super(4);
    }

    walk () {
        super.walk();
        console.log('Walking')
    }
}

