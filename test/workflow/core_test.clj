(ns workflow.core-test
  (:require [clojure.test :refer :all]
            [workflow.core :refer :all]))

(deftest create-test
  (testing "we can create a state"
    (is (= obj :new-permit))))
