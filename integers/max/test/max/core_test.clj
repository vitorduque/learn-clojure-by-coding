(ns max.core-test
  (:require [clojure.test :refer :all]
            [max.core :refer :all]))

(deftest max-example-test
  (testing "should return the max number value"
    (is (= 3 (max-example 1 2 3)))))
