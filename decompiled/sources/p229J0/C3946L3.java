package p229J0;

import p275Kn.InterfaceC4814a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: J0.L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C3946L3 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3952M3 f12177Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC4006X3 f12178Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC4814a f12179o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f12180p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3952M3 f12181q0;

    /* JADX INFO: renamed from: r0 */
    public int f12182r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3946L3(C3952M3 c3952m3, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f12181q0 = c3952m3;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f12180p0 = obj;
        this.f12182r0 |= Integer.MIN_VALUE;
        return this.f12181q0.m4658a(null, this);
    }
}
