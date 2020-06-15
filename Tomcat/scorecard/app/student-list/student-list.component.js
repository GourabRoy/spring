// Register `studentList` component, along with its associated controller and template
angular.
  module('studentCatalogue').
  component('studentList', {
    templateUrl:'app/student-list/student-list.template.html',
    controller: function StudentListController($http) {

	var self = this;
	$http.get('http://localhost:9090/services/getStudentsForBatch/12345').then(function(response) {
        self.students = response.data;
      });
    }
  });
