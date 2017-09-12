/**
 * 
 */

(function(){
	var app = angular.module("AirlineManagement",["ngRoute"]);
	app.config(function($routeProvider){
		$routeProvider
			.when("/home",{
				templateUrl:"html/home.html",
				controller: "HomeController"
			})
			.when("/user",{
				templateUrl:"html/user.html",
				controller: "AdminController"	
			})
			.when("/admin",{
				templateUrl:"html/admin.html",
				controller: "AdminController"	
			})
			.when("/signup",{
				templateUrl:"html/admin.html"
			})
			.otherwise({redirectTo:"/home"});
	})
}());

