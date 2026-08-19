package p414R;

import java.util.Map;
import p001A.C0083q0;
import p004A2.InterfaceC0310a;
import p147Fh.RunnableC2748e;
import p178H.AbstractC3166q0;
import p178H.C3151j;
import p253K.AbstractC4503n;
import p465T.C7166b;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;
import p610Z1.C10142i;

/* JADX INFO: renamed from: R.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6781o implements InterfaceC0310a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f21789b;

    public /* synthetic */ C6781o(Object obj, int i10) {
        this.f21788a = i10;
        this.f21789b = obj;
    }

    @Override // p004A2.InterfaceC0310a
    public final void accept(Object obj) {
        switch (this.f21788a) {
            case 0:
                C3151j c3151j = (C3151j) obj;
                for (Map.Entry entry : ((Map) this.f21789b).entrySet()) {
                    int i10 = c3151j.f9483b - ((C7166b) entry.getKey()).f22779f;
                    if (((C7166b) entry.getKey()).f22780g) {
                        i10 = -i10;
                    }
                    int iM5251g = AbstractC4503n.m5251g(i10);
                    C6778l c6778l = (C6778l) entry.getValue();
                    c6778l.getClass();
                    AbstractC8488H2.m9142c(new RunnableC2748e(c6778l, iM5251g, -1, 2));
                }
                break;
            case 1:
                AbstractC8072d6.m8486c("SurfaceViewImpl", "Safe to release surface.");
                C0083q0 c0083q0 = (C0083q0) this.f21789b;
                if (c0083q0 != null) {
                    c0083q0.m271f();
                }
                break;
            default:
                ((C10142i) this.f21789b).m10747a((AbstractC3166q0) obj);
                break;
        }
    }
}
