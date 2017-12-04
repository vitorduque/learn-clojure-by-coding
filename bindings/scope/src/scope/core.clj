(ns scope.core)


(def let-scope-one
  (let [x "something"]
    (let [x "somewhere"])
    (str x)))

(def let-scope-two
  (let [x "something"]
    (let [x "somewhere"]
    (str x))))

(defn -main
  []
  (println let-scope-one)
  (println let-scope-two))
