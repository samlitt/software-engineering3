#import "@preview/gentle-clues:0.9.0": *

#set page(paper: "a4")
#align(center, [
    #block(width: 150mm,[
        #set align(center)
        #text(weight: "bold", size: 18pt, "Software Engineering 3")\
        #text(weight: "semibold", size: 14pt, "Bonusaufgabe - U02 Teil 1")\
        #text(weight: "medium", size: 12pt, "Jan Eisenbeiß, Konrad Kappmeyer, Vincent Klingemann, Tyler Rose")
    ])
])

#info()[Antwort von Claude.ai Haiku mit Answer Style Explanatory]

= Architektursichten und physische Verteilung in der Softwarearchitektur

== 1. Die vier Architektursichten

In der Softwarearchitektur unterscheiden wir vier fundamentale Sichten, die verschiedene Aspekte eines Softwaresystems beleuchten:

=== 1.1 Logische Sicht
Die logische Sicht beschreibt die fachliche Struktur des Systems aus Anwendungssicht. Sie zeigt die wichtigsten Klassen, deren Beziehungen und die Organisation in Pakete. Diese Sicht ist besonders wichtig für das Verständnis der Domäne und der Geschäftslogik.

=== 1.2 Prozesssicht
Die Prozesssicht fokussiert sich auf das dynamische Verhalten des Systems. Sie zeigt die Nebenläufigkeit, Synchronisation und Kommunikation zwischen verschiedenen Prozessen. Diese Sicht ist besonders relevant für nicht-funktionale Anforderungen wie Performance und Verfügbarkeit.

=== 1.3 Entwicklungssicht
Die Entwicklungssicht (auch Implementierungssicht genannt) beschreibt die Organisation der Software aus Entwicklerperspektive. Sie zeigt die Aufteilung in Module, Komponenten und Schichten sowie deren Abhängigkeiten.

=== 1.4 Physische Sicht
Die physische Sicht (auch Verteilungssicht genannt) beschreibt die Verteilung der Software auf die physische Hardware. Sie zeigt, wie Softwarekomponenten auf verschiedene Rechner und Systeme verteilt werden.

= 1.
Die Ergebnisse der KI entsprechen nicht den von uns erarbeiteten. Die genannten Architektursichten sind, bis auf die physische Sicht (Verteilungssicht), nicht die von uns in der Vorlesung behandelten. Die Prozesssicht scheint der Laufzeitsicht ähnlich zu sein. Die Bausteinsicht aus der Vorlesung scheint wie eine Kombination aus der Logischen Sicht und der Entwicklungssicht. Die Konzeptsicht wurde von der KI nicht beschrieben.
Das Ergebnis der KI könnten besser werden wenn für jede Sicht ein eigener Prompt geschrieben wird in dem genau beschrieben ist um welche es geht.

== 2. UML-Beispieldiagramme

=== 2.1 Logische Sicht - Klassendiagramm eines Online-Shop-Systems
#figure(image("images/ai_generated_class_diagram.png", width: 50%),
        caption: [Von der KI generiertes Klassendiagramm, in mermaid Syntax geschrieben.])
Dieses Klassendiagramm zeigt die grundlegenden Entitäten eines Online-Shop-Systems und deren Beziehungen. Es verdeutlicht die fachliche Struktur mit Klassen für Bestellungen, Produkte und Kunden.

=== 2.2 Prozesssicht - Aktivitätsdiagramm für den Bestellprozess
#figure(image("images/ai_generated_state_diagram.png", width: 50%),
        caption: [Von der KI generiertes Zustandsdiagramm, in mermaid Syntax geschrieben.])

Dieses Aktivitätsdiagramm zeigt den Ablauf eines Bestellprozesses mit den verschiedenen Zuständen und möglichen Übergängen.

= Aufgabe 2
#info()[Antwort von Claude.ai Haiku mit Answer Style Concise]
Es wurde nach Aufgabe 2a) mit dem Callback-Verfahren gefragt.

Die Programmieraufgabe wurde richtig gelöst und war nach aufteilen der Klassen in einzelne Dateien direkt lauffähig.
Auffällig war das die KI für das ausgeben des Ergebnisses ein Interface definiert hat und ein anonymes Objekt erstellt hat in dem die onResult()-Methode überladen wurde. Dadurch ist es nicht notwendig das der "Caller" den Client kennt.