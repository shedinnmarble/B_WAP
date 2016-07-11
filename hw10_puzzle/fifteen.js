 //js puzzle game code
 "use strict";
 //define empty tile Module
 var empty = (function() {
     // the 4th row, and the 4th col
     var row;
     var col;
     var setRow = function(row) {
         this.row = row;
     };
     var setCol = function(col) {
         this.col = col;
     };
     var getRow = function() {
         return this.row;
     };
     var getCol = function() {
         return this.col;
     };
     return {
         setRow: setRow,
         setCol: setCol,
         getRow: getRow,
         getCol: getCol
     };
 })();
 var Puzzle = (function() {
     //General implementation steps
     //1. initialize the background
     //2. set the click event for divs
     //3. movie the div for the clicked one and swap with the empty one
     //4. remember the empty div and remove them

     //init the game
     var init = function() {

         var divs = $("#puzzlearea div");

         // initialize each piece
         $.each(divs, function(i, value) {
             var div = divs[i];
             // calculate x and y for this piece
             var x = ((i % 4) * 100);
             var y = (Math.floor(i / 4) * 100);

             // set basic style and background
             div.className = "puzzlepiece";
             div.style.left = x + 'px';
             div.style.top = y + 'px';
             div.style.backgroundImage = 'url("background.jpg")';
             div.style.backgroundPosition = -x + 'px ' + (-y) + 'px';
             // store x and y for later
             div.x = x;
             div.y = y;
         });
         empty.setRow(3);
         empty.setCol(3);

     };
     var canMove = function(tileLeft, emptyLeft, tileTop, emptyTop) {
         if (Math.abs(tileLeft - emptyLeft) == 100 && tileTop == emptyTop) {
             return true;
         }
         if (Math.abs(tileTop - emptyTop) == 100 && tileLeft == emptyLeft)  {
             return true;
         }
         return false;
     };
     var shuffle = function(array) {
         var currentIndex = array.length,
             temporaryValue, randomIndex;

         // While there remain elements to shuffle...
         while (0 !== currentIndex) {

             // Pick a remaining element...
             randomIndex = Math.floor(Math.random() * currentIndex);
             currentIndex -= 1;

             // And swap it with the current element.
             temporaryValue = array[currentIndex];
             array[currentIndex] = array[randomIndex];
             array[randomIndex] = temporaryValue;
         }

         return array;
     };
     var clickMoveInit = function() {
         $("#puzzlearea div").click(function() {
             //get current x, y
             //set it to new x,y
             //update empty div area
             var left = parseInt($(this).css("left"));
             var top = parseInt($(this).css("top"));
             var emptyLeft = empty.getRow() * 100;
             var emptyTop = empty.getCol() * 100;
             //swap empty and the current one
             if (canMove(left, emptyLeft, top, emptyTop)) {
                 empty.setRow(parseInt(left) / 100);
                 empty.setCol(parseInt(top) / 100);
                 $(this).css("left", emptyLeft + "px");
                 $(this).css("top", emptyTop + "px");
             }

             // alert(left+":"+right+"; "+emptyLeft+","+emptyTop);
         });
         $("#puzzlearea div").hover(function() {
             var left = parseInt($(this).css("left"));
             var top = parseInt($(this).css("top"));
             var emptyLeft = empty.getRow() * 100;
             var emptyTop = empty.getCol() * 100;
             //swap empty and the current one
             if (canMove(left, emptyLeft, top, emptyTop)) {
                 $(this).addClass("movablepiece");
             }
         }).mouseout(function() {
             $(this).removeClass("movablepiece");
         });
         $("#shufflebutton").click(function() {
             //re-arrange the sequence
             //get random result
             //add number 
             var randomArr = [];
             var divs = $("#puzzlearea div");
             var size = divs.length;
                 //check array contins some value
             function contains(a, obj) {
                 for (var i = 0; i < a.length; i++) {
                     if (a[i] === obj) {
                         return true;
                     }
                 }
                 return false;
             }
             while (size >= 0) {
                 while (true) {
                     var randomNum = parseInt(Math.random() * 16);
                     if (!contains(randomArr, randomNum)) {
                         randomArr.push(randomNum);
                         break;
                     }
                 }
                 size--;
             }
             //update empty size
             var x = ((randomArr[divs.length] % 4));
             var y = (Math.floor(randomArr[divs.length] / 4));
             empty.setRow(x);
             empty.setCol(y);
             //reset current box number
             $.each(divs, function(i, value) {
                     var x = ((randomArr[i] % 4) * 100);
                     var y = (Math.floor(randomArr[i] / 4) * 100);
                     $(value).css("left", x + "px");
                     $(value).css("top", y + "px");
                 });
                 //alert(randomArr)

         });
     };

     return {
         init: init,
         clickMoveInit: clickMoveInit
     };
 })();
 $(document).ready(function() {
         // alert("I have jquery");
         Puzzle.init();
         Puzzle.clickMoveInit();
     });
     // window.onload=function(){
     // 
     // }