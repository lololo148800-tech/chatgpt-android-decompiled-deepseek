package p041Be;

import io.ktor.utils.p815io.InterfaceC15088n;
import p103Dn.InterfaceC2186j;
import p117Eb.C2391u;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Be.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C1247s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C2391u f3287Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC2186j f3288Z;

    /* JADX INFO: renamed from: o0 */
    public InterfaceC15088n f3289o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f3290p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2391u f3291q0;

    /* JADX INFO: renamed from: r0 */
    public int f3292r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247s(C2391u c2391u, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f3291q0 = c2391u;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f3290p0 = obj;
        this.f3292r0 |= Integer.MIN_VALUE;
        return this.f3291q0.m3509F(null, null, this);
    }
}
