//Bonus:  refactor Animals.jaaa into jaaascript
let animals = ["peacoCK", "rabbit", "chiwawa", "OranguTAN", "aipeR", "cobra", "paNDa", "bUffalo", "DeeR", "maLLard"];

const capsFirst = (arr, mutate) => {
    if (mutate) {
        return arr.map(a => a.slice(0, 1).toUpperCase() + a.slice(1).toLowerCase())
    }
    else {
        let newArr = arr.slice();
        return newArr.map(a => a.slice(0, 1).toUpperCase() + a.slice(1).toLowerCase());
    }
}

const lowerFirst = (arr, mutate) => {
    if (mutate) {
        return arr.map(a => a.slice(0, 1).toLowerCase() + a.slice(1).toUpperCase());
    }
    else {
        let newArr = arr.slice();
        return newArr.map(a => a.slice(0, 1).toLowerCase() + a.slice(1).toUpperCase());
    }

}

const addAnimal = animalName => {
    animals.push(animalName);
    return animalName;
}

const flipAnimals = mutate => {
    let instructions = ["Flip", "the", "animals", "list", ".", " ", "Mutate", "the", "animals", "only", "if", "flag", "true"];
    if (mutate) {
        instructions.reverse();
        return instructions;
    } else {
        let newArray = instructions.slice();
        newArray.reverse();
        return newArray;
    }
}

const sortAnimals = mutate => {
    if (mutate) {
        animals.sort();
        return animals;
    } else {
        let newArr = animals.slice();
        newArr.sort();
        return newArr;
    }
}
console.log("1", capsFirst(animals, false));
console.log("2", capsFirst(animals, true));

console.log("3", lowerFirst(animals, false));
console.log("4", lowerFirst(animals, true));

console.log(addAnimal("Doggy dog"));
console.log("5", animals);
animals = capsFirst(animals, true);
console.log("6", flipAnimals());
console.log("7", sortAnimals(false));