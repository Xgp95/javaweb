window.onload = function(){
    //1.查找#bj节点
    document.getElementById("btn01").onclick = function () {
        var elementByIdbj = document.getElementById("bj");
        alert(elementByIdbj.innerText);
    }
    //2.查找所有li节点
    var btn02Ele = document.getElementById("btn02");
    btn02Ele.onclick = function () {
        alert(document.getElementsByTagName("li").length);
    }

    //3.查找name=gender的所有节点
    var btn03Ele = document.getElementById("btn03");
    btn03Ele.onclick = function () {
        alert(document.getElementsByName("gender").length);
    }

    //4.查找#city下所有li节点
    var btn04Ele = document.getElementById("btn04");
    btn04Ele.onclick = function(){
        //1 获取id为city的节点
        var elementByIdcity = document.getElementById("city");

        //2 通过city节点.getElementsByTagName按标签名查子节点
        alert(elementByIdcity.getElementsByTagName("li").length);
    };
    //5.返回#city的所有子节点
    var btn05Ele = document.getElementById("btn05");
    btn05Ele.onclick = function(){
        //1 获取id为city的节点
        var elementByIdcity = document.getElementById("city");
        //2 通过city获取所有子节点
        var length = elementByIdcity.childNodes.length;
        alert(length);
    };
    //6.返回#phone的第一个子节点
    var btn06Ele = document.getElementById("btn06");
    btn06Ele.onclick = function(){
        // 查询id为phone的节点
        var elementById = document.getElementById("phone");
        alert(elementById.firstChild.innerHTML);
    };
    //7.返回#bj的父节点
    var btn07Ele = document.getElementById("btn07");
    btn07Ele.onclick = function(){
        //1 查询id为bj的节点
        var elementById = document.getElementById("bj");
        //2 bj节点获取父节点
        var parentNode = elementById.parentNode;
        alert(parentNode.innerHTL);
    };
    //8.返回#android的前一个兄弟节点
    var btn08Ele = document.getElementById("btn08");
    btn08Ele.onclick = function(){
        // 获取id为android的节点
        var elementById = document.getElementById("android");
        // 通过android节点获取前面兄弟节点
        alert(elementById.previousSibling.innerHTML);
    };
    //9.读取#username的value属性值
    var btn09Ele = document.getElementById("btn09");
    btn09Ele.onclick = function(){
        var elementById = document.getElementById("username");
        alert(elementById.value);
    };
    //10.设置#username的value属性值
    var btn10Ele = document.getElementById("btn10");
    btn10Ele.onclick = function(){
        var elementById = document.getElementById("username");
        elementById.value = "hello world"
    };
    //11.返回#bj的文本值
    var btn11Ele = document.getElementById("btn11");
        btn11Ele.onclick = function(){
        var elementById = document.getElementById("city");
        alert(elementById.innerText);
    };
};