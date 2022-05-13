$(function () {

//1.选择第一个 div 元素
$("#btn1").click(function(){
	$("div:first").css("background", "#bbffaa");
});

//2.选择最后一个 div 元素
$("#btn2").click(function(){
	$("div:last").css("background", "#bbffaa");
});

//3.选择class不为 one 的所有 div 元素
$("#btn3").click(function(){
	$("div:not(.one)").css("background", "#bbffaa");
});

//4.选择索引值为偶数的 div 元素
$("#btn4").click(function(){
	$("div:even").css("background", "#bbffaa");
});

//5.选择索引值为奇数的 div 元素
$("#btn5").click(function(){
	$("div:odd").css("background", "#bbffaa");
});

//6.选择索引值为大于 3 的 div 元素
$("#btn6").click(function(){
	$("div:gt(3)").css("background", "#bbffaa");
});

//7.选择索引值为等于 3 的 div 元素
$("#btn7").click(function(){
	$("div:eq(3)").css("background", "#bbffaa");
});

//8.选择索引值为小于 3 的 div 元素
$("#btn8").click(function(){
	$("div:lt(3)").css("background", "#bbffaa");
});

//9.选择所有的标题元素
$("#btn9").click(function(){
	$("div:header").css("background", "#bbffaa");
});

//10.选择当前正在执行动画的所有元素
$("#btn10").click(function(){
	$(":animated").css("background", "#bbffaa");
});
//11.选择没有执行动画的最后一个div
$("#btn11").click(function(){
	$("div:not(:animated):last").css("background", "#bbffaa");
});})