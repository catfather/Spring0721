let json1={
    'userId':'m1',
    'userpw':'111',
    'userAge':"11"
    'arr':['java','html','css','script',]
    'data':{
        'result':["a","a","a","a"]

    }
}



$('#userId').val();
$('#email').val();
$('#password').val();

// {user : ,email: ,password: }
// @RequestBody


let jsonData={
    'userId':$('#userId').val(),
    'email':$('#email').val(),
    'password':$('#password').val();
}

JSON.stringfy(jsonData);


//get 경우

