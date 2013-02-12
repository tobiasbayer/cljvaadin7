(defproject cljvaadin7 "0.1.0-SNAPSHOT"
  :description "Demonstrates how to integrate Clojure and Vaadin 7"
  :url "https://github.com/codebrickie/cljvaadin7"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.vaadin/vaadin-server "7.0.0"]
                 [com.vaadin/vaadin-client-compiled "7.0.0"]
                 [com.vaadin/vaadin-themes "7.0.0"]
                 [javax.servlet/servlet-api "2.5"]]
  :aot [cljvaadin7.MyApplicationUI])

