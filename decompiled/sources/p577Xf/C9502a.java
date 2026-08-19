package p577Xf;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: Xf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9502a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C9504c f28609Y;

    /* JADX INFO: renamed from: Z */
    public boolean f28610Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f28611o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9504c f28612p0;

    /* JADX INFO: renamed from: q0 */
    public int f28613q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9502a(C9504c c9504c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f28612p0 = c9504c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f28611o0 = obj;
        this.f28613q0 |= Integer.MIN_VALUE;
        return this.f28612p0.m10024a(false, this);
    }
}
