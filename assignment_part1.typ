#set page(paper: "a4")
#align(center, [
    #block(width: 150mm,[
        #set align(center)
        #text(weight: "bold", size: 18pt, "Software Engineering 3")\
        #text(weight: "semibold", size: 14pt, "Bonusaufgabe - U02 Teil 1")\
        #text(weight: "medium", size: 12pt, "Jan Eisenbeiß, Konrad Kappmeyer, Vincent Klingemann, Tyler Rose")
    ])
])

= Architekturkonzepte
== Kontextsicht
- Blackbox
- Zeigen den Zusammenhang des Systems mit seiner Umgebung aus der Vogelperspektive
- Schnittstellen nach außen
- Interaktion mit wichtigen Stakeholdern
- Notation z.B. durch Use Cases

== Bausteinsicht
- Statische Struktur der Architekturbausteine des Systems, Subsysteme, Komponenten und deren Schnittstellen zueinander
- Notation z.B. durch UML-Klassendiagramme
#figure(image("images/5770464c-6db6-4ef0-946f-4991ab0ce2c3.png"))


== Laufzeitsicht
- Beschreibt das Zusammenwirken der Bausteine zur Laufzeit
- Dynamische Strukturen
- Notation z.B. durch UML-Sequenz, Aktivitäts- oder Kollaborations/Kommunikationsdiagramme
#figure(image("images/35dbe6f8-4c0e-4cce-8fdd-10dd317242d5.svg"))

== Verteilungssicht
- Infrastruktursicht
- Beschreibung der Hardwarekomponenten (Rechner,Prozessoren, Netztopologien)
- System aus Betreibersicht
- Notation z.B. durch UML-Einsatzdiagramme

= Physische Verteilung
#table(
  columns: 3,
  inset: 10pt,
  align: horizon,
  table.header(
    [*Architektur*], [*Pro*], [*Kontra*]
  ),
  "Zweischichtenarchitektur",
  "Einfachheit, Performance",
  "Skalierbarkeit, Wartungsfreundlichkeit, Flexibilität",

  "Dreischichtenarchitektur",
  "Skalierbarkeit, Wartungsfreundlichkeit, Flexibilität",
  "Komplexität, Performance",

  "Mehrschichtenarchitektur ",
  "wie Dreischichten + Plattform unabhängig",
  "wie Dreischichten + mehr Komplexität",
)
