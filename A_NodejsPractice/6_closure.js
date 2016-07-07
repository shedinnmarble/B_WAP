var foo = 1;
function bar() {
if (!foo) {
var foo = 10;
var b=100;
}
console.log(foo);
console.log(b)
}
bar();