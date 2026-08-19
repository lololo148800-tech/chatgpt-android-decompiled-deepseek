package p758g0;

import com.google.protobuf.AbstractC12107L1;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: g0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13757d0 implements InterfaceC13766i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13787s0 f43421a;

    /* JADX INFO: renamed from: b */
    public final C13783q0 f43422b;

    /* JADX INFO: renamed from: c */
    public final Object f43423c;

    /* JADX INFO: renamed from: d */
    public final Object f43424d;

    /* JADX INFO: renamed from: e */
    public final AbstractC13784r f43425e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13784r f43426f;

    /* JADX INFO: renamed from: g */
    public final AbstractC13784r f43427g;

    /* JADX INFO: renamed from: h */
    public long f43428h;

    /* JADX INFO: renamed from: i */
    public AbstractC13784r f43429i;

    public C13757d0(InterfaceC13772l interfaceC13772l, C13783q0 c13783q0, Object obj, Object obj2, AbstractC13784r abstractC13784r) {
        this.f43421a = interfaceC13772l.mo15214a(c13783q0);
        this.f43422b = c13783q0;
        this.f43423c = obj2;
        this.f43424d = obj;
        this.f43425e = (AbstractC13784r) c13783q0.f43526a.invoke(obj);
        InterfaceC1436k interfaceC1436k = c13783q0.f43526a;
        this.f43426f = (AbstractC13784r) interfaceC1436k.invoke(obj2);
        this.f43427g = abstractC13784r != null ? AbstractC13758e.m15247l(abstractC13784r) : ((AbstractC13784r) interfaceC1436k.invoke(obj)).mo15285c();
        this.f43428h = -1L;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: d */
    public final boolean mo15229d() {
        return this.f43421a.mo3881d();
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: e */
    public final long mo15230e() {
        if (this.f43428h < 0) {
            this.f43428h = this.f43421a.mo3882q(this.f43425e, this.f43426f, this.f43427g);
        }
        return this.f43428h;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: f */
    public final C13783q0 mo15231f() {
        return this.f43422b;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: g */
    public final AbstractC13784r mo15232g(long j10) {
        if (!AbstractC12107L1.m13810a(this, j10)) {
            return this.f43421a.mo3877K(j10, this.f43425e, this.f43426f, this.f43427g);
        }
        AbstractC13784r abstractC13784r = this.f43429i;
        if (abstractC13784r != null) {
            return abstractC13784r;
        }
        AbstractC13784r abstractC13784rMo3883s = this.f43421a.mo3883s(this.f43425e, this.f43426f, this.f43427g);
        this.f43429i = abstractC13784rMo3883s;
        return abstractC13784rMo3883s;
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean mo15233h(long j10) {
        return AbstractC12107L1.m13810a(this, j10);
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: i */
    public final Object mo15234i(long j10) {
        if (AbstractC12107L1.m13810a(this, j10)) {
            return this.f43423c;
        }
        AbstractC13784r abstractC13784rMo3884u = this.f43421a.mo3884u(j10, this.f43425e, this.f43426f, this.f43427g);
        int iMo15284b = abstractC13784rMo3884u.mo15284b();
        for (int i10 = 0; i10 < iMo15284b; i10++) {
            if (Float.isNaN(abstractC13784rMo3884u.mo15283a(i10))) {
                throw new IllegalStateException("AnimationVector cannot contain a NaN. " + abstractC13784rMo3884u + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return this.f43422b.f43527b.invoke(abstractC13784rMo3884u);
    }

    @Override // p758g0.InterfaceC13766i
    /* JADX INFO: renamed from: j */
    public final Object mo15235j() {
        return this.f43423c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f43424d + " -> " + this.f43423c + HJrCuD.VtyQttzvClI + this.f43427g + ", duration: " + (mo15230e() / 1000000) + " ms,animationSpec: " + this.f43421a;
    }
}
