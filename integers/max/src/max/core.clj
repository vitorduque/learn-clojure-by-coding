(ns max.core)

(defn max-example [num-one num-two num-three]
  (max num-one num-two num-three))

(defn -main
  []
  (println (max-example 1 2 3)))
