package p1066vk;

import kotlin.jvm.internal.C16556x;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p110E4.C2307e;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p408Qj.C6736b;
import p523V9.AbstractC8154o0;
import p571X9.AbstractC9233X;
import p928oh.C18194a;
import p931ok.AbstractC18223d;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vk.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20635c extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f65495Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0566C0 f65496Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C2307e f65497o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C6736b f65498p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20635c(C0566C0 c0566c0, C2307e c2307e, C6736b c6736b, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65496Z = c0566c0;
        this.f65497o0 = c2307e;
        this.f65498p0 = c6736b;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20635c(this.f65496Z, this.f65497o0, this.f65498p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C20635c) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f65495Y;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            this.f65496Z.mo1275e(null);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C2307e c2307e = this.f65497o0;
        this.f65495Y = 1;
        C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
        c0624m.m1262r();
        AbstractC18223d.m19732b(c2307e.m3398j().f64406h, new C18194a(new C16556x(), 24, c0624m));
        if (c0624m.m1261q() == enumC19250a) {
            return enumC19250a;
        }
        C3516e c3516e = AbstractC0593T.f1824a;
        C1451e c1451e = AbstractC2935m.f8797a;
        C20634b c20634b = new C20634b(this.f65498p0, null);
        this.f65495Y = 2;
        if (AbstractC0575H.m1168P(c1451e, c20634b, this) == enumC19250a) {
            return enumC19250a;
        }
        this.f65496Z.mo1275e(null);
        return C17296C.f55119a;
    }
}
