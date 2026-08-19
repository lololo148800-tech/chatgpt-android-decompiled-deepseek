package p949pj;

import mm.C17312o;
import p521V6.C7805H;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: pj.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C18432E extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f58800Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C7805H f58801Z;

    /* JADX INFO: renamed from: o0 */
    public int f58802o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18432E(C7805H c7805h, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58801Z = c7805h;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58800Y = obj;
        this.f58802o0 |= Integer.MIN_VALUE;
        Object objMo217k = this.f58801Z.mo217k(this);
        return objMo217k == EnumC19250a.f61036Y ? objMo217k : new C17312o(objMo217k);
    }
}
