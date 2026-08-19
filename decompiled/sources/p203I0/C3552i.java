package p203I0;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: I0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3552i extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3559p f10763Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10764Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3559p f10765o0;

    /* JADX INFO: renamed from: p0 */
    public int f10766p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3552i(C3559p c3559p, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f10765o0 = c3559p;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10764Z = obj;
        this.f10766p0 |= Integer.MIN_VALUE;
        return this.f10765o0.m4233a(this);
    }
}
