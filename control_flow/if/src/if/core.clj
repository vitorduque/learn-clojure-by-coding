(ns if.core)

(defn happy
  [feeling]
  (if feeling
    (str "I'm happy :)")
    (str "I'm not happy :(")))

(defn -main
  []
  (println (happy true)))
