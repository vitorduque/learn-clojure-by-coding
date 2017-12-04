(ns closure.core)

(defn say-something
  [something]
  (fn []
    (str "Hey, I'm " something)))

(def cool
  (say-something "cool"))

(def not-cool
  (say-something "not-cool"))

(defn -main
  []
  (println (cool))
  (println (not-cool)))
