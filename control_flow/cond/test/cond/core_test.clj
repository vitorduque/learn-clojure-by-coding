(ns cond.core-test
  (:require [clojure.test :refer :all]
            [cond.core :refer :all]))

(deftest cond-test
  (testing "should return 'value equals 1'"
    (is (= (str "value equals 1") (cond-example 1))))
  (testing "should return 'between 2 and 9'"
    (is (= (str "between 2 and 9") (cond-example 7))))
  (testing "should return 'not a number'"
    (is (= (str "not a number") (cond-example "puff"))))
  (testing "should return 'out of range'"
    (is (= (str "out of range") (cond-example 666)))))
