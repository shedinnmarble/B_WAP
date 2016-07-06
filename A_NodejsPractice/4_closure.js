
    x = 10; 
    console.log('some thing:' + x);              // foo.js
    function main() {
        //var x = 5;
        //var x;
        console.log("<br>x1 is" + x);
        x = 20;
        if (x > 0) {
            //var x = 30;
            console.log("<br>x2 is" + x);
        }
        //var x = 40;
        var f = function(x) { console.log("<br>x3 is" + x); }
        f(50);
    }
    main();
