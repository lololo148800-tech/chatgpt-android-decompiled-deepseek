package p033B5;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0654C;
import p1009s9.C19506i;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p374P5.C6354g;
import p374P5.C6361n;
import p523V9.AbstractC7966P5;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: B5.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0833q {

    /* JADX INFO: renamed from: a */
    public static final C19506i f2313a = new C19506i(Boolean.TRUE, 2);

    /* JADX INFO: renamed from: a */
    public static C0816A m1888a(String str) {
        String str2 = C0654C.f1910Z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("file");
        sb2.append(':');
        if (str != null) {
            sb2.append(str);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return new C0816A(string, str2, "file", null, str);
    }

    /* JADX INFO: renamed from: b */
    public static final Drawable m1889b(InterfaceC0829m interfaceC0829m, Resources resources) {
        if (interfaceC0829m instanceof C0824h) {
            return ((C0824h) interfaceC0829m).f2304a;
        }
        return interfaceC0829m instanceof C0817a ? new BitmapDrawable(resources, ((C0817a) interfaceC0829m).f2281a) : new C0830n(interfaceC0829m, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0829m m1890c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C0817a(((BitmapDrawable) drawable).getBitmap(), true) : new C0824h(drawable);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m1891d(C6354g c6354g, C19506i c19506i) {
        Object obj = c6354g.f20679s.f2309a.get(c19506i);
        if (obj != null) {
            return obj;
        }
        Object obj2 = c6354g.f20681u.f20651n.f2309a.get(c19506i);
        return obj2 == null ? c19506i.f61960Z : obj2;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m1892e(C6361n c6361n, C19506i c19506i) {
        Object obj = c6361n.f20706j.f2309a.get(c19506i);
        return obj == null ? c19506i.f61960Z : obj;
    }

    /* JADX INFO: renamed from: f */
    public static final String m1893f(C0816A c0816a) {
        List listM1894g = m1894g(c0816a);
        if (listM1894g.isEmpty()) {
            return null;
        }
        String str = c0816a.f2280e;
        AbstractC16544l.m18091d(str);
        String str2 = c0816a.f2277b;
        if (!AbstractC21329w.m21734u(str, str2, false)) {
            str2 = "";
        }
        return AbstractC17680n.m19349Y(listM1894g, c0816a.f2277b, str2, null, 0, null, null, 60);
    }

    /* JADX INFO: renamed from: g */
    public static final List m1894g(C0816A c0816a) {
        String str = c0816a.f2280e;
        if (str == null) {
            return C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        while (i10 < str.length()) {
            int i11 = i10 + 1;
            int iM21678L = AbstractC21322p.m21678L(str, '/', i11, false, 4);
            if (iM21678L == -1) {
                iM21678L = str.length();
            }
            String strSubstring = str.substring(i11, iM21678L);
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i10 = iM21678L;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final String m1895h(String str, byte[] bArr) {
        int length = str.length();
        int i10 = 0;
        int iMax = Math.max(0, length - 2);
        int i11 = 0;
        while (true) {
            if (i10 >= iMax) {
                if (i10 == i11) {
                    return str;
                }
                if (i10 >= length) {
                    return AbstractC21329w.m21724k(bArr, i11, 5);
                }
            } else if (str.charAt(i10) == '%') {
                int i12 = i10 + 3;
                try {
                    String strSubstring = str.substring(i10 + 1, i12);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    AbstractC7966P5.m8254b(16);
                    bArr[i11] = (byte) Integer.parseInt(strSubstring, 16);
                    i11++;
                    i10 = i12;
                } catch (NumberFormatException unused) {
                    bArr[i11] = (byte) str.charAt(i10);
                    i11++;
                    i10++;
                }
            }
            bArr[i11] = (byte) str.charAt(i10);
            i11++;
            i10++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0816A m1896i(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = C0654C.f1910Z;
        String strM21731r = !AbstractC16544l.m18089b(str2, Separators.SLASH) ? AbstractC21329w.m21731r(str, str2, Separators.SLASH) : str;
        int i10 = 0;
        boolean z6 = true;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (i10 < strM21731r.length()) {
            char cCharAt = strM21731r.charAt(i10);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i13 == -1 && i11 == -1) {
                            i13 = i10 + 1;
                        }
                    } else if (z6 && i13 == -1 && i11 == -1) {
                        int i16 = i10 + 2;
                        if (i16 < str.length() && str.charAt(i10 + 1) == '/' && str.charAt(i16) == '/') {
                            i14 = i10 + 3;
                            z6 = false;
                            i15 = i10;
                            i10 = i16;
                        } else if (strM21731r.equals(str)) {
                            i12 = i10 + 1;
                            i15 = i10;
                            i10 = i12;
                            i14 = i10;
                        }
                    }
                } else if (i12 == -1 && i13 == -1 && i11 == -1) {
                    i12 = i14 == -1 ? 0 : i10;
                    z6 = false;
                }
            } else if (i11 == -1) {
                i11 = i10 + 1;
            }
            i10++;
        }
        int iMin = Math.min(i11 == -1 ? Integer.MAX_VALUE : i11 - 1, strM21731r.length());
        int iMin2 = Math.min(i13 == -1 ? Integer.MAX_VALUE : i13 - 1, iMin);
        if (i14 != -1) {
            strSubstring2 = strM21731r.substring(0, i15);
            AbstractC16544l.m18093f(strSubstring2, "substring(...)");
            strSubstring = strM21731r.substring(i14, Math.min(i12 != -1 ? i12 : Integer.MAX_VALUE, iMin2));
            AbstractC16544l.m18093f(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i12 != -1) {
            strSubstring3 = strM21731r.substring(i12, iMin2);
            AbstractC16544l.m18093f(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i13 != -1) {
            strSubstring4 = strM21731r.substring(i13, iMin);
            AbstractC16544l.m18093f(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i11 != -1) {
            strSubstring5 = strM21731r.substring(i11, strM21731r.length());
            AbstractC16544l.m18093f(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strM1895h = strSubstring2 != null ? m1895h(strSubstring2, bArr) : null;
        String strM1895h2 = strSubstring != null ? m1895h(strSubstring, bArr) : null;
        String strM1895h3 = strSubstring3 != null ? m1895h(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            m1895h(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            m1895h(strSubstring5, bArr);
        }
        return new C0816A(strM21731r, str2, strM1895h, strM1895h2, strM1895h3);
    }
}
