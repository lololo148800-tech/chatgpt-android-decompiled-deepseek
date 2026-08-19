package p000;

import android.content.Context;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p117Eb.C2392v;
import p167Gb.C3032c;
import p178H.C3123P;
import p571X9.AbstractC9233X;
import p913o2.AbstractC17803d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: i */
/* JADX INFO: loaded from: classes.dex */
public final class C14886i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3123P f46369Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2392v f46370Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f46371o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f46372p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14886i(C3123P c3123p, C2392v c2392v, Context context, InterfaceC1436k interfaceC1436k, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f46369Y = c3123p;
        this.f46370Z = c2392v;
        this.f46371o0 = context;
        this.f46372p0 = interfaceC1436k;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14886i(this.f46369Y, this.f46370Z, this.f46371o0, this.f46372p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14886i c14886i = (C14886i) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14886i.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f46369Y.m3959F(this.f46370Z, AbstractC17803d.m19557d(this.f46371o0), new C3032c(this.f46372p0, 4));
        return C17296C.f55119a;
    }
}
