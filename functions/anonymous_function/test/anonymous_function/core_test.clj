(ns anonymous-function.core-test
  (:require [clojure.test :refer :all]
            [anonymous-function.core :refer :all]))

(deftest greeting-test
  (testing "should return a text interpolation"
    (let [name "Duque"]
      (is (= (str "Hey, I am: " name) (greeting "Duque"))))))
