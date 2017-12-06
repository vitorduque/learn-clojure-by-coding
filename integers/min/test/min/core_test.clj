(ns min.core-test
  (:require [clojure.test :refer :all]
            [min.core :refer :all]))

(deftest min-example-test
  (testing "should return the minimun of params"
    (is (= 5 (min-example 5 10 666)))))
