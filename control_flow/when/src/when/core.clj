(ns when.core)

(defn  when-example [weather]
  (when (= "cold" weather)
    (str "It's cold")))

(defn -main
  []
  (println (when-example "cold")))
