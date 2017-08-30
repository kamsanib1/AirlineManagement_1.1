/**
 * 
 */

(function(){
	var app = angular.module("AirlineManagement",["ngRoute"]);
	app.config(function($routeProvider){
		$routeProvider
			.when("/home",{
				templateUrl:"html/home.html",
				controller:"HomeController"
			})
			.when("/user",{
				templateUrl:"html/user.html"
			})
			.otherwise({redirectTo:"/home"});
	})
}());

