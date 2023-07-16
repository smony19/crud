function person(name) {
    return {
        name: name,
        talk()  {
            console.log(`Hello! I am ${this.name}.`);
        }
    }
}

const joe = person('Joe')
joe.talk();