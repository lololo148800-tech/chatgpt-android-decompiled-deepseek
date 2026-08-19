package p339Nf;

import java.util.List;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20903v;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p582Xk.HXHG.bQBnquXS;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nf.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C5725g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f18545Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18546Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f18547o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f18548p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ List f18549q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f18550r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ String f18551s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5725g(InterfaceC20904w interfaceC20904w, String str, String str2, int i10, List list, String str3, String str4, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18545Y = interfaceC20904w;
        this.f18546Z = str;
        this.f18547o0 = str2;
        this.f18548p0 = i10;
        this.f18549q0 = list;
        this.f18550r0 = str3;
        this.f18551s0 = str4;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5725g(this.f18545Y, this.f18546Z, this.f18547o0, this.f18548p0, this.f18549q0, this.f18550r0, this.f18551s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5725g c5725g = (C5725g) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5725g.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC20904w interfaceC20904w = this.f18545Y;
        if (interfaceC20904w != null) {
            C20903v c20903v = C20903v.f66631h;
            String str = this.f18546Z;
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            C17309l c17309l = new C17309l("conversationId", str);
            C17309l c17309l2 = new C17309l("messageId", this.f18547o0);
            C17309l c17309l3 = new C17309l("index", new Integer(this.f18548p0));
            C17309l c17309l4 = new C17309l("num_images", new Integer(this.f18549q0.size()));
            C17309l c17309l5 = new C17309l("url", this.f18550r0);
            String str2 = this.f18551s0;
            interfaceC20904w.mo21447a(c20903v, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, new C17309l(bQBnquXS.fnhFD, str2 != null ? str2 : "")));
        }
        return C17296C.f55119a;
    }
}
