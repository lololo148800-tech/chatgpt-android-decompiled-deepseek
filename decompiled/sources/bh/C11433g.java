package bh;

import p1155zi.C21957R1;
import p318Mh.EnumC5424s0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C11433g extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public C11434h f34542Y;

    /* JADX INFO: renamed from: Z */
    public EnumC5424s0 f34543Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f34544o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C11434h f34545p0;

    /* JADX INFO: renamed from: q0 */
    public int f34546q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11433g(C11434h c11434h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f34545p0 = c11434h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f34544o0 = obj;
        this.f34546q0 |= Integer.MIN_VALUE;
        Object objM12798c = this.f34545p0.m12798c(null, this);
        return objM12798c == EnumC19250a.f61036Y ? objM12798c : new C21957R1((String) objM12798c);
    }
}
