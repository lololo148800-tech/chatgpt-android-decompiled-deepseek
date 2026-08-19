package ie;

import java.io.IOException;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p593Y8.C9683j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ie.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C14972a extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C14975d f46626Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9683j f46627Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14972a(C14975d c14975d, C9683j c9683j, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f46626Y = c14975d;
        this.f46627Z = c9683j;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new C14972a(this.f46626Y, this.f46627Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) throws IOException {
        C14972a c14972a = (C14972a) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        c14972a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws IOException {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C14975d c14975d = this.f46626Y;
        AbstractC8160o6.m8726a(c14975d.f46631b, "Closing database " + ((String) c14975d.f46632c.getValue()), null, 6);
        this.f46627Z.close();
        return C17296C.f55119a;
    }
}
