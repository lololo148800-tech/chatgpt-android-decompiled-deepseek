package p486Tl;

import java.util.ArrayList;
import java.util.List;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p275Kn.C4816c;
import p533Vl.AbstractC8394f;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Tl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C7505d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C4816c f23817Y;

    /* JADX INFO: renamed from: Z */
    public C2392v f23818Z;

    /* JADX INFO: renamed from: o0 */
    public AbstractC8394f f23819o0;

    /* JADX INFO: renamed from: p0 */
    public int f23820p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C2392v f23821q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ AbstractC8394f f23822r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7505d(C2392v c2392v, AbstractC8394f abstractC8394f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f23821q0 = c2392v;
        this.f23822r0 = abstractC8394f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C7505d(this.f23821q0, this.f23822r0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7505d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2392v c2392v;
        C4816c c4816c;
        AbstractC8394f abstractC8394f;
        List listM19322C0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f23820p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            c2392v = this.f23821q0;
            C4816c c4816c2 = (C4816c) c2392v.f7436Z;
            this.f23817Y = c4816c2;
            this.f23818Z = c2392v;
            AbstractC8394f abstractC8394f2 = this.f23822r0;
            this.f23819o0 = abstractC8394f2;
            this.f23820p0 = 1;
            if (c4816c2.m5448e(null, this) == enumC19250a) {
                return enumC19250a;
            }
            c4816c = c4816c2;
            abstractC8394f = abstractC8394f2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(QzvfuIgrngtl.KxMyVGyWPcvmsYw);
            }
            abstractC8394f = this.f23819o0;
            c2392v = this.f23818Z;
            c4816c = this.f23817Y;
            AbstractC9233X.m9807c(obj);
        }
        try {
            c2392v.f7439q0 = abstractC8394f;
            if (abstractC8394f != null) {
                ArrayList arrayList = (ArrayList) c2392v.f7440r0;
                listM19322C0 = AbstractC17680n.m19322C0(arrayList);
                arrayList.clear();
            } else {
                listM19322C0 = null;
            }
            return listM19322C0;
        } finally {
            c4816c.m5450g(null);
        }
    }
}
