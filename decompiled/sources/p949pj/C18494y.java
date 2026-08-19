package p949pj;

import mm.C17312o;
import p784hb.C14438g;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: pj.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C18494y extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f58951Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14438g f58952Z;

    /* JADX INFO: renamed from: o0 */
    public int f58953o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18494y(C14438g c14438g, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f58952Z = c14438g;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f58951Y = obj;
        this.f58953o0 |= Integer.MIN_VALUE;
        Object objM15968i = this.f58952Z.m15968i(null, this);
        return objM15968i == EnumC19250a.f61036Y ? objM15968i : new C17312o(objM15968i);
    }
}
