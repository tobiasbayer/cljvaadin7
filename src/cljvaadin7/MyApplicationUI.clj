(ns cljvaadin7.MyApplicationUI
  (import [com.vaadin.ui VerticalLayout Label Button Button$ClickListener Notification])
  (:gen-class
    :extends com.vaadin.ui.UI))

(defn- show-click-message
  []
  (Notification/show "Button clicked"))

(defn- create-button-click-listener 
  [action]
  (reify Button$ClickListener 
            (buttonClick 
              [_ evt]
              (action))))

(defn- add-action
  [button action]
  (.addListener button (create-button-click-listener action)))

(defn- create-button
  [caption]
  (doto (Button. caption) (add-action show-click-message)))

(defn- create-main-layout
  []
  (doto (VerticalLayout.)
	        (.addComponent (Label. "Hello Clojure-Vaadin 7!"))
	        (.addComponent (create-button "Push me!"))))

(defn -init
  [main-ui request]
  (doto main-ui (.setContent (create-main-layout))))

  






