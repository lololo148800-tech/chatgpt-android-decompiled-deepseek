package p033B5;

import p374P5.C6354g;
import p374P5.InterfaceC6362o;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: B5.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0838v extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C0840x f2328Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC6362o f2329Z;

    /* JADX INFO: renamed from: o0 */
    public C6354g f2330o0;

    /* JADX INFO: renamed from: p0 */
    public C0825i f2331p0;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC0829m f2332q0;

    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ Object f2333r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C0840x f2334s0;

    /* JADX INFO: renamed from: t0 */
    public int f2335t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0838v(C0840x c0840x, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f2334s0 = c0840x;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f2333r0 = obj;
        this.f2335t0 |= Integer.MIN_VALUE;
        return this.f2334s0.m1897a(null, 0, this);
    }
}
