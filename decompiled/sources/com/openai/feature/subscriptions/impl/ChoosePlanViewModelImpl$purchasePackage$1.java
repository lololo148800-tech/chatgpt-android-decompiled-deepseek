package com.openai.feature.subscriptions.impl;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p098Di.C2056e;
import p098Di.C2059h;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1155zi.C21975X1;
import p1155zi.C21978Y1;
import p1155zi.EnumC21909E1;
import p1155zi.EnumC21981Z1;
import p178H.AbstractC3137c;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p624Zg.AbstractC10345O;
import p624Zg.AbstractC10357a0;
import p624Zg.C10332B;
import p624Zg.C10338H;
import p624Zg.C10346P;
import p624Zg.C10365e0;
import p624Zg.C10393y;
import p624Zg.C10394z;
import p624Zg.InterfaceC10333C;
import p624Zg.InterfaceC10347Q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$purchasePackage$1", m20656f = "ChoosePlanViewModelImpl.kt", m20657l = {119, 130}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ChoosePlanViewModelImpl$purchasePackage$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC10333C f39881Y;

    /* JADX INFO: renamed from: Z */
    public int f39882Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ChoosePlanViewModelImpl f39883o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f39884p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Activity f39885q0;

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39886a;

        static {
            int[] iArr = new int[EnumC21981Z1.values().length];
            try {
                C21978Y1 c21978y1 = EnumC21981Z1.Companion;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                C21978Y1 c21978y2 = EnumC21981Z1.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39886a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoosePlanViewModelImpl$purchasePackage$1(ChoosePlanViewModelImpl choosePlanViewModelImpl, String str, Activity activity, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39883o0 = choosePlanViewModelImpl;
        this.f39884p0 = str;
        this.f39885q0 = activity;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new ChoosePlanViewModelImpl$purchasePackage$1(this.f39883o0, this.f39884p0, this.f39885q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((ChoosePlanViewModelImpl$purchasePackage$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC10333C c10393y;
        InterfaceC10333C interfaceC10333C;
        InterfaceC10347Q interfaceC10347Q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39882Z;
        String str = this.f39884p0;
        ChoosePlanViewModelImpl choosePlanViewModelImpl = this.f39883o0;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC10333C = this.f39881Y;
                AbstractC9233X.m9807c(obj);
            }
            interfaceC10347Q = (InterfaceC10347Q) obj;
            ChoosePlanViewModelImpl.m14371o(choosePlanViewModelImpl, interfaceC10347Q, interfaceC10333C, str);
            choosePlanViewModelImpl.m14397m(new ChoosePlanViewModelImpl$setPurchasing$1(str, false));
            if (interfaceC10347Q instanceof C10346P) {
                choosePlanViewModelImpl.m14393h(C2056e.f6277a);
            } else if (!AbstractC16544l.m18089b(interfaceC10347Q, C10338H.f30673Y) && (interfaceC10347Q instanceof AbstractC10345O)) {
                AbstractC10345O abstractC10345O = (AbstractC10345O) interfaceC10347Q;
                AbstractC8160o6.m8727b(choosePlanViewModelImpl.f39870l, "Error purchasing package", abstractC10345O.getCause(), 4);
                C3430e c3430e = AbstractC10357a0.f30702o0;
                choosePlanViewModelImpl.m14393h(new C2059h(choosePlanViewModelImpl.f39867i.m3160b(AbstractC3137c.m3981d(abstractC10345O).f30703Y)));
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C2153Q0 c2153q0 = choosePlanViewModelImpl.f39868j.f34536s0;
        this.f39882Z = 1;
        obj = AbstractC2124C.m3221t(c2153q0, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        C21975X1 c21975x1 = ((C10365e0) obj).f30718b;
        EnumC21981Z1 enumC21981Z1 = c21975x1 != null ? c21975x1.f69571a : null;
        int i11 = enumC21981Z1 == null ? -1 : WhenMappings.f39886a[enumC21981Z1.ordinal()];
        if (i11 == 1) {
            EnumC21909E1 enumC21909E1 = EnumC21909E1.Plus;
            c10393y = new C10393y();
        } else if (i11 != 2) {
            c10393y = C10332B.f30662a;
        } else {
            EnumC21909E1 enumC21909E2 = EnumC21909E1.Plus;
            c10393y = new C10394z();
        }
        ChoosePlanViewModelImpl.m14371o(choosePlanViewModelImpl, null, c10393y, str);
        this.f39881Y = c10393y;
        this.f39882Z = 2;
        Object objM12795d = choosePlanViewModelImpl.f39868j.m12795d(this.f39885q0, str, c10393y, this);
        if (objM12795d == enumC19250a) {
            return enumC19250a;
        }
        interfaceC10333C = c10393y;
        obj = objM12795d;
        interfaceC10347Q = (InterfaceC10347Q) obj;
        ChoosePlanViewModelImpl.m14371o(choosePlanViewModelImpl, interfaceC10347Q, interfaceC10333C, str);
        choosePlanViewModelImpl.m14397m(new ChoosePlanViewModelImpl$setPurchasing$1(str, false));
        if (interfaceC10347Q instanceof C10346P) {
            choosePlanViewModelImpl.m14393h(C2056e.f6277a);
        } else if (!AbstractC16544l.m18089b(interfaceC10347Q, C10338H.f30673Y)) {
            AbstractC10345O abstractC10345O2 = (AbstractC10345O) interfaceC10347Q;
            AbstractC8160o6.m8727b(choosePlanViewModelImpl.f39870l, "Error purchasing package", abstractC10345O2.getCause(), 4);
            C3430e c3430e2 = AbstractC10357a0.f30702o0;
            choosePlanViewModelImpl.m14393h(new C2059h(choosePlanViewModelImpl.f39867i.m3160b(AbstractC3137c.m3981d(abstractC10345O2).f30703Y)));
        }
        return C17296C.f55119a;
    }
}
