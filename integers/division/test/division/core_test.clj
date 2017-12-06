(ns division.core-test
  (:require [clojure.test :refer :all]
            [division.core :refer :all]))

(deftest division-test
  (testing "should return the division of two params"
    (is (= 3/4 (division 3 4)))))
