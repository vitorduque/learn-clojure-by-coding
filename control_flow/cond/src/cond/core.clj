(ns cond.core)

(defn cond-example [nha]
  (cond
    (not (number? nha)) "not a number"
    (= nha 1) "value equals 1"
    (and (< nha 9) (> nha 2)) "between 2 and 9"
    :else "out of range"))

(defn -main
  []
  (println (cond-example 1)))
