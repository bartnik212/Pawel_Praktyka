Aplikacja ma zadanie spytać się użytkownika o imię, kawałek refrenu oraz instrument, na którym chciałby zagrać. 
Składa się z 9 klas:
1. Interfejs IInstrument posiada metodę void "graj"
2. Klasa Muzykant posiada 2 pola - imię typu String oraz instrument typu IInstrument. Posiada również konstruktor,
który przyjmuje imię, jako parametr, setter, który przyjmuje instrument, jako parametr oraz metodę "zagraj", która przyjmuje 
text typu String. Ta metoda, w zależności, od tego czy instrument jest nullem, czy nie, wyświetla komunikat o tym,
czy posiada instrument do grania, czy gra na danym instrumencie.
3. 6 klas to instrumenty, które implementują interfejs IInstrument oraz jego metodę i wyświetlają sposób grania instrumentu
oraz tekst (refren) podany, jako parametr.
4. Ostatnia klasa, jest to klasa uruchomieniowa, w której znajduje się pętla. Użytkownik w pętli może wpisać następujące komendy:
-sing, DRUM, GUITAR, PLATES, FLUTE, VOICE, TIBETAN BOWL, koniec.
W zależności od komendy program poinformuje nas, czy posiada instrument do grania, jeśli tak to poinformuje nas jaki to instrument
oraz wyświetli nam kawałek naszego refrenu razem z "brzmieniem" danego instrumentu. Komenda "koniec" kończy pracę programu.
