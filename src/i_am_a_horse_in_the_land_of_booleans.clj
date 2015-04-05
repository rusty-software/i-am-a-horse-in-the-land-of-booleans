(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (nil? x) (false? x))))

(defn abs [x]
  (if (> 0 x)
    (* -1 x)
    x))

(defn divides? [divisor n]
  (if (= 0 divisor)
    (throw (IllegalArgumentException. "0 is not a valid divisor!"))
    (= 0 (mod n divisor))))

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
