package com.openai.feature.serverstatus.impl.sunset;

import androidx.lifecycle.ViewModelKt;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl.C124761;
import com.statsig.androidsdk.StatsigLoggerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p086D6.C1970n;
import p1026ti.C19995a;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1081wc.C20897p;
import p1081wc.InterfaceC20904w;
import p122Eg.C2435d;
import p122Eg.C2436e;
import p248Jk.InterfaceC4473d;
import p571X9.AbstractC9233X;
import p876lm.InterfaceC17068a;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/sunset/SunsetViewModelImpl_Factory;", "LJk/d;", "Lcom/openai/feature/serverstatus/impl/sunset/SunsetViewModelImpl;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SunsetViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: c */
    public static final Companion f39468c = new Companion(0);

    /* JADX INFO: renamed from: a */
    public final InterfaceC17068a f39469a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17068a f39470b;

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/sunset/SunsetViewModelImpl_Factory$Companion;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    public SunsetViewModelImpl_Factory(InterfaceC17068a sunsetService, InterfaceC17068a analyticsService) {
        AbstractC16544l.m18094g(sunsetService, "sunsetService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f39469a = sunsetService;
        this.f39470b = analyticsService;
    }

    /* JADX INFO: renamed from: a */
    public static final SunsetViewModelImpl_Factory m14348a(InterfaceC17068a sunsetService, InterfaceC17068a analyticsService) {
        f39468c.getClass();
        AbstractC16544l.m18094g(sunsetService, "sunsetService");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        return new SunsetViewModelImpl_Factory(sunsetService, analyticsService);
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        Object obj = this.f39469a.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        Object obj2 = this.f39470b.get();
        AbstractC16544l.m18093f(obj2, "get(...)");
        f39468c.getClass();
        SunsetViewModelImpl sunsetViewModelImpl = new SunsetViewModelImpl(new C2436e(null, null, null));
        ((InterfaceC20904w) obj2).mo21447a(C20897p.f66610j, C17690x.f56481Y);
        final C2153Q0 c2153q0 = ((C2435d) obj).f7571c;
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$special$$inlined$filterIsInstance$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C124772<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f39464Y;

                /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$special$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$special$$inlined$filterIsInstance$1$2", m20656f = "SunsetViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f39465Y;

                    /* JADX INFO: renamed from: Z */
                    public int f39466Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f39465Y = obj;
                        this.f39466Z |= Integer.MIN_VALUE;
                        return C124772.this.mo395a(null, this);
                    }
                }

                public C124772(InterfaceC2186j interfaceC2186j) {
                    this.f39464Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f39466Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f39466Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f39465Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f39466Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        if (obj instanceof C19995a) {
                            anonymousClass1.f39466Z = 1;
                            if (this.f39464Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj2);
                    }
                    return C17296C.f55119a;
                }
            }

            @Override // p103Dn.InterfaceC2184i
            /* JADX INFO: renamed from: d */
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
                Object objMo3141d = c2153q0.mo3141d(new C124772(interfaceC2186j), interfaceC18770c);
                return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
            }
        }, 5, sunsetViewModelImpl.new C124761(null)), ViewModelKt.m12143a(sunsetViewModelImpl));
        return sunsetViewModelImpl;
    }
}
