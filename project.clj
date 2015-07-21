(defproject bukkure "0.3.1-SNAPSHOT"
  :description "Bringing Clojure to the Bukkit API"
  :url "http://github.com/SevereOverfl0w/Bukkure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :java-source-paths ["javasrc"]
  :javac-options ["-d" "classes/" "-source" "1.7" "-target" "1.7"]
  :resource-paths ["resources/*"]
  :repositories [["spigot-repo" "https://hub.spigotmc.org/nexus/content/groups/public/"]]
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.bukkit/bukkit "1.8.7-R0.1-SNAPSHOT"]
                 [org.reflections/reflections "0.9.8"]
                 [org.clojure/tools.nrepl "0.2.3"]
                 [cheshire "5.2.0"]])
