/* The following code was generated by JFlex 1.7.0 */

import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>TanglishTranslator.flex</tt>
 */
class TanglishTranslator {

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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  TanglishTranslator(java.io.Reader in) {
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
      System.out.println("Usage : java TanglishTranslator [ --encoding <name> ] <inputfile(s)>");
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
        TanglishTranslator scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new TanglishTranslator(reader);
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
