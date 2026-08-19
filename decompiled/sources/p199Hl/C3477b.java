package p199Hl;

import java.util.Iterator;
import p658b5.C11248s;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Hl.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3477b extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11248s f10542Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f10543Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f10544o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11248s f10545p0;

    /* JADX INFO: renamed from: q0 */
    public int f10546q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3477b(C11248s c11248s, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f10545p0 = c11248s;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f10544o0 = obj;
        this.f10546q0 |= Integer.MIN_VALUE;
        return this.f10545p0.m12671t(null, this);
    }
}
