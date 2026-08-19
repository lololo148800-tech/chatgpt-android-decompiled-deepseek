package p993rj;

import java.io.Serializable;
import mm.C17312o;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: rj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C19023C extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f60610Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19024D f60611Z;

    /* JADX INFO: renamed from: o0 */
    public int f60612o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19023C(C19024D c19024d, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f60611Z = c19024d;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f60610Y = obj;
        this.f60612o0 |= Integer.MIN_VALUE;
        Serializable serializableM20284f = this.f60611Z.m20284f(this);
        return serializableM20284f == EnumC19250a.f61036Y ? serializableM20284f : new C17312o(serializableM20284f);
    }
}
