(ns clojure-library-experiment.core-test
  (:require [clojure.test :refer :all]
            [clojure-library-experiment.core :refer :all]))

(deftest f-test
  (testing "(f 1) is 2"
    (is (= (f 1) 2))))
