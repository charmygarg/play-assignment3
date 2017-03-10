$(document).ready(function(){

 $('#login').on("click",function(){

                console.log($('#username').val())
                console.log("clicked")
                jsRoutes.controllers.LoginController.loginAction($('#username').val()).ajax({
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