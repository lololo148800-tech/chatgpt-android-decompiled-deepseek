package p594Y9;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0280q;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C6021p;
import p502Uc.C7627k;
import p523V9.AbstractC8088f6;
import p635a1.AbstractC10443a;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.C13733I;
import p774h1.C14327E;
import p774h1.C14365u;
import p909nm.AbstractC17681o;
import p919o8.C17981j0;

/* JADX INFO: renamed from: Y9.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9818V {
    /* JADX INFO: renamed from: a */
    public static C17981j0 m10457a(C3676s c3676s) {
        try {
            Number width = c3676s.m4395w("width").mo4383q();
            Number height = c3676s.m4395w("height").mo4383q();
            AbstractC16544l.m18093f(width, "width");
            AbstractC16544l.m18093f(height, "height");
            return new C17981j0(width, height);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Viewport", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Viewport", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Viewport", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10459q m10458b(InterfaceC10459q shimmer, boolean z6, boolean z10, float f10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            f10 = 8;
        }
        AbstractC16544l.m18094g(shimmer, "$this$shimmer");
        return AbstractC10443a.m10921b(shimmer, C0280q.f1030t0, new C7627k(z6, z10, f10, false));
    }

    /* JADX INFO: renamed from: c */
    public static final C14327E m10459c(long j10, C6021p c6021p) {
        c6021p.m6524S(-1226460530);
        List listM19382k = AbstractC17681o.m19382k(new C14365u(C14365u.m15774b(C14365u.m15776d(j10), j10)), new C14365u(C14365u.m15774b(C14365u.m15776d(j10) * 0.2f, j10)), new C14365u(C14365u.m15774b(C14365u.m15776d(j10), j10)));
        C13733I c13733iM15242g = AbstractC13758e.m15242g(AbstractC13758e.m15253r("ShimmerAnimation", c6021p, 0), 0.0f, 2600.0f, AbstractC13758e.m15252q(AbstractC13758e.m15255t(2000, 0, null, 6), 1, 4), "ShimmerAnimation", c6021p, 28728, 0);
        C14327E c14327e = new C14327E(listM19382k, null, AbstractC8088f6.m8536b(((Number) c13733iM15242g.f43307p0.getValue()).floatValue() - 2000.0f, 0.0f), AbstractC8088f6.m8536b(((Number) c13733iM15242g.f43307p0.getValue()).floatValue() - (2000.0f / 2), 0.0f), 0);
        c6021p.m6553p(false);
        return c14327e;
    }
}
