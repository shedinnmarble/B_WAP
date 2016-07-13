/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var Dict = (function () {
    var click = function () {
        $("#lookUp").click(function () {
            var word = $("#word").val();
             $("#ajaxLoading").show();
            $.post("dictServlet", {"word": word})
                    .done(function (data) {
                        var jsonData = JSON.parse(data);
                        var content = "";
                        if (jsonData.length == 0) {
                            content = "<p>Sorry, no such word</p>";
                        }
                        $("#difinition").empty();
                        $.each(jsonData, function (index, value) {
                            content += "<p>" + index + "(" + value.wordtype + ")::" + value.definition + "</p>";
                        })
                        $("#difinition").html(content)
                    }).always(function () {
                $("#ajaxLoading").hide()
            })


        })
    };
    return{
        click: click
    }

})();

$(document).ready(function () {
    $("#ajaxLoading")
            .hide()
            .ajaxStart(function () {
                $(this).show();
            }).ajaxStop(function () {
        $(this).hide();
    });
    Dict.click()
})

