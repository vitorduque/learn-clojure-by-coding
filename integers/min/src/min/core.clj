(ns min.core)

(defn min-example [num-one num-two num-three]
  (min num-one num-two num-three))

(defn -main
  []
  (println (min-example 5 4 1)))
