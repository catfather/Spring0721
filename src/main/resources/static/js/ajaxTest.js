$('#ajax').on('click',ajax1Fn);

function ajax1Fn(){
    $.ajax({
        type:'GET',
        url:'/ajax/index',
        success:function(res){
            console.log(res);
            alert('ajax Success!');

        },
        error:function(){
            console.log("fail");

        }
    })
}

$('#ajax2').on('click',ajax2Fn);

function ajax2Fn(){
    $.ajax({
        type:'POST',
        url:'/ajax/ajax2',
        success:function(res){
            alert('ajax Success!');
            console.log(res);

        },
        error:function(){
            console.log("fail");

        }
    })
}
$('#ajax3').on('click',ajax3Fn);
function ajax3Fn(){
    $.ajax({
        type:'GET',
        url:'/ajax/ajax3',
        data:{'name':'m1','email':'m1email'},
        success:function(res){
            alert('ajax Success!');
            console.log(res);

        },
        error:function(){
            console.log("fail");

        }
    })
}

$('#ajax4').on('click',ajax4Fn);
function ajax4Fn(){
    $.ajax({
        type:'POST',
        url:'/ajax/ajax4',
        data:{'name':'m1','email':'m1email'},
        success:function(res){
            alert('ajax Success!');
            console.log(res);

        },
        error:function(){
            console.log("fail");

        }
    })
}

$('#ajax5').on('click',ajax4Fn);
function ajax4Fn(){
    $.ajax({
        type:'POST',
        url:'/ajax/ajax5',
        data:{'name':'m1','email':'m1email'},
        success:function(res){
            alert('ajax Success!');
            console.log(res);
            console.log(res.name);
            console.log(res.email);

            $('.name').text(res.name);
            $('.email').text(res.email);


        },
        error:function(){
            console.log("fail");

        }
    })
}

$('#ajax7').on('click',ajax7Fn);
function ajax7Fn(){
    $.ajax({
        type:'POST',
        url:'/ajax/ajax7',
        success:function(res){
            alert('ajax Success!');
            console.log(res);

            let data="<tbody>"
            for(let i in res){
                console.log(res[i]);
                data+="<tr>";

                data+="<td>"+res[i].email+"</td>"
                data+="<td>"+res[i].name+"</td>"

                data+="</tr>";
            }
            data+="</tbody>";
            console.log(data);
            $('.rs2').html(data);


        },
        error:function(){
            console.log("fail");

        }
    })
}

$('#ajax8').on('click',ajax8Fn);
function ajax8Fn(){
const data={
'name':'m1','email':'m1email'
};

    $.ajax({
        type:'POST',
        url:'/ajax/ajax8',
        data:JSON.stringify(data),
        contentType : "application/json; charset=utf-8",
        success:function(res){
            alert('ajax Success!');
            console.log(res);
            console.log(res.name);
            console.log(res.email);

            $('.name').text(res.name);
            $('.email').text(res.email);


        },
        error:function(){
            console.log("fail");

        }
    })
}

$('#ajax9').on('click',ajax9Fn);
function ajax9Fn(){
const data={
'name':'m1','email':'m1email'
};

    $.ajax({
        type:'POST',
        url:'/ajax/ajax9',
        data:JSON.stringify(data),
        contentType : "application/json; charset=utf-8",
        success:function(res){
            alert('ajax Success!');
            console.log(res);
            console.log(res.name);
            console.log(res.email);

            $('.name').text(res.name);
            $('.email').text(res.email);


        },
        error:function(){
            console.log("fail");

        }
    })
}