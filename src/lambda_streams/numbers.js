//Bonus: refactor numbers.java into javascript
let nums = [10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500];

const added = () => nums.reduce((a, b) => a + b, 0);
console.log(added())

const subtracted = () => nums.reduce((a, b) => a - b, 0);
console.log(subtracted())


const multiplied = () => nums.reduce((a, b) => a * b, 1);
console.log(multiplied())


const divided = () => nums.reduce((a, b) => a / b, multiplied());
console.log(divided())

const findMax = () => Math.max(...nums);
console.log(findMax());
const findMin = () => Math.min(...nums);
console.log(findMin())

const isPrime = num => {
    for (let i = 2; i <= num / 2; i++) {
        if (num % i === 0) {
            return false;
        }
    }
    return true;
}
console.log(isPrime(29))
console.log(isPrime(39))