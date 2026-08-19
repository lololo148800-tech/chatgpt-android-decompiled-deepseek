package p594Y9;

import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6021p;
import p562X0.AbstractC9018m;
import p562X0.C9013h;
import p562X0.C9014i;
import p562X0.InterfaceC9016k;
import p919o8.C17902H1;

/* JADX INFO: renamed from: Y9.Y3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9840Y3 {
    /* JADX INFO: renamed from: a */
    public static C17902H1 m10487a(C3676s c3676s) {
        try {
            return new C17902H1(c3676s.m4395w("start").mo4382p(), c3676s.m4395w("duration").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type InForegroundPeriod", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type InForegroundPeriod", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type InForegroundPeriod", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C9013h m10488b(C6021p c6021p) {
        c6021p.m6524S(-796080049);
        C9013h c9013h = (C9013h) AbstractC9834X3.m10481d(new Object[0], C9013h.f27507d, null, C9014i.f27511Z, c6021p, 3072, 4);
        c9013h.f27510c = (InterfaceC9016k) c6021p.m6548k(AbstractC9018m.f27517a);
        c6021p.m6553p(false);
        return c9013h;
    }
}
