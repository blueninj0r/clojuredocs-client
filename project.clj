(defproject org.thnetos/cd-client "0.3.5"
  :url "https://github.com/dakrone/clojuredocs-client"
  :description "A client for the clojuredocs API"
  :dependencies [[clj-http "0.5.3"]
                 [cheshire "4.0.2"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.4.0"]]}})
