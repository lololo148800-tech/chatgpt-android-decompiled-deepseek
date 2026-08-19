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

/* JADX INFO: renamed from: rc.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C18937y extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18918f f60442Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC5985X f60443Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18911A f60444o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f60445p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18937y(C18918f c18918f, InterfaceC5985X interfaceC5985X, C18911A c18911a, InterfaceC5985X interfaceC5985X2, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60442Y = c18918f;
        this.f60443Z = interfaceC5985X;
        this.f60444o0 = c18911a;
        this.f60445p0 = interfaceC5985X2;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18937y(this.f60442Y, this.f60443Z, this.f60444o0, this.f60445p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18937y c18937y = (C18937y) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18937y.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC5985X interfaceC5985X = this.f60445p0;
        int length = ((C3590f) interfaceC5985X.getValue()).f10934Y.length();
        C17296C c17296c = C17296C.f55119a;
        if (length == 0) {
            return c17296c;
        }
        C19530l c19530lM20621a = AbstractC19519a.m20621a((C3590f) interfaceC5985X.getValue(), this.f60442Y, true);
        InterfaceC5985X interfaceC5985X2 = this.f60443Z;
        if (!c19530lM20621a.equals(interfaceC5985X2.getValue())) {
            interfaceC5985X2.setValue(c19530lM20621a);
            this.f60444o0.invoke();
        }
        return c17296c;
    }
}
