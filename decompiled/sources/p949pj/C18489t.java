package p949pj;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p536W.C8408d;
import p571X9.AbstractC9233X;
import p594Y9.AbstractC9900h3;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: pj.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C18489t extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Context f58937Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18489t(Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f58937Y = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18489t(this.f58937Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C18489t) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C8408d c8408d = C8408d.f26139g;
        return AbstractC9900h3.m10565b(this.f58937Y);
    }
}
