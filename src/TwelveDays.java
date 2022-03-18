class TwelveDays {
    String verse(int verseNumber) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String a="";
        if(verseNumber==1)
            a+="On the first day of Christmas my true love gave to me: " + "a Partridge in a Pear Tree.\n";
        else if(verseNumber==2)
            a+="On the second day of Christmas my true love gave to me: two Turtle Doves, " + "and a Partridge in a Pear Tree.\n";
        else if(verseNumber==3)
            a+="On the third day of Christmas my true love gave to me: three French Hens, " + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==4)
            a+="On the fourth day of Christmas my true love gave to me: four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==5)
            a+="On the fifth day of Christmas my true love gave to me: five Gold Rings, " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==6)
            a+="On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, " + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " + "and a Partridge in a Pear Tree.\n";
        else if(verseNumber==7)
            a+="On the seventh day of Christmas my true love gave to me: " + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, " + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==8)
            a+="On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking," + " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==9)
            a+="On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, " + "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==10)
            a+="On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, " + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, " + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " + "and a Partridge in a Pear Tree.\n";
        else if(verseNumber==11)
            a+="On the eleventh day of Christmas my true love gave to me: " + "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        else if(verseNumber==12)
            a+="On the twelfth day of Christmas my true love gave to me: " + "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, " + "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        return a;
    }

    String verses(int startVerse, int endVerse) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String a="";
        for(int i=startVerse;i<=endVerse;i++)
        {
            a+=verse(i);
            if(i!=endVerse)
                a+="\n";
        }
        return a;
    }

    String sing() {
        //  throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String a="On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" + "\n" + "On the second day of Christmas my true love gave to me: two Turtle Doves, " + "and a Partridge in a Pear Tree.\n" + "\n" + "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, " + "and a Partridge in a Pear Tree.\n" + "\n" + "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, " + "two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" + "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" + "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" + "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, " + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " + "and a Partridge in a Pear Tree.\n" + "\n" + "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, " + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" + "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking," + " seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" + "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing," + " eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, " + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" + "\n" + "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, " + "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, " + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, " + "and a Partridge in a Pear Tree.\n" + "\n" + "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, " + "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, " + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, " + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        return a;
    }
}
