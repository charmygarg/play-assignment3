
$(document).ready(function(){

        $('#signUpBtn').on("click",function(){

         jsRoutes.controllers.SignUpController.signUp().ajax({
                      success: function(data){
                        $('#body').html(data);
                      },
                      error: function(){
                      $('#body').html("hello");
                      alert("fail")
                    }
          })
      })
      $('#loginBtn').on("click",function(){
                jsRoutes.controllers.LoginController.login().ajax({
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

