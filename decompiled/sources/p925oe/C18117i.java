package p925oe;

import java.util.Map;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.C22011h0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: oe.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C18117i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f57792Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f57793Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18117i(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f57793Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18117i c18117i = new C18117i(this.f57793Z, interfaceC18770c);
        c18117i.f57792Y = obj;
        return c18117i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18117i) create((Map) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((Map) this.f57792Y).get(new C22011h0(this.f57793Z)) != null);
    }
}
