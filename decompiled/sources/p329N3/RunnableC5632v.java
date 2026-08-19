package p329N3;

import android.content.res.Configuration;
import io.sentry.C15345d;
import io.sentry.C15516w;
import io.sentry.EnumC15375i1;
import io.sentry.android.core.AppComponentsBreadcrumbsIntegration;
import io.sentry.android.replay.C15294h;
import io.sentry.android.replay.C15298l;
import io.sentry.android.replay.capture.AbstractC15275f;
import io.sentry.android.replay.capture.C15278i;
import io.sentry.android.replay.capture.C15281l;
import io.sentry.protocol.EnumC15432e;
import io.sentry.rrweb.AbstractC15461b;
import io.sentry.rrweb.C15471l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.C16556x;
import p001A.C0030P;
import p057C3.C1526D;
import p057C3.SurfaceHolderCallbackC1523A;
import p083D3.C1863a;
import p083D3.C1864b;
import p083D3.C1868f;
import p1073w3.AbstractC20817s;
import p193Hf.C3353c0;
import p658b5.C11232c;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: N3.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5632v implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18298Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f18299Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f18300o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f18301p0;

    public /* synthetic */ RunnableC5632v(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j10, Configuration configuration) {
        this.f18298Y = 1;
        this.f18300o0 = appComponentsBreadcrumbsIntegration;
        this.f18299Z = j10;
        this.f18301p0 = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EnumC15432e enumC15432e = null;
        long j10 = this.f18299Z;
        Object obj = this.f18301p0;
        Object obj2 = this.f18300o0;
        switch (this.f18298Y) {
            case 0:
                C11232c c11232c = (C11232c) obj2;
                c11232c.getClass();
                int i10 = AbstractC20817s.f66106a;
                C1526D c1526d = ((SurfaceHolderCallbackC1523A) c11232c.f33997Z).f4046Y;
                C1868f c1868f = c1526d.f4055E0;
                C1863a c1863aM2747C = c1868f.m2747C();
                c1868f.m2748D(c1863aM2747C, 26, new C1864b(c1863aM2747C, obj, j10));
                if (c1526d.f4075Y0 == obj) {
                    c1526d.f4100y0.m10694e(26, new C0030P(13));
                    return;
                }
                return;
            case 1:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
                if (appComponentsBreadcrumbsIntegration.f47298Z != null) {
                    int i11 = appComponentsBreadcrumbsIntegration.f47297Y.getResources().getConfiguration().orientation;
                    if (i11 == 1) {
                        enumC15432e = EnumC15432e.PORTRAIT;
                    } else if (i11 == 2) {
                        enumC15432e = EnumC15432e.LANDSCAPE;
                    }
                    String lowerCase = enumC15432e != null ? enumC15432e.name().toLowerCase(Locale.ROOT) : "undefined";
                    C15345d c15345d = new C15345d(j10);
                    c15345d.f47907p0 = "navigation";
                    c15345d.f47909r0 = "device.orientation";
                    c15345d.m16574b(lowerCase, "position");
                    c15345d.f47911t0 = EnumC15375i1.INFO;
                    C15516w c15516w = new C15516w();
                    c15516w.m16729c("android:configuration", (Configuration) obj);
                    appComponentsBreadcrumbsIntegration.f47298Z.mo16252u(c15345d, c15516w);
                    return;
                }
                return;
            default:
                C15278i this$0 = (C15278i) obj2;
                AbstractC16544l.m18094g(this$0, "this$0");
                C15298l c15298l = (C15298l) obj;
                C15294h c15294h = this$0.f47714i;
                if (c15294h != null) {
                    c15298l.invoke(c15294h, Long.valueOf(j10));
                }
                this$0.f47736u.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - this$0.f47734s.getExperimental().f48340a.f47055g;
                C15294h c15294h2 = this$0.f47714i;
                if (c15294h2 != null) {
                    C16525B c16525b = new C16525B();
                    AbstractC17686t.m19393A(c15294h2.f47778s0, new C3353c0(jCurrentTimeMillis, c15294h2, c16525b, 4));
                    str = (String) c16525b.f51262Y;
                } else {
                    str = null;
                }
                this$0.f47718m.setValue(this$0, AbstractC15275f.f47705r[2], str);
                ArrayList arrayList = this$0.f47738w;
                C16556x c16556x = new C16556x();
                AbstractC17686t.m19393A(arrayList, new C3353c0(jCurrentTimeMillis, this$0, c16556x, 5));
                if (c16556x.f51285Y) {
                    int i12 = 0;
                    for (Object obj3 : arrayList) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            AbstractC17681o.m19388q();
                            throw null;
                        }
                        C15281l c15281l = (C15281l) obj3;
                        c15281l.f47739a.f47010F0 = i12;
                        List<AbstractC15461b> list = c15281l.f47740b.f47094Z;
                        if (list != null) {
                            for (AbstractC15461b abstractC15461b : list) {
                                if (abstractC15461b instanceof C15471l) {
                                    ((C15471l) abstractC15461b).f48328p0 = i12;
                                }
                            }
                        }
                        i12 = i13;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC5632v(Object obj, Object obj2, long j10, int i10) {
        this.f18298Y = i10;
        this.f18300o0 = obj;
        this.f18301p0 = obj2;
        this.f18299Z = j10;
    }
}
