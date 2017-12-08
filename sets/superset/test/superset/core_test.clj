(ns superset.core-test
  (:require [clojure.test :refer :all]
            [superset.core :refer :all]))

(deftest sets-superset-test
  (testing "should returt true"
    (is (= true (sets-superset #{0 1} #{1}))))
  (testing "should return false"
    (is (= false (sets-superset #{0} #{0 1})))))
