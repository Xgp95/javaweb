$(function() {
    //1.选取含有 属性title 的div元素
    $("#btn1").click(function() {
        $("div[title]").css("background", "#bbffaa");
    });
    //2.选取 属性title值等于'test'的div元素
    $("#btn2").click(function() {
        $("div[title='test']").css("background", "#bbffaa");
    });
    //3.选取 属性title值不等于'test'的div元素(*没有属性title的也将被选中)
    $("#btn3").click(function() {
        $("div[title!='test']").css("background", "#bbffaa");
    });
    //4.选取 属性title值 以'te'开始 的div元素
    $("#btn4").click(function() {
        $("div[title^='te']").css("background", "#bbffaa");
    });
    //5.选取 属性title值 以'est'结束 的div元素
    $("#btn5").click(function() {
        $("div[title$='est']").css("background", "#bbffaa");
    });
    //6.选取 属性title值 含有'es'的div元素
    $("#btn6").click(function() {
        $("div[title*='es']").css("background", "#bbffaa");
    });

    //7.首先选取有属性id的div元素，然后在结果中 选取属性title值 含有'es'的 div 元素
    $("#btn7").click(function() {
        $("div[id][title*='es']").css("background", "#bbffaa");
    });
    //8.选取 含有 title 属性值, 且title 属性值不等于 test 的 div 元素
    $("#btn8").click(function() {
        $("div[title][title!='test']").css("background", "#bbffaa");
    });
});