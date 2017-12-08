(ns subset.core-test
  (:require [clojure.test :refer :all]
            [subset.core :refer :all]))

(deftest sets-subset-test
  (testing "should return true"
    (is (= true (sets-subset #{1 3} #{1 2 3}))))
  (testing "should return false"
    (is (= false (sets-subset #{5} #{1 2 3})))))
