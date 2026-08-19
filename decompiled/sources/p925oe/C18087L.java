package p925oe;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: oe.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C18087L extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18089N f57703Y;

    /* JADX INFO: renamed from: Z */
    public String f57704Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f57705o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C18089N f57706p0;

    /* JADX INFO: renamed from: q0 */
    public int f57707q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18087L(C18089N c18089n, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f57706p0 = c18089n;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f57705o0 = obj;
        this.f57707q0 |= Integer.MIN_VALUE;
        return this.f57706p0.m19710a(this);
    }
}
