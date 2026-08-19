package p988rc;

import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p204I1.C3590f;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sc.AbstractC19519a;
import sc.C19530l;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rc.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C18936x extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f60437Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3590f f60438Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18918f f60439o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f60440p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C18911A f60441q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18936x(boolean z6, C3590f c3590f, C18918f c18918f, InterfaceC5985X interfaceC5985X, C18911A c18911a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60437Y = z6;
        this.f60438Z = c3590f;
        this.f60439o0 = c18918f;
        this.f60440p0 = interfaceC5985X;
        this.f60441q0 = c18911a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18911A c18911a = this.f60441q0;
        return new C18936x(this.f60437Y, this.f60438Z, this.f60439o0, this.f60440p0, c18911a, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18936x c18936x = (C18936x) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18936x.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C17296C c17296c = C17296C.f55119a;
        if (this.f60437Y) {
            return c17296c;
        }
        C19530l c19530lM20621a = AbstractC19519a.m20621a(this.f60438Z, this.f60439o0, true);
        InterfaceC5985X interfaceC5985X = this.f60440p0;
        if (!c19530lM20621a.equals(interfaceC5985X.getValue())) {
            interfaceC5985X.setValue(c19530lM20621a);
            this.f60441q0.invoke();
        }
        return c17296c;
    }
}
