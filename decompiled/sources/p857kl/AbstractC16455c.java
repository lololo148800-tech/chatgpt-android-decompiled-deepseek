package p857kl;

import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p109E3.C2292p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p200Hm.C3504c;
import p488Tn.C7518a;
import p523V9.AbstractC8120j6;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: kl.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16455c {

    /* JADX INFO: renamed from: a */
    public static final Set f51054a;

    /* JADX INFO: renamed from: b */
    public static final Set f51055b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f51056c;

    /* JADX INFO: renamed from: d */
    public static final Set f51057d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList f51058e;

    static {
        ArrayList arrayListM19361k0 = AbstractC17680n.m19361k0(new C3504c('0', '9'), AbstractC17680n.m19359i0(new C3504c('a', 'z'), new C3504c('A', 'Z')));
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM19361k0, 10));
        Iterator it = arrayListM19361k0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f51054a = AbstractC17680n.m19328G0(arrayList);
        f51055b = AbstractC17680n.m19328G0(AbstractC17680n.m19361k0(new C3504c('0', '9'), AbstractC17680n.m19359i0(new C3504c('a', 'z'), new C3504c('A', 'Z'))));
        AbstractC17680n.m19328G0(AbstractC17680n.m19361k0(new C3504c('0', '9'), AbstractC17680n.m19359i0(new C3504c('a', 'f'), new C3504c('A', 'F'))));
        Set setM19293P = AbstractC17678l.m19293P(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(setM19293P, 10));
        Iterator it2 = setM19293P.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f51056c = arrayList2;
        f51057d = AbstractC17678l.m19293P(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        AbstractC17665J.m19266f(f51055b, AbstractC17678l.m19293P(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listM19382k = AbstractC17681o.m19382k('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(listM19382k, 10));
        Iterator it3 = listM19382k.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f51058e = arrayList3;
    }

    /* JADX INFO: renamed from: a */
    public static final int m18028a(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        if ('a' > c9 || c9 >= 'g') {
            return -1;
        }
        return c9 - 'W';
    }

    /* JADX INFO: renamed from: b */
    public static final String m18029b(int i10, int i11, String str, boolean z6) throws C2292p {
        int i12 = i10;
        while (i12 < i11) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z6 && cCharAt == '+')) {
                int i13 = i11 - i10;
                if (i13 > 255) {
                    i13 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i13);
                if (i12 > i10) {
                    sb2.append((CharSequence) str, i10, i12);
                }
                byte[] bArr = null;
                while (i12 < i11) {
                    char cCharAt2 = str.charAt(i12);
                    if (z6 && cCharAt2 == '+') {
                        sb2.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i11 - i12) / 3];
                        }
                        int i14 = 0;
                        while (i12 < i11 && str.charAt(i12) == '%') {
                            int i15 = i12 + 2;
                            if (i15 >= i11) {
                                throw new C2292p("Incomplete trailing HEX escape: " + str.subSequence(i12, str.length()).toString() + ", in " + ((Object) str) + " at " + i12);
                            }
                            int i16 = i12 + 1;
                            int iM18028a = m18028a(str.charAt(i16));
                            int iM18028a2 = m18028a(str.charAt(i15));
                            if (iM18028a == -1 || iM18028a2 == -1) {
                                throw new C2292p("Wrong HEX escape: %" + str.charAt(i16) + str.charAt(i15) + ", in " + ((Object) str) + ", at " + i12);
                            }
                            bArr[i14] = (byte) ((iM18028a * 16) + iM18028a2);
                            i12 += 3;
                            i14++;
                        }
                        sb2.append(AbstractC21329w.m21724k(bArr, i14, 4));
                    } else {
                        sb2.append(cCharAt2);
                    }
                    i12++;
                }
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "toString(...)");
                return string;
            }
            i12++;
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public static String m18030c(String str) {
        int length = str.length();
        Charset charset = C21307a.f67720a;
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(charset, "charset");
        return m18029b(0, length, str, false);
    }

    /* JADX INFO: renamed from: d */
    public static String m18031d(String str, int i10, int i11, boolean z6, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z6 = false;
        }
        Charset charset = C21307a.f67720a;
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(charset, "charset");
        return m18029b(i10, i11, str, z6);
    }

    /* JADX INFO: renamed from: e */
    public static final String m18032e(String str, final boolean z6) {
        AbstractC16544l.m18094g(str, "<this>");
        final StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = C21307a.f67720a.newEncoder();
        AbstractC16544l.m18093f(charsetEncoderNewEncoder, "newEncoder(...)");
        int length = str.length();
        C7518a c7518a = new C7518a();
        AbstractC8120j6.m8625c(charsetEncoderNewEncoder, c7518a, str, 0, length);
        m18034g(c7518a, new InterfaceC1436k() { // from class: kl.a
            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                Byte b = (Byte) obj;
                byte bByteValue = b.byteValue();
                boolean zContains = AbstractC16455c.f51054a.contains(b);
                StringBuilder sb3 = sb2;
                if (zContains || AbstractC16455c.f51058e.contains(b)) {
                    sb3.append((char) bByteValue);
                } else if (z6 && bByteValue == 32) {
                    sb3.append('+');
                } else {
                    sb3.append(AbstractC16455c.m18035h(bByteValue));
                }
                return C17296C.f55119a;
            }
        });
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static String m18033f(String str, int i10, boolean z6) throws CharacterCodingException {
        int i11 = 0;
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        AbstractC16544l.m18094g(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = C21307a.f67720a;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (z6 || cCharAt != '/') {
                if (!f51055b.contains(Character.valueOf(cCharAt))) {
                    if (!f51057d.contains(Character.valueOf(cCharAt))) {
                        int i12 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                        AbstractC16544l.m18093f(charsetEncoderNewEncoder, "newEncoder(...)");
                        int i13 = i12 + i11;
                        C7518a c7518a = new C7518a();
                        AbstractC8120j6.m8625c(charsetEncoderNewEncoder, c7518a, str, i11, i13);
                        while (!c7518a.mo7821g()) {
                            while (!c7518a.mo7821g()) {
                                sb2.append(m18035h(c7518a.readByte()));
                            }
                        }
                        i11 = i13;
                    }
                }
            }
            sb2.append(cCharAt);
            i11++;
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static final void m18034g(C7518a c7518a, InterfaceC1436k interfaceC1436k) {
        while (!c7518a.mo7821g()) {
            while (!c7518a.mo7821g()) {
                interfaceC1436k.invoke(Byte.valueOf(c7518a.readByte()));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m18035h(byte b) {
        int i10 = (b & 255) >> 4;
        int i11 = b & 15;
        return new String(new char[]{'%', (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48), (char) ((i11 < 0 || i11 >= 10) ? ((char) (i11 + 65)) - '\n' : i11 + 48)});
    }
}
