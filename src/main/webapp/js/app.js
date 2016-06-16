(function () {

    angular.module('myTask', [])

        .controller('TaskController', function ($scope, $http) {

            $scope.list = [];

            init();

            function init() {
                listAll();
                $scope.task = {};
            }

            function listAll() {
                $http.get('/api/tasks').then(function (response) {
                    $scope.list = response.data._embedded.tasks;
                });
            }

            $scope.add = function () {
                $http.post('/api/tasks', $scope.task).then(function () {
                    init();
                });
            };

            $scope.filed = function (task) {
                $http.put(task._links.self.href, task).then(function () {
                	listAll();
                });
            };

            $scope.delete = function () {
                $scope.list.forEach(function (t) {
                    if (t.filed) {
                        $http.delete(t._links.self.href).then(function () {
                        	listAll();
                        });
                    }
                })

            };
        });

})();