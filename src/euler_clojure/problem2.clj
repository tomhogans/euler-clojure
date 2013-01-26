(ns euler-clojure.problem2
  (:gen-class))

(defn fib [a b] 
  (cons a (lazy-seq (fib b (+ b a)))))

(defn sum-of-even-fibs [m]
  (reduce + (filter even? (take-while #(< % m) (fib 1 2)))))

(defn -main [n] (println (sum-of-even-fibs (read-string n))))
