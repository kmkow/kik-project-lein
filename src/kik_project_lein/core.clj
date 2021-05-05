;;Programowanie Funkcyjne
;;Konrad Kowalczyk nr 36334 ID-1/V
;; Kółko i krzyżyk
(ns kik-project-lein.core
  (:gen-class))

(def p0 (atom " "))
(def p1 (atom " "))
(def p2 (atom " "))
(def p3 (atom " "))
(def p4 (atom " "))
(def p5 (atom " "))
(def p6 (atom " "))
(def p7 (atom " "))
(def p8 (atom " "))

(def win (atom "0"))
(def xn nil)
(def xz nil)
(def pc-move nil)
(def found (atom "nil"))
(def cur-p (atom "X"))
(def turn 0)


(defn cur-player-change []
  (if (= @cur-p "X")
    (def cur-p (atom "O"))
    (def cur-p (atom "X"))
    )
  )

(defn display-board1 []

  (println "     |     |     ")
  (println " " @p0 " | " @p1 " | " @p2)
  (println "_____|_____|_____")
  (println "     |     |     ")
  (println " " @p3 " | " @p4 " | " @p5)
  (println "_____|_____|_____")
  (println "     |     |     ")
  (println " " @p6 " | " @p7 " | " @p8)
  (println "     |     |     "))

(defn x []
  (def xn (atom (read-line)))
  (def xz (atom (str @xn)))
  )

(defn player-move []
  (x)
  (if (and (= @p0 " ") (= @xz "1"))
    (def p0 (atom "X"))
    )

  (if (and (= @p1 " ") (= @xz "2"))
    (def p1 (atom "X"))
    )

  (if (and (= @p2 " ") (= @xz "3"))
    (def p2 (atom "X"))
    )

  (if (and (= @p3 " ") (= @xz "4"))
    (def p3 (atom "X"))
    )

  (if (and (= @p4 " ") (= @xz "5"))
    (def p4 (atom "X"))
    )

  (if (and (= @p5 " ") (= @xz "6"))
    (def p5 (atom "X"))
    )

  (if (and (= @p6 " ") (= @xz "7"))
    (def p6 (atom "X"))
    )

  (if (and (= @p7 " ") (= @xz "8"))
    (def p7 (atom "X"))
    )

  (if (and (= @p8 " ") (= @xz "9"))
    (def p8 (atom "X"))
    )
  )

(defn pc-random-move []

  (def found (atom "nil"))
  (def pc-move (rand-int 8))
  (when (< @turn 5)
  (while (= @found "nil")
    (if  (and (= @found "nil")(= @p0 " "))
      (when  (= pc-move 0)
        (def p0 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if  (and (= @found "nil") (= @p1 " "))
      (when  (= pc-move 1)
        (def p1 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and  (= @found "nil")(= @p2 " "))
      (when  (= pc-move 2)
        (def p2 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and (= @found "nil") (= @p3 " "))
      (when  (= pc-move 3)
        (def p3 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and (= @found "nil")(= @p4 " "))
      (when  (= pc-move 4)
        (def p4 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and (= @found "nil")(= @p5 " "))
      (when  (= pc-move 5)
        (def p5 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and (= @found "nil")(= @p6 " "))
      (when  (= pc-move 6)
        (def p6 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and (= @found "nil")(= @p7 " "))
      (when  (= pc-move 7)
        (def p7 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (if (and (= @found "nil")(= @p8 " "))
      (when (= pc-move 8)
        (def p8 (atom "O"))
        (def found (atom "fin"))
        (println "Computer has chosen: " (inc pc-move))
        )
      )
    (def pc-move (rand-int 8))
    )
   )
  )

;;(println
;  @p0 @p1 @p2
;  @p3 @p4 @p5
;  @p6 @p7 @p8)

(defn winner []
  (println "************************")
  (println "*| The Winner is : " @cur-p "|*")
  (println "************************")
  (def win (atom "1"))
  ;;(System/exit 0)
  )

(defn win-check [cur-pl]

  (if (or (and (= @p0 @p1 @p2 cur-pl) (not= @p0 " "))
          (and (= @p3 @p4 @p5 cur-pl) (not= @p3 " "))
          (and (= @p6 @p7 @p8 cur-pl) (not= @p6 " "))
          (and (= @p0 @p3 @p6 cur-pl) (not= @p6 " "))
          (and (= @p1 @p4 @p7 cur-pl) (not= @p1 " "))
          (and (= @p2 @p5 @p8 cur-pl) (not= @p2 " "))
          (and (= @p0 @p4 @p8 cur-pl) (not= @p0 " "))
          (and (= @p2 @p4 @p6 cur-pl) (not= @p2 " ")))
    (winner)
    )
  )
(defn -main []

  (def turn (atom 1))
  (display-board1)
  (println 1 2 3)
  (println 4 5 6)
  (println 7 8 9)
  (while (or (= @win "0") (<= @turn 5))

    ;;tie
    (when (and (> @turn 5) (= @win "0"))
      (println "*** TIE ***")
      (def win (atom "1")))

    (when (= @win "0")
      ;;player move
      (println "Your move")
      (player-move)
      (display-board1)
      (win-check @cur-p)
      (cur-player-change)
      (println " ")
      )
    (when (= @win "0")
      ;;computer makes move
      (pc-random-move)
      (display-board1)
      (win-check @cur-p)
      (cur-player-change)
      (println " ")
      )
    (swap! turn inc)
    )
  )


