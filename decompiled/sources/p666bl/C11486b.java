package p666bl;

import sm.AbstractC19687c;

/* JADX INFO: renamed from: bl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11486b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11488d f34756Y;

    /* JADX INFO: renamed from: Z */
    public String f34757Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34758o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11488d f34759p0;

    /* JADX INFO: renamed from: q0 */
    public int f34760q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11486b(C11488d c11488d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34759p0 = c11488d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34758o0 = obj;
        this.f34760q0 |= Integer.MIN_VALUE;
        return this.f34759p0.m12891d(null, this);
    }
}
