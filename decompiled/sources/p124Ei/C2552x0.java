package p124Ei;

import android.content.Context;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.C11092a0;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.RunnableC11090Z;
import com.openai.voice.webrtc.VoiceModeForegroundService;
import mm.C17296C;
import p025An.AbstractC0593T;
import p025An.C0624m;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p153Fn.AbstractC2935m;
import p195Hh.C3430e;
import p201Hn.C3516e;
import p341Ni.EnumC5802v;
import p349O0.C5972Q;
import p482Tg.C7448e;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8663k4;
import p571X9.AbstractC9233X;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ei.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2552x0 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f7968Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC11112u f7969Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f7970o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Context f7971p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2552x0(InterfaceC11112u interfaceC11112u, boolean z6, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f7969Z = interfaceC11112u;
        this.f7970o0 = z6;
        this.f7971p0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2552x0(this.f7969Z, this.f7970o0, this.f7971p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2552x0) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    /* JADX WARN: Code duplicated, block: B:20:0x0074  */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[RETURN] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C0624m c0624m;
        C11092a0 c11092a0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f7968Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC11105n abstractC11105nMo7809i = this.f7969Z.mo7809i();
            EnumC11104m enumC11104m = EnumC11104m.f33477p0;
            C3516e c3516e = AbstractC0593T.f1824a;
            C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
            boolean zMo1143X0 = c1451e.mo1143X0(getContext());
            boolean z6 = this.f7970o0;
            Context context = this.f7971p0;
            if (zMo1143X0) {
                C2550w0 c2550w0 = new C2550w0(z6, context, 0);
                this.f7968Y = 1;
                c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
                c0624m.m1262r();
                c11092a0 = new C11092a0(abstractC11105nMo7809i, c0624m, c2550w0);
                if (zMo1143X0) {
                    c1451e.mo872V0(C18777j.f59682Y, new RunnableC11090Z(abstractC11105nMo7809i, c11092a0, 1));
                } else {
                    abstractC11105nMo7809i.mo7806a(c11092a0);
                }
                c0624m.m1264u(new C7448e(c1451e, abstractC11105nMo7809i, c11092a0, 13));
                if (c0624m.m1261q() == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (abstractC11105nMo7809i.mo7807b() == EnumC11104m.f33474Y) {
                    throw new C5972Q(null, 2);
                }
                if (abstractC11105nMo7809i.mo7807b().compareTo(enumC11104m) < 0) {
                    C2550w0 c2550w1 = new C2550w0(z6, context, 0);
                    this.f7968Y = 1;
                    c0624m = new C0624m(1, AbstractC8154o0.m8714e(this));
                    c0624m.m1262r();
                    c11092a0 = new C11092a0(abstractC11105nMo7809i, c0624m, c2550w1);
                    if (zMo1143X0) {
                        c1451e.mo872V0(C18777j.f59682Y, new RunnableC11090Z(abstractC11105nMo7809i, c11092a0, 1));
                    } else {
                        abstractC11105nMo7809i.mo7806a(c11092a0);
                    }
                    c0624m.m1264u(new C7448e(c1451e, abstractC11105nMo7809i, c11092a0, 13));
                    if (c0624m.m1261q() == enumC19250a) {
                        return enumC19250a;
                    }
                } else if (z6) {
                    C3430e c3430e = VoiceModeForegroundService.f40396o0;
                    AbstractC8663k4.m9357c(context, EnumC5802v.f18949Y);
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
