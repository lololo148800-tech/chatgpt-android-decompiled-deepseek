package p571X9;

import java.util.Set;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p917o6.C17854g;
import p917o6.C17855h;
import p917o6.C17856i;

/* JADX INFO: renamed from: X9.F3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9130F3 {
    /* JADX INFO: renamed from: a */
    public static final boolean m9669a(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9670b(C17855h c17855h, Set set, String str, Set set2) {
        if (c17855h.equals(C17856i.f56942b)) {
            return true;
        }
        if (c17855h.equals(C17856i.f56941a)) {
            return false;
        }
        return AbstractC17680n.m19333J(c17855h.f56940a.f56939a, str);
    }

    /* JADX INFO: renamed from: c */
    public static final C17855h m9671c(String... strArr) {
        return new C17855h(new C17854g(AbstractC17678l.m19293P(strArr)));
    }
}
