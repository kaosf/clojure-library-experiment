(ns clojure-library-experiment.core-test
  (:require [clojure.test :refer :all]
            [clojure-library-experiment.core :refer :all]))

(deftest f-test
  (testing "(f 1) is 2"
    (is (= (f 1) 2))))

(deftest g-test
  (testing "(g 2) is 4"
    (is (= (g 2) 4))))
