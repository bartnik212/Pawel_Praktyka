Program ma za zadanie spytać użytkownika o imię, nazwisko oraz czy jest żołnierzem - jeśli tak to pyta o rangę. 
Następnie, w zależności od tego kim jest, wyświetla mu się zdanie : „Tu {IMIE}{NAZWISKO}, {RANGA} Polskich sił zbrojnych!”
albo "Nazywam się {IMIE} {NAZWISKO}, jestem obywatelem Polskim!”

Pakiet posiada 5 klas. 
1. Klasa Osoba jest klasą abstrakcyjną, w której powstała metoda abstrakcyjna, jak również 2 konstruktory (domyślny oraz "zwykły")
oraz gettery i settery
2. Klasa Ranga jest typem wyliczeniowym z 7 wartościami, polem ranga oraz getterem i setterem. 
3. Klasa Zolnierz dziedziczy po Klasie Osoba oraz zawiera pole typu Ranga o nazwie ranga.
 W celu przypisania obiektu Zolnierz do typu Osoba, został użyty polimorfizm.
Klasa implementuje metodę z klasy Osoba - z tej klasy pobiera za pomocą gettera imię, nazwisko oraz z typu wyliczeniowego Ranga
pobiera rangę. Nazwa rangi jest przekształcana w ten sposób aby zaczynała się dużą literą.
4. Klasa Cywil jest rozszerzona o klasę Osoba. Podobnie, jak w klasie Zolnierz, został użyty polimorfizm. 
Klasa Cywil implementuje metodę z klasy Osoba i również pobiera imię oraz nazwisko (bez rangi)
5. Klasa Main jest klasą uruchomieniową.
