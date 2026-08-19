package p001A;

import java.util.List;
import java.util.Map;
import p117Eb.C2392v;
import p228J.C3836g;
import p228J.C3865u0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3870x;
import p414R.C6778l;

/* JADX INFO: renamed from: A.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0096x implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f412Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f413Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f414o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f415p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f416q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f417r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f418s0;

    public /* synthetic */ RunnableC0096x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f412Y = i10;
        this.f413Z = obj;
        this.f414o0 = obj2;
        this.f415p0 = obj3;
        this.f416q0 = obj4;
        this.f417r0 = obj5;
        this.f418s0 = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f412Y) {
            case 0:
                C0018J c0018j = (C0018J) this.f413Z;
                String str = (String) this.f414o0;
                C3865u0 c3865u0 = (C3865u0) this.f415p0;
                InterfaceC3800E0 interfaceC3800E0 = (InterfaceC3800E0) this.f416q0;
                C3836g c3836g = (C3836g) this.f417r0;
                List list = (List) this.f418s0;
                c0018j.getClass();
                c0018j.m126v("Use case " + str + " RESET", null);
                c0018j.f90Y.m21921B(str, c3865u0, interfaceC3800E0, c3836g, list);
                c0018j.m117m();
                c0018j.m96F();
                c0018j.m103M();
                if (c0018j.f89T0 == 9) {
                    c0018j.m94D();
                }
                break;
            default:
                ((C2392v) this.f413Z).m3559p((InterfaceC3870x) this.f414o0, (InterfaceC3870x) this.f415p0, (C6778l) this.f416q0, (C6778l) this.f417r0, (Map.Entry) this.f418s0);
                break;
        }
    }
}
