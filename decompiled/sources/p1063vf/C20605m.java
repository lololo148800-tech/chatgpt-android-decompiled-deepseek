package p1063vf;

import java.util.Map;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C20605m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f65382Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f65383Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20605m(String str, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65383Z = str;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20605m c20605m = new C20605m(this.f65383Z, interfaceC18770c);
        c20605m.f65382Y = obj;
        return c20605m;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20605m) create((Map) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        return Boolean.valueOf(((Map) this.f65382Y).containsKey(this.f65383Z));
    }
}
