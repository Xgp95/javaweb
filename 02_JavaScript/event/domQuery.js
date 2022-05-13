window.onload = function(){
    //1.查找#bj节点
    document.getElementById("btn01").onclick = function () {
        var bjObj = document.getElementById("bj");
        alert(bjObj.innerHTML);
    }
    //2.查找所有li节点
    var btn02Ele = document.getElementById("btn02");
    btn02Ele.onclick = function(){
        var lis = document.getElementsByTagName("li");
        alert(lis.length)
    };
    //3.查找name=gender的所有节点
    var btn03Ele = document.getElementById("btn03");
    btn03Ele.onclick = function(){
        var genders = document.getElementsByName("gender");
        alert(genders.length)
    };
    //4.查找#city下所有li节点
    var btn04Ele = document.getElementById("btn04");
    btn04Ele.onclick = function(){
        //1 获取id为city的节点
        //2 通过city节点.getElementsByTagName按标签名查子节点
        var lis = document.getElementById("city").getElementsByTagName("li");
        alert(lis.length)
    };
    //5.返回#city的所有子节点
    var btn05Ele = document.getElementById("btn05");
    btn05Ele.onclick = function(){
        //1 获取id为city的节点
        //2 通过city获取所有子节点
        alert(document.getElementById("city").childNodes.length);
    };
    //6.返回#phone的第一个子节点
    var btn06Ele = document.getElementById("btn06");
    btn06Ele.onclick = function(){
        // 查询id为phone的节点
        alert( document.getElementById("phone").firstChild.innerHTML );
    };
    //7.返回#bj的父节点
    var btn07Ele = document.getElementById("btn07");
    btn07Ele.onclick = function(){
        //1 查询id为bj的节点
        var bjObj = document.getElementById("bj");
        //2 bj节点获取父节点
        alert( bjObj.parentNode.innerHTML );
    };
    //8.返回#android的前一个兄弟节点
    var btn08Ele = document.getElementById("btn08");
    btn08Ele.onclick = function(){
        // 获取id为android的节点
        // 通过android节点获取前面兄弟节点
        alert( document.getElementById("android").previousSibling.innerHTML );
    };
    //9.读取#username的value属性值
    var btn09Ele = document.getElementById("btn09");
    btn09Ele.onclick = function(){
        alert(document.getElementById("username").value);
    };
    //10.设置#username的value属性值
    var btn10Ele = document.getElementById("btn10");
    btn10Ele.onclick = function(){
        document.getElementById("username").value = "hello world";
    };
    //11.返回#bj的文本值
    var btn11Ele = document.getElementById("btn11");
    btn11Ele.onclick = function(){
        alert(document.getElementById("city").innerHTML);
        // alert(document.getElementById("city").innerText);
    };
};