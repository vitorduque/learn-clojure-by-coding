(ns indexof.core-test
  (:require [clojure.test :refer :all]
            [indexof.core :refer :all]))

(deftest indexof-test
  (testing "should return the index of value passed"
    (is (= 1 (indexof [1 2 5] 2)))))
