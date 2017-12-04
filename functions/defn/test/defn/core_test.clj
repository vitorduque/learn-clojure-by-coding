(ns defn.core-test
  (:require [clojure.test :refer :all]
            [defn.core :refer :all]))

(deftest method-one-test
  (testing "should say hello to a name"
    (let [name "Vitaum"]
      (is (= (str "Hello, " name)  (method-one name))))))
