(ns literal.core-test
  (:require [clojure.test :refer :all]
            [literal.core :refer :all]))

(deftest sets-literal-test
  (testing "should return a set"
    (is (= (type #{}) (type (sets-literal #{1 2 3}))))))
