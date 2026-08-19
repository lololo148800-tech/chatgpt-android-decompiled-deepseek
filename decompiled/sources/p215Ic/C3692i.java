package p215Ic;

import gd.C13980q1;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.AbstractC0593T;
import p1081wc.C20881a0;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p948pi.InterfaceC18419b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ic.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C3692i implements InterfaceC18419b {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13849E f11210Y;

    /* JADX INFO: renamed from: Z */
    public final C20881a0 f11211Z;

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC13849E f11212o0;

    /* JADX INFO: renamed from: p0 */
    public final C20881a0 f11213p0;

    public C3692i(InterfaceC13849E experimentManager, C20881a0 statsigAnalyticsService, InterfaceC13849E defaultExperimentManager, C20881a0 defaultStatsigAnalyticsService) {
        AbstractC16544l.m18094g(experimentManager, "experimentManager");
        AbstractC16544l.m18094g(statsigAnalyticsService, "statsigAnalyticsService");
        AbstractC16544l.m18094g(defaultExperimentManager, "defaultExperimentManager");
        AbstractC16544l.m18094g(defaultStatsigAnalyticsService, "defaultStatsigAnalyticsService");
        this.f11210Y = experimentManager;
        this.f11211Z = statsigAnalyticsService;
        this.f11212o0 = defaultExperimentManager;
        this.f11213p0 = defaultStatsigAnalyticsService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: a */
    public final Object mo1965a(InterfaceC18770c interfaceC18770c) {
        C3691h c3691h;
        C20881a0 c20881a0;
        C3692i c3692i;
        C20881a0 c20881a1;
        if (interfaceC18770c instanceof C3691h) {
            c3691h = (C3691h) interfaceC18770c;
            int i10 = c3691h.f11209q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3691h.f11209q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3691h = new C3691h(this, (AbstractC19687c) interfaceC18770c);
            }
        } else {
            c3691h = new C3691h(this, (AbstractC19687c) interfaceC18770c);
        }
        Object objM15482b = c3691h.f11207o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3691h.f11209q0;
        if (i11 != 0) {
            if (i11 == 1) {
                c20881a0 = c3691h.f11206Z;
                c3692i = (C3692i) c3691h.f11205Y;
                AbstractC9233X.m9807c(objM15482b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c20881a1 = (C20881a0) c3691h.f11205Y;
                AbstractC9233X.m9807c(objM15482b);
            }
            c20881a1.m21451c(((Boolean) objM15482b).booleanValue());
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM15482b);
        C13980q1 c13980q1 = C13980q1.f44038c;
        c3691h.f11205Y = this;
        c20881a0 = this.f11213p0;
        c3691h.f11206Z = c20881a0;
        c3691h.f11209q0 = 1;
        objM15482b = ((C14005w2) this.f11212o0).m15482b(c13980q1, c3691h);
        if (objM15482b == enumC19250a) {
            return enumC19250a;
        }
        c3692i = this;
        c20881a0.m21451c(((Boolean) objM15482b).booleanValue());
        C20881a0 c20881a2 = c3692i.f11211Z;
        C13980q1 c13980q2 = C13980q1.f44038c;
        c3691h.f11205Y = c20881a2;
        c3691h.f11206Z = null;
        c3691h.f11209q0 = 2;
        Object objM15482b2 = ((C14005w2) c3692i.f11210Y).m15482b(c13980q2, c3691h);
        if (objM15482b2 == enumC19250a) {
            return enumC19250a;
        }
        c20881a1 = c20881a2;
        objM15482b = objM15482b2;
        c20881a1.m21451c(((Boolean) objM15482b).booleanValue());
        return C17296C.f55119a;
    }

    @Override // p948pi.InterfaceC18419b
    /* JADX INFO: renamed from: b */
    public final C3516e mo1966b() {
        return AbstractC0593T.f1824a;
    }
}
