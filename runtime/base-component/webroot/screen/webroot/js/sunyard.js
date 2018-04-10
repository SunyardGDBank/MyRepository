// by 2018/1/2

$(function () {
    $(window).on('scroll', function () {
        $('#left').height($('#content').height())
    })
})