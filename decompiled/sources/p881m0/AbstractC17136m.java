package p881m0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.C16557y;
import p049Bm.InterfaceC1436k;
import p296Lk.C5109f;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9233X;
import p758g0.AbstractC13758e;
import p758g0.C13774m;
import p758g0.C13796x;
import p758g0.InterfaceC13772l;
import p860l0.InterfaceC16694M0;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: m0.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17136m {

    /* JADX INFO: renamed from: a */
    public static final float f54799a = RCHTTPStatusCodes.BAD_REQUEST;

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public static final Object m18900a(InterfaceC16694M0 interfaceC16694M0, float f10, C13774m c13774m, C13796x c13796x, C17129f c17129f, AbstractC19687c abstractC19687c) {
        C17134k c17134k;
        C13774m c13774m2;
        C16557y c16557y;
        float f11;
        if (abstractC19687c instanceof C17134k) {
            c17134k = (C17134k) abstractC19687c;
            int i10 = c17134k.f54792q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17134k.f54792q0 = i10 - Integer.MIN_VALUE;
            } else {
                c17134k = new C17134k(abstractC19687c);
            }
        } else {
            c17134k = new C17134k(abstractC19687c);
        }
        Object obj = c17134k.f54791p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17134k.f54792q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16557y c16557y2 = new C16557y();
            boolean z6 = ((Number) c13774m.m15282c()).floatValue() == 0.0f;
            C5109f c5109f = new C5109f(f10, c16557y2, interfaceC16694M0, c17129f, 3);
            c17134k.f54789Z = c13774m;
            c17134k.f54790o0 = c16557y2;
            c17134k.f54788Y = f10;
            c17134k.f54792q0 = 1;
            if (AbstractC13758e.m15241f(c13774m, c13796x, !z6, c5109f, c17134k) == enumC19250a) {
                return enumC19250a;
            }
            c13774m2 = c13774m;
            c16557y = c16557y2;
            f11 = f10;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f11 = c17134k.f54788Y;
            c16557y = c17134k.f54790o0;
            c13774m2 = c17134k.f54789Z;
            AbstractC9233X.m9807c(obj);
        }
        return new C17124a(new Float(f11 - c16557y.f51286Y), c13774m2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public static final Object m18901b(InterfaceC16694M0 interfaceC16694M0, float f10, float f11, C13774m c13774m, InterfaceC13772l interfaceC13772l, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C17135l c17135l;
        C16557y c16557y;
        float f12;
        if (abstractC19687c instanceof C17135l) {
            c17135l = (C17135l) abstractC19687c;
            int i10 = c17135l.f54798r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c17135l.f54798r0 = i10 - Integer.MIN_VALUE;
            } else {
                c17135l = new C17135l(abstractC19687c);
            }
        } else {
            c17135l = new C17135l(abstractC19687c);
        }
        C17135l c17135l2 = c17135l;
        Object obj = c17135l2.f54797q0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c17135l2.f54798r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C16557y c16557y2 = new C16557y();
            float fFloatValue = ((Number) c13774m.m15282c()).floatValue();
            Float f13 = new Float(f10);
            boolean z6 = ((Number) c13774m.m15282c()).floatValue() == 0.0f;
            C5109f c5109f = new C5109f(f11, c16557y2, interfaceC16694M0, interfaceC1436k);
            c17135l2.f54795o0 = c13774m;
            c17135l2.f54796p0 = c16557y2;
            c17135l2.f54793Y = f10;
            c17135l2.f54794Z = fFloatValue;
            c17135l2.f54798r0 = 1;
            if (AbstractC13758e.m15243h(c13774m, f13, interfaceC13772l, !z6, c5109f, c17135l2) == enumC19250a) {
                return enumC19250a;
            }
            c16557y = c16557y2;
            f12 = fFloatValue;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = c17135l2.f54794Z;
            f10 = c17135l2.f54793Y;
            c16557y = c17135l2.f54796p0;
            c13774m = c17135l2.f54795o0;
            AbstractC9233X.m9807c(obj);
        }
        return new C17124a(new Float(f10 - c16557y.f51286Y), AbstractC13758e.m15248m(c13774m, 0.0f, m18902c(((Number) c13774m.m15282c()).floatValue(), f12), 29));
    }

    /* JADX INFO: renamed from: c */
    public static final float m18902c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? AbstractC8301I.m8917h(f10, f11) : AbstractC8301I.m8915f(f10, f11);
    }
}
