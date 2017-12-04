(ns closure.core-test
  (:require [clojure.test :refer :all]
            [closure.core :refer :all]))

(deftest say-something-test
  (testing "should return a closure/function"
    (let [feeling "cool"]
      (def some-feeling
        (say-something feeling))
      (is (= (str "Hey, I'm " feeling) (some-feeling))))))
