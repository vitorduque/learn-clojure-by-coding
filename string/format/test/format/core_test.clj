(ns format.core-test
  (:require [clojure.test :refer :all]
            [format.core :refer :all]))

(deftest format-one-test
  (testing "should return concatenated string with format"
    (def something "fruit")
    (is (= (str "I hate " something) (format-one something)))))
