const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");

    // Reverse each word
    let reversedWords = words.map(word => {
        return word.split("").reverse().join("");
    });

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

rl.question('Please enter a sentence: ', (sentence) => {
  const reversed = reverseWords(sentence);
  console.log("Reversed sentence:", reversed);
  rl.close();
});
