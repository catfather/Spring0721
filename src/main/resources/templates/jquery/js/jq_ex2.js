



$('#idCheck').on('click',idCheckFn);

function idCheckFn(){

    if($('#userId').val() == 'm1'){
        alert('존재합니다')
        const data='아이디가 존재 합니다';
        $('#result').text(data);
        return false;
    }else{
        alert("존재하지 않습니다")
    }
}

$('#joinBtn').on('click',joinFn);
function joinFn(event){

}





$('.result > button').on('click',fn1);
function fn1(){

    const userId=$('#userId').val();
    const email=$('#email').val();
    const password=$('#password').val();

    const data =`
        <tr>
            <td>${userId}</td>
            <td>${email}</td>
            <td>${password}</td>
        </tr>
    `

    $('.result > table > tbody').append(data);
}

