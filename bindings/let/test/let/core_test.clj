(ns let.core-test
  (:require [clojure.test :refer :all]
            [let.core :refer :all]))

(deftest let-example-one-test
  (testing "should return a string"
    (is (= "printing something cool" let-example-one))))

(deftest let-example-two-test
  (testing "should return a string"
    (is (= "printing something bad" let-example-two))))

(deftest let-example-three-test
  (testing "should return a concat of 'let-example-one' and 'let-example-two'"
    (is (= (str let-example-one let-example-two) let-example-three))))
