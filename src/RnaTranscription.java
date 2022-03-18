class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        char[] a=dnaStrand.toCharArray();
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(a[i]=='G')
                a[i]='C';
            else if(a[i]=='C')
                a[i]='G';
            else if(a[i]=='T')
                a[i]='A';
            else if(a[i]=='A')
                a[i]='U';
        }
        String rnaStrand=new String(a);
        return rnaStrand;
    }

}
