(ns modulo.core-test
  (:require [clojure.test :refer :all]
            [modulo.core :refer :all]))

(deftest modulo-test
  (testing "should return de mod of params"
    (is (= 1 (modulo 3 2)))))
