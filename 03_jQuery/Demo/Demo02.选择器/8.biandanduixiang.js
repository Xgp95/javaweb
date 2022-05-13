$(function(){
		//1.对表单内 可用input 赋值操作
		$("#btn1").click(function(){
			// val()可以操作表单项的value属性值
			// 它可以设置和获取
			$(":text:enabled").val("我是万能的程序员");
		});
		//2.对表单内 不可用input 赋值操作
		$("#btn2").click(function(){
			$(":text:disabled").val("管你可用不可用，反正我是万能的程序员");
		});
		//3.获取多选框选中的个数  使用size()方法获取选取到的元素集合的元素个数
		$("#btn3").click(function(){
			alert( $(":checkbox:checked").length );
		});
		//4.获取多选框，每个选中的value值
		$("#btn4").click(function(){
			// 获取全部选中的复选框标签对象
			var $checkboies = $(":checkbox:checked");
			// 老式遍历
			// for (var i = 0; i < $checkboies.length; i++){
			// 	alert( $checkboies[i].value );
			// }

			// each方法是jQuery对象提供用来遍历元素的方法
			// 在遍历的function函数中，有一个this对象，这个this对象，就是当前遍历到的dom对象
			$checkboies.each(function () {
				alert( this.value );
			});

		});
		//5.获取下拉框选中的内容
		$("#btn5").click(function(){
			// 获取选中的option标签对象
			var $options = $("select option:checked");
			// 遍历，获取option标签中的文本内容
			$options.each(function () {
				// 在each遍历的function函数中，有一个this对象。这个this对象是当前正在遍历到的dom对象
				alert(this.innerHTML);
			});
		});
	});