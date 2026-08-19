package p969qj;

import mm.C17312o;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: qj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C18757o extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f59644Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18755m f59645Z;

    /* JADX INFO: renamed from: o0 */
    public int f59646o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18757o(C18755m c18755m, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f59645Z = c18755m;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f59644Y = obj;
        this.f59646o0 |= Integer.MIN_VALUE;
        Object objMo20046a = this.f59645Z.mo20046a(null, null, this);
        return objMo20046a == EnumC19250a.f61036Y ? objMo20046a : new C17312o(objMo20046a);
    }
}
