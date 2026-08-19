package p544W9;

import p841k.C16291k;
import p859l.C16655f;

/* JADX INFO: renamed from: W9.U3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8566U3 {
    /* JADX INFO: renamed from: a */
    public static final C16291k m9231a() {
        C16655f c16655f = C16655f.f53354a;
        C16291k c16291k = new C16291k();
        c16291k.f50467a = c16655f;
        return c16291k;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9232b(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: c */
    public static String m9233c(int i10) {
        if (m9232b(i10, 0)) {
            return "Blocking";
        }
        if (m9232b(i10, 1)) {
            return "Optional";
        }
        if (m9232b(i10, 2)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }
}
