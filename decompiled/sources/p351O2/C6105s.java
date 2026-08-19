package p351O2;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: O2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C6105s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f19852Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC6085H f19853Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6105s(AbstractC6085H abstractC6085H, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f19853Z = abstractC6085H;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C6105s c6105s = new C6105s(this.f19853Z, interfaceC18770c);
        c6105s.f19852Y = obj;
        return c6105s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6105s) create((AbstractC6085H) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC6085H abstractC6085H = (AbstractC6085H) this.f19852Y;
        AbstractC6085H abstractC6085H2 = this.f19853Z;
        boolean z6 = false;
        if (!(abstractC6085H2 instanceof C6089c) && !(abstractC6085H2 instanceof C6095i) && abstractC6085H == abstractC6085H2) {
            z6 = true;
        }
        return Boolean.valueOf(z6);
    }
}
