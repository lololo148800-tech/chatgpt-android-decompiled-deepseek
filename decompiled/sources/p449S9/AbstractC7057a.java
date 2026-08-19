package p449S9;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001A.AbstractC0010F;
import p003A1.AbstractC0168G;
import p109E3.C2292p;
import p1139z0.C21585H;
import p232J3.C4206F;
import p499U9.C7591u;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: S9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7057a {

    /* JADX INFO: renamed from: b */
    public static volatile C2292p f22532b;

    /* JADX INFO: renamed from: a */
    public static final Object f22531a = new Object();

    /* JADX INFO: renamed from: c */
    public static final C7068f0 f22533c = new C7068f0(ParameterNames.f31999ID);

    /* JADX INFO: renamed from: d */
    public static final C7068f0 f22534d = new C7068f0("type");

    /* JADX INFO: renamed from: a */
    public static int m7456a(int i10, int i11, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (AbstractC7048Q.f22514a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if ((i12 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                            return i12;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i12;
                }
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m7457b(AbstractC7085o abstractC7085o) {
        Iterator it = abstractC7085o.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: c */
    public static String m7458c(C7054X c7054x) {
        StringBuilder sb2 = new StringBuilder(c7054x.mo7448m());
        for (int i10 = 0; i10 < c7054x.mo7448m(); i10++) {
            byte bMo7445f = c7054x.mo7445f(i10);
            if (bMo7445f == 34) {
                sb2.append("\\\"");
            } else if (bMo7445f == 39) {
                sb2.append("\\'");
            } else if (bMo7445f != 92) {
                switch (bMo7445f) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo7445f < 32 || bMo7445f > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo7445f >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo7445f >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo7445f & 7) + 48));
                        } else {
                            sb2.append((char) bMo7445f);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: d */
    public static String m7459d(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strM20d;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strM20d = "null";
            } else {
                try {
                    strM20d = obj.toString();
                } catch (Exception e10) {
                    String strM9890i = AbstractC9306j0.m9890i(obj.getClass().getName(), Separators.f31989AT, Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM9890i), (Throwable) e10);
                    strM20d = AbstractC0010F.m20d(Separators.LESS_THAN, strM9890i, " threw ", e10.getClass().getName(), Separators.GREATER_THAN);
                }
            }
            objArr[i11] = strM20d;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: e */
    public static void m7460e(int i10, int i11) {
        String strM7459d;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strM7459d = m7459d("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
                }
                strM7459d = m7459d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strM7459d);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7461f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC10763a.m11054l("null value in entry: ", obj.toString(), "=null"));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m7462g(StringBuilder sb2, Iterator it, C7591u c7591u) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(C7591u.m7939N(entry.getKey()));
            sb2.append(" : ");
            sb2.append(C7591u.m7939N(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(C7591u.m7939N(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(C7591u.m7939N(entry2.getValue()));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7463h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m7464i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = C7096v.f22584Y;
            }
        } else {
            if (!(collection instanceof InterfaceC7035D)) {
                return false;
            }
            objComparator = ((AbstractC7093s) ((InterfaceC7035D) collection)).f22580p0;
        }
        return comparator.equals(objComparator);
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m7465j(byte[]... bArr) {
        int i10 = 0;
        int length = 0;
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            length += bArr[i10].length;
            i10++;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length2);
            i11 += length2;
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC7072h0 m7466k(C7076j0 c7076j0) throws C7062c0 {
        try {
            C7074i0 c7074i0M7488m = c7076j0.m7488m();
            if (c7074i0M7488m == null) {
                throw new C7062c0("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = c7074i0M7488m.f22549a;
                byte b10 = c7074i0M7488m.f22550b;
                int i10 = 0;
                if (b == -128) {
                    long jM7484a = c7076j0.m7484a();
                    if (jM7484a > 1000) {
                        throw new C7062c0("Parser being asked to read a large CBOR array");
                    }
                    m7467l(b10, jM7484a);
                    AbstractC7072h0[] abstractC7072h0Arr = new AbstractC7072h0[(int) jM7484a];
                    while (i10 < jM7484a) {
                        abstractC7072h0Arr[i10] = m7466k(c7076j0);
                        i10++;
                    }
                    return new C7056Z(AbstractC7081m.m7492t(abstractC7072h0Arr));
                }
                if (b != -96) {
                    if (b == -64) {
                        throw new C7062c0("Tags are currently unsupported");
                    }
                    if (b == -32) {
                        return new C7058a0(c7076j0.m7479E());
                    }
                    if (b == 0 || b == 32) {
                        long jM7485e = c7076j0.m7485e();
                        m7467l(b10, jM7485e > 0 ? jM7485e : ~jM7485e);
                        return new C7064d0(jM7485e);
                    }
                    if (b == 64) {
                        c7076j0.m7482T((byte) 64);
                        byte[] bArrM7486j0 = c7076j0.m7486j0();
                        int length = bArrM7486j0.length;
                        m7467l(b10, length);
                        return new C7060b0(C7054X.m7451s(length, bArrM7486j0));
                    }
                    if (b == 96) {
                        c7076j0.m7482T((byte) 96);
                        String str = new String(c7076j0.m7486j0(), StandardCharsets.UTF_8);
                        m7467l(b10, str.length());
                        return new C7068f0(str);
                    }
                    throw new C7062c0("Unidentifiable major type: " + ((b >> 5) & 7));
                }
                long jM7487k = c7076j0.m7487k();
                if (jM7487k > 1000) {
                    throw new C7062c0("Parser being asked to read a large CBOR map");
                }
                m7467l(b10, jM7487k);
                int i11 = (int) jM7487k;
                C21585H[] c21585hArr = new C21585H[i11];
                AbstractC7072h0 abstractC7072h0 = null;
                int i12 = 0;
                while (i12 < jM7487k) {
                    AbstractC7072h0 abstractC7072h0M7466k = m7466k(c7076j0);
                    if (abstractC7072h0 != null && abstractC7072h0M7466k.compareTo(abstractC7072h0) <= 0) {
                        throw new C4206F("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + abstractC7072h0.toString() + "\nCurrent key: " + abstractC7072h0M7466k.toString());
                    }
                    c21585hArr[i12] = new C21585H(abstractC7072h0M7466k, 8, m7466k(c7076j0));
                    i12++;
                    abstractC7072h0 = abstractC7072h0M7466k;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    C21585H c21585h = c21585hArr[i10];
                    if (treeMap.containsKey((AbstractC7072h0) c21585h.f68344Z)) {
                        throw new C4206F("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put((AbstractC7072h0) c21585h.f68344Z, (AbstractC7072h0) c21585h.f68345o0);
                    i10++;
                }
                return new C7066e0(C7091r.m7498b(treeMap));
            } catch (IOException e10) {
                e = e10;
                throw new C7062c0(e);
            } catch (RuntimeException e11) {
                e = e11;
                throw new C7062c0(e);
            }
        } catch (IOException e12) {
            throw new C7062c0(e12);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m7467l(byte b, long j10) throws C4206F {
        switch (b) {
            case 24:
                if (j10 < 24) {
                    throw new C4206F(AbstractC0168G.m533v("Integer value ", j10, " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j10 < 256) {
                    throw new C4206F(AbstractC0168G.m533v("Integer value ", j10, " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j10 < 65536) {
                    throw new C4206F(AbstractC0168G.m533v("Integer value ", j10, " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j10 < 4294967296L) {
                    throw new C4206F(AbstractC0168G.m533v("Integer value ", j10, " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m7468m(int i10, int i11, int i12) {
        String strM7469n;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM7469n = m7469n(i10, i12, "start index");
            } else {
                strM7469n = (i11 < 0 || i11 > i12) ? m7469n(i11, i12, "end index") : m7459d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM7469n);
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m7469n(int i10, int i11, String str) {
        if (i10 < 0) {
            return m7459d("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return m7459d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i11, "negative size: "));
    }
}
