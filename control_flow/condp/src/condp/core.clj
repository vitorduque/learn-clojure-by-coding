(ns condp.core)

(defn condp-example [x]
  (condp contains? x
    [1 2 3] (str "contain " x)
    (str "do not contain " x)))

(defn -main
  []
  (println (condp-example 666)))
