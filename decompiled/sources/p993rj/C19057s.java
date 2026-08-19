package p993rj;

import mm.C17312o;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C19057s extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f60722Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19024D f60723Z;

    /* JADX INFO: renamed from: o0 */
    public int f60724o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19057s(C19024D c19024d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60723Z = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60722Y = obj;
        this.f60724o0 |= Integer.MIN_VALUE;
        Object objM20281c = this.f60723Z.m20281c(this);
        return objM20281c == EnumC19250a.f61036Y ? objM20281c : new C17312o(objM20281c);
    }
}
