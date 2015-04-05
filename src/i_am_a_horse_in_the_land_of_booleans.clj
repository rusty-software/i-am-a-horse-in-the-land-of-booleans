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
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  "Trying not to use anything that hasn't been covered (let, seq), but couldn't resist 'or'.  Fragile implementation otherwise."
  (cond
    (number? x) (* 2 x)
    (or (vector? x) (list? x))
    (if (empty? x)
      nil
      (* 2 (count x)))
    (empty? x) nil
    :else true))

(defn leap-year? [year]
  ":(")

; '_______'
