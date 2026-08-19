package fk;

import java.io.File;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1112xm.AbstractC21304h;
import p1113xn.C21307a;
import p571X9.AbstractC9233X;
import p749fd.C13628m;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: fk.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13683d extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13684e f43178Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13683d(C13684e c13684e, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        EnumC13681b[] enumC13681bArr = EnumC13681b.f43176Y;
        this.f43178Y = c13684e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        EnumC13681b[] enumC13681bArr = EnumC13681b.f43176Y;
        return new C13683d(this.f43178Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C13683d) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C13684e c13684e = this.f43178Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        try {
            if (!c13684e.f43179a.exists()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            File file = c13684e.f43179a;
            EnumC13681b[] enumC13681bArr = EnumC13681b.f43176Y;
            AbstractC21304h.m21641d(file, C21307a.f67720a, new C13628m(sb2));
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
