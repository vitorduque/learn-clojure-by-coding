(ns str.core-test
  (:require [clojure.test :refer :all]
            [str.core :refer :all]))

(deftest str-one-test
  (testing "should return concatenated strings"
    (def some-name "Lala")
    (is (= (str "My name is: " some-name) (str-one some-name) ))))
