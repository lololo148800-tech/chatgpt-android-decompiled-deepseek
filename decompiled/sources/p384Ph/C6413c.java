package p384Ph;

import p556Wk.C8915b0;
import p959q8.C18639a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ph.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6413c extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C8915b0 f20858Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f20859Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18639a f20860o0;

    /* JADX INFO: renamed from: p0 */
    public int f20861p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6413c(C18639a c18639a, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f20860o0 = c18639a;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f20859Z = obj;
        this.f20861p0 |= Integer.MIN_VALUE;
        return this.f20860o0.m20000o(null, this);
    }
}
