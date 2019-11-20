
jQuery(document).ready(function () {

    jQuery("section").append("<div><p>LEYENDA DE LO Q SEA</p></div>");
    $("tr").append("<td>Info</td>");
    $(".articulo").append("<p>Un parrafo en todos los clase articulo</p>");
    $("td:nth-child(5)").attr("style", "background-color:red;color:white;");
    $("td:nth-child(5)").click(() => {
        alert("ay no me pinches :<");
    });
    //$(".articulo").toggle();
    $("#otro_menu").html("<h2>Menú de artículos</h2><div id='martinez' class='divArtic'></div>");
    $("article").each(function (index) {
        $(this).attr("id", "articulo_" + index);
        $("#martinez").append(`
        
            <a class='spct0'>Articulo `+ (index + 1) + `</a>
        
        `);
    });
    $("#martinez").append("<a class='spct00'>Tunear </a>");
    var first = true;
    $(".spct00").click(function () {
        if (first) {
            $(".articulo").addClass("fancy_article");
            first = false;
        }else{
            $(".articulo").removeClass("fancy_article");
            first=true;
        }
    });
    $(".spct0").each(function (index) {
        $(this).click(function () {
            $("#articulo_" + index).toggle();
        });
    });

});