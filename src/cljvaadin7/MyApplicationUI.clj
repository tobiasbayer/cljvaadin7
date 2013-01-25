(ns cljvaadin7.MyApplicationUI
  (import [com.vaadin.ui VerticalLayout Label Button Button$ClickListener Notification])
  (:gen-class
    :extends com.vaadin.ui.UI))


(defn- show-click-message
  []
  (Notification/show "Button clicked"))

(defn- create-button-click-listener [action]
  (reify Button$ClickListener 
            (buttonClick 
              [_ evt]
              (action))))

(defn- addAction
  [button action]
  (.addListener button (create-button-click-listener action)))

(defn -init
  [this request]
  (let [layout (VerticalLayout.)
        label (Label. "Hello Clojure-Vaadin 7!")
        button (Button. "Push me!")]
    (addAction button show-click-message)
    (.addComponent layout label)
    (.addComponent layout button)
    (.setContent this layout)))

  






