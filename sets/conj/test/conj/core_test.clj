(ns conj.core-test
  (:require [clojure.test :refer :all]
            [conj.core :refer :all]))

(deftest sets-conj-test
  (testing "should return concatenated sets"
    (is (= 3 (count (sets-conj #{1 2} 3))))))
