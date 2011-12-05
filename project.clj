(defproject javatest "0.1.0-SNAPSHOT"

  ;; `lein jar` fails when I include these in project.clj...
  :java-source-path "src/jvm"

  ;; still fails with this:
  :source-path "src" 

  ;; `lein jar` passes when I switch :source-path to "src/clj"
  ;; (uncomment this and comment the previous line)
  ;; :source-path "src/clj" 
  )
