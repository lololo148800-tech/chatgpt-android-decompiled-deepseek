package p339Nf;

import java.util.Iterator;
import java.util.List;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p040Bd.C1075e4;
import p049Bm.InterfaceC1439n;
import p1081wc.C20903v;
import p1081wc.InterfaceC20904w;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nf.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5732n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f18607Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18608Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f18609o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ List f18610p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f18611q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ List f18612r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ InterfaceC5985X f18613s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5732n(InterfaceC20904w interfaceC20904w, String str, String str2, List list, List list2, List list3, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18607Y = interfaceC20904w;
        this.f18608Z = str;
        this.f18609o0 = str2;
        this.f18610p0 = list;
        this.f18611q0 = list2;
        this.f18612r0 = list3;
        this.f18613s0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5732n(this.f18607Y, this.f18608Z, this.f18609o0, this.f18610p0, this.f18611q0, this.f18612r0, this.f18613s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5732n c5732n = (C5732n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5732n.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        float f10 = AbstractC5741w.f18690a;
        int iOrdinal = ((EnumC5742x) this.f18613s0.getValue()).ordinal();
        String str2 = this.f18609o0;
        String str3 = this.f18608Z;
        InterfaceC20904w interfaceC20904w = this.f18607Y;
        if (iOrdinal != 0) {
            if (iOrdinal == 1 && interfaceC20904w != null) {
                C20903v c20903v = C20903v.f66628e;
                str = str3 != null ? str3 : null;
                interfaceC20904w.mo21447a(c20903v, AbstractC17659D.m19244f(new C17309l("conversationId", str != null ? str : ""), new C17309l("messageId", str2), new C17309l("num_images", new Integer(this.f18612r0.size()))));
            }
        } else if (interfaceC20904w != null) {
            C20903v c20903v2 = C20903v.f66629f;
            str = str3 != null ? str3 : null;
            C17309l c17309l = new C17309l("conversationId", str != null ? str : "");
            C17309l c17309l2 = new C17309l("messageId", str2);
            C17309l c17309l3 = new C17309l("num_links", new Integer(this.f18610p0.size()));
            Iterator it = this.f18611q0.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((C1075e4) it.next()).f2928b.size();
            }
            interfaceC20904w.mo21447a(c20903v2, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, new C17309l("num_search_results", new Integer(size))));
        }
        return C17296C.f55119a;
    }
}
