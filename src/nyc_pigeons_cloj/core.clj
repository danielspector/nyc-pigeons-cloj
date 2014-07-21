(ns nyc-pigeons-cloj.core
  (:gen-class))

(def pigeon-data 
  {
   :color {
           :purple ["Theo" "Peter Jr." "Lucky"],
           :grey ["Theo" "Peter Jr." "Ms. K"],
           :white ["Queenie" "Andrew" "Ms. K" "Alex"],
           :brown ["Queenie" "Alex"]
           },
   :gender {
            :male ["Alex" "Theo" "Peter Jr." "Andrew" "Lucky"],
            :female ["Queenie" "Ms. K"]
            },
   :lives {
           "Subway" ["Theo" "Queenie"],
           "Central Park" ["Alex", "Ms. K", "Lucky"],
           "Library" ["Peter Jr."],
           "City Hall" ["Andrew"]
           }
   }
  )

(def pigeons 
  (vec
    (flatten 
      (conj 
        (get-in pigeon-data [:gender :male]) 
        (get-in pigeon-data [:gender :female])
      ))))

(def attrs (keys pigeon-data))

(defn organized-pigeons []
  into {}
  pigeons attrs
  )

(def colors 
  (keys (:color pigeon-data)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
