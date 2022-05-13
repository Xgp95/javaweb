$(function(){
    //1.选择 含有文本 'di' 的 div 元素
    $("#btn1").click(function(){
        $("div:contains(di)").css("background", "#bbffaa");
    });

    //2.选择不包含子元素(或者文本元素) 的 div 空元素
    $("#btn2").click(function(){
        $("div:empty").css("background", "#bbffaa");
    });

    //3.选择含有 class 为 mini 元素的 div 元素
    $("#btn3").click(function(){
        $("div:has(.mini)").css("background", "#bbffaa");
    });

    //4.选择含有子元素(或者文本元素)的div元素
    $("#btn4").click(function(){
        $("div:parent").css("background", "#bbffaa");
    });
});