$(document).ready(function(){

 $('#signUp').on("click",function(){
                jsRoutes.controllers.SignUpController.signUpAction($('#name').val(),$('#username').val(),
                            $('#password').val(),$('#confirmPassword').val()).ajax({
                            success: function(data){
                                $('#body').html(data);
                            },
                            error: function(){
                                $('#body').html("Please signUp again");
                                alert("fail")
                          }
                })
            })
});