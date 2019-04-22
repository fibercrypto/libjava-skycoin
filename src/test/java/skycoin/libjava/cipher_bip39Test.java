// package skycoin.libjava;

// import org.junit.Test;

// import static org.junit.Assert.*;

// public class cipher_bip39Test extends skycoin {
//     static {
//         System.loadLibrary("skycoin");
//     }
//     transutils utils = new transutils();
//     @Test
//     public void TestIsMnemonicValid() {
//         _GoString_ m = new _GoString_();
//         long err = SKY_bip39_NewDefaultMnemomic(m);
//         assertEquals(err, SKY_OK);
//         SWIGTYPE_p_unsigned_char val = new_CharPtr();
//         err = SKY_bip39_IsMnemonicValid(m, val);
//         assertEquals(err, SKY_OK);
//         assertEquals(CharPtr_value(val),1);

//         // Truncated
//         String str = m.getP();
//         str = str.substring(0, str.length() - 15);
//         _GoString_ Str = new _GoString_();
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);
//         assertNotEquals(CharPtr_value(val),1);

//         // Trailing whitespace
//         str = m.getP();
//         str += " ";
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);
//         assertNotEquals(CharPtr_value(val),1);

//         str = m.getP();
//         str += "/n";
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);
//         assertNotEquals(CharPtr_value(val),1);

//         // Trailing whitespace
//         str = m.getP();
//         str += " ";
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);
//         assertNotEquals(CharPtr_value(val),1);

//         str = m.getP();
//         str += "/n";
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);
//         assertNotEquals(CharPtr_value(val),1);

//         // Preceding whitespace
//         str = m.getP();
//         str.concat(" ");
//         str.concat(str);
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);

//         str = m.getP();
//         str += "/n" + str;
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);

//         // Extra whitespace between words
//         str = m.getP();
//         String[] ms = str.split(" ", 0);
//         String.join(" ", ms);
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);

//         // Contains invalid word
//         str = m.getP();
//         ms = str.split(" ", 0);
//         ms[2] = "foo";
//         String.join(" ", ms);
//         Str.SetString(str);
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);

//         // Invalid number of words
//         str = m.getP();
//         ms = str.split(" ", 0);
//         String[] ms1 = new String[ms.length - 1];
//         for (int i = 0; i < ms1.length; i++) {
//             ms1[i] = ms[i];
//         }
//         Str.SetString(String.join(" ", ms1));
//         err = SKY_bip39_IsMnemonicValid(Str, val);
//         assertEquals(err, SKY_OK);
//     }
// }
