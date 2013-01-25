(defproject cljvaadin7 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.vaadin/vaadin-server "7.0.0.rc1"]
                 [com.vaadin/vaadin-client-compiled "7.0.0.rc1"]
                 [com.vaadin/vaadin-themes "7.0.0.rc1"]
                 [javax.servlet/servlet-api "2.5"]] ;FIXME provided scope?
  :aot [cljvaadin7.MyApplicationUI])

