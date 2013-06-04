(defproject laczoka/clj-json "0.5.4"
  :description "Fast JSON encoding and decoding for Clojure via the Jackson library."
  :url "http://github.com/mmcgrana/clj-json"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :javac-fork "true"
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.codehaus.jackson/jackson-core-asl "1.9.9"]])
