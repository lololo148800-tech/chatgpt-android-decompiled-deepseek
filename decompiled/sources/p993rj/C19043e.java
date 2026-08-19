package p993rj;

import mm.C17312o;
import p001A.C0042V0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C19043e extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f60705Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0042V0 f60706Z;

    /* JADX INFO: renamed from: o0 */
    public int f60707o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19043e(C0042V0 c0042v0, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60706Z = c0042v0;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60705Y = obj;
        this.f60707o0 |= Integer.MIN_VALUE;
        Object objMo217k = this.f60706Z.mo217k(this);
        return objMo217k == EnumC19250a.f61036Y ? objMo217k : new C17312o(objMo217k);
    }
}
