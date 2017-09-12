/**
 * 
 */
(function(){
	
	var styleNormal = {'background-color':'none'};
	var styleHighlight = {'background-color':'#ffffff'};
	
	var homeController = function($scope,$log){
		$scope.showuser = function(){
			$scope.user=true;
			$scope.userStyle=styleHighlight;
			$scope.adminStyle=styleNormal;
			$log.info("user click:user");
		}
		$scope.showadmin = function(){
			$scope.user=false;
			$scope.adminStyle=styleHighlight;
			$scope.userStyle=styleNormal;
			$log.info("user click:admin");
		}
		$scope.test = function(){
			alert("HomeController: ng-click working.");
		}
		//(function(){alert("home controller working.");}());
		$scope.user = true;
		
	}
	
	var module = angular.module("AirlineManagement")
	module.controller("HomeController",homeController);
}());