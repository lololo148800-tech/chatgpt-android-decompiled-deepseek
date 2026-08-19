package p789hg;

import com.google.protobuf.AbstractC12107L1;
import kg.C16411q;
import kg.C16412r;
import kg.InterfaceC16413s;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p318Mh.AbstractC5364G0;
import p553Wh.C8870f;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9268c4;
import p737f1.C13522n;
import p737f1.InterfaceC13515g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: hg.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C14509h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f45727Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f45728Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC13515g f45729o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C13522n f45730p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14509h(C8870f c8870f, InterfaceC13515g interfaceC13515g, C13522n c13522n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f45728Z = c8870f;
        this.f45729o0 = interfaceC13515g;
        this.f45730p0 = c13522n;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14509h c14509h = new C14509h(this.f45728Z, this.f45729o0, this.f45730p0, interfaceC18770c);
        c14509h.f45727Y = obj;
        return c14509h;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14509h c14509h = (C14509h) create((InterfaceC16413s) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14509h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC16413s interfaceC16413s = (InterfaceC16413s) this.f45727Y;
        if (interfaceC16413s instanceof C16411q) {
            C16411q c16411q = (C16411q) interfaceC16413s;
            boolean z6 = c16411q.f50939b;
            C8870f c8870f = this.f45728Z;
            if (z6) {
                c8870f.f27149b.m12195o();
            }
            AbstractC12107L1.m13813d(this.f45729o0);
            AbstractC5364G0.m5889d(c8870f.f27149b, c16411q.f50938a, true);
        } else if (interfaceC16413s instanceof C16412r) {
            AbstractC9268c4.m9841b(this.f45730p0);
        }
        return C17296C.f55119a;
    }
}
