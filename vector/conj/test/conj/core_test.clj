(ns conj.core-test
  (:require [clojure.test :refer :all]
            [conj.core :refer :all]))

(deftest a-test
  (testing "should return the vectors concatenated"
    (is (= [1 2 3 4] (conj-vector [1 2 3] 4)))))
