package p993rj;

import mm.C17312o;
import p001A.C0042V0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rj.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19042d extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f60702Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0042V0 f60703Z;

    /* JADX INFO: renamed from: o0 */
    public int f60704o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19042d(C0042V0 c0042v0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60703Z = c0042v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60702Y = obj;
        this.f60704o0 |= Integer.MIN_VALUE;
        Object objMo224r = this.f60703Z.mo224r(this);
        return objMo224r == EnumC19250a.f61036Y ? objMo224r : new C17312o(objMo224r);
    }
}
