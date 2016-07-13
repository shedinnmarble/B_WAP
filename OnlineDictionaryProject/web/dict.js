/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
"use strict";
var Dict = (function () {
    var submit = function () {
        var word = $("#word").val();
        if (word.length === 0) {
            alert("please input a word!");
            return;
        }
        $("#ajaxLoading").show();
        $.post("dictServlet", {"word": word})
                .done(function (data) {
                    var jsonData = JSON.parse(data);
                    var content = "";
                    if (jsonData.length === 0) {
                        content = "<p>Sorry, no such word</p>";
                    }
                    $("#difinition").empty();
                    $.each(jsonData, function (index, value) {
                        content += "<p>" + (index + 1) + "(" + value.wordtype + ")::" + value.definition + "</p>";
                    });
                    $("#difinition").html(content);
                }).always(function () {
            $("#ajaxLoading").hide();
        });
    };
    var click = function () {
        $("#lookUp").click(function () {
            submit();
        });
        $(document).keypress(function (e) {
            if (e.which === 13) {
                submit();
            }
        });
    };
    return{
        click: click
    };

})();

$(document).ready(function () {
    Dict.click();
});

