package android.gov.nist.javax.sip.clientauthutils;

import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes.dex */
public class MessageDigestAlgorithm {
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: H */
    private static String m11069H(String str) {
        try {
            return toHexString(MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("Failed to instantiate an MD5 algorithm", e10);
        }
    }

    /* JADX INFO: renamed from: KD */
    private static String m11070KD(String str, String str2) {
        return m11069H(AbstractC9306j0.m9890i(str, ":", str2));
    }

    public static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, StackLogger stackLogger) {
        String strM9890i;
        if (stackLogger.isLoggingEnabled(32)) {
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("trying to authenticate using : ", str, ", ", str2, ", ");
            AbstractC10763a.m11067y(sbM9896o, str3, ", ", str4, ", ");
            AbstractC10763a.m11067y(sbM9896o, str5, ", ", str6, ", ");
            AbstractC10763a.m11067y(sbM9896o, str7, ", ", str8, ", ");
            sbM9896o.append(str9);
            stackLogger.logDebug(sbM9896o.toString());
        }
        if (str2 == null || str6 == null || str7 == null || str3 == null) {
            throw new NullPointerException("Null parameter to MessageDigestAlgorithm.calculateResponse()");
        }
        if (str5 == null || str5.length() == 0) {
            throw new NullPointerException("cnonce_value may not be absent for MD5-Sess algorithm.");
        }
        if (str9 == null || str9.trim().length() == 0 || str9.trim().equalsIgnoreCase("auth")) {
            strM9890i = AbstractC9306j0.m9890i(str6, ":", str7);
        } else {
            if (str8 == null) {
                str8 = "";
            }
            strM9890i = str6 + ":" + str7 + ":" + m11069H(str8);
        }
        if (str9 == null || str4 == null || !(str9.equalsIgnoreCase("auth") || str9.equalsIgnoreCase("auth-int"))) {
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(str3, ":");
            sbM9895n.append(m11069H(strM9890i));
            return m11070KD(str2, sbM9895n.toString());
        }
        return m11070KD(str2, str3 + ":" + str4 + ":" + str5 + ":" + str9 + ":" + m11069H(strM9890i));
    }

    private static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = toHex;
            cArr[i10] = cArr2[(b >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String calculateResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, StackLogger stackLogger) {
        String string;
        String strM9890i;
        if (stackLogger.isLoggingEnabled(32)) {
            StringBuilder sbM9896o = AbstractC9306j0.m9896o("trying to authenticate using : ", str, ", ", str2, ", ");
            sbM9896o.append(str3);
            sbM9896o.append(", ");
            sbM9896o.append(str4 != null && str4.trim().length() > 0);
            sbM9896o.append(", ");
            sbM9896o.append(str5);
            sbM9896o.append(", ");
            AbstractC10763a.m11067y(sbM9896o, str6, ", ", str7, ", ");
            AbstractC10763a.m11067y(sbM9896o, str8, ", ", str9, ", ");
            sbM9896o.append(str10);
            sbM9896o.append(", ");
            sbM9896o.append(str11);
            stackLogger.logDebug(sbM9896o.toString());
        }
        if (str2 != null && str3 != null && str4 != null && str8 != null && str9 != null && str5 != null) {
            if (str != null && str.trim().length() != 0 && !str.trim().equalsIgnoreCase(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM)) {
                if (str7 != null && str7.length() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    AbstractC10763a.m11067y(sb2, m11069H(str2 + ":" + str3 + ":" + str4), ":", str5, ":");
                    sb2.append(str7);
                    string = sb2.toString();
                } else {
                    throw new NullPointerException("cnonce_value may not be absent for MD5-Sess algorithm.");
                }
            } else {
                string = str2 + ":" + str3 + ":" + str4;
            }
            if (str11 != null && str11.trim().length() != 0 && !str11.trim().equalsIgnoreCase("auth")) {
                if (str10 == null) {
                    str10 = "";
                }
                strM9890i = str8 + ":" + str9 + ":" + m11069H(str10);
            } else {
                strM9890i = AbstractC9306j0.m9890i(str8, ":", str9);
            }
            if (str7 != null && str11 != null && str6 != null && (str11.equalsIgnoreCase("auth") || str11.equalsIgnoreCase("auth-int"))) {
                return m11070KD(m11069H(string), str5 + ":" + str6 + ":" + str7 + ":" + str11 + ":" + m11069H(strM9890i));
            }
            String strM11069H = m11069H(string);
            StringBuilder sbM9895n = AbstractC9306j0.m9895n(str5, ":");
            sbM9895n.append(m11069H(strM9890i));
            return m11070KD(strM11069H, sbM9895n.toString());
        }
        throw new NullPointerException("Null parameter to MessageDigestAlgorithm.calculateResponse()");
    }
}
