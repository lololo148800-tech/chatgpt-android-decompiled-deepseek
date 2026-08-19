package p909nm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17295B;
import mm.C17309l;
import mm.C17318u;
import mm.C17320w;
import mm.C17322y;
import p030B2.C0740V;
import p049Bm.InterfaceC1436k;
import p1091wn.C21026g;
import p1091wn.InterfaceC21029j;
import p153Fn.C2942t;
import p200Hm.C3508g;
import p379Pb.LVf.efyhmdM;
import p523V9.AbstractC7989S5;
import p571X9.AbstractC9387w3;
import p571X9.AbstractC9393x3;
import p606Yn.C10107h;

/* JADX INFO: renamed from: nm.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17678l extends AbstractC9387w3 {
    /* JADX INFO: renamed from: A */
    public static Object m19278A(int i10, Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    /* JADX INFO: renamed from: B */
    public static int m19279B(Object obj, Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public static int m19280C(int[] iArr, int i10) {
        AbstractC16544l.m18094g(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public static final void m19281D(Object[] objArr, StringBuilder sb2, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(objArr, "<this>");
        AbstractC16544l.m18094g(separator, "separator");
        AbstractC16544l.m18094g(prefix, "prefix");
        AbstractC16544l.m18094g(postfix, "postfix");
        AbstractC16544l.m18094g(truncated, "truncated");
        sb2.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                sb2.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC7989S5.m8294c(sb2, obj, interfaceC1436k);
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
    }

    /* JADX INFO: renamed from: E */
    public static String m19282E(byte[] bArr, String str, InterfaceC1436k interfaceC1436k, int i10) {
        if ((i10 & 32) != 0) {
            interfaceC1436k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i11 = 0;
        for (byte b : bArr) {
            i11++;
            if (i11 > 1) {
                sb2.append((CharSequence) str);
            }
            if (interfaceC1436k != null) {
                sb2.append((CharSequence) interfaceC1436k.invoke(Byte.valueOf(b)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b));
            }
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: F */
    public static String m19283F(Object[] objArr, String str, String str2, String str3, InterfaceC1436k interfaceC1436k, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i10 & 2) != 0 ? "" : str2;
        String postfix = (i10 & 4) != 0 ? "" : str3;
        if ((i10 & 32) != 0) {
            interfaceC1436k = null;
        }
        AbstractC16544l.m18094g(objArr, "<this>");
        AbstractC16544l.m18094g(separator, "separator");
        AbstractC16544l.m18094g(prefix, "prefix");
        AbstractC16544l.m18094g(postfix, "postfix");
        StringBuilder sb2 = new StringBuilder();
        m19281D(objArr, sb2, separator, prefix, postfix, -1, "...", interfaceC1436k);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: G */
    public static Object m19284G(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: H */
    public static int m19285H(int[] iArr) {
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i10 = iArr[0];
        int i11 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: I */
    public static byte[] m19286I(byte[] bArr, byte[] elements) {
        AbstractC16544l.m18094g(bArr, "<this>");
        AbstractC16544l.m18094g(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        AbstractC16544l.m18091d(bArrCopyOf);
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: J */
    public static char m19287J(char[] cArr) {
        AbstractC16544l.m18094g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: K */
    public static Object m19288K(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: L */
    public static float m19289L(float[] fArr) {
        AbstractC16544l.m18094g(fArr, "<this>");
        float f10 = 0.0f;
        for (float f11 : fArr) {
            f10 += f11;
        }
        return f10;
    }

    /* JADX INFO: renamed from: M */
    public static final void m19290M(Object[] objArr, LinkedHashSet linkedHashSet) {
        AbstractC16544l.m18094g(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    /* JADX INFO: renamed from: N */
    public static List m19291N(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new C17676j(objArr, false)) : AbstractC9393x3.m9974d(objArr[0]);
        }
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: O */
    public static ArrayList m19292O(int[] iArr) {
        AbstractC16544l.m18094g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static Set m19293P(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return C17691y.f56482Y;
        }
        if (length == 1) {
            return AbstractC17665J.m19268h(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC17660E.m19257b(objArr.length));
        m19290M(objArr, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: Q */
    public static ArrayList m19294Q(Object[] objArr, Object[] other) {
        AbstractC16544l.m18094g(objArr, "<this>");
        AbstractC16544l.m18094g(other, "other");
        int iMin = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new C17309l(objArr[i10], other[i10]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static Iterable m19295b(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        return objArr.length == 0 ? C17689w.f56480Y : new C10107h(objArr, 1);
    }

    /* JADX INFO: renamed from: c */
    public static List m19296c(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        AbstractC16544l.m18093f(listAsList, "asList(...)");
        return listAsList;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC21029j m19297d(Object[] objArr) {
        return objArr.length == 0 ? C21026g.f66901a : new C0740V(objArr, 2);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19298e(Object obj, Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        return m19279B(obj, objArr) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static boolean m19299f(char[] cArr, char c9) {
        int length = cArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (c9 == cArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m19300g(int[] iArr, int i10) {
        AbstractC16544l.m18094g(iArr, "<this>");
        return m19280C(iArr, i10) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static boolean m19301h(long[] jArr, long j10) {
        int length = jArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (j10 == jArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static void m19303j(int i10, int i11, int i12, int[] iArr, int[] destination) {
        AbstractC16544l.m18094g(iArr, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: k */
    public static void m19304k(int i10, int i11, int i12, Object[] objArr, Object[] destination) {
        AbstractC16544l.m18094g(objArr, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: l */
    public static void m19305l(byte[] bArr, int i10, byte[] destination, int i11, int i12) {
        AbstractC16544l.m18094g(bArr, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: m */
    public static void m19306m(char[] cArr, char[] destination, int i10, int i11, int i12) {
        AbstractC16544l.m18094g(cArr, "<this>");
        AbstractC16544l.m18094g(destination, "destination");
        System.arraycopy(cArr, i11, destination, i10, i12 - i11);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m19307n(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = iArr.length;
        }
        m19303j(i10, 0, i11, iArr, iArr2);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m19308o(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        m19304k(0, i10, i11, objArr, objArr2);
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m19309p(byte[] bArr, int i10, int i11) {
        AbstractC16544l.m18094g(bArr, "<this>");
        AbstractC9387w3.m9957a(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC16544l.m18093f(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: q */
    public static Object[] m19310q(Object[] objArr, int i10, int i11) {
        AbstractC16544l.m18094g(objArr, "<this>");
        AbstractC9387w3.m9957a(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC16544l.m18093f(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: r */
    public static void m19311r(Object[] objArr, C2942t c2942t, int i10, int i11) {
        AbstractC16544l.m18094g(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, c2942t);
    }

    /* JADX INFO: renamed from: s */
    public static void m19312s(int[] iArr, int i10, int i11, int i12) {
        if ((i12 & 4) != 0) {
            i11 = iArr.length;
        }
        Arrays.fill(iArr, 0, i11, i10);
    }

    /* JADX INFO: renamed from: t */
    public static void m19313t(long[] jArr) {
        int length = jArr.length;
        AbstractC16544l.m18094g(jArr, "<this>");
        Arrays.fill(jArr, 0, length, -9187201950435737472L);
    }

    /* JADX INFO: renamed from: v */
    public static ArrayList m19315v(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: w */
    public static Object m19316w(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: x */
    public static Object m19317x(Object[] objArr) {
        AbstractC16544l.m18094g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: y */
    public static C3508g m19318y(int[] iArr) {
        return new C3508g(0, iArr.length - 1, 1);
    }

    /* JADX INFO: renamed from: z */
    public static Integer m19319z(int[] iArr, int i10) {
        AbstractC16544l.m18094g(iArr, "<this>");
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    /* JADX INFO: renamed from: i */
    public static final void m19302i(Object[] objArr, StringBuilder sb2, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb2.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb2.append('[');
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10];
            String str = "null";
            if (obj == null) {
                sb2.append("null");
            } else if (obj instanceof Object[]) {
                m19302i((Object[]) obj, sb2, arrayList);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                AbstractC16544l.m18093f(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                AbstractC16544l.m18093f(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                AbstractC16544l.m18093f(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                AbstractC16544l.m18093f(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                AbstractC16544l.m18093f(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                AbstractC16544l.m18093f(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                AbstractC16544l.m18093f(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                AbstractC16544l.m18093f(string8, "toString(...)");
                sb2.append(string8);
            } else if (obj instanceof C17318u) {
                String strM19349Y = AbstractC17680n.m19349Y(new C17318u(((C17318u) obj).f55150Y), ", ", "[", "]", 0, null, null, 56);
                if (strM19349Y != null) {
                    str = strM19349Y;
                }
                sb2.append(str);
            } else if (obj instanceof C17295B) {
                String strM19349Y2 = AbstractC17680n.m19349Y(new C17295B(((C17295B) obj).f55118Y), efyhmdM.veoPPoLF, "[", "]", 0, null, null, 56);
                if (strM19349Y2 != null) {
                    str = strM19349Y2;
                }
                sb2.append(str);
            } else if (obj instanceof C17320w) {
                String strM19349Y3 = AbstractC17680n.m19349Y(new C17320w(((C17320w) obj).f55152Y), ", ", "[", "]", 0, null, null, 56);
                if (strM19349Y3 != null) {
                    str = strM19349Y3;
                }
                sb2.append(str);
            } else if (obj instanceof C17322y) {
                String strM19349Y4 = AbstractC17680n.m19349Y(new C17322y(((C17322y) obj).f55154Y), ", ", "[", "]", 0, null, null, 56);
                if (strM19349Y4 != null) {
                    str = strM19349Y4;
                }
                sb2.append(str);
            } else {
                sb2.append(obj.toString());
            }
        }
        sb2.append(']');
        arrayList.remove(AbstractC17681o.m19381j(arrayList));
    }
}
