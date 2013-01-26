(ns euler-clojure.problem1
  (:gen-class))

(defn sum-of-multiples [n]
  (reduce + (distinct (concat (range 1 n 3) (range 1 n 5)))))

(defn -main [n] (println (sum-of-multiples (read-string n))))
