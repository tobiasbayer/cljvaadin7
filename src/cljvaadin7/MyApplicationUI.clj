(ns cljvaadin7.MyApplicationUI
  (import [com.vaadin.ui VerticalLayout Label])
  (:gen-class
    :extends com.vaadin.ui.UI))

(defn -init
  [this request]
  (let [layout (VerticalLayout.)
        label (Label. "Hello Clojure-Vaadin 7!")]
    (.addComponent layout label)
    (.setContent this layout)))


