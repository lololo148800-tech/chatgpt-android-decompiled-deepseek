package bh;

import android.app.Activity;
import ch.C11757k;
import com.revenuecat.purchases.Purchases;
import gd.InterfaceC13849E;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import ni.C17627a;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2149O0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21913F1;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.C21952P1;
import p1155zi.EnumC22080y1;
import p201Hn.C3516e;
import p437Rn.C6949g;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p624Zg.C10346P;
import p624Zg.C10365e0;
import p624Zg.C10385q;
import p624Zg.InterfaceC10333C;
import p624Zg.InterfaceC10334D;
import p624Zg.InterfaceC10347Q;
import p708dh.C13158l;
import p948pi.C18418a;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: bh.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C11431e implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC10334D f34530Y;

    /* JADX INFO: renamed from: Z */
    public final C18418a f34531Z;

    /* JADX INFO: renamed from: o0 */
    public final C13158l f34532o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC13849E f34533p0;

    /* JADX INFO: renamed from: q0 */
    public final C17627a f34534q0;

    /* JADX INFO: renamed from: r0 */
    public final C2153Q0 f34535r0;

    /* JADX INFO: renamed from: s0 */
    public final C2153Q0 f34536s0;

    /* JADX INFO: renamed from: t0 */
    public final C2153Q0 f34537t0;

    public C11431e(InterfaceC10334D interfaceC10334D, C18418a c18418a, C13158l c13158l, InterfaceC13849E interfaceC13849E, C17627a c17627a) {
        this.f34530Y = interfaceC10334D;
        this.f34531Z = c18418a;
        this.f34532o0 = c13158l;
        this.f34533p0 = interfaceC13849E;
        this.f34534q0 = c17627a;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C10365e0());
        this.f34535r0 = c2153q0M3204c;
        this.f34536s0 = c2153q0M3204c;
        this.f34537t0 = AbstractC2124C.m3204c(C21917G1.f69468a);
        AbstractC2124C.m3226y(new C1970n((InterfaceC2149O0) AbstractC9227W.m9800c(new C6949g(this, 25)).getValue(), 5, new C11427a(this, null)), c17627a);
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        String strM22322a = this.f34531Z.f58774b.m22322a();
        C11757k c11757k = (C11757k) this.f34530Y;
        if (strM22322a != null) {
            Purchases.Companion companion = Purchases.INSTANCE;
            companion.configureInCustomEntitlementsComputationMode(c11757k.f35648a, "goog_DPguJtknNxbQBStStwhWGRsghUw", strM22322a);
            companion.getSharedInstance().setUpdatedCustomerInfoListener(c11757k.f35652e);
            C10385q c10385q = new C10385q(strM22322a, 6);
            C2153Q0 c2153q0 = c11757k.f35654g;
            c2153q0.getClass();
            c2153q0.m3251l(null, c10385q);
            Boolean bool = Boolean.TRUE;
            C2153Q0 c2153q1 = c11757k.f35653f;
            c2153q1.getClass();
            c2153q1.m3251l(null, bool);
        }
        return C17296C.f55119a;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m12794c(EnumC22080y1 enumC22080y1, AbstractC19687c abstractC19687c) {
        C11428b c11428b;
        C11431e c11431e;
        if (abstractC19687c instanceof C11428b) {
            c11428b = (C11428b) abstractC19687c;
            int i10 = c11428b.f34522p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11428b.f34522p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11428b = new C11428b(this, abstractC19687c);
            }
        } else {
            c11428b = new C11428b(this, abstractC19687c);
        }
        Object objM13051b = c11428b.f34520Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11428b.f34522p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13051b);
            C21917G1 c21917g1 = C21917G1.f69468a;
            C2153Q0 c2153q0 = this.f34537t0;
            c2153q0.getClass();
            c2153q0.m3251l(null, c21917g1);
            c11428b.f34519Y = this;
            c11428b.f34522p0 = 1;
            objM13051b = ((C11757k) this.f34530Y).m13051b(enumC22080y1, c11428b);
            if (objM13051b == enumC19250a) {
                return enumC19250a;
            }
            c11431e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11431e = c11428b.f34519Y;
            AbstractC9233X.m9807c(objM13051b);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM13051b;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 error = (AbstractC21933K1) abstractC21955Q1;
            C2153Q0 c2153q1 = c11431e.f34537t0;
            AbstractC16544l.m18094g(error, "error");
            C21913F1 c21913f1 = new C21913F1(error);
            c2153q1.getClass();
            c2153q1.m3251l(null, c21913f1);
        }
        if (abstractC21955Q1 instanceof C21952P1) {
            List list = (List) ((C21952P1) abstractC21955Q1).f69511a;
            C2153Q0 c2153q2 = c11431e.f34537t0;
            C21921H1 c21921h1 = new C21921H1(list);
            c2153q2.getClass();
            c2153q2.m3251l(null, c21921h1);
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m12795d(Activity activity, String str, InterfaceC10333C interfaceC10333C, AbstractC19687c abstractC19687c) {
        C11429c c11429c;
        C11431e c11431e;
        if (abstractC19687c instanceof C11429c) {
            c11429c = (C11429c) abstractC19687c;
            int i10 = c11429c.f34526p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11429c.f34526p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11429c = new C11429c(this, abstractC19687c);
            }
        } else {
            c11429c = new C11429c(this, abstractC19687c);
        }
        Object objM13052c = c11429c.f34524Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11429c.f34526p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM13052c);
            c11429c.f34523Y = this;
            c11429c.f34526p0 = 1;
            objM13052c = ((C11757k) this.f34530Y).m13052c(activity, str, interfaceC10333C, c11429c);
            if (objM13052c == enumC19250a) {
                return enumC19250a;
            }
            c11431e = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11431e = c11429c.f34523Y;
            AbstractC9233X.m9807c(objM13052c);
        }
        InterfaceC10347Q interfaceC10347Q = (InterfaceC10347Q) objM13052c;
        if (interfaceC10347Q instanceof C10346P) {
            AbstractC0575H.m1156D(c11431e.f34534q0, null, null, new C11430d(c11431e, (C10346P) interfaceC10347Q, null), 3);
        }
        return interfaceC10347Q;
    }
}
