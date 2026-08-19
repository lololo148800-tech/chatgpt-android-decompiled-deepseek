package p040Bd;

import gd.C13911Z;
import gd.C13940g1;
import gd.C13942h;
import gd.C13969n2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.List;
import mm.C17296C;
import p025An.AbstractC0593T;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.C17691y;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Bd.S1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0996S1 implements InterfaceC18419b {

    /* JADX INFO: renamed from: o0 */
    public static Object f2788o0 = C17691y.f56482Y;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13849E f2789Y;

    /* JADX INFO: renamed from: Z */
    public final C13969n2 f2790Z;

    public C0996S1(InterfaceC13849E interfaceC13849E, C13969n2 c13969n2) {
        this.f2789Y = interfaceC13849E;
        this.f2790Z = c13969n2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.Set] */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C0990R1 c0990r1;
        if (interfaceC18770c instanceof C0990R1) {
            c0990r1 = (C0990R1) interfaceC18770c;
            int i10 = c0990r1.f2776o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0990r1.f2776o0 = i10 - Integer.MIN_VALUE;
            } else {
                c0990r1 = new C0990R1(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c0990r1 = new C0990R1(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM15478b = c0990r1.f2774Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0990r1.f2776o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM15478b);
            C13940g1 c13940g1 = C13940g1.f43990c;
            C14005w2 c14005w2 = (C14005w2) this.f2789Y;
            if (!c14005w2.m15481a(c13940g1)) {
                f2788o0 = AbstractC17665J.m19267g(f2788o0, "navigation");
            }
            if (!c14005w2.m15481a(C13911Z.f43960c)) {
                f2788o0 = AbstractC17665J.m19267g(f2788o0, "businesses_map");
            }
            C13942h c13942h = C13942h.f43992d;
            c0990r1.f2776o0 = 1;
            objM15478b = this.f2790Z.m15478b(c13942h, c0990r1);
            if (objM15478b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM15478b);
        }
        f2788o0 = AbstractC17665J.m19266f(f2788o0, AbstractC17680n.m19328G0((List) objM15478b));
        return C17296C.f55119a;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }
}
