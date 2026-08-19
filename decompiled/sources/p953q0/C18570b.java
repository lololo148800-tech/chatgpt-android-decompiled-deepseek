package p953q0;

import p972qm.C18778k;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18570b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C18778k f59157Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f59158Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18572c f59159o0;

    /* JADX INFO: renamed from: p0 */
    public int f59160p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18570b(C18572c c18572c, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f59159o0 = c18572c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59158Z = obj;
        this.f59160p0 |= Integer.MIN_VALUE;
        return this.f59159o0.m19944a(this);
    }
}
