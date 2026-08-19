package p814ik;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import kotlin.jvm.internal.AbstractC16544l;
import p1009s9.C19501d;
import p1009s9.C19503f;
import p1009s9.C19506i;
import p1022t9.C19819d;
import p166Ga.C3029c;
import p239Ja.C4307j;
import p310M9.C5311e;
import p310M9.C5312f;
import p451Sb.C7102a;
import p523V9.AbstractC7854B5;
import p658b5.C11232c;
import p746fa.AbstractC13600i;
import p746fa.C13606o;
import p746fa.ExecutorC13605n;
import p749fd.C13628m;
import p868l9.AbstractC16835c;

/* JADX INFO: renamed from: ik.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15031c implements InterfaceC15029a {

    /* JADX INFO: renamed from: a */
    public String f46728a;

    /* JADX INFO: renamed from: a */
    public final void m16159a(Context context) {
        C5311e c5311e;
        C13606o c13606oM8116d;
        AbstractC16544l.m18094g(context, "context");
        C19503f c19503f = C19503f.f61952b;
        C11232c c11232c = new C11232c();
        c11232c.f33996Y = new C5312f(context, c19503f);
        synchronized (C5311e.class) {
            try {
                if (C5311e.f17482q0 == null) {
                    C5311e.f17482q0 = new C5311e(context.getApplicationContext(), 0);
                }
                c5311e = C5311e.f17482q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c11232c.f33997Z = c5311e;
        C5312f c5312f = (C5312f) c11232c.f33996Y;
        if (c5312f.f17489l.m20602c(c5312f.f17488k, 212800000) == 0) {
            C3029c c3029cM3900d = C3029c.m3900d();
            c3029cM3900d.f9120e = new C19501d[]{AbstractC16835c.f54008a};
            c3029cM3900d.f9119d = new C7102a(c5312f);
            c3029cM3900d.f9118c = false;
            c3029cM3900d.f9117b = 27601;
            c13606oM8116d = c5312f.m20770b(0, c3029cM3900d.m3904c());
        } else {
            c13606oM8116d = AbstractC7854B5.m8116d(new C19819d(new Status(17, null, null, null)));
        }
        C19506i c19506i = new C19506i(c11232c, 13);
        c13606oM8116d.getClass();
        ExecutorC13605n executorC13605n = AbstractC13600i.f42962a;
        c13606oM8116d.m15128g(executorC13605n, c19506i).m15126e(executorC13605n, new C4307j(new C13628m(this, 19), 21));
    }
}
