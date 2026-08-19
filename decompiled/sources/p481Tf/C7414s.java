package p481Tf;

import p1155zi.C21952P1;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Tf.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C7414s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C7415t f23486Y;

    /* JADX INFO: renamed from: Z */
    public C21952P1 f23487Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f23488o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C7415t f23489p0;

    /* JADX INFO: renamed from: q0 */
    public int f23490q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7414s(C7415t c7415t, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f23489p0 = c7415t;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f23488o0 = obj;
        this.f23490q0 |= Integer.MIN_VALUE;
        return this.f23489p0.m7800d(this);
    }
}
