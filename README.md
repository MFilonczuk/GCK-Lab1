# GCK-Lab1

Program zawiera układ słoneczny wykonany w Javie przy pomocy biblioteki swing.

Rozmiar okna utworzony po przez setpreferedSize(new Dimension), aby okno rysunku miało faktycznie wymiary podane - 1680x720. bo przez setSize rozmiar będzie nieco mniejszy niż podany.
this.setResizable(false) - aby nie można było zmieniać rozmiaru okna. 
Metoda DrawSpace() - Tworzy gwiazdy w tym nasze słońce, gwiazdy w "oddali" to losowo generowane pojedyncze punkty dzięki czemu rozmieszczenie gwiazd wydaje się bardziej
naturalne. Dodatkowo generowane jest kolejne 500 gwiazd, które są "dalej" przez co ich światło jest słabsze. 
Dodatkowo słońce wypełnione przez gradient GradientPaint paint = new GradientPaint(0,115,new Color(245, 124, 29),150,100,new Color(229, 172, 19));
Metody tworzące planety to wypełnione okręgi wraz z orbitami, które są narysowane po przez łuki - g2D.drawArc(-500,100,820,520,270,180);
