 $(document).ready(function(){

    $('#logout').on("click",function(){

                console.log("clicked")
                jsRoutes.controllers.WelcomeController.welcome().ajax({
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
