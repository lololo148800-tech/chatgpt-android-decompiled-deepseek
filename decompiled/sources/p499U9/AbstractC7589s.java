package p499U9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Path;
import java.util.ArrayList;
import p025An.C0644w;
import p1098x5.C21122a;
import p1098x5.EnumC21128g;
import p523V9.AbstractC7870D5;
import p979r2.C18864e;

/* JADX INFO: renamed from: U9.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7589s {

    /* JADX INFO: renamed from: a */
    public static C7588r f24011a;

    /* JADX INFO: renamed from: a */
    public static boolean m7926a(C18864e[] c18864eArr, C18864e[] c18864eArr2) {
        if (c18864eArr == null || c18864eArr2 == null || c18864eArr.length != c18864eArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < c18864eArr.length; i10++) {
            C18864e c18864e = c18864eArr[i10];
            char c9 = c18864e.f60091a;
            C18864e c18864e2 = c18864eArr2[i10];
            if (c9 != c18864e2.f60091a || c18864e.f60092b.length != c18864e2.f60092b.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static float[] m7927b(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static C18864e[] m7928c(String str) {
        int i10;
        String strTrim;
        float[] fArrM7927b;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i13 < str.length()) {
            while (i13 < str.length()) {
                char cCharAt = str.charAt(i13);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i12, i13).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i11) != 'z' || strTrim.charAt(i11) == 'Z') {
                                fArrM7927b = new float[i11];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i14 = i11;
                                    int i15 = 1;
                                    while (i15 < length) {
                                        int i16 = i11;
                                        int i17 = i16;
                                        int i18 = i17;
                                        int i19 = i18;
                                        for (int i20 = i15; i20 < strTrim.length(); i20++) {
                                            char cCharAt2 = strTrim.charAt(i20);
                                            if (cCharAt2 == ' ') {
                                                i16 = 0;
                                                i18 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i16 = 0;
                                                        i18 = 1;
                                                        break;
                                                    case '-':
                                                        if (i20 == i15 || i16 != 0) {
                                                            i16 = 0;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i17 == 0) {
                                                            i16 = 0;
                                                            i17 = 1;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i16 = 0;
                                                        break;
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i18 != 0) {
                                                if (i15 < i20) {
                                                    fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                                    i14++;
                                                }
                                                if (i19 != 0) {
                                                    i15 = i20;
                                                } else {
                                                    i15 = i20 + 1;
                                                }
                                                i11 = 0;
                                            }
                                        }
                                        if (i15 < i20) {
                                            fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                            i14++;
                                        }
                                        if (i19 != 0) {
                                            i15 = i20;
                                        } else {
                                            i15 = i20 + 1;
                                        }
                                        i11 = 0;
                                    }
                                    fArrM7927b = m7927b(fArr, i14);
                                    i11 = 0;
                                } catch (NumberFormatException e10) {
                                    throw new RuntimeException(AbstractC10763a.m11054l("error in parsing \"", strTrim, Separators.DOUBLE_QUOTE), e10);
                                }
                            }
                            arrayList.add(new C18864e(strTrim.charAt(i11), fArrM7927b));
                        }
                        i12 = i13;
                        i13++;
                        i11 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i13++;
            }
            strTrim = str.substring(i12, i13).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i11) != 'z') {
                    fArrM7927b = new float[i11];
                } else {
                    fArrM7927b = new float[i11];
                }
                arrayList.add(new C18864e(strTrim.charAt(i11), fArrM7927b));
            }
            i12 = i13;
            i13++;
            i11 = 0;
        }
        if (i13 - i12 != 1 || i12 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new C18864e(str.charAt(i12), new float[0]));
        }
        return (C18864e[]) arrayList.toArray(new C18864e[i10]);
    }

    /* JADX INFO: renamed from: d */
    public static Path m7929d(String str) {
        Path path = new Path();
        try {
            C18864e.m20175b(m7928c(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C18864e[] m7930e(C18864e[] c18864eArr) {
        C18864e[] c18864eArr2 = new C18864e[c18864eArr.length];
        for (int i10 = 0; i10 < c18864eArr.length; i10++) {
            c18864eArr2[i10] = new C18864e(c18864eArr[i10]);
        }
        return c18864eArr2;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m7931f(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: renamed from: g */
    public static final float m7932g(AbstractC7870D5 abstractC7870D5, EnumC21128g enumC21128g) {
        if (abstractC7870D5 instanceof C21122a) {
            return ((C21122a) abstractC7870D5).f67118b;
        }
        int iOrdinal = enumC21128g.ordinal();
        if (iOrdinal == 0) {
            return Float.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Float.MAX_VALUE;
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C7587q m7933h(C7585o c7585o) {
        try {
            if (f24011a == null) {
                f24011a = new C7588r(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C7587q) f24011a.m4539y(c7585o);
    }
}
