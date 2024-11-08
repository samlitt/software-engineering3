# SE3 Bonusaufgabe
Gruppenmitglieder: Jan Eisenbeiß, Konrad Kappmeyer, Vincent Klingemann, Tyler Rose

# Teil 1
Siehe `SE3-U02-Teil1.pdf`.

# Teil 2
Die erste Teilaufgabe a) wird in dem package `task1` implementiert und besteht aus jeweils einer Caller und Client Klasse.
Die Programmteile die richtige "Arbeit" simulieren sollen, sind in den Klassen `Counter` und `Cesar` implementiert.
Diese werden dann jeweils von den Client und Caller Klassen benutzt.

Die zweite Teilaufgabe b) wird in dem package `task2` implementiert und besteht aus der Klasse `BMI`, die den eigentlichen BMI berechnet und auch die Gewichtsabschätzung vornimmt.
Die `BMIClient` Klasse erzeugt die CompletableFutures und gibt die beiden Ergebnisse auf der Komandozeile aus.

## Entrypoints
Aufgabe a) kann über die Klassen `CallbackClient` und `PollingClient` ausgeführt werden.
Aufgabe b) wird über die Klasse `BMIClient` ausgeführt.

## Aufgabenteil 1 als PDF
Das Dokument für die Abgabe kann mit [Typst](https://github.com/typst/typst) als PDF exportiert werden, 
hierfür wird einfach `typst compile assigment_part1.typ <Dateiname>.pdf` ausgeführt.
