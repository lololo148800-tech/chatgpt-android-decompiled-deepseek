package p787he;

import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p403Qd.AbstractC6601G;
import p403Qd.AbstractC6661w;
import p403Qd.C6597C;
import p403Qd.C6600F;
import p403Qd.C6656s;
import p403Qd.C6664z;
import p479Td.AbstractC7343b0;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: he.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14470a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45585Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C14459O f45586Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14470a(C14459O c14459o, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45586Z = c14459o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14470a c14470a = new C14470a(this.f45586Z, interfaceC18770c);
        c14470a.f45585Y = obj;
        return c14470a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14470a c14470a = (C14470a) create((List) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14470a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        List<AbstractC6601G> list = (List) this.f45585Y;
        C14459O c14459o = this.f45586Z;
        c14459o.getClass();
        for (AbstractC6601G abstractC6601G : list) {
            if (!(abstractC6601G instanceof C6664z) && !(abstractC6601G instanceof C6656s)) {
                if (abstractC6601G instanceof C6597C) {
                    c14459o.m15983l(((C6597C) abstractC6601G).f21307c.f23291f);
                } else if (abstractC6601G instanceof C6600F) {
                    C6600F c6600f = (C6600F) abstractC6601G;
                    AbstractC7343b0 abstractC7343b0 = c6600f.f21313e;
                    if (abstractC7343b0 != null) {
                        c14459o.m15983l(abstractC7343b0);
                    }
                    Iterator it = c6600f.f21312d.iterator();
                    while (it.hasNext()) {
                        c14459o.m15983l(((C7351f0) it.next()).f23291f);
                    }
                } else {
                    boolean z6 = abstractC6601G instanceof AbstractC6661w;
                }
            }
        }
        return C17296C.f55119a;
    }
}
