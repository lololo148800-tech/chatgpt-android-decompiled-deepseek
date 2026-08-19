package p414R;

import p221Ii.RunnableC3724c;
import p301M.RunnableC5227i;
import p610Z1.C10142i;
import p610Z1.InterfaceC10143j;

/* JADX INFO: renamed from: R.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6769c implements InterfaceC10143j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21716Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f21717Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f21718o0;

    public /* synthetic */ C6769c(Object obj, int i10, int i11) {
        this.f21718o0 = obj;
        this.f21716Y = i10;
        this.f21717Z = i11;
    }

    @Override // p610Z1.InterfaceC10143j
    /* JADX INFO: renamed from: b */
    public Object mo169b(C10142i c10142i) {
        C6771e c6771e = (C6771e) this.f21718o0;
        c6771e.getClass();
        c6771e.m7204d(new RunnableC3724c(c6771e, 11, new C6767a(this.f21716Y, this.f21717Z, c10142i)), new RunnableC5227i(c10142i, 1));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
