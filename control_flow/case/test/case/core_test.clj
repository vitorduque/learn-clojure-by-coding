(ns case.core-test
  (:require [clojure.test :refer :all]
            [case.core :refer :all]))

(deftest case-example-test
  (testing "should return 'one'"
    (is (= (str "one") (case-example 1))))
  (testing "should return 'two'"
    (is (= (str "two") (case-example 2))))
  (testing "should return 'anything'"
    (is (= (str "anything") (case-example "blablabla")))))
