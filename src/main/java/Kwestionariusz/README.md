Program ma za zadanie podzielenie pacjentów na grupy żadnego, zmniejszonego oraz podwyższonego ryzyka. 
Program zawiera 3 klasy:
1. PatientQuestionnare, który pyta użytkownika czy był chory w ostatnim czasie, czy posiada maseczkę, 
czy przebywał w krajach wysokiego ryzyka oraz, czy przebywal w otoczeniu na kwarantannie
2. LowRiskPatient jest klasą wyjątkiem, który po przechwyceniu
wyświetla komunikat "Witaj, średnio się cieszymy, że jesteś naszym pacjentem :)". Jest przechwycony w momencie, 
gdy użytkownik potwierdzi, że był ostatnio chory albo nie posiada maseczki
3. HighRiskPatient również jest klasą wyjątkiem, który zadaje dodatkowe pytania 
jeśli pacjent przebywał w krajach wysokiego ryzyka albo przebywał w otoczeniu na kwarantannie
