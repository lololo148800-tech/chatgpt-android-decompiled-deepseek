package p1063vf;

import android.net.Uri;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20600h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C20603k f65360Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Uri f65361Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f65362o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20600h(C20603k c20603k, Uri uri, boolean z6, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65360Y = c20603k;
        this.f65361Z = uri;
        this.f65362o0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20600h(this.f65360Y, this.f65361Z, this.f65362o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20600h c20600h = (C20600h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20600h.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f65360Y.m21194b(this.f65362o0, this.f65361Z);
        return C17296C.f55119a;
    }
}
