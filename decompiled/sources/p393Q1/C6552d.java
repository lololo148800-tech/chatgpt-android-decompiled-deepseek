package p393Q1;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p029B0.C0714a;
import p029B0.C0715b;
import p049Bm.InterfaceC1426a;
import p1116y0.C21358g;
import p1139z0.C21585H;
import p1140z1.AbstractC21669O;
import p1140z1.C21665K;
import p774h1.AbstractC14337O;
import p774h1.AbstractC14360p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Q1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6552d extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21209Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f21210Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f21211o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6552d(Object obj, long j10, int i10) {
        super(0);
        this.f21209Y = i10;
        this.f21211o0 = obj;
        this.f21210Z = j10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f21209Y) {
            case 0:
                return ((AbstractC14337O) ((AbstractC14360p) this.f21211o0)).mo14804b(this.f21210Z);
            case 1:
                C17689w c17689w = C17689w.f56480Y;
                return new C21358g((String) this.f21211o0, this.f21210Z, new C21585H((C0714a) null, new C0715b(c17689w, c17689w, 100)));
            default:
                AbstractC21669O abstractC21669OMo22157H0 = ((C21665K) this.f21211o0).m22107a().mo22157H0();
                AbstractC16544l.m18091d(abstractC21669OMo22157H0);
                abstractC21669OMo22157H0.mo21533p(this.f21210Z);
                return C17296C.f55119a;
        }
    }
}
