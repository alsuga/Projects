// John Machin's formula pi/4 = 4 * arctan (1/5) - arctan (1/239)
const getPiApx = 16 * Math.atan(1 / 5) - 4 * Math.atan(1 / 239);

const getNDigitPi = (n = 100) => getPiApx.toFixed(n > 100? 100: n);

console.log('result', getNDigitPi());
