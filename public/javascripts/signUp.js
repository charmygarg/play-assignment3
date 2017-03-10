$(document).ready(function(){

 $('#signUp').on("click",function(){

                console.log($('#name').val())
                console.log("clicked")
                jsRoutes.controllers.SignUpController.signUpAction($('#name').val(),$('#username').val(),
                                $('#password').val(),$('#confirmPassword').val()).ajax({
                            success: function(data){
                              $('#body').html(data);

                            },
                            error: function(){
                            $('#body').html("hello");
                            alert("fail")
                          }

                })


            })
});