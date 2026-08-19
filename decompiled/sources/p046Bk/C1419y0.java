package p046Bk;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1014t1.AbstractC19736m;
import p1014t1.C19738o;
import p586Y0.AbstractC9556h;
import p586Y0.AbstractC9562n;
import p586Y0.C9560l;
import p758g0.AbstractC13785r0;
import p758g0.C13755c0;
import p758g0.C13770k;
import p758g0.C13783q0;
import p759g1.C13800b;
import p994rk.InterfaceC19201o2;

/* JADX INFO: renamed from: Bk.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1419y0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3798Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC16546n f3799Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1419y0(int i10, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f3798Y = i10;
        switch (i10) {
            case 1:
                this.f3799Z = (AbstractC16546n) interfaceC1436k;
                super(1);
                break;
            case 2:
                this.f3799Z = (AbstractC16546n) interfaceC1436k;
                super(1);
                break;
            case 3:
            default:
                this.f3799Z = (AbstractC16546n) interfaceC1436k;
                break;
            case 4:
                this.f3799Z = (AbstractC16546n) interfaceC1436k;
                super(1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r0v6, types: [Bm.k, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Bm.n, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Bm.n, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f3798Y) {
            case 0:
                InterfaceC19201o2 it = (InterfaceC19201o2) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f3799Z.invoke(it);
                return C17296C.f55119a;
            case 1:
                return this.f3799Z.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 2:
                AbstractC9556h abstractC9556h = (AbstractC9556h) this.f3799Z.invoke((C9560l) obj);
                synchronized (AbstractC9562n.f28759b) {
                    AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10076q(abstractC9556h.mo10044d());
                }
                return abstractC9556h;
            case 3:
                C13770k c13770k = (C13770k) obj;
                Object value = c13770k.f43484e.getValue();
                C13783q0 c13783q0 = AbstractC13785r0.f43528a;
                this.f3799Z.invoke(value, C13755c0.f43402u0.invoke(c13770k.f43485f));
                return C17296C.f55119a;
            case 4:
                return this.f3799Z.invoke(Long.valueOf(((Number) obj).longValue()));
            default:
                C19738o c19738o = (C19738o) obj;
                this.f3799Z.invoke(c19738o, Float.valueOf(C13800b.m15306g(AbstractC19736m.m20687i(c19738o, false))));
                c19738o.m20691a();
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1419y0(InterfaceC1439n interfaceC1439n, int i10) {
        super(1);
        this.f3798Y = i10;
        switch (i10) {
            case 5:
                this.f3799Z = (AbstractC16546n) interfaceC1439n;
                super(1);
                break;
            default:
                C13783q0 c13783q0 = AbstractC13785r0.f43528a;
                this.f3799Z = (AbstractC16546n) interfaceC1439n;
                break;
        }
    }
}
