package p339Nf;

import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1081wc.C20903v;
import p1081wc.InterfaceC20904w;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Nf.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C5729k extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC20904w f18582Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f18583Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f18584o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f18585p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ String f18586q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ String f18587r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C5721c f18588s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5729k(InterfaceC20904w interfaceC20904w, String str, String str2, String str3, String str4, String str5, C5721c c5721c, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18582Y = interfaceC20904w;
        this.f18583Z = str;
        this.f18584o0 = str2;
        this.f18585p0 = str3;
        this.f18586q0 = str4;
        this.f18587r0 = str5;
        this.f18588s0 = c5721c;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5729k(this.f18582Y, this.f18583Z, this.f18584o0, this.f18585p0, this.f18586q0, this.f18587r0, this.f18588s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5729k c5729k = (C5729k) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5729k.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C20903v c20903v = C20903v.f66632i;
        String str = this.f18583Z;
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C17309l c17309l = new C17309l("conversationId", str);
        C17309l c17309l2 = new C17309l("messageId", this.f18584o0);
        C17309l c17309l3 = new C17309l("url", this.f18585p0);
        String str2 = this.f18586q0;
        C17309l c17309l4 = new C17309l(UiComponentConfig.Title.type, str2 != null ? str2 : "");
        C17309l c17309l5 = new C17309l("domain", this.f18587r0);
        C5721c c5721c = this.f18588s0;
        this.f18582Y.mo21447a(c20903v, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, new C17309l("type", c5721c.f18530a), new C17309l("section_index", new Integer(c5721c.f18531b)), new C17309l("global_index", new Integer(c5721c.f18532c))));
        return C17296C.f55119a;
    }
}
