package p900n6;

import p658b5.C11241l;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: n6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C17504a extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f55984Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11241l f55985Z;

    /* JADX INFO: renamed from: o0 */
    public int f55986o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17504a(C11241l c11241l, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f55985Z = c11241l;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f55984Y = obj;
        this.f55986o0 |= Integer.MIN_VALUE;
        return this.f55985Z.m12591L(null, this);
    }
}
