$(document).ready(function(){
    //1.选择 body 内的所有 div 元素
    $("#btn1").click(function(){
        $("div").css("background", "#bbffaa");
    });

    //2.在 body 内, 选择div子元素
    $("#btn2").click(function(){
        $("body > div").css("background", "#bbffaa");
    });

    //3.选择 id 为 one 的下一个 div 元素
    $("#btn3").click(function(){
        $("#one+div").css("background", "#bbffaa");
    });

    //4.选择 id 为 two 的元素后面的所有 div 兄弟元素
    $("#btn4").click(function(){
        $("#two~div").css("background", "#bbffaa");
    });
});