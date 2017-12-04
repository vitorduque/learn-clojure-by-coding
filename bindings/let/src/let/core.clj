(ns let.core)

(def let-example-one
  (let [l "cool"]
    (str "printing something " l)))

(def let-example-two
  (let [l "bad"]
    (str "printing something " l)))

(def let-example-three
  (let [let-one let-example-one
        let-two let-example-two]
    (str let-one let-two)))

(defn -main
  []
  (println let-example-one)
  (println let-example-two)
  (println let-example-three))

