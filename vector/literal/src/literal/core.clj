(ns literal.core)

(defn vector-literal [vector-one]
  (if (instance? clojure.lang.PersistentVector vector-one)
    vector-one
    false))

(defn -main
  []
  (println (vector-literal [1 2 3])))
