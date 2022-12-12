import java.io.*;

%%

%class SinglishTranslator
%standalone
%state STRING

%{

String text2;

void append(String c){
	text2+=c;
}
void replace_function(String text)throws IOException{

	FileWriter myWriter = new FileWriter("SinhalaOutput.txt");
	
	String[] vowels = new String[20];
	String[] vowelsUnicode = new String[20]; 
	String[] vowelModifiersUnicode = new String[20];

	String[] consonantsUnicode = new String[41];
	String[] consonants = new String[41];

	String[] specialConsonantsUnicode = new String[6];
	String[] specialConsonants = new String[6];

	String[] specialCharUnicode = new String[2];
	String[] specialChar = new String[2];

    /*ආ*/   vowels[0]="aa";     vowelsUnicode[0]="\u0d86";      vowelModifiersUnicode[0]="\u0dcf";

    /*ඈ*/   vowels[1]="Aa";     vowelsUnicode[1]="\u0d88";      vowelModifiersUnicode[1]="\u0dd1";
             vowels[2]="ae";     vowelsUnicode[2]="\u0d88";      vowelModifiersUnicode[2]="\u0dd1";

    /*ඊ*/   vowels[3]="ii";     vowelsUnicode[3]="\u0d8a";      vowelModifiersUnicode[3]="\u0dd3";
            vowels[4]="ie";     vowelsUnicode[4]="\u0d8a";      vowelModifiersUnicode[4]="\u0dd3";
            vowels[5]="ee";     vowelsUnicode[5]="\u0d8a";      vowelModifiersUnicode[5]="\u0dd3";

    /*ඒ*/   vowels[6]="ea";     vowelsUnicode[6]="\u0d92";      vowelModifiersUnicode[6]="\u0dda";
            vowels[7]="ei";     vowelsUnicode[7]="\u0d92";      vowelModifiersUnicode[7]="\u0dda";

    /*ඕ*/   vowels[8]="oe";    vowelsUnicode[8]="\u0d95";       vowelModifiersUnicode[8]="\u0ddd";

    /*ඌ*/   vowels[9]="uu";    vowelsUnicode[9]="\u0d8c";      vowelModifiersUnicode[9]="\u0dd6";
            vowels[10]="oo";    vowelsUnicode[10]="\u0d8c";     vowelModifiersUnicode[10]="\u0dd6";

    /*ඖ*/   vowels[11]="au";    vowelsUnicode[11]="\u0d96";     vowelModifiersUnicode[11]="\u0dde";
    /*අ*/    vowels[12]="a";     vowelsUnicode[12]="\u0d85";     vowelModifiersUnicode[12]="";

    /*ඇ*/   vowels[13]="A";     vowelsUnicode[13]="\u0d87";     vowelModifiersUnicode[13]="\u0dd0";
             vowels[14]="/a";    vowelsUnicode[14]="\u0d87";     vowelModifiersUnicode[14]="\u0dd0";

    /*ඉ*/   vowels[15]="i";     vowelsUnicode[15]="\u0d89";     vowelModifiersUnicode[15]="\u0dd2";
    /*එ*/   vowels[16]="e";     vowelsUnicode[16]="\u0d91";     vowelModifiersUnicode[16]="\u0dd9";
    /*ඔ*/   vowels[17]="o";     vowelsUnicode[17]="\u0d94";     vowelModifiersUnicode[17]="\u0ddc";
    /*උ*/   vowels[18]="u";     vowelsUnicode[18]="\u0d8b";     vowelModifiersUnicode[18]="\u0dd4";
    /*ඓ*/  vowels[19]="ai";   vowelsUnicode[19]="\u0d93";      vowelModifiersUnicode[19]="\u0ddb";


    /*ෆෲ*/  specialCharUnicode[0]="\u0df2"; specialChar[0]="ruu";
    /*ෆෘ*/   specialCharUnicode[1]="\u0dd8"; specialChar[1]="ru";

    /*ඍ*/    specialConsonantsUnicode[0]="\u0d8d"; specialConsonants[0]="!r";
    /*ඎ*/    specialConsonantsUnicode[1]="\u0d8e"; specialConsonants[1]="!R";
    /*ඏ*/    specialConsonantsUnicode[2]="\u0d8f"; specialConsonants[2]="!p";
    /*ඐ*/   specialConsonantsUnicode[3]="\u0d90"; specialConsonants[3]="!P";
    /*ෆං*/    specialConsonantsUnicode[4]="\u0d82"; specialConsonants[4]="!n";
    /*ෆඃ*/    specialConsonantsUnicode[5]="\u0d83"; specialConsonants[5]="!h";

    /*ඤ*/	consonantsUnicode[0]="\u0da4"; consonants[0]="nnk";
    /*ඥ*/	consonantsUnicode[1]="\u0da5"; consonants[1]="nng";
    /*ඬ*/	consonantsUnicode[2]="\u0dac"; consonants[2]="nnd";
    /*ඳ*/	 consonantsUnicode[3]="\u0db3"; consonants[3]="ndh";
    /*ඞ*/	 consonantsUnicode[4]="\u0d9e"; consonants[4]="nd";
    /*ඟ*/	 consonantsUnicode[5]="\u0d9f"; consonants[5]="ng";
    /*ච*/	 consonantsUnicode[6]="\u0da0"; consonants[6]="ch";
    /*ඡ*/	 consonantsUnicode[7]="\u0da1"; consonants[7]="CH";
    /*ඦ*/	 consonantsUnicode[8]="\u0da6"; consonants[8]="nj";
    /*ත*/	 consonantsUnicode[9]="\u0dad"; consonants[9]="th";
    /*ථ*/	 consonantsUnicode[10]="\u0dae"; consonants[10]="TH";
    /*ද*/	 consonantsUnicode[11]="\u0daf"; consonants[11]="dh";
    /*ධ*/	consonantsUnicode[12]="\u0db0"; consonants[12]="DH";
    /*ඹ*/	consonantsUnicode[13]="\u0db9"; consonants[13]="mb";
    /*ශ*/	consonantsUnicode[14]="\u0dc1"; consonants[14]="sh";
    /*ෂ*/	consonantsUnicode[15]="\u0dc2"; consonants[15]="SH";

    /*ක*/   consonantsUnicode[16]="\u0d9a"; consonants[16]="k";
    /*ඛ*/	consonantsUnicode[17]="\u0d9b"; consonants[17]="K";
    /*ග*/	consonantsUnicode[18]="\u0d9c"; consonants[18]="g";
    /*ඝ*/	consonantsUnicode[19]="\u0d9d"; consonants[19]="G";  
    /*ජ*/	consonantsUnicode[20]="\u0da2"; consonants[20]="j";
    /*ඣ*/  consonantsUnicode[21]="\u0da3"; consonants[21]="J";
    /*ට*/	consonantsUnicode[22]="\u0da7"; consonants[22]="t";
    /*ඨ*/	consonantsUnicode[23]="\u0da8"; consonants[23]="T";
    /*ඩ*/	consonantsUnicode[24]="\u0da9"; consonants[24]="d";
    /*ඪ*/	consonantsUnicode[25]="\u0daa"; consonants[25]="D";
    /*ණ*/	consonantsUnicode[26]="\u0dab"; consonants[26]="N";
    /*න*/	consonantsUnicode[27]="\u0db1"; consonants[27]="n";
    /*ප*/	consonantsUnicode[28]="\u0db4"; consonants[28]="p";
    /*ඵ*/	consonantsUnicode[29]="\u0db5"; consonants[29]="P";
    /*බ*/	consonantsUnicode[30]="\u0db6"; consonants[30]="b";
    /*භ*/	consonantsUnicode[31]="\u0db7"; consonants[31]="B";
    /*ම*/	consonantsUnicode[32]="\u0db8"; consonants[32]="m";
    /*ය*/	consonantsUnicode[33]="\u0dba"; consonants[33]="y";
    /*ර*/	consonantsUnicode[34]="\u0dbb"; consonants[34]="r";
    /*ල*/	consonantsUnicode[35]="\u0dbd"; consonants[35]="l";
    /*ව*/	consonantsUnicode[36]="\u0dc0"; consonants[36]="w";
    /*ස*/	consonantsUnicode[37]="\u0dc3"; consonants[37]="s";
    /*හ*/	consonantsUnicode[38]="\u0dc4"; consonants[38]="h";
    /*ළ*/	consonantsUnicode[39]="\u0dc5"; consonants[39]="L";
    /*ෆ*/	consonantsUnicode[40]="\u0dc6"; consonants[40]="f";

    String text1;
	text1 = "";
	String r;
	
	text1 = text1 + text; 
		
	for (int j=0; j<specialConsonants.length; j++){
        text1 = text1.replace(specialConsonants[j], specialConsonantsUnicode[j]);
    }
	
	for (int k=0; k<specialCharUnicode.length; k++){
        for (var j=0;j<consonants.length;j++){
           String s = consonants[j] + specialChar[k];
           String v = consonantsUnicode[j] + specialCharUnicode[k];
           text1 = text1.replace(s, v);
        }
    }    
	
	for ( int k=0;k<consonants.length;k++){
        for (int j=0;j<vowels.length;j++){ 
            String s = consonants[k]+vowels[j];
            String v = consonantsUnicode[k] + vowelModifiersUnicode[j];
            text1 = text1.replace(s, v);
        }
    }
	
    for (int j=0; j<consonants.length; j++){
        text1 = text1.replaceAll(consonants[j], consonantsUnicode[j]+"\u0dca");
    }
	
	for (int j=0; j<vowels.length; j++){
			text1 = text1.replaceAll(vowels[j], vowelsUnicode[j]);
	}
    
    myWriter.write(text1);
	myWriter.close();
}

%}

%%
<YYINITIAL>{
"<" {yybegin(STRING); text2 = "";}
}
<STRING>{
[a-zA-Z0-9] {append(yytext());}
[\ \t\r\n] {append(yytext());}
[\r|\n|\r\n] {append(yytext());}
[\.\!\?] {append(yytext());}
[\,\;\:\-] {append(yytext());}
">" { replace_function(text2); }
}



    
    


    

   

