$(function () {
	//1.选择 id 为 one 的元素 "background-color","#bbffaa"
	$("#btn1").click(function () {
		// css() 方法 可以设置和获取样式
		$("#one").css("background-color","#bbffaa");
	});


	//2.选择 class 为 mini 的所有元素
	$("#btn2").click(function () {
		$(".mini").css("background-color","#bbffaa");
	});

	//3.选择 元素名是 div 的所有元素
	$("#btn3").click(function () {
		$("div").css("background-color","#bbffaa");
	});

	//4.选择所有的元素
	$("#btn4").click(function () {
		$("*").css("background-color","#bbffaa");
	});

	//5.选择所有的 span 元素和id为two的元素
	$("#btn5").click(function () {
		$("span,#two").css("background-color","#bbffaa");
	});

});