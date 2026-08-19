package p988rc;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2213w0;
import p204I1.C3590f;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sc.AbstractC19519a;
import sc.C19530l;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rc.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C18935w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC2213w0 f60431Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3590f f60432Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18918f f60433o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f60434p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f60435q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C18911A f60436r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18935w(InterfaceC2213w0 interfaceC2213w0, C3590f c3590f, C18918f c18918f, boolean z6, InterfaceC5985X interfaceC5985X, C18911A c18911a, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60431Y = interfaceC2213w0;
        this.f60432Z = c3590f;
        this.f60433o0 = c18918f;
        this.f60434p0 = z6;
        this.f60435q0 = interfaceC5985X;
        this.f60436r0 = c18911a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C18911A c18911a = this.f60436r0;
        return new C18935w(this.f60431Y, this.f60432Z, this.f60433o0, this.f60434p0, this.f60435q0, c18911a, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18935w c18935w = (C18935w) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18935w.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC2213w0 interfaceC2213w0 = this.f60431Y;
        C3590f c3590f = this.f60432Z;
        interfaceC2213w0.setValue(c3590f);
        C19530l c19530lM20621a = AbstractC19519a.m20621a(c3590f, this.f60433o0, !this.f60434p0);
        InterfaceC5985X interfaceC5985X = this.f60435q0;
        C19530l other = (C19530l) interfaceC5985X.getValue();
        AbstractC16544l.m18094g(other, "other");
        boolean zM18089b = AbstractC16544l.m18089b(AbstractC17680n.m19353c0(c19530lM20621a.f62042b), AbstractC17680n.m19353c0(other.f62042b));
        C17296C c17296c = C17296C.f55119a;
        if (zM18089b) {
            return c17296c;
        }
        interfaceC5985X.setValue(c19530lM20621a);
        this.f60436r0.invoke();
        return c17296c;
    }
}
