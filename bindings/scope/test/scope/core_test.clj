(ns scope.core-test
  (:require [clojure.test :refer :all]
            [scope.core :refer :all]))

(deftest let-scope-one-test
  (testing "should return the first let"
    (is (= "something" let-scope-one))))

(deftest let-scope-two-test
  (testing "should return the second let"
    (is (= "somewhere" let-scope-two))))
