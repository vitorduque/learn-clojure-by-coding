(ns if-when.core)

(defn positive-numbers [numbers]
  (if-let [positives (not-empty (filterv pos? numbers))]
    positives
    "No positive"))

(defn -main
  []
  (println (positive-numbers [-1 0 1 2 3])))
