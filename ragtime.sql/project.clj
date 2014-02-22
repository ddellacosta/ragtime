(defproject ragtime-c.j.j-0.3.3/ragtime.sql "0.3.4"
  :description "Ragtime migrations for SQL databases"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ragtime-c.j.j-0.3.3/ragtime.core "0.3.4"]
                 [org.clojure/java.jdbc "0.3.3"]]
  :profiles
  {:dev {:dependencies [[com.h2database/h2 "1.3.160"]]}})
