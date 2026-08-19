package p571X9;

import java.io.FileNotFoundException;
import java.io.IOException;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p499U9.C7588r;
import p594Y9.AbstractC9818V;
import p919o8.C17944W;

/* JADX INFO: renamed from: X9.O4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9185O4 {

    /* JADX INFO: renamed from: a */
    public static C7588r f27970a;

    /* JADX INFO: renamed from: a */
    public static void m9742a(AbstractC0682p abstractC0682p, C0654C c0654c) {
        if (abstractC0682p.m1463d(c0654c)) {
            return;
        }
        try {
            abstractC0682p.mo1399i(c0654c, false).close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9743b(AbstractC0682p abstractC0682p, C0654C c0654c) throws IOException {
        try {
            IOException iOException = null;
            for (C0654C c0654c2 : abstractC0682p.mo1396e(c0654c)) {
                try {
                    if (abstractC0682p.m1464f(c0654c2).f1984c) {
                        m9743b(abstractC0682p, c0654c2);
                    }
                    abstractC0682p.mo1395b(c0654c2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static C17944W m9744c(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("viewport");
            return new C17944W(abstractC3673pM4395w != null ? AbstractC9818V.m10457a(abstractC3673pM4395w.m4390m()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Display", e12);
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C9173M4 m9745d(C9149I4 c9149i4) {
        try {
            if (f27970a == null) {
                f27970a = new C7588r(3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (C9173M4) f27970a.m4539y(c9149i4);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized C9173M4 m9746e(String str) {
        byte b = (byte) (((byte) 1) | 2);
        try {
            if (b != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m9745d(new C9149I4(str));
    }
}
