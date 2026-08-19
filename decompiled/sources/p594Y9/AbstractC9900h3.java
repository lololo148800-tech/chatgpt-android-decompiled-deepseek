package p594Y9;

import android.content.Context;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0100z;
import p006A4.C0359t;
import p178H.C3169s;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p239Ja.C4307j;
import p301M.AbstractC5229k;
import p301M.RunnableC5220b;
import p477Tb.C7296c;
import p536W.C8408d;
import p544W9.AbstractC8577W2;
import p610Z1.C10145l;
import p848k6.AbstractC16347a;
import p919o8.C17942V0;

/* JADX INFO: renamed from: Y9.h3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9900h3 {
    /* JADX INFO: renamed from: a */
    public static C17942V0 m10564a(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("viewport");
            return new C17942V0(abstractC3673pM4395w != null ? AbstractC9715D3.m10308b(abstractC3673pM4395w.m4390m()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Display", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static RunnableC5220b m10565b(Context context) {
        C10145l c10145lM17947b;
        AbstractC16544l.m18094g(context, "context");
        C8408d c8408d = C8408d.f26139g;
        synchronized (c8408d.f26140a) {
            c10145lM17947b = c8408d.f26141b;
            if (c10145lM17947b == null) {
                c10145lM17947b = AbstractC16347a.m17947b(new C0100z(c8408d, 21, new C3169s(context)));
                c8408d.f26141b = c10145lM17947b;
            }
        }
        C4307j c4307j = new C4307j(new C0359t(context, 2), 9);
        return AbstractC5229k.m5782f(c10145lM17947b, new C7296c(c4307j, 18), AbstractC8577W2.m9240b());
    }
}
