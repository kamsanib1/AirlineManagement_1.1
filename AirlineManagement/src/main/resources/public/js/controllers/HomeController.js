/**
 * 
 */
(function(){
	
	var homeController = function($scope, $http, $location,$log){
		$scope.username="";
		$scope.password="";
		
		var url="http://localhost:9090/";
		var user;
		$scope.verify = function(){
			$http.get(url+"api/users/"+$scope.username)
				.then(verifyUser);
		}
		
		var verifyUser= function(response){
			var user = response.data;
			$log.info("response:\n"+user.username);
			if(user!=null && user.password==$scope.password)
				$location.path("/user");
			else $scope.error = "login failed!!";
		}
	}
	
	angular.module("AirlineManagement")
		.controller("HomeController",homeController);
}());