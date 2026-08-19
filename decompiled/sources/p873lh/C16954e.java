package p873lh;

import p172Gi.C3067I;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: lh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C16954e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public Object f54413Y;

    /* JADX INFO: renamed from: Z */
    public C3067I f54414Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f54415o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C16961l f54416p0;

    /* JADX INFO: renamed from: q0 */
    public int f54417q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16954e(C16961l c16961l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f54416p0 = c16961l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f54415o0 = obj;
        this.f54417q0 |= Integer.MIN_VALUE;
        return this.f54416p0.m18594e(this);
    }
}
