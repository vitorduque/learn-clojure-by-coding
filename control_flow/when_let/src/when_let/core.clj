(ns when-let.core)

(defn when-let-example [num_ary]
  (when-let [positives (filterv pos? num_ary)]
    positives
    ))

(defn -main
  []
  (println (when-let-example [-1 0 1 2 3])))
