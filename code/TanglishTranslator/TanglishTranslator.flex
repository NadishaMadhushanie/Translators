import java.io.*;

%%

%class TanglishTranslator
%standalone
%state STRING

%{

String text2;

void append(String c){
	text2+=c;
}
void replace_function(String text)throws IOException{

	FileWriter myWriter = new FileWriter("TamilOutput.txt");
	
	String[] vowels = new String[16];
	String[] vowelsUnicode = new String[16]; 
	String[] vowelModifiersUnicode = new String[16];

	String[] consonantsUnicode = new String[28];
	String[] consonants = new String[28];

	String[] specialConsonantsUnicode = new String[3];
	String[] specialConsonants = new String[3];

	String[] specialCharUnicode = new String[1];
	String[] specialChar = new String[1];

    /*ஆ*/   vowels[0]="aa";     vowelsUnicode[0]="\u0b86";      vowelModifiersUnicode[0]="\u0bbe";

    /*ஈ*/    vowels[1]="ii";     vowelsUnicode[1]="\u0b88";      vowelModifiersUnicode[1]="\u0bc0";
             vowels[2]="ie";     vowelsUnicode[2]="\u0b88";      vowelModifiersUnicode[2]="\u0bc0";
             vowels[3]="ee";     vowelsUnicode[3]="\u0b88";      vowelModifiersUnicode[3]="\u0bc0";

    /*ஏ*/    vowels[4]="ea";     vowelsUnicode[4]="\u0b8f";      vowelModifiersUnicode[4]="\u0bc7";
             vowels[5]="ei";     vowelsUnicode[5]="\u0b8f";      vowelModifiersUnicode[5]="\u0bc7";

    /*ஐ*/    vowels[6]="ai";     vowelsUnicode[6]="\u0b90";      vowelModifiersUnicode[6]="\u0bc8";
    /*ஓ*/    vowels[7]="oe";     vowelsUnicode[7]="\u0b93";      vowelModifiersUnicode[7]="\u0bcb";

    /*ஊ*/   vowels[8]="uu";    vowelsUnicode[8]="\u0b8a";     vowelModifiersUnicode[8]="\u0bc2";
             vowels[9]="oo";    vowelsUnicode[9]="\u0b8a";     vowelModifiersUnicode[9]="\u0bc2";

    /*ஔ*/  vowels[10]="au";    vowelsUnicode[10]="\u0b94";     vowelModifiersUnicode[10]="\u0bcc";

    /*அ*/    vowels[11]="a";    vowelsUnicode[11]="\u0b85";     vowelModifiersUnicode[11]="";
    /*இ*/    vowels[12]="i";    vowelsUnicode[12]="\u0b87";     vowelModifiersUnicode[12]="\u0bbf";
    /*எ*/    vowels[13]="e";     vowelsUnicode[13]="\u0b8e";     vowelModifiersUnicode[13]="\u0bc6";
    /*ஒ*/    vowels[14]="o";     vowelsUnicode[14]="\u0b92";     vowelModifiersUnicode[14]="\u0bca";
    /*உ*/    vowels[15]="u";     vowelsUnicode[15]="\u0b89";     vowelModifiersUnicode[15]="\u0bc1";
    

    /*பௗ*/   specialCharUnicode[0]="\u0bd7"; specialChar[0]="P";


    /*ஃ*/   specialConsonantsUnicode[0]="\u0b83"; specialConsonants[0]="Ahh";
            specialConsonantsUnicode[1]="\u0b83"; specialConsonants[1]="H";

    /*ௐ*/   specialConsonantsUnicode[2]="\u0bd0"; specialConsonants[2]="OM";

    /*ங*/	consonantsUnicode[0]="\u0b99"; consonants[0]="ng";
    /*ஞ*/	consonantsUnicode[1]="\u0b9e"; consonants[1]="nk";
    /*ச*/	 consonantsUnicode[2]="\u0b9a"; consonants[2]="ch";
    /*ண*/	consonantsUnicode[3]="\u0ba3"; consonants[3]="NN";
    /*த*/	 consonantsUnicode[4]="\u0ba4"; consonants[4]="th";
    /*ள*/	consonantsUnicode[5]="\u0bb3"; consonants[5]="LL";
    /*ஷ*/	consonantsUnicode[6]="\u0bb7"; consonants[6]="sh";

    /*க*/    consonantsUnicode[7]="\u0b95"; consonants[7]="k";
    /*ஜ*/	consonantsUnicode[8]="\u0b9c"; consonants[8]="j";
    /*ட*/	consonantsUnicode[9]="\u0b9f"; consonants[9]="t";
    /*ந*/	consonantsUnicode[10]="\u0ba8"; consonants[10]="N";
    /*ன*/	consonantsUnicode[11]="\u0ba9"; consonants[11]="n";
    /*ப*/	consonantsUnicode[12]="\u0baa"; consonants[12]="p";
    /*ம*/	consonantsUnicode[13]="\u0bae"; consonants[13]="m";
    /*ய*/	consonantsUnicode[14]="\u0baf"; consonants[14]="y";
    /*ர*/	 consonantsUnicode[15]="\u0bb0"; consonants[15]="r";
    /*ற*/	consonantsUnicode[16]="\u0bb1"; consonants[16]="R";
    /*ல*/	consonantsUnicode[17]="\u0bb2"; consonants[17]="l";
    /*ழ*/	consonantsUnicode[18]="\u0bb4"; consonants[18]="L";
    /*வ*/	consonantsUnicode[19]="\u0bb5"; consonants[19]="w";
    /*ஸ*/   consonantsUnicode[20]="\u0bb8"; consonants[20]="S";
    /*ஹ*/	consonantsUnicode[21]="\u0bb9"; consonants[21]="H";

    /*ச*/	 consonantsUnicode[22]="\u0b9a"; consonants[22]="s";
    /*த*/	 consonantsUnicode[23]="\u0ba4"; consonants[23]="d";
    /*க*/    consonantsUnicode[24]="\u0b95"; consonants[24]="g";
    /*க*/    consonantsUnicode[25]="\u0b95"; consonants[25]="h";
    /*ட*/	consonantsUnicode[26]="\u0b9f"; consonants[26]="D";
    /*ப*/	consonantsUnicode[27]="\u0baa"; consonants[27]="f";

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
        text1 = text1.replaceAll(consonants[j], consonantsUnicode[j]+"\u0bcd");
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
