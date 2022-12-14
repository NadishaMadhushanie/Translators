/* The following code was generated by JFlex 1.7.0 */

import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>SinglishTranslator.flex</tt>
 */
class SinglishTranslator {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\2\1\2\2\0\1\2\22\0\1\2\1\2\12\0\2\2"+
    "\1\2\1\0\12\2\2\2\1\1\1\0\1\3\1\2\1\0\32\2"+
    "\6\0\32\2\1\0\1\2\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff93\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[6];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\4\0\10\0\10\0\10\0\10";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[6];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\4\3\1\5\1\6\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\4\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[6];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

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

    /*???*/   vowels[0]="aa";     vowelsUnicode[0]="\u0d86";      vowelModifiersUnicode[0]="\u0dcf";

    /*???*/   vowels[1]="Aa";     vowelsUnicode[1]="\u0d88";      vowelModifiersUnicode[1]="\u0dd1";
             vowels[2]="ae";     vowelsUnicode[2]="\u0d88";      vowelModifiersUnicode[2]="\u0dd1";

    /*???*/   vowels[3]="ii";     vowelsUnicode[3]="\u0d8a";      vowelModifiersUnicode[3]="\u0dd3";
            vowels[4]="ie";     vowelsUnicode[4]="\u0d8a";      vowelModifiersUnicode[4]="\u0dd3";
            vowels[5]="ee";     vowelsUnicode[5]="\u0d8a";      vowelModifiersUnicode[5]="\u0dd3";

    /*???*/   vowels[6]="ea";     vowelsUnicode[6]="\u0d92";      vowelModifiersUnicode[6]="\u0dda";
            vowels[7]="ei";     vowelsUnicode[7]="\u0d92";      vowelModifiersUnicode[7]="\u0dda";

    /*???*/   vowels[8]="oe";    vowelsUnicode[8]="\u0d95";       vowelModifiersUnicode[8]="\u0ddd";

    /*???*/   vowels[9]="uu";    vowelsUnicode[9]="\u0d8c";      vowelModifiersUnicode[9]="\u0dd6";
            vowels[10]="oo";    vowelsUnicode[10]="\u0d8c";     vowelModifiersUnicode[10]="\u0dd6";

    /*???*/   vowels[11]="au";    vowelsUnicode[11]="\u0d96";     vowelModifiersUnicode[11]="\u0dde";
    /*???*/    vowels[12]="a";     vowelsUnicode[12]="\u0d85";     vowelModifiersUnicode[12]="";

    /*???*/   vowels[13]="A";     vowelsUnicode[13]="\u0d87";     vowelModifiersUnicode[13]="\u0dd0";
             vowels[14]="/a";    vowelsUnicode[14]="\u0d87";     vowelModifiersUnicode[14]="\u0dd0";

    /*???*/   vowels[15]="i";     vowelsUnicode[15]="\u0d89";     vowelModifiersUnicode[15]="\u0dd2";
    /*???*/   vowels[16]="e";     vowelsUnicode[16]="\u0d91";     vowelModifiersUnicode[16]="\u0dd9";
    /*???*/   vowels[17]="o";     vowelsUnicode[17]="\u0d94";     vowelModifiersUnicode[17]="\u0ddc";
    /*???*/   vowels[18]="u";     vowelsUnicode[18]="\u0d8b";     vowelModifiersUnicode[18]="\u0dd4";
    /*???*/  vowels[19]="ai";   vowelsUnicode[19]="\u0d93";      vowelModifiersUnicode[19]="\u0ddb";


    /*??????*/  specialCharUnicode[0]="\u0df2"; specialChar[0]="ruu";
    /*??????*/   specialCharUnicode[1]="\u0dd8"; specialChar[1]="ru";

    /*???*/    specialConsonantsUnicode[0]="\u0d8d"; specialConsonants[0]="!r";
    /*???*/    specialConsonantsUnicode[1]="\u0d8e"; specialConsonants[1]="!R";
    /*???*/    specialConsonantsUnicode[2]="\u0d8f"; specialConsonants[2]="!p";
    /*???*/   specialConsonantsUnicode[3]="\u0d90"; specialConsonants[3]="!P";
    /*??????*/    specialConsonantsUnicode[4]="\u0d82"; specialConsonants[4]="!n";
    /*??????*/    specialConsonantsUnicode[5]="\u0d83"; specialConsonants[5]="!h";

