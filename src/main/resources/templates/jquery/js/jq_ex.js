//$('*').css('margin','100').css('padding','0')
$('*').css({'margin':'0','padding':'0'})
$('#parent').css({'width':'800px','border':'1px solid'})
$('#parent .nav').css({'background-color' : 'green'})
$('#parent .nav h1').css({'width' : '400px','height':'40px'
,'background-color':'blue'})
$('.gnb').css({'width':'800'})
$('.gnb>ul').css({'display':'flex','jutify-content':'space-between'})
$('.gnb>ul>li').css({'background-color':'red'})
$('.gnb>ul>li').css({'flex':'1','background-color':'#ffff00'})
$('ul,li').css({'list-style':'none'})
$('ul>li').eq(2).css({'background-color':'blue'})
$('.box').css({'width':'500px','height':'300px','border':'1px solid'})
$('.box').html('<div><ul><li>list</li></ul></div>');
//템플렛 리터럴 문자처리 방식
const data=`
<div>
    <ul>
        <li>아이디</li>
        <li>비밀번호</li>
        <li>이름</li>
        <li>이메일</li>
    </ul>
</div>
`

// 이벤트 구현 1
//$('.gnb>ul>li').eq(0).on('click', function(){});

//이벤트 구현 2
//$('.gnb>ul>li').eq(0).on('click', ()=>{ });

// 이벤트
$('.gnb>ul>li').eq(0).on('click',fn1);
function fn1(){
    $('.box').html(data)
}

$('.gnb>ul>li').eq(1).on('click',fn2);
function fn2(){
    $('.box').html("")
}

function btn1Fn(){
    alert("추가되었습니다");
}




