package p184H5;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: H5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3243j extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C3244k f9875Y;

    /* JADX INFO: renamed from: Z */
    public C3241h f9876Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f9877o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C3244k f9878p0;

    /* JADX INFO: renamed from: q0 */
    public int f9879q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3243j(C3244k c3244k, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f9878p0 = c3244k;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f9877o0 = obj;
        this.f9879q0 |= Integer.MIN_VALUE;
        return this.f9878p0.m4132a(this);
    }
}
