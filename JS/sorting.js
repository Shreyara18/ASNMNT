const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter numbers separated by spaces: ', (input) => {
  // Convert the input string into an array of numbers
  const numbers = input.split(' ').map(num => Number(num));

  // Sorting the array in descending order
  numbers.sort((a, b) => b - a);

  console.log('Sorted array in descending order:', numbers);
  rl.close();
});
