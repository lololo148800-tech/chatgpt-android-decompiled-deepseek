package p1043ui;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p417R2.C6790b;
import p417R2.C6795g;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: ui.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C20296f extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f64164Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f64165Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC20298h f64166o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20296f(InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c, AbstractC20298h abstractC20298h) {
        super(2, interfaceC18770c);
        this.f64165Z = interfaceC1436k;
        this.f64166o0 = abstractC20298h;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C20296f c20296f = new C20296f(this.f64165Z, interfaceC18770c, this.f64166o0);
        c20296f.f64164Y = obj;
        return c20296f;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20296f c20296f = (C20296f) create((C6790b) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20296f.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C6790b c6790b = (C6790b) this.f64164Y;
        C6795g key = AbstractC20298h.f64170g;
        c6790b.getClass();
        AbstractC16544l.m18094g(key, "key");
        String str = (String) c6790b.f21795a.get(key);
        AbstractC20298h abstractC20298h = this.f64166o0;
        Object objMo20631a = str != null ? abstractC20298h.f64172b.mo20631a(str) : null;
        if (objMo20631a == null) {
            objMo20631a = abstractC20298h.f64173c;
        }
        Object objInvoke = this.f64165Z.invoke(objMo20631a);
        if (objInvoke != null) {
            c6790b.m7234b(key, abstractC20298h.f64172b.toString(objInvoke));
        }
        return C17296C.f55119a;
    }
}