    /*???*/	consonantsUnicode[0]="\u0da4"; consonants[0]="nnk";
    /*???*/	consonantsUnicode[1]="\u0da5"; consonants[1]="nng";
    /*???*/	consonantsUnicode[2]="\u0dac"; consonants[2]="nnd";
    /*???*/	 consonantsUnicode[3]="\u0db3"; consonants[3]="ndh";
    /*???*/	 consonantsUnicode[4]="\u0d9e"; consonants[4]="nd";
    /*???*/	 consonantsUnicode[5]="\u0d9f"; consonants[5]="ng";
    /*???*/	 consonantsUnicode[6]="\u0da0"; consonants[6]="ch";
    /*???*/	 consonantsUnicode[7]="\u0da1"; consonants[7]="CH";
    /*???*/	 consonantsUnicode[8]="\u0da6"; consonants[8]="nj";
    /*???*/	 consonantsUnicode[9]="\u0dad"; consonants[9]="th";
    /*???*/	 consonantsUnicode[10]="\u0dae"; consonants[10]="TH";
    /*???*/	 consonantsUnicode[11]="\u0daf"; consonants[11]="dh";
    /*???*/	consonantsUnicode[12]="\u0db0"; consonants[12]="DH";
    /*???*/	consonantsUnicode[13]="\u0db9"; consonants[13]="mb";
    /*???*/	consonantsUnicode[14]="\u0dc1"; consonants[14]="sh";
    /*???*/	consonantsUnicode[15]="\u0dc2"; consonants[15]="SH";

    /*???*/   consonantsUnicode[16]="\u0d9a"; consonants[16]="k";
    /*???*/	consonantsUnicode[17]="\u0d9b"; consonants[17]="K";
    /*???*/	consonantsUnicode[18]="\u0d9c"; consonants[18]="g";
    /*???*/	consonantsUnicode[19]="\u0d9d"; consonants[19]="G";  
    /*???*/	consonantsUnicode[20]="\u0da2"; consonants[20]="j";
    /*???*/  consonantsUnicode[21]="\u0da3"; consonants[21]="J";
    /*???*/	consonantsUnicode[22]="\u0da7"; consonants[22]="t";
    /*???*/	consonantsUnicode[23]="\u0da8"; consonants[23]="T";
    /*???*/	consonantsUnicode[24]="\u0da9"; consonants[24]="d";
    /*???*/	consonantsUnicode[25]="\u0daa"; consonants[25]="D";
    /*???*/	consonantsUnicode[26]="\u0dab"; consonants[26]="N";
    /*???*/	consonantsUnicode[27]="\u0db1"; consonants[27]="n";
    /*???*/	consonantsUnicode[28]="\u0db4"; consonants[28]="p";
    /*???*/	consonantsUnicode[29]="\u0db5"; consonants[29]="P";
    /*???*/	consonantsUnicode[30]="\u0db6"; consonants[30]="b";
    /*???*/	consonantsUnicode[31]="\u0db7"; consonants[31]="B";
    /*???*/	consonantsUnicode[32]="\u0db8"; consonants[32]="m";
    /*???*/	consonantsUnicode[33]="\u0dba"; consonants[33]="y";
    /*???*/	consonantsUnicode[34]="\u0dbb"; consonants[34]="r";
    /*???*/	consonantsUnicode[35]="\u0dbd"; consonants[35]="l";
    /*???*/	consonantsUnicode[36]="\u0dc0"; consonants[36]="w";
    /*???*/	consonantsUnicode[37]="\u0dc3"; consonants[37]="s";
    /*???*/	consonantsUnicode[38]="\u0dc4"; consonants[38]="h";
    /*???*/	consonantsUnicode[39]="\u0dc5"; consonants[39]="L";
    /*???*/	consonantsUnicode[40]="\u0dc6"; consonants[40]="f";

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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  SinglishTranslator(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 82) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            } 
            // fall through
          case 5: break;
          case 2: 
            { yybegin(STRING); text2 = "";
            } 
            // fall through
          case 6: break;
          case 3: 
            { append(yytext());
            } 
            // fall through
          case 7: break;
          case 4: 
            { replace_function(text2);
            } 
            // fall through
          case 8: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java SinglishTranslator [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        SinglishTranslator scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new SinglishTranslator(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
