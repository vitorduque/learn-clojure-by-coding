(ns symbol.core-test
  (:require [clojure.test :refer :all]
            [symbol.core :refer :all]))

(deftest a-test
  (testing "a method should return a symbol type"
    (is (= (type 'whatever) a))))

(deftest b-test
  (testing "a method should return a symbol type"
    (is (= (type 'whatever) b))))

(deftest everything-is-symbol-test
  (testing "a method should return a symbol type"
    (is (= (type 'whatever) everything-is-symbol))))

(deftest string-test
  (testing "a method should return 'not sure'"
    (is (= "not sure" string))))
