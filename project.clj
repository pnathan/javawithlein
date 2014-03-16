(defproject com.upside-down-research.javawithlein "1.0.0"
  :description "Lein with Java"
  :author "Paul Nathan"
  :license {:name "CC0"
            :url "http://creativecommons.org/publicdomain/zero/1.0/legalcode"}

  :min-lein-version "2.0.0"

  ;; java compilation requirements
  :main javawithlein
  :java-source-paths ["src" "test"]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]

  ;; junit shenanigans
  :profiles {:dev {:dependencies [[junit/junit "4.11"]]}}
  :junit ["test/com/upside-down-research"]
  :plugins [[lein-junit "1.1.5"]]
  :junit-formatter "summary"
  :junit-results-dir "test-results"
  )