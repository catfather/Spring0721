// emailCheckFn 함수 정의
function emailCheckFn() {
    const email = $('#email').val();
    $.ajax({
        type: 'GET',
        url: '/ajax/ajaxJoin',
        data: { email: email }, // 객체 형태로 데이터 전달
        success: function (req) {
            if (req == 1) {
                alert("중복 이메일");
                $('#email').focus();
                return false;
            }
            alert("등록 가능한 이메일");
        },
        error: function () {
            alert("실패...?");
        }
    });
}

// 이벤트 핸들러 등록 시 함수명만 사용
$('#emailCheck').on('click', emailCheckFn);
