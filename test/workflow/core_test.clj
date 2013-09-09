(ns workflow.core-test
  (:require [clojure.test :refer :all]
            [workflow.core :refer :all]))

(deftest test-that-we-have-a-function-that-creates-a-new-permit-state
  (testing "we can create a state \"New Permit\""
    (let [obj (create-state :create)]
      (is (= obj :new-permit)))))

(deftest test-that-new-permit-can-change-to-submitted-permit-through-submit-action
  (testing "Test that new permit can change to submitted permit through submit action"
    (let [new-state (transition)]
      (is (= new-state :submitted-permit)))))

(deftest test-that-submitted-permit-can-change-to-approved-permit-through-approve-action
  (testing "Test that submitted permit can change to approved permit through approve action"
    (let [new-state (transition)]
      (is (= new-state :approved-permit)))))
