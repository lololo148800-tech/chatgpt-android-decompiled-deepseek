package com.openai.feature.voice.impl;

import android.app.Application;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Looper;
import androidx.lifecycle.C11082S;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import be.C11345b;
import bh.C11434h;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.openai.voice.VoiceModeViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import gd.C13845C1;
import gd.C13848D1;
import gd.C13851E1;
import gd.C13857G1;
import gd.C13860H1;
import gd.C13861I;
import gd.C13896U;
import gd.C13922c;
import gd.C13935f0;
import gd.C13969n2;
import gd.C14005w2;
import gd.InterfaceC13849E;
import ge.C14049R0;
import ge.C14053T0;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ke.C16382j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16533a;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.CameraXHelper;
import mh.C17263k;
import mh.EnumC17264l;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import ne.C17600b;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p040Bd.EnumC0940I4;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p072Ci.C1699d;
import p072Ci.C1708m;
import p072Ci.EnumC1702g;
import p086D6.C1970n;
import p092Dc.C1991h;
import p098Di.C2054c;
import p098Di.C2055d;
import p098Di.C2058g;
import p1025te.C19863N;
import p1025te.C19864O;
import p1025te.C19874e;
import p1025te.C19876g;
import p1025te.InterfaceC19878i;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2146N;
import p103Dn.C2153Q0;
import p103Dn.C2207t0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1061vb.C20513d;
import p1081wc.AbstractC20882b;
import p1081wc.C20860F;
import p1081wc.C20862H;
import p1081wc.C20883b0;
import p1081wc.InterfaceC20904w;
import p1082wd.C20909b;
import p1120y4.C21382i;
import p1130yi.AbstractC21544c;
import p1130yi.EnumC21542a;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21891A;
import p1155zi.C21902C2;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p1155zi.C22025k2;
import p1155zi.C22038o;
import p1155zi.C22045p2;
import p1155zi.C22057s2;
import p1155zi.C22069v2;
import p1155zi.C22081y2;
import p1155zi.EnumC22033m2;
import p1155zi.EnumC22034n;
import p1155zi.InterfaceC21915G;
import p1160zp.AbstractC22225a;
import p124Ei.C2460K;
import p124Ei.C2472Q;
import p124Ei.C2475S;
import p124Ei.C2477T;
import p124Ei.C2479U;
import p124Ei.C2481V;
import p124Ei.C2483W;
import p124Ei.C2485X;
import p124Ei.C2487Y;
import p124Ei.C2489Z;
import p124Ei.C2492a0;
import p124Ei.C2495b0;
import p124Ei.C2498c0;
import p124Ei.C2500d;
import p124Ei.C2501d0;
import p124Ei.C2504e0;
import p124Ei.C2507f0;
import p124Ei.C2510g0;
import p124Ei.C2513h0;
import p124Ei.C2516i0;
import p124Ei.C2519j0;
import p124Ei.C2522k0;
import p124Ei.C2525l0;
import p124Ei.C2528m0;
import p124Ei.C2529m1;
import p124Ei.C2531n0;
import p124Ei.C2532n1;
import p124Ei.C2534o0;
import p124Ei.C2536p0;
import p124Ei.C2538q0;
import p124Ei.C2540r0;
import p124Ei.C2542s0;
import p124Ei.C2544t0;
import p124Ei.C2546u0;
import p124Ei.InterfaceC2548v0;
import p148Fi.AbstractC2792U0;
import p148Fi.AbstractC2805a1;
import p148Fi.AbstractC2829i1;
import p148Fi.AbstractC2841n;
import p148Fi.C2770J;
import p148Fi.C2778N;
import p148Fi.C2786R0;
import p148Fi.C2790T0;
import p148Fi.C2791U;
import p148Fi.C2794V0;
import p148Fi.C2796W0;
import p148Fi.C2798X0;
import p148Fi.C2800Y0;
import p148Fi.C2802Z0;
import p148Fi.C2807b0;
import p148Fi.C2808b1;
import p148Fi.C2811c1;
import p148Fi.C2814d1;
import p148Fi.C2816e0;
import p148Fi.C2820f1;
import p148Fi.C2823g1;
import p148Fi.C2825h0;
import p148Fi.C2826h1;
import p148Fi.C2833k;
import p148Fi.C2834k0;
import p148Fi.C2854t0;
import p148Fi.C2864y0;
import p172Gi.C3061C;
import p172Gi.C3077j;
import p172Gi.EnumC3062D;
import p172Gi.EnumC3068a;
import p201Hn.C3516e;
import p201Hn.ExecutorC3515d;
import p216Id.C3694b;
import p221Ii.RunnableC3724c;
import p228J.AbstractC3794B0;
import p268Kf.C4666u;
import p269Kh.C4688o;
import p273Kl.C4727J0;
import p313Mc.C5317a;
import p317Mg.C5350a;
import p318Mh.C5352A0;
import p318Mh.C5391c;
import p318Mh.C5431w;
import p318Mh.EnumC5421r;
import p341Ni.AbstractC5790k0;
import p341Ni.C5784h0;
import p341Ni.C5788j0;
import p341Ni.C5789k;
import p341Ni.C5791l;
import p341Ni.C5793m;
import p341Ni.C5794n;
import p341Ni.C5795o;
import p341Ni.C5796p;
import p341Ni.C5797q;
import p341Ni.C5801u;
import p341Ni.InterfaceC5798r;
import p360Od.C6172d;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p365Oi.C6256d;
import p365Oi.C6257e;
import p387Pl.C6497q;
import p387Pl.EnumC6464K;
import p403Qd.EnumC6606L;
import p427Rc.C6844a;
import p435Rl.C6924h;
import p435Rl.InterfaceC6919c;
import p479Td.C7351f0;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p528Vg.C8285d;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8718u;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9212T2;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p708dh.C13166t;
import p728ei.C13406b;
import p787he.C14459O;
import p855kj.AbstractC16428g;
import p855kj.C16432k;
import p858ko.C16482A;
import p867l8.C16831c;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.C17690x;
import p956q3.C18621a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import sm.InterfaceC19693i;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/voice/impl/VoiceModeViewModelImpl;", "Lcom/openai/voice/VoiceModeViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeViewModelImpl extends VoiceModeViewModel {

    /* JADX INFO: renamed from: A */
    public final C14053T0 f39967A;

    /* JADX INFO: renamed from: B */
    public final C11434h f39968B;

    /* JADX INFO: renamed from: C */
    public final C2790T0 f39969C;

    /* JADX INFO: renamed from: D */
    public final C6844a f39970D;

    /* JADX INFO: renamed from: E */
    public final C2864y0 f39971E;

    /* JADX INFO: renamed from: F */
    public final C6256d f39972F;

    /* JADX INFO: renamed from: G */
    public final C6257e f39973G;

    /* JADX INFO: renamed from: H */
    public final C4727J0 f39974H;

    /* JADX INFO: renamed from: I */
    public final C17314q f39975I;

    /* JADX INFO: renamed from: J */
    public final C17314q f39976J;

    /* JADX INFO: renamed from: K */
    public String f39977K;

    /* JADX INFO: renamed from: L */
    public boolean f39978L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC6919c f39979M;

    /* JADX INFO: renamed from: N */
    public final C6844a f39980N;

    /* JADX INFO: renamed from: O */
    public final C6844a f39981O;

    /* JADX INFO: renamed from: i */
    public final C5350a f39982i;

    /* JADX INFO: renamed from: j */
    public final C14459O f39983j;

    /* JADX INFO: renamed from: k */
    public final C17600b f39984k;

    /* JADX INFO: renamed from: l */
    public final C5784h0 f39985l;

    /* JADX INFO: renamed from: m */
    public final C13132J f39986m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC17068a f39987n;

    /* JADX INFO: renamed from: o */
    public final C16382j f39988o;

    /* JADX INFO: renamed from: p */
    public final C2854t0 f39989p;

    /* JADX INFO: renamed from: q */
    public final C1991h f39990q;

    /* JADX INFO: renamed from: r */
    public final Application f39991r;

    /* JADX INFO: renamed from: s */
    public final C13166t f39992s;

    /* JADX INFO: renamed from: t */
    public final C16961l f39993t;

    /* JADX INFO: renamed from: u */
    public final C13133K f39994u;

    /* JADX INFO: renamed from: v */
    public final C13969n2 f39995v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC20904w f39996w;

    /* JADX INFO: renamed from: x */
    public final C11082S f39997x;

    /* JADX INFO: renamed from: y */
    public final C19864O f39998y;

    /* JADX INFO: renamed from: z */
    public final C13141T f39999z;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {186}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LNi/r;", "connectionState", "LFi/J;", "remoteState", "Lmm/C;", "<anonymous>", "(LNi/r;LFi/J;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125331 extends AbstractC19694j implements InterfaceC1440o {

        /* JADX INFO: renamed from: Y */
        public AbstractC2829i1 f40000Y;

        /* JADX INFO: renamed from: Z */
        public int f40001Z;

        /* JADX INFO: renamed from: o0 */
        public /* synthetic */ InterfaceC5798r f40002o0;

        /* JADX INFO: renamed from: p0 */
        public /* synthetic */ Object f40003p0;

        public C125331(InterfaceC18770c interfaceC18770c) {
            super(3, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1440o
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C125331 c125331 = VoiceModeViewModelImpl.this.new C125331((InterfaceC18770c) obj3);
            c125331.f40002o0 = (InterfaceC5798r) obj;
            c125331.f40003p0 = (C2770J) obj2;
            return c125331.invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0064  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            AbstractC2829i1 abstractC2829i1;
            InterfaceC5798r interfaceC5798r;
            AbstractC2829i1 abstractC2829i2;
            VoiceModeViewModelImpl voiceModeViewModelImpl;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40001Z;
            C17296C c17296c = C17296C.f55119a;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC5798r connectionState = this.f40002o0;
                C2770J remoteState = (C2770J) this.f40003p0;
                AbstractC16544l.m18094g(connectionState, "connectionState");
                AbstractC16544l.m18094g(remoteState, "remoteState");
                if (connectionState.equals(C5793m.f18928a)) {
                    abstractC2829i1 = C2798X0.f8527a;
                } else if (connectionState instanceof C5795o) {
                    abstractC2829i1 = ((C5795o) connectionState).f18930a ? C2800Y0.f8529a : C2802Z0.f8531a;
                } else {
                    boolean zEquals = connectionState.equals(C5791l.f18914a) ? true : connectionState.equals(C5797q.f18932a);
                    C2796W0 c2796w0 = C2796W0.f8522a;
                    if (zEquals) {
                        abstractC2829i1 = c2796w0;
                    } else {
                        if (connectionState.equals(C5794n.f18929a) ? true : connectionState instanceof C5796p) {
                            abstractC2829i1 = C2820f1.f8553a;
                        } else {
                            if (!(connectionState instanceof C5789k)) {
                                throw new C0644w();
                            }
                            switch (AbstractC5790k0.f18913a[remoteState.f8478a.ordinal()]) {
                                case 1:
                                    abstractC2829i1 = c2796w0;
                                    break;
                                case 2:
                                    abstractC2829i1 = C2794V0.f8521a;
                                    break;
                                case 3:
                                    abstractC2829i1 = C2808b1.f8535a;
                                    break;
                                case 4:
                                    abstractC2829i1 = C2814d1.f8542a;
                                    break;
                                case 5:
                                    abstractC2829i1 = C2811c1.f8539a;
                                    break;
                                case 6:
                                    abstractC2829i1 = C2826h1.f8565a;
                                    break;
                                case 7:
                                    abstractC2829i1 = C2823g1.f8561a;
                                    break;
                                default:
                                    throw new C0644w();
                            }
                        }
                    }
                }
                VoiceModeViewModelImpl voiceModeViewModelImpl2 = VoiceModeViewModelImpl.this;
                C2790T0 c2790t0 = voiceModeViewModelImpl2.f39969C;
                this.f40002o0 = connectionState;
                this.f40003p0 = voiceModeViewModelImpl2;
                this.f40000Y = abstractC2829i1;
                this.f40001Z = 1;
                Object objMo395a = c2790t0.f8513a.mo395a(abstractC2829i1, this);
                if (objMo395a != enumC19250a) {
                    objMo395a = c17296c;
                }
                if (objMo395a == enumC19250a) {
                    return enumC19250a;
                }
                interfaceC5798r = connectionState;
                abstractC2829i2 = abstractC2829i1;
                voiceModeViewModelImpl = voiceModeViewModelImpl2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC2829i2 = this.f40000Y;
                voiceModeViewModelImpl = (VoiceModeViewModelImpl) this.f40003p0;
                interfaceC5798r = this.f40002o0;
                AbstractC9233X.m9807c(obj);
            }
            voiceModeViewModelImpl.m14397m(new VoiceModeViewModelImpl$1$1$1(abstractC2829i2, interfaceC5798r));
            return c17296c;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$10 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$10", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "it", "", "<anonymous>", "(LEi/n1;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1253410 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40007Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1253410 c1253410 = new C1253410(2, interfaceC18770c);
            c1253410.f40007Y = obj;
            return c1253410;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1253410) create((C2532n1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(AbstractC2792U0.m3711b(((C2532n1) this.f40007Y).f7895b));
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$11 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "", "isOnline", "invoke", "(LEi/n1;Z)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1253511 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1253511 f40008Y = new C1253511();

        public C1253511() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, zBooleanValue && setOnEach.f7916w, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -8388609, 2047);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$12 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$12", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "it", "", "<anonymous>", "(LEi/n1;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1253612 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40009Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1253612 c1253612 = new C1253612(2, interfaceC18770c);
            c1253612.f40009Y = obj;
            return c1253612;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1253612) create((C2532n1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(AbstractC2792U0.m3710a(((C2532n1) this.f40009Y).f7895b));
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$13 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$13", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {274}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "isActive", "inForeground", "Lmm/C;", "<anonymous>", "(ZZ)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1253713 extends AbstractC19694j implements InterfaceC1440o {

        /* JADX INFO: renamed from: Y */
        public int f40010Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ boolean f40011Z;

        /* JADX INFO: renamed from: o0 */
        public /* synthetic */ boolean f40012o0;

        public C1253713(InterfaceC18770c interfaceC18770c) {
            super(3, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1440o
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            C1253713 c1253713 = VoiceModeViewModelImpl.this.new C1253713((InterfaceC18770c) obj3);
            c1253713.f40011Z = zBooleanValue;
            c1253713.f40012o0 = zBooleanValue2;
            return c1253713.invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40010Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                boolean z6 = this.f40011Z;
                boolean z10 = this.f40012o0;
                if (z6 && !z10) {
                    VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
                    C2532n1 c2532n1 = (C2532n1) voiceModeViewModelImpl.m14391f();
                    if (!c2532n1.f7916w && !c2532n1.f7918y) {
                        EnumC3068a enumC3068a = EnumC3068a.AppBackgrounded;
                        this.f40010Y = 1;
                        if (voiceModeViewModelImpl.m14379r(enumC3068a, this) == enumC19250a) {
                            return enumC19250a;
                        }
                    } else if (c2532n1.f7902i) {
                        voiceModeViewModelImpl.mo14227j(C2538q0.f7928a);
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

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$14 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$14", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LGi/C;", ParameterNames.INFO, "Lmm/C;", "<anonymous>", "(LGi/C;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1253814 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40014Y;

        public C1253814(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1253814 c1253814 = VoiceModeViewModelImpl.this.new C1253814(interfaceC18770c);
            c1253814.f40014Y = obj;
            return c1253814;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1253814 c1253814 = (C1253814) create((C3061C) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1253814.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            VoiceModeViewModelImpl.this.m14392g(new C2460K((C3061C) this.f40014Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$15 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$15", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "it", "Lzi/h0;", "<anonymous>", "(LId/b;)Lzi/h0;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1253915 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40016Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1253915 c1253915 = new C1253915(2, interfaceC18770c);
            c1253915.f40016Y = obj;
            return c1253915;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1253915) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            String str = ((C3694b) this.f40016Y).f11216a;
            if (str != null) {
                return new C22011h0(str);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$16 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "Lzi/h0;", "it", "invoke-mRA7E-s", "(LEi/n1;Ljava/lang/String;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254016 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1254016 f40017Y = new C1254016();

        public C1254016() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            String it = ((C22011h0) obj2).f69652a;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C2532n1.m3605e(setOnEach, it, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -2, 2047);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "", "it", "invoke", "(LEi/n1;Z)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125412 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125412 f40018Y = new C125412();

        public C125412() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, zBooleanValue, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -33, 2047);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$20 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$20", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOd/d;", "it", "Lmm/C;", "<anonymous>", "(LOd/d;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254220 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40019Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$20$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C6172d f40021Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C6172d c6172d) {
                super(1);
                this.f40021Y = c6172d;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, this.f40021Y, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -1048577, 2047);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$20$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f40022Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, true, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -131073, 2047);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$20$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass3 f40023Y = new AnonymousClass3();

            public AnonymousClass3() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -131073, 2047);
            }
        }

        public C1254220(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1254220 c1254220 = VoiceModeViewModelImpl.this.new C1254220(interfaceC18770c);
            c1254220.f40019Y = obj;
            return c1254220;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1254220 c1254220 = (C1254220) create((C6172d) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1254220.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C6172d c6172d = (C6172d) this.f40019Y;
            VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
            AbstractC8160o6.m8726a(voiceModeViewModelImpl.f39971E, "find action tool: " + c6172d.f20094d + " => " + c6172d, null, 6);
            voiceModeViewModelImpl.m14397m(new AnonymousClass1(c6172d));
            if (c6172d.f20094d == EnumC6606L.f21327Y) {
                voiceModeViewModelImpl.f39996w.mo21447a(C20860F.f66370g, C17690x.f56481Y);
                voiceModeViewModelImpl.m14397m(AnonymousClass2.f40022Y);
            } else {
                voiceModeViewModelImpl.m14397m(AnonymousClass3.f40023Y);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$23 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$23", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "LTd/b0;", "it", "Lmm/C;", "<anonymous>", "(Ljava/util/List;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254323 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40024Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$23$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ List f40026Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List list) {
                super(1);
                this.f40026Y = list;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, AbstractC17680n.m19363m0(this.f40026Y), null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -524289, 2047);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$23$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f40027Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, true, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -65537, 2047);
            }
        }

        public C1254323(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1254323 c1254323 = VoiceModeViewModelImpl.this.new C1254323(interfaceC18770c);
            c1254323.f40024Y = obj;
            return c1254323;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C1254323 c1254323 = (C1254323) create((List) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c1254323.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((List) this.f40024Y);
            VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
            voiceModeViewModelImpl.m14397m(anonymousClass1);
            if (AbstractC2792U0.m3711b(((C2532n1) voiceModeViewModelImpl.m14391f()).f7895b)) {
                voiceModeViewModelImpl.m14397m(AnonymousClass2.f40027Y);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$24 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Landroid/content/Intent;", "it", "Lmm/C;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254424 extends AbstractC16546n implements InterfaceC1436k {
        public C1254424() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            Intent it = (Intent) obj;
            AbstractC16544l.m18094g(it, "it");
            VoiceModeViewModelImpl.this.m14393h(new C2055d(it));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$25 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$25", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {325}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "msg", "Lmm/C;", "<anonymous>", "(LTd/f0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254525 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f40029Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f40030Z;

        public C1254525(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1254525 c1254525 = VoiceModeViewModelImpl.this.new C1254525(interfaceC18770c);
            c1254525.f40030Z = obj;
            return c1254525;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1254525) create((C7351f0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40029Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C7351f0 c7351f0 = (C7351f0) this.f40030Z;
                if (c7351f0 != null) {
                    C5784h0 c5784h0 = VoiceModeViewModelImpl.this.f39985l;
                    this.f40029Y = 1;
                    if (c5784h0.m6180m(c7351f0, this) == enumC19250a) {
                        return enumC19250a;
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

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$28 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$28", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {341}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/g;", "it", "Lmm/C;", "<anonymous>", "(Lte/g;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254628 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f40032Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f40033Z;

        public C1254628(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1254628 c1254628 = VoiceModeViewModelImpl.this.new C1254628(interfaceC18770c);
            c1254628.f40033Z = obj;
            return c1254628;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1254628) create((C19876g) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40032Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C19876g c19876g = (C19876g) this.f40033Z;
                C5784h0 c5784h0 = VoiceModeViewModelImpl.this.f39985l;
                InterfaceC21915G interfaceC21915G = c19876g.f63017a;
                this.f40032Y = 1;
                if (c5784h0.m6181o(interfaceC21915G, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException(YladLSetV.dnmYgPK);
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$29 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$29", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {345, 346}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254729 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f40035Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$29$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$29$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "it", "", "<anonymous>", "(LEi/n1;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f40037Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f40037Y = obj;
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((C2532n1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(((C2532n1) this.f40037Y).f7887S);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$29$2, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$29$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "show"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass2 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f40038Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, interfaceC18770c);
                anonymousClass2.f40038Y = ((Boolean) obj).booleanValue();
                return anonymousClass2;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass2) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f40038Y);
            }
        }

        public C1254729(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return VoiceModeViewModelImpl.this.new C1254729(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1254729) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40035Y;
            VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                voiceModeViewModelImpl.f39999z.m14818a(EnumC1702g.AdvancedVoiceVideo);
                C5352A0 c5352a0 = C5352A0.f17578h;
                c5352a0.getClass();
                voiceModeViewModelImpl.m14393h(new C2058g(c5352a0.m5885a(C5391c.f17646Z), true));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = voiceModeViewModelImpl.f40343c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.f40035Y = 1;
            if (AbstractC2124C.m3220s(c2153q0, anonymousClass1, this) == enumC19250a) {
                return enumC19250a;
            }
            C13141T c13141t = voiceModeViewModelImpl.f39999z;
            C1970n c1970n = new C1970n(c13141t.f41721d, 21, EnumC1702g.AdvancedVoiceVideo);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, null);
            this.f40035Y = 2;
            if (AbstractC2124C.m3220s(c1970n, anonymousClass2, this) == enumC19250a) {
                return enumC19250a;
            }
            voiceModeViewModelImpl.f39999z.m14818a(EnumC1702g.AdvancedVoiceVideo);
            C5352A0 c5352a1 = C5352A0.f17578h;
            c5352a1.getClass();
            voiceModeViewModelImpl.m14393h(new C2058g(c5352a1.m5885a(C5391c.f17646Z), true));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "LVg/d;", "it", "invoke", "(LEi/n1;LVg/d;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125483 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125483 f40039Y = new C125483();

        public C125483() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            C8285d it = (C8285d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, it.f25827e, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -2097153, 2047);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$30 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$30", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {353, 354, 356}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1254930 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f40040Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f40041Z;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$30$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$30$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "", "show"}, m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ boolean f40043Y;

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, interfaceC18770c);
                anonymousClass1.f40043Y = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((AnonymousClass1) create(bool, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                AbstractC9233X.m9807c(obj);
                return Boolean.valueOf(this.f40043Y);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$30$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass2 f40044Y = new AnonymousClass2();

            public AnonymousClass2() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, true, false, null, -1, 2015);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$30$3, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"", "it", "Lmm/C;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass3 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ VoiceModeViewModelImpl f40045Y;

            /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$30$3$1, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
            final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

                /* JADX INFO: renamed from: Y */
                public static final AnonymousClass1 f40046Y = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj) {
                    C2532n1 setState = (C2532n1) obj;
                    AbstractC16544l.m18094g(setState, "$this$setState");
                    return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -1, 2015);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(VoiceModeViewModelImpl voiceModeViewModelImpl) {
                super(1);
                this.f40045Y = voiceModeViewModelImpl;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                this.f40045Y.m14397m(AnonymousClass1.f40046Y);
                return C17296C.f55119a;
            }
        }

        public C1254930(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C1254930 c1254930 = VoiceModeViewModelImpl.this.new C1254930(interfaceC18770c);
            c1254930.f40041Z = obj;
            return c1254930;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1254930) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0081 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0082  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            InterfaceC0571F interfaceC0571F;
            long jM8644j;
            InterfaceC0571F interfaceC0571F2;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40040Y;
            VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC0571F = (InterfaceC0571F) this.f40041Z;
                    AbstractC9233X.m9807c(obj);
                } else if (i10 == 2) {
                    interfaceC0571F = (InterfaceC0571F) this.f40041Z;
                    AbstractC9233X.m9807c(obj);
                    voiceModeViewModelImpl.m14397m(AnonymousClass2.f40044Y);
                    C21554a c21554a = C21555b.f68260Z;
                    jM8644j = AbstractC8128k6.m8644j(7, EnumC21557d.SECONDS);
                    this.f40041Z = interfaceC0571F;
                    this.f40040Y = 3;
                    if (AbstractC0575H.m1185n(jM8644j, this) == enumC19250a) {
                        return enumC19250a;
                    }
                    interfaceC0571F2 = interfaceC0571F;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0571F2 = (InterfaceC0571F) this.f40041Z;
                    AbstractC9233X.m9807c(obj);
                }
                AbstractC9212T2.m9779c(interfaceC0571F2, new AnonymousClass3(voiceModeViewModelImpl));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            interfaceC0571F = (InterfaceC0571F) this.f40041Z;
            C14053T0 c14053t0 = voiceModeViewModelImpl.f39967A;
            C14049R0 c14049r0 = new C14049R0(c14053t0.f44172Y.f41697b, c14053t0, 0);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.f40041Z = interfaceC0571F;
            this.f40040Y = 1;
            if (AbstractC2124C.m3220s(c14049r0, anonymousClass1, this) == enumC19250a) {
                return enumC19250a;
            }
            C21554a c21554a2 = C21555b.f68260Z;
            long jM8644j2 = AbstractC8128k6.m8644j(1, EnumC21557d.SECONDS);
            this.f40041Z = interfaceC0571F;
            this.f40040Y = 2;
            if (AbstractC0575H.m1185n(jM8644j2, this) == enumC19250a) {
                return enumC19250a;
            }
            voiceModeViewModelImpl.m14397m(AnonymousClass2.f40044Y);
            C21554a c21554a3 = C21555b.f68260Z;
            jM8644j = AbstractC8128k6.m8644j(7, EnumC21557d.SECONDS);
            this.f40041Z = interfaceC0571F;
            this.f40040Y = 3;
            if (AbstractC0575H.m1185n(jM8644j, this) == enumC19250a) {
                return enumC19250a;
            }
            interfaceC0571F2 = interfaceC0571F;
            AbstractC9212T2.m9779c(interfaceC0571F2, new AnonymousClass3(voiceModeViewModelImpl));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$31 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "Lkj/g;", "device", "invoke", "(LEi/n1;Lkj/g;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1255031 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1255031 f40047Y = new C1255031();

        public C1255031() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, C2500d.m3585a(setOnEach.f7882N, false, (AbstractC16428g) obj2, null, 11), -1, 1919);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$32 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"LEi/n1;", "", "Lkj/g;", "devices", "invoke", "(LEi/n1;Ljava/util/List;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C1255132 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C1255132 f40048Y = new C1255132();

        public C1255132() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            List devices = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(devices, "devices");
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, C2500d.m3585a(setOnEach.f7882N, false, null, devices, 7), -1, 1919);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"LEi/n1;", "", "LPl/q;", "tracks", "invoke", "(LEi/n1;Ljava/util/List;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125524 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125524 f40049Y = new C125524();

        public C125524() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            boolean z6;
            boolean z10;
            C2532n1 setOnEach = (C2532n1) obj;
            List tracks = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(tracks, "tracks");
            List list = tracks;
            boolean z11 = list instanceof Collection;
            if (!z11 || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = false;
                        break;
                    }
                    if (((C6497q) it.next()).f20996g == EnumC6464K.f20969Y) {
                        z6 = true;
                        break;
                    }
                }
            } else {
                z6 = false;
                break;
            }
            if (z11 && list.isEmpty()) {
                z10 = false;
            } else {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((C6497q) it2.next()).f20996g == EnumC6464K.f20971o0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, false, false, false, z6, false, false, false, false, false, false, false, null, null, null, false, false, false, z10, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -16777473, 2047);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$5 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$5", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {208}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125535 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f40050Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$5$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LFi/n;", "msg", "Lmm/C;", "emit", "(LFi/n;Lqm/c;)Ljava/lang/Object;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1<T> implements InterfaceC2186j {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ VoiceModeViewModelImpl f40052Y;

            /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$5$1$5, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
            final class AnonymousClass5 extends AbstractC16546n implements InterfaceC1436k {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ AbstractC2841n f40053Y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass5(AbstractC2841n abstractC2841n) {
                    super(1);
                    this.f40053Y = abstractC2841n;
                }

                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj) {
                    C2529m1 c2529m1;
                    C22025k2 c22025k2M3714a;
                    C2532n1 setState = (C2532n1) obj;
                    AbstractC16544l.m18094g(setState, "$this$setState");
                    C2807b0 c2807b0 = (C2807b0) this.f40053Y;
                    C2816e0 c2816e0 = c2807b0.f8533a;
                    C2834k0 c2834k0 = c2807b0.f8534b;
                    C2529m1 c2529m2 = setState.f7871C;
                    if (c2529m2 != null) {
                        c2529m1 = c2529m2;
                    } else if (c2834k0 == null || (c22025k2M3714a = c2834k0.m3714a()) == null) {
                        c2529m2 = null;
                        c2529m1 = c2529m2;
                    } else {
                        c2529m1 = new C2529m1(c22025k2M3714a);
                    }
                    return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, c2834k0, c2816e0, c2529m1, null, false, false, null, null, null, false, false, false, false, null, -469762049, 2047);
                }
            }

            /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$5$1$6, reason: invalid class name */
            @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
            final class AnonymousClass6 extends AbstractC16546n implements InterfaceC1436k {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ AbstractC2841n f40054Y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(AbstractC2841n abstractC2841n) {
                    super(1);
                    this.f40054Y = abstractC2841n;
                }

                @Override // p049Bm.InterfaceC1436k
                public final Object invoke(Object obj) {
                    C2532n1 setState = (C2532n1) obj;
                    AbstractC16544l.m18094g(setState, "$this$setState");
                    return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, (C2791U) this.f40054Y, false, false, null, null, null, false, false, false, false, null, -536870913, 2047);
                }
            }

            public AnonymousClass1(VoiceModeViewModelImpl voiceModeViewModelImpl) {
                this.f40052Y = voiceModeViewModelImpl;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x00de  */
            /* JADX WARN: Code duplicated, block: B:39:0x0109 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Instruction removed from duplicated block: B:37:0x00de, please report this as an issue */
            @Override // p103Dn.InterfaceC2186j
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object mo395a(AbstractC2841n abstractC2841n, InterfaceC18770c interfaceC18770c) throws Throwable {
                VoiceModeViewModelImpl$5$1$emit$1 voiceModeViewModelImpl$5$1$emit$1;
                C2825h0 c2825h0;
                C22025k2 c22025k2M3714a;
                AnonymousClass1<T> anonymousClass1;
                AnonymousClass1<T> anonymousClass2;
                C7351f0 c7351f0;
                AbstractC2841n abstractC2841n2 = abstractC2841n;
                if (interfaceC18770c instanceof VoiceModeViewModelImpl$5$1$emit$1) {
                    voiceModeViewModelImpl$5$1$emit$1 = (VoiceModeViewModelImpl$5$1$emit$1) interfaceC18770c;
                    int i10 = voiceModeViewModelImpl$5$1$emit$1.f40059q0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        voiceModeViewModelImpl$5$1$emit$1.f40059q0 = i10 - Integer.MIN_VALUE;
                    } else {
                        voiceModeViewModelImpl$5$1$emit$1 = new VoiceModeViewModelImpl$5$1$emit$1(this, interfaceC18770c);
                    }
                } else {
                    voiceModeViewModelImpl$5$1$emit$1 = new VoiceModeViewModelImpl$5$1$emit$1(this, interfaceC18770c);
                }
                Object objM15977f = voiceModeViewModelImpl$5$1$emit$1.f40057o0;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = voiceModeViewModelImpl$5$1$emit$1.f40059q0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM15977f);
                    boolean z6 = abstractC2841n2 instanceof C2833k;
                    VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40052Y;
                    if (z6) {
                        String str = ((C2833k) abstractC2841n2).f8569a;
                        voiceModeViewModelImpl$5$1$emit$1.f40055Y = this;
                        voiceModeViewModelImpl$5$1$emit$1.f40059q0 = 1;
                        if (VoiceModeViewModelImpl.m14376o(voiceModeViewModelImpl, str, voiceModeViewModelImpl$5$1$emit$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        anonymousClass2 = this;
                        C19864O c19864o = anonymousClass2.f40052Y.f39998y;
                        c19864o.getClass();
                        c19864o.m20781a(new C16482A(c19864o, 28));
                    } else if (abstractC2841n2 instanceof C2778N) {
                        C7351f0 c7351f1 = (C7351f0) ((C2778N) abstractC2841n2).f8491e.getValue();
                        if (c7351f1 != null) {
                            AbstractC8160o6.m8726a(voiceModeViewModelImpl.f39971E, "Coordinator handle response message: " + c7351f1.f23290e + Separators.f31991SP + c7351f1, null, 6);
                            C7351f0 c7351f0M7781a = C7351f0.m7781a(c7351f1, null, null, null, null, EnumC0940I4.f2702p0, false, false, -8193, 511);
                            voiceModeViewModelImpl$5$1$emit$1.f40055Y = this;
                            voiceModeViewModelImpl$5$1$emit$1.f40056Z = abstractC2841n2;
                            voiceModeViewModelImpl$5$1$emit$1.f40059q0 = 2;
                            objM15977f = voiceModeViewModelImpl.f39983j.m15977f(c7351f0M7781a, voiceModeViewModelImpl$5$1$emit$1);
                            if (objM15977f == enumC19250a) {
                                return enumC19250a;
                            }
                            anonymousClass1 = this;
                        } else {
                            anonymousClass1 = this;
                        }
                        c7351f0 = (C7351f0) ((C2778N) abstractC2841n2).f8492f.getValue();
                        if (c7351f0 != null) {
                            VoiceModeViewModelImpl voiceModeViewModelImpl2 = anonymousClass1.f40052Y;
                            AbstractC8160o6.m8726a(voiceModeViewModelImpl2.f39971E, "Coordinator handle request message: " + c7351f0.f23290e + Separators.f31991SP + c7351f0, null, 6);
                            voiceModeViewModelImpl$5$1$emit$1.f40055Y = null;
                            voiceModeViewModelImpl$5$1$emit$1.f40056Z = null;
                            voiceModeViewModelImpl$5$1$emit$1.f40059q0 = 3;
                            objM15977f = voiceModeViewModelImpl2.f39983j.m15977f(c7351f0, voiceModeViewModelImpl$5$1$emit$1);
                            if (objM15977f == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else if (abstractC2841n2 instanceof C2807b0) {
                        C2807b0 c2807b0 = (C2807b0) abstractC2841n2;
                        C2834k0 c2834k0 = c2807b0.f8534b;
                        if (c2834k0 != null && (c22025k2M3714a = c2834k0.m3714a()) != null) {
                            AbstractC8160o6.m8726a(voiceModeViewModelImpl.f39971E, "Usage update audio: " + c22025k2M3714a, null, 6);
                        }
                        C2834k0 c2834k1 = c2807b0.f8534b;
                        if (c2834k1 != null && (c2825h0 = c2834k1.f8573c) != null) {
                            AbstractC8160o6.m8726a(voiceModeViewModelImpl.f39971E, "Usage update video: " + c2825h0, null, 6);
                        }
                        voiceModeViewModelImpl.m14397m(new AnonymousClass5(abstractC2841n2));
                    } else if (abstractC2841n2 instanceof C2791U) {
                        voiceModeViewModelImpl.m14397m(new AnonymousClass6(abstractC2841n2));
                    }
                } else if (i11 != 1) {
                    if (i11 == 2) {
                        abstractC2841n2 = voiceModeViewModelImpl$5$1$emit$1.f40056Z;
                        anonymousClass1 = (AnonymousClass1) voiceModeViewModelImpl$5$1$emit$1.f40055Y;
                        AbstractC9233X.m9807c(objM15977f);
                        c7351f0 = (C7351f0) ((C2778N) abstractC2841n2).f8492f.getValue();
                        if (c7351f0 != null) {
                            VoiceModeViewModelImpl voiceModeViewModelImpl3 = anonymousClass1.f40052Y;
                            AbstractC8160o6.m8726a(voiceModeViewModelImpl3.f39971E, "Coordinator handle request message: " + c7351f0.f23290e + Separators.f31991SP + c7351f0, null, 6);
                            voiceModeViewModelImpl$5$1$emit$1.f40055Y = null;
                            voiceModeViewModelImpl$5$1$emit$1.f40056Z = null;
                            voiceModeViewModelImpl$5$1$emit$1.f40059q0 = 3;
                            objM15977f = voiceModeViewModelImpl3.f39983j.m15977f(c7351f0, voiceModeViewModelImpl$5$1$emit$1);
                            if (objM15977f == enumC19250a) {
                                return enumC19250a;
                            }
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(objM15977f);
                    }
                } else {
                    anonymousClass2 = (AnonymousClass1) voiceModeViewModelImpl$5$1$emit$1.f40055Y;
                    AbstractC9233X.m9807c(objM15977f);
                    C19864O c19864o2 = anonymousClass2.f40052Y.f39998y;
                    c19864o2.getClass();
                    c19864o2.m20781a(new C16482A(c19864o2, 28));
                }
                return C17296C.f55119a;
            }
        }

        public C125535(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return VoiceModeViewModelImpl.this.new C125535(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125535) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40050Y;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
            C2127D0 c2127d0 = voiceModeViewModelImpl.f39985l.f18829C;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(voiceModeViewModelImpl);
            this.f40050Y = 1;
            c2127d0.getClass();
            C2127D0.m3228m(c2127d0, anonymousClass1, this);
            return enumC19250a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$6 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$6", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {251, 251, 253}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125546 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public C2786R0 f40060Y;

        /* JADX INFO: renamed from: Z */
        public int f40061Z;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$6$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C2786R0 f40063Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C3077j f40064Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2786R0 c2786r0, C3077j c3077j) {
                super(1);
                this.f40063Y = c2786r0;
                this.f40064Z = c3077j;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2532n1 setState = (C2532n1) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, this.f40063Y.f8502a, this.f40064Z, false, false, false, false, null, -1, 2041);
            }
        }

        public C125546(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            return VoiceModeViewModelImpl.this.new C125546(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125546) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        /* JADX WARN: Code duplicated, block: B:26:0x0060 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x006d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x006e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0080  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:37:0x008d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:32:0x007a->B:46:?, LOOP_END, SYNTHETIC] */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            C2786R0 c2786r0;
            Object objM18593d;
            C2786R0 c2786r1;
            Object obj2;
            AbstractC21955Q1 abstractC21955Q1;
            String str;
            String str2;
            boolean zM18089b;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40061Z;
            C17296C c17296c = C17296C.f55119a;
            Object obj3 = null;
            VoiceModeViewModelImpl voiceModeViewModelImpl = VoiceModeViewModelImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else if (i10 == 2) {
                    AbstractC9233X.m9807c(obj);
                    abstractC21955Q1 = (AbstractC21955Q1) obj;
                    if (abstractC21955Q1 instanceof C21952P1) {
                        return c17296c;
                    }
                    c2786r0 = (C2786R0) ((C21952P1) abstractC21955Q1).f69511a;
                    C16961l c16961l = voiceModeViewModelImpl.f39993t;
                    this.f40060Y = c2786r0;
                    this.f40061Z = 3;
                    objM18593d = c16961l.m18593d(this);
                    if (objM18593d == enumC19250a) {
                        return enumC19250a;
                    }
                    c2786r1 = c2786r0;
                    obj2 = objM18593d;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2786r1 = this.f40060Y;
                    AbstractC9233X.m9807c(obj);
                    C1708m c1708m = (C1708m) obj;
                    obj2 = c1708m != null ? c1708m.f4890a : null;
                }
                str = (String) obj2;
                for (Object obj4 : c2786r1.f8502a) {
                    str2 = ((C3077j) obj4).f9279b;
                    if (str == null) {
                        zM18089b = false;
                    } else {
                        zM18089b = AbstractC16544l.m18089b(str2, str);
                    }
                    if (zM18089b) {
                        obj3 = obj4;
                        break;
                    }
                }
                voiceModeViewModelImpl.m14397m(new AnonymousClass1(c2786r1, (C3077j) obj3));
                return c17296c;
            }
            AbstractC9233X.m9807c(obj);
            C16961l c16961l2 = voiceModeViewModelImpl.f39993t;
            this.f40061Z = 1;
            obj = AbstractC2124C.m3221t(c16961l2.f54438Z.f64176f, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            c2786r0 = (C2786R0) obj;
            if (c2786r0 == null) {
                C16961l c16961l3 = voiceModeViewModelImpl.f39993t;
                this.f40061Z = 2;
                obj = c16961l3.m18594e(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                abstractC21955Q1 = (AbstractC21955Q1) obj;
                if (abstractC21955Q1 instanceof C21952P1) {
                    return c17296c;
                }
                c2786r0 = (C2786R0) ((C21952P1) abstractC21955Q1).f69511a;
            }
            C16961l c16961l4 = voiceModeViewModelImpl.f39993t;
            this.f40060Y = c2786r0;
            this.f40061Z = 3;
            objM18593d = c16961l4.m18593d(this);
            if (objM18593d == enumC19250a) {
                return enumC19250a;
            }
            c2786r1 = c2786r0;
            obj2 = objM18593d;
            str = (String) obj2;
            while (r1.hasNext()) {
                str2 = ((C3077j) obj4).f9279b;
                if (str == null) {
                    zM18089b = false;
                } else {
                    zM18089b = AbstractC16544l.m18089b(str2, str);
                }
                if (zM18089b) {
                    obj3 = obj4;
                    break;
                }
            }
            voiceModeViewModelImpl.m14397m(new AnonymousClass1(c2786r1, (C3077j) obj3));
            return c17296c;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$7 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$7", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "it", "LFi/i1;", "<anonymous>", "(LEi/n1;)LFi/i1;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125557 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40065Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125557 c125557 = new C125557(2, interfaceC18770c);
            c125557.f40065Y = obj;
            return c125557;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C125557) create((C2532n1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return ((C2532n1) this.f40065Y).f7895b;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$8 */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    final /* synthetic */ class C125568 extends C16533a implements InterfaceC1439n, InterfaceC19693i {
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20862H c20862h;
            AbstractC2829i1 abstractC2829i1 = (AbstractC2829i1) obj;
            VoiceModeViewModelImpl voiceModeViewModelImpl = (VoiceModeViewModelImpl) this.f51270Y;
            C17690x c17690x = C17690x.f56481Y;
            voiceModeViewModelImpl.getClass();
            if (abstractC2829i1 instanceof AbstractC2805a1) {
                c20862h = C20862H.f66409q;
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2794V0.f8521a)) {
                c20862h = C20862H.f66406n;
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2811c1.f8539a)) {
                if (voiceModeViewModelImpl.f39978L) {
                    voiceModeViewModelImpl.f39978L = false;
                } else {
                    c20862h = C20862H.f66412t;
                }
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2826h1.f8565a)) {
                c20862h = C20862H.f66415w;
            } else if (AbstractC16544l.m18089b(abstractC2829i1, C2823g1.f8561a)) {
                c20862h = C20862H.f66413u;
            } else {
                c20862h = AbstractC16544l.m18089b(abstractC2829i1, C2808b1.f8535a) ? C20862H.f66410r : null;
            }
            if (c20862h != null) {
                voiceModeViewModelImpl.m14382u(c20862h, c17690x);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$9 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "LCi/d;", "it", "invoke", "(LEi/n1;LCi/d;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125579 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125579 f40066Y = new C125579();

        public C125579() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C2532n1 setOnEach = (C2532n1) obj;
            C1699d it = (C1699d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            Boolean bool = it.f4834h;
            return C2532n1.m3605e(setOnEach, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, bool != null ? bool.booleanValue() : false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -4194305, 2047);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [An.G, qm.c, qm.i] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v24 */
    public VoiceModeViewModelImpl(C11345b c11345b, C4666u c4666u, C13406b c13406b, C20513d c20513d, C5350a c5350a, C14459O c14459o, C17600b c17600b, InterfaceC13849E interfaceC13849E, C5784h0 c5784h0, C13132J c13132j, InterfaceC17068a gizmosRepositoryProvider, C16382j c16382j, C2854t0 c2854t0, C1991h c1991h, Application application, C13166t c13166t, C16961l c16961l, C13133K c13133k, C13969n2 c13969n2, InterfaceC20904w interfaceC20904w, C11082S c11082s, C19864O c19864o, C13141T c13141t, C14053T0 c14053t0, C11434h c11434h, C2790T0 c2790t0) {
        ?? r6;
        AbstractC16544l.m18094g(gizmosRepositoryProvider, "gizmosRepositoryProvider");
        String str = ((C22011h0) AbstractC17680n.m19351a0((List) c11345b.f34300b.getValue())).f69652a;
        C14005w2 c14005w2 = (C14005w2) interfaceC13849E;
        boolean zM15481a = c14005w2.m15481a(C13848D1.f43886c);
        boolean zM15481a2 = c14005w2.m15481a(C13845C1.f43881c);
        boolean zM15481a3 = c14005w2.m15481a(C13860H1.f43898c);
        boolean zM15481a4 = c14005w2.m15481a(C13857G1.f43896c);
        boolean zM15481a5 = c14005w2.m15481a(C13851E1.f43888c);
        super(new C2532n1(str, null, c14005w2.m15481a(C13861I.f43899c) ? EnumC22033m2.Advanced : EnumC22033m2.Standard, zM15481a, zM15481a2, new C2500d(c14005w2.m15481a(C13896U.f43945c), 14), zM15481a3, zM15481a4, zM15481a5, -49170, 127));
        this.f39982i = c5350a;
        this.f39983j = c14459o;
        this.f39984k = c17600b;
        this.f39985l = c5784h0;
        this.f39986m = c13132j;
        this.f39987n = gizmosRepositoryProvider;
        this.f39988o = c16382j;
        this.f39989p = c2854t0;
        this.f39990q = c1991h;
        this.f39991r = application;
        this.f39992s = c13166t;
        this.f39993t = c16961l;
        this.f39994u = c13133k;
        this.f39995v = c13969n2;
        this.f39996w = interfaceC20904w;
        this.f39997x = c11082s;
        this.f39998y = c19864o;
        this.f39999z = c13141t;
        this.f39967A = c14053t0;
        this.f39968B = c11434h;
        this.f39969C = c2790t0;
        this.f39970D = new C6844a();
        this.f39971E = AbstractC2792U0.m3712c("VoiceModeViewModel");
        this.f39972F = c5784h0.f18840N;
        this.f39973G = c5784h0.f18841O;
        this.f39974H = c5784h0.f18871w;
        this.f39975I = AbstractC9227W.m9800c(new VoiceModeViewModelImpl$gizmosRepository$2(this));
        this.f39976J = AbstractC9227W.m9800c(new VoiceModeViewModelImpl$gizmoId$2(this));
        String strM4498w = AbstractC3794B0.m4498w("toString(...)");
        C21382i.f67878g = strM4498w;
        this.f39977K = strM4498w;
        this.f39980N = new C6844a();
        this.f39981O = new C6844a();
        AbstractC2124C.m3226y(new C2207t0(c5784h0.f18833G, c5784h0.f18827A, new C125331(null), 0), ViewModelKt.m12143a(this));
        m14396l(C125412.f40018Y, c5784h0.f18867s);
        m14396l(C125483.f40039Y, c5350a.f64176f);
        m14396l(C125524.f40049Y, c5784h0.f18839M);
        C18621a c18621aM12143a = ViewModelKt.m12143a(this);
        C3516e c3516e = AbstractC0593T.f1824a;
        AbstractC0575H.m1156D(c18621aM12143a, ExecutorC3515d.f10633Z, null, new C125535(null), 2);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new C125546(null), 3);
        AbstractC2124C.m3226y(new C1970n(AbstractC9206S2.m9771b(new C125557(2, null), this.f40343c), 5, new C125568(2, 4, VoiceModeViewModelImpl.class, this, "trackVoiceState", "trackVoiceState(Lcom/openai/voice/api/VoiceState;Ljava/util/Map;)V")), ViewModelKt.m12143a(this));
        m14396l(C125579.f40066Y, c13132j.f41695r0);
        m14396l(C1253511.f40008Y, AbstractC9206S2.m9771b(new C1253410(2, null), this.f40343c));
        AbstractC2124C.m3226y(new C2207t0(AbstractC9206S2.m9771b(new C1253612(2, null), this.f40343c), c13406b.f42469c, new C1253713(null), 0), ViewModelKt.m12143a(this));
        AbstractC2124C.m3226y(new C1970n(c5784h0.f18845S, 5, new C1253814(null)), ViewModelKt.m12143a(this));
        C1253915 c1253915 = new C1253915(2, null);
        C2207t0 c2207t0 = c14459o.f45526y;
        m14396l(C1254016.f40017Y, new C2146N(AbstractC9206S2.m9771b(c1253915, c2207t0), 2));
        if (((C2532n1) m14391f()).f7909p) {
            final VoiceModeViewModelImpl$special$$inlined$filter$1 voiceModeViewModelImpl$special$$inlined$filter$1 = new VoiceModeViewModelImpl$special$$inlined$filter$1(new VoiceModeViewModelImpl$special$$inlined$map$1(c2207t0));
            AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3215n(new InterfaceC2184i() { // from class: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$2

                /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$2$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C125702<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f40218Y;

                    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$2$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f40219Y;

                        /* JADX INFO: renamed from: Z */
                        public int f40220Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f40219Y = obj;
                            this.f40220Z |= Integer.MIN_VALUE;
                            return C125702.this.mo395a(null, this);
                        }
                    }

                    public C125702(InterfaceC2186j interfaceC2186j) {
                        this.f40218Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f40220Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f40220Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f40219Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f40220Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            Object objM19351a0 = AbstractC17680n.m19351a0((List) obj);
                            anonymousClass1.f40220Z = 1;
                            if (this.f40218Y.mo395a(objM19351a0, anonymousClass1) == enumC19250a) {
                                return enumC19250a;
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
                    Object objMo3141d = voiceModeViewModelImpl$special$$inlined$filter$1.mo3141d(new C125702(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            }), 5, new C1254220(null)), ViewModelKt.m12143a(this));
        }
        if (((C2532n1) m14391f()).f7908o) {
            final VoiceModeViewModelImpl$special$$inlined$map$3 voiceModeViewModelImpl$special$$inlined$map$3 = new VoiceModeViewModelImpl$special$$inlined$map$3(c2207t0);
            AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3215n(new InterfaceC2184i() { // from class: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$2

                /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$2$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C125682<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f40208Y;

                    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$2$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$2$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f40209Y;

                        /* JADX INFO: renamed from: Z */
                        public int f40210Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f40209Y = obj;
                            this.f40210Z |= Integer.MIN_VALUE;
                            return C125682.this.mo395a(null, this);
                        }
                    }

                    public C125682(InterfaceC2186j interfaceC2186j) {
                        this.f40208Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f40210Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f40210Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f40209Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f40210Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            if (!((List) obj).isEmpty()) {
                                anonymousClass1.f40210Z = 1;
                                if (this.f40208Y.mo395a(obj, anonymousClass1) == enumC19250a) {
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
                    Object objMo3141d = voiceModeViewModelImpl$special$$inlined$map$3.mo3141d(new C125682(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            }), 5, new C1254323(null)), ViewModelKt.m12143a(this));
        }
        if (c14005w2.m15481a(C13935f0.f43985c)) {
            C1254424 c1254424 = new C1254424();
            AbstractC8160o6.m8728c(c4666u.f15200f, "Binding interceptClientSideCommands", null, null, 6);
            AbstractC2124C.m3226y(new C1970n(new C2207t0(c4666u.m5378c(), c4666u, c1254424), 5, new C1254525(null)), ViewModelKt.m12143a(this));
        }
        if (((C2532n1) m14391f()).f7887S) {
            r6 = 0;
            r6 = 0;
            InterfaceC6919c interfaceC6919cCreateCameraProvider$default = CameraXHelper.Companion.createCameraProvider$default(CameraXHelper.INSTANCE, ProcessLifecycleOwner.f33399u0, null, 2, null);
            if (interfaceC6919cCreateCameraProvider$default.isSupported(application)) {
                ArrayList arrayList = C6924h.f22195a;
                C8395g c8395g = AbstractC8396h.Companion;
                EnumC8397i enumC8397i = EnumC8397i.f26117Z;
                AbstractC8396h.Companion.getClass();
                if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                    interfaceC6919cCreateCameraProvider$default.getCameraVersion();
                    AbstractC22225a.f70470a.getClass();
                    C16831c.m18567d(new Object[0]);
                }
                C6924h.f22195a.add(interfaceC6919cCreateCameraProvider$default);
                this.f39979M = interfaceC6919cCreateCameraProvider$default;
            }
        } else {
            r6 = 0;
        }
        final C2153Q0 c2153q0 = c19864o.f62964c;
        AbstractC2124C.m3226y(new C1970n(new InterfaceC2184i() { // from class: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$mapNotNull$1$2 */
            @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            public final class C125722<T> implements InterfaceC2186j {

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ InterfaceC2186j f40228Y;

                /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$mapNotNull$1$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {52}, m20658m = "emit")
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class AnonymousClass1 extends AbstractC19687c {

                    /* JADX INFO: renamed from: Y */
                    public /* synthetic */ Object f40229Y;

                    /* JADX INFO: renamed from: Z */
                    public int f40230Z;

                    public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                        super(interfaceC18770c);
                    }

                    @Override // sm.AbstractC19685a
                    public final Object invokeSuspend(Object obj) {
                        this.f40229Y = obj;
                        this.f40230Z |= Integer.MIN_VALUE;
                        return C125722.this.mo395a(null, this);
                    }
                }

                public C125722(InterfaceC2186j interfaceC2186j) {
                    this.f40228Y = interfaceC2186j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p103Dn.InterfaceC2186j
                /* JADX INFO: renamed from: a */
                public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC18770c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                        int i10 = anonymousClass1.f40230Z;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f40230Z = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                    }
                    Object obj2 = anonymousClass1.f40229Y;
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    int i11 = anonymousClass1.f40230Z;
                    if (i11 == 0) {
                        AbstractC9233X.m9807c(obj2);
                        C19874e c19874e = (C19874e) AbstractC17680n.m19352b0(((C19863N) obj).f62956c.values());
                        InterfaceC19878i interfaceC19878i = c19874e != null ? c19874e.f63015c : null;
                        C19876g c19876g = interfaceC19878i instanceof C19876g ? (C19876g) interfaceC19878i : null;
                        if (c19876g != null) {
                            anonymousClass1.f40230Z = 1;
                            if (this.f40228Y.mo395a(c19876g, anonymousClass1) == enumC19250a) {
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
            public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) throws Throwable {
                c2153q0.mo3141d(new C125722(interfaceC2186j), interfaceC18770c);
                return EnumC19250a.f61036Y;
            }
        }, 5, new C1254628(r6)), ViewModelKt.m12143a(this));
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), r6, r6, new C1254729(r6), 3);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), r6, r6, new C1254930(r6), 3);
        C5801u c5801u = c5784h0.f18870v;
        m14396l(C1255031.f40047Y, c5801u.f18946k);
        m14396l(C1255132.f40048Y, c5801u.f18948m);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:118:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:123:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:128:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:130:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:134:0x040c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0416  */
    /* JADX WARN: Code duplicated, block: B:139:0x0420  */
    /* JADX WARN: Code duplicated, block: B:141:0x0424  */
    /* JADX WARN: Code duplicated, block: B:143:0x042b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0435  */
    /* JADX WARN: Code duplicated, block: B:152:0x0454  */
    /* JADX WARN: Code duplicated, block: B:153:0x0457  */
    /* JADX WARN: Code duplicated, block: B:156:0x0465  */
    /* JADX WARN: Code duplicated, block: B:157:0x046a  */
    /* JADX WARN: Code duplicated, block: B:159:0x046e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0474  */
    /* JADX WARN: Code duplicated, block: B:162:0x0477  */
    /* JADX WARN: Code duplicated, block: B:164:0x047b  */
    /* JADX WARN: Code duplicated, block: B:166:0x047f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0487  */
    /* JADX WARN: Code duplicated, block: B:173:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:174:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:177:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:178:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:180:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:182:0x0503  */
    /* JADX WARN: Code duplicated, block: B:185:0x0510  */
    /* JADX WARN: Code duplicated, block: B:187:0x0514  */
    /* JADX WARN: Code duplicated, block: B:190:0x0522  */
    /* JADX WARN: Code duplicated, block: B:192:0x0526  */
    /* JADX WARN: Code duplicated, block: B:194:0x052c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0539  */
    /* JADX WARN: Code duplicated, block: B:199:0x053d  */
    /* JADX WARN: Code duplicated, block: B:200:0x053f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0543  */
    /* JADX WARN: Code duplicated, block: B:206:0x0550  */
    /* JADX WARN: Code duplicated, block: B:208:0x0556  */
    /* JADX WARN: Code duplicated, block: B:211:0x0563  */
    /* JADX WARN: Code duplicated, block: B:213:0x0567  */
    /* JADX WARN: Code duplicated, block: B:215:0x056b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0258  */
    /* JADX WARN: Code duplicated, block: B:43:0x0268  */
    /* JADX WARN: Code duplicated, block: B:48:0x028d  */
    /* JADX WARN: Code duplicated, block: B:50:0x029a A[PHI: r0 r1 r3 r4 r5 r6 r7 r8 r9 r10 r11
      0x029a: PHI (r0v11 boolean) = (r0v9 boolean), (r0v18 boolean) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r1v27 java.lang.String) = (r1v24 java.lang.String), (r1v32 java.lang.String) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r3v22 zi.A) = (r3v19 zi.A), (r3v40 zi.A) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r4v15 mh.l) = (r4v11 mh.l), (r4v22 mh.l) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r5v18 Kh.o) = (r5v14 Kh.o), (r5v23 Kh.o) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r6v18 Id.b) = (r6v14 Id.b), (r6v23 Id.b) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r7v17 Ei.n1) = (r7v13 Ei.n1), (r7v22 Ei.n1) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r8v15 Mc.a) = (r8v11 Mc.a), (r8v19 Mc.a) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r9v12 zi.m2) = (r9v8 zi.m2), (r9v16 zi.m2) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r10v9 Gi.D) = (r10v6 Gi.D), (r10v12 Gi.D) binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]
      0x029a: PHI (r11v6 com.openai.feature.voice.impl.VoiceModeViewModelImpl) = 
      (r11v4 com.openai.feature.voice.impl.VoiceModeViewModelImpl)
      (r11v10 com.openai.feature.voice.impl.VoiceModeViewModelImpl)
     binds: [B:42:0x0266, B:47:0x028b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x02d8 A[Catch: all -> 0x0581, TRY_LEAVE, TryCatch #0 {all -> 0x0581, blocks: (B:59:0x02ce, B:61:0x02d8), top: B:227:0x02ce }] */
    /* JADX WARN: Code duplicated, block: B:63:0x02db  */
    /* JADX WARN: Code duplicated, block: B:65:0x02de  */
    /* JADX WARN: Code duplicated, block: B:66:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:72:0x031a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0331  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0341  */
    /* JADX WARN: Code duplicated, block: B:88:0x0358  */
    /* JADX WARN: Code duplicated, block: B:93:0x036a  */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Throwable, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX INFO: renamed from: n */
    public static final Object m14375n(VoiceModeViewModelImpl voiceModeViewModelImpl, EnumC3062D enumC3062D, EnumC22033m2 enumC22033m2, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        VoiceModeViewModelImpl$connectImpl$1 voiceModeViewModelImpl$connectImpl$1;
        C5317a c5317aM5877a;
        C2532n1 c2532n1;
        EnumC3062D enumC3062D2;
        EnumC22033m2 enumC22033m3;
        boolean z10;
        C3694b c3694b;
        Object objM3221t;
        VoiceModeViewModelImpl voiceModeViewModelImpl2;
        EnumC3062D enumC3062D3;
        boolean z11;
        C3694b c3694b2;
        C5317a c5317a;
        EnumC22033m2 enumC22033m4;
        C2532n1 c2532n2;
        C4688o c4688oM21453a;
        C17263k c17263k;
        EnumC17264l enumC17264lM18970a;
        Object objM3221t2;
        VoiceModeViewModelImpl voiceModeViewModelImpl3;
        EnumC3062D enumC3062D4;
        EnumC22033m2 enumC22033m5;
        C5317a c5317a2;
        C2532n1 c2532n3;
        C3694b c3694b3;
        C4688o c4688o;
        EnumC17264l enumC17264l;
        C21891A c21891a;
        String str;
        Object objM18593d;
        C3694b c3694b4;
        C2532n1 c2532n4;
        EnumC22033m2 enumC22033m6;
        EnumC3062D enumC3062D5;
        String str2;
        C21891A c21891a2;
        EnumC17264l enumC17264l2;
        VoiceModeViewModelImpl voiceModeViewModelImpl4;
        C4688o c4688o2;
        C5317a c5317aM5877a2;
        C5317a c5317a3;
        C5317a c5317a4;
        String str3;
        String str4;
        C21936L0 c21936l0;
        String str5;
        String str6;
        EnumC3062D enumC3062D6;
        EnumC22033m2 enumC22033m7;
        C5317a c5317a5;
        Object objM14380s;
        C21891A c21891a3;
        String str7;
        EnumC17264l enumC17264l3;
        C4688o c4688o3;
        C2532n1 c2532n5;
        VoiceModeViewModelImpl voiceModeViewModelImpl5;
        EnumC3062D enumC3062D7;
        EnumC22033m2 enumC22033m8;
        C5317a c5317a6;
        C21902C2 c21902c2;
        C2529m1 c2529m1;
        Object objM3221t3;
        boolean z12;
        C21902C2 c21902c3;
        C5317a c5317a7;
        String str8;
        EnumC3062D enumC3062D8;
        C2532n1 c2532n6;
        C3694b c3694b5;
        List list;
        Object obj;
        C22057s2 c22057s2;
        List list2;
        Iterator it;
        Object next;
        C22081y2 c22081y2;
        C22045p2 c22045p2;
        C1699d c1699d;
        boolean z13;
        Boolean bool;
        Boolean bool2;
        boolean zM18089b;
        boolean z14;
        boolean z15;
        String str9;
        String str10;
        String str11;
        String str12;
        C21936L0 c21936l1;
        String str13;
        String str14;
        EnumC22033m2 enumC22033m9;
        EnumC22033m2 enumC22033m10;
        boolean zBooleanValue;
        String str15;
        C21902C2 c21902c4;
        boolean z16;
        String str16;
        C2532n1 c2532n7;
        VoiceModeViewModelImpl voiceModeViewModelImpl6;
        C21902C2 c21902c5;
        C2532n1 c2532n8;
        VoiceModeViewModelImpl voiceModeViewModelImpl7;
        C22081y2 c22081y2M22334b;
        String str17;
        C22038o c22038o;
        EnumC22034n enumC22034n;
        int i10;
        ?? r10;
        boolean z17;
        C22081y2 c22081y2M22334b2;
        boolean zM18089b2;
        C22069v2 c22069v2;
        C22081y2 c22081y2M22334b3;
        boolean zM18089b3;
        C22069v2 c22069v3;
        C22081y2 c22081y2M22334b4;
        boolean zM18089b4;
        C22069v2 c22069v4;
        VoiceModeViewModelImpl voiceModeViewModelImpl8 = voiceModeViewModelImpl;
        if (abstractC19687c instanceof VoiceModeViewModelImpl$connectImpl$1) {
            voiceModeViewModelImpl$connectImpl$1 = (VoiceModeViewModelImpl$connectImpl$1) abstractC19687c;
            int i11 = voiceModeViewModelImpl$connectImpl$1.f40078A0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = i11 - Integer.MIN_VALUE;
            } else {
                voiceModeViewModelImpl$connectImpl$1 = new VoiceModeViewModelImpl$connectImpl$1(voiceModeViewModelImpl8, abstractC19687c);
            }
        } else {
            voiceModeViewModelImpl$connectImpl$1 = new VoiceModeViewModelImpl$connectImpl$1(voiceModeViewModelImpl8, abstractC19687c);
        }
        Object objM3221t4 = voiceModeViewModelImpl$connectImpl$1.f40091y0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i12 = voiceModeViewModelImpl$connectImpl$1.f40078A0;
        C17296C c17296c = C17296C.f55119a;
        boolean z18 = false;
        switch (i12) {
            case 0:
                AbstractC9233X.m9807c(objM3221t4);
                c5317aM5877a = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68239r0, null);
                c5317aM5877a.m5876b();
                String string = UUID.randomUUID().toString();
                AbstractC16544l.m18093f(string, "toString(...)");
                C21382i.f67878g = string;
                voiceModeViewModelImpl8.f39977K = string;
                voiceModeViewModelImpl8.m14382u(C20862H.f66414v, C17690x.f56481Y);
                c2532n1 = (C2532n1) voiceModeViewModelImpl.m14391f();
                C2207t0 c2207t0 = voiceModeViewModelImpl8.f39983j.f45526y;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl8;
                enumC3062D2 = enumC3062D;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D2;
                enumC22033m3 = enumC22033m2;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317aM5877a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n1;
                z10 = z6;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z10;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 1;
                objM3221t4 = AbstractC2124C.m3221t(c2207t0, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t4 == enumC19250a) {
                    return enumC19250a;
                }
                c3694b = (C3694b) objM3221t4;
                C2207t0 c2207t1 = voiceModeViewModelImpl8.f39984k.f56349b;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl8;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D2;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317aM5877a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n1;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z10;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 2;
                objM3221t = AbstractC2124C.m3221t(c2207t1, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl2 = voiceModeViewModelImpl8;
                enumC3062D3 = enumC3062D2;
                z11 = z10;
                c3694b2 = c3694b;
                c5317a = c5317aM5877a;
                objM3221t4 = objM3221t;
                enumC22033m4 = enumC22033m3;
                c2532n2 = c2532n1;
                c4688oM21453a = ((C20909b) objM3221t4).m21453a();
                voiceModeViewModelImpl2.m14397m(new VoiceModeViewModelImpl$connectImpl$2(voiceModeViewModelImpl2, c3694b2));
                c17263k = EnumC17264l.f55058o0;
                C1970n c1970n = voiceModeViewModelImpl2.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c17263k;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 3;
                objM3221t4 = AbstractC2124C.m3221t(c1970n, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t4 == enumC19250a) {
                    return enumC19250a;
                }
                Application application = voiceModeViewModelImpl2.f39991r;
                c17263k.getClass();
                enumC17264lM18970a = C17263k.m18970a((C1699d) objM3221t4, application);
                InterfaceC2184i interfaceC2184i = voiceModeViewModelImpl2.f39992s.f41802f;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264lM18970a;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 4;
                objM3221t2 = AbstractC2124C.m3221t(interfaceC2184i, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t2 == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl3 = voiceModeViewModelImpl2;
                enumC3062D4 = enumC3062D3;
                enumC22033m5 = enumC22033m4;
                c5317a2 = c5317a;
                c2532n3 = c2532n2;
                c3694b3 = c3694b2;
                c4688o = c4688oM21453a;
                enumC17264l = enumC17264lM18970a;
                objM3221t4 = objM3221t2;
                c21891a = (C21891A) objM3221t4;
                str = c3694b3.f11227l;
                if (str == null) {
                    C16961l c16961l = voiceModeViewModelImpl3.f39993t;
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl3;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D4;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m5;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n3;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b3;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a;
                    voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 5;
                    objM18593d = c16961l.m18593d(voiceModeViewModelImpl$connectImpl$1);
                    if (objM18593d == enumC19250a) {
                        return enumC19250a;
                    }
                    str = (String) objM18593d;
                    if (str == null) {
                        c21891a2 = c21891a;
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = null;
                    } else {
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = str;
                        c21891a2 = c21891a;
                    }
                } else {
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = str;
                    c21891a2 = c21891a;
                }
                enumC17264l2 = enumC17264l;
                voiceModeViewModelImpl4 = voiceModeViewModelImpl3;
                c4688o2 = c4688o;
                voiceModeViewModelImpl4.m14397m(new VoiceModeViewModelImpl$connectImpl$3(voiceModeViewModelImpl4, str2));
                if (AbstractC16544l.m18089b(str2, "straw")) {
                    voiceModeViewModelImpl4.f39994u.m14817a(VoiceModeViewModelImpl$connectImpl$4.f40097Y);
                }
                c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68240s0, c5317a2);
                try {
                    c5317aM5877a2.m5876b();
                    str3 = c3694b4.f11216a;
                    if (str3 == null) {
                        str4 = null;
                    } else {
                        str4 = str3;
                    }
                    try {
                        c21936l0 = (C21936L0) voiceModeViewModelImpl4.f39976J.getValue();
                        if (c21936l0 != null) {
                            str5 = c21936l0.f69488a;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str6 = null;
                        } else {
                            str6 = str5;
                        }
                        voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl4;
                        voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D5;
                        voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m6;
                        voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                        voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n4;
                        voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b4;
                        voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o2;
                        voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l2;
                        voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a2;
                        voiceModeViewModelImpl$connectImpl$1.f40088v0 = str2;
                        voiceModeViewModelImpl$connectImpl$1.f40089w0 = c5317aM5877a2;
                        voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                        voiceModeViewModelImpl$connectImpl$1.f40078A0 = 6;
                        c5317a3 = c5317aM5877a2;
                        String str18 = str6;
                        enumC3062D6 = enumC3062D5;
                        enumC22033m7 = enumC22033m6;
                        c5317a5 = c5317a2;
                        try {
                            objM14380s = voiceModeViewModelImpl4.m14380s(str4, str18, enumC22033m6, str2, voiceModeViewModelImpl$connectImpl$1);
                            if (objM14380s == enumC19250a) {
                                return enumC19250a;
                            }
                            c21891a3 = c21891a2;
                            objM3221t4 = objM14380s;
                            str7 = str2;
                            enumC17264l3 = enumC17264l2;
                            c4688o3 = c4688o2;
                            c2532n5 = c2532n4;
                            voiceModeViewModelImpl5 = voiceModeViewModelImpl4;
                            enumC3062D7 = enumC3062D6;
                            c5317a4 = c5317a3;
                            enumC22033m8 = enumC22033m7;
                            c5317a6 = c5317a5;
                            c21902c2 = (C21902C2) objM3221t4;
                            c5317a4.m5875a();
                            if (c21902c2 != null && (list2 = c21902c2.f69437b) != null) {
                                it = list2.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next = it.next();
                                    } else {
                                        next = null;
                                    }
                                    c22081y2 = (C22081y2) next;
                                    if (c22081y2 == null && (c22045p2 = c22081y2.f69804c) != null) {
                                        voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$6$1(c22045p2));
                                    }
                                    return c17296c;
                                } while (enumC22033m8 != ((C22081y2) next).f69803b);
                                c22081y2 = (C22081y2) next;
                                if (c22081y2 == null) {
                                }
                            }
                            if (c21902c2 != null || (list = c21902c2.f69437b) == null) {
                                c2529m1 = null;
                            } else {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        Iterator it3 = it2;
                                        if (((C22081y2) next2).f69803b == c21902c2.f69436a) {
                                            obj = next2;
                                        } else {
                                            it2 = it3;
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                C22081y2 c22081y3 = (C22081y2) obj;
                                if (c22081y3 == null || (c22057s2 = c22081y3.f69805d) == null) {
                                    c2529m1 = null;
                                } else {
                                    if (enumC22033m8 != null || !c22057s2.f69751e) {
                                        c22057s2 = null;
                                    }
                                    if (c22057s2 != null) {
                                        c2529m1 = new C2529m1(c22057s2);
                                    } else {
                                        c2529m1 = null;
                                    }
                                }
                            }
                            C1970n c1970n2 = voiceModeViewModelImpl5.f39986m.f41695r0;
                            voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                            voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                            voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                            voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                            voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                            voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                            voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                            voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                            voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                            voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                            voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                            voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                            voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                            objM3221t3 = AbstractC2124C.m3221t(c1970n2, voiceModeViewModelImpl$connectImpl$1);
                            if (objM3221t3 == enumC19250a) {
                                return enumC19250a;
                            }
                            z12 = z11;
                            c21902c3 = c21902c2;
                            c5317a7 = c5317a6;
                            objM3221t4 = objM3221t3;
                            str8 = str7;
                            enumC3062D8 = enumC3062D7;
                            C3694b c3694b6 = c3694b4;
                            c2532n6 = c2532n5;
                            c3694b5 = c3694b6;
                            c1699d = (C1699d) objM3221t4;
                            if (c21891a3.m22330i()) {
                                c22038o = c21891a3.f69415a;
                                if (c22038o != null) {
                                    enumC22034n = c22038o.f69716f;
                                } else {
                                    enumC22034n = null;
                                }
                                if (enumC22034n == EnumC22034n.f69698Z) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            } else {
                                z13 = false;
                            }
                            if (c21902c3 == null && c21902c3.m22335c() && z13) {
                                zM18089b = AbstractC16544l.m18089b(c1699d.f4829c, Boolean.TRUE);
                            } else {
                                bool = c1699d.f4829c;
                                bool2 = Boolean.TRUE;
                                if (AbstractC16544l.m18089b(bool, bool2) || !AbstractC16544l.m18089b(c1699d.f4830d, bool2)) {
                                    zM18089b = false;
                                } else {
                                    zM18089b = true;
                                }
                            }
                            if (c21902c3 != null) {
                                z14 = true;
                                if (!c21902c3.m22335c() && z13 && zM18089b && c2532n6.f7887S) {
                                    z15 = true;
                                }
                                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                                str9 = c3694b5.f11216a;
                                str10 = voiceModeViewModelImpl5.f39977K;
                                str11 = c4688o3.f15253b;
                                EnumC17264l.f55058o0.getClass();
                                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                                if (enumC17264l3 == EnumC17264l.Auto) {
                                    str12 = null;
                                } else {
                                    str12 = enumC17264l3.f55064Y;
                                }
                                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                                if (c21936l1 != null) {
                                    str13 = c21936l1.f69488a;
                                } else {
                                    str13 = null;
                                }
                                if (c21902c3 != null) {
                                    c22081y2M22334b = c21902c3.m22334b();
                                    if (c22081y2M22334b != null) {
                                        str17 = c22081y2M22334b.f69802a;
                                    } else {
                                        str17 = null;
                                    }
                                    str14 = str17;
                                } else {
                                    str14 = null;
                                }
                                if (c21902c3 != null || (enumC22033m9 = c21902c3.f69436a) == null) {
                                    enumC22033m9 = EnumC22033m2.Standard;
                                }
                                enumC22033m10 = enumC22033m9;
                                C5431w.f17746g.getClass();
                                C11082S savedStateHandle = voiceModeViewModelImpl5.f39997x;
                                AbstractC16544l.m18094g(savedStateHandle, "savedStateHandle");
                                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle)).booleanValue();
                                if (c21902c3 != null) {
                                    str15 = c21902c3.f69438c;
                                } else {
                                    str15 = null;
                                }
                                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                                c21902c4 = c21902c3;
                                z16 = z14;
                                str16 = str14;
                                c2532n7 = c2532n6;
                                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                                    return enumC19250a;
                                }
                                c21902c5 = c21902c4;
                                c2532n8 = c2532n7;
                                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                                if (c21902c5 == null) {
                                    i10 = 6;
                                    r10 = 0;
                                } else {
                                    c22081y2M22334b4 = c21902c5.m22334b();
                                    if (c22081y2M22334b4 != null || (c22069v4 = c22081y2M22334b4.f69809h) == null) {
                                        zM18089b4 = false;
                                    } else {
                                        zM18089b4 = AbstractC16544l.m18089b(c22069v4.f69770a, Boolean.TRUE);
                                    }
                                    if (zM18089b4 == z16 || c2532n8.f7883O) {
                                        i10 = 6;
                                        r10 = 0;
                                    } else {
                                        i10 = 6;
                                        r10 = 0;
                                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Video capability is enabled in voice status but not in statsig", null, null, 6);
                                    }
                                }
                                if (c21902c5 == null) {
                                    z17 = false;
                                } else {
                                    c22081y2M22334b3 = c21902c5.m22334b();
                                    if (c22081y2M22334b3 != null || (c22069v3 = c22081y2M22334b3.f69809h) == null) {
                                        zM18089b3 = false;
                                    } else {
                                        zM18089b3 = AbstractC16544l.m18089b(c22069v3.f69771b, Boolean.TRUE);
                                    }
                                    if (zM18089b3 == z16) {
                                        z17 = z16;
                                    } else {
                                        z17 = false;
                                    }
                                }
                                if (z17 && !c2532n8.f7884P) {
                                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                                }
                                if (c21902c5 != null) {
                                    c22081y2M22334b2 = c21902c5.m22334b();
                                    if (c22081y2M22334b2 != null || (c22069v2 = c22081y2M22334b2.f69809h) == null) {
                                        zM18089b2 = false;
                                    } else {
                                        zM18089b2 = AbstractC16544l.m18089b(c22069v2.f69772c, Boolean.TRUE);
                                    }
                                    if (zM18089b2 == z16) {
                                        z18 = z16;
                                    }
                                }
                                if (z18 && !c2532n8.f7885Q) {
                                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                                }
                                return c17296c;
                            }
                            z14 = true;
                            z15 = false;
                            voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                            str9 = c3694b5.f11216a;
                            str10 = voiceModeViewModelImpl5.f39977K;
                            str11 = c4688o3.f15253b;
                            EnumC17264l.f55058o0.getClass();
                            AbstractC16544l.m18094g(enumC17264l3, "<this>");
                            if (enumC17264l3 == EnumC17264l.Auto) {
                                str12 = null;
                            } else {
                                str12 = enumC17264l3.f55064Y;
                            }
                            c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                            if (c21936l1 != null) {
                                str13 = c21936l1.f69488a;
                            } else {
                                str13 = null;
                            }
                            if (c21902c3 != null) {
                                c22081y2M22334b = c21902c3.m22334b();
                                if (c22081y2M22334b != null) {
                                    str17 = c22081y2M22334b.f69802a;
                                } else {
                                    str17 = null;
                                }
                                str14 = str17;
                            } else {
                                str14 = null;
                            }
                            if (c21902c3 != null) {
                                enumC22033m9 = EnumC22033m2.Standard;
                            } else {
                                enumC22033m9 = EnumC22033m2.Standard;
                            }
                            enumC22033m10 = enumC22033m9;
                            C5431w.f17746g.getClass();
                            C11082S savedStateHandle2 = voiceModeViewModelImpl5.f39997x;
                            AbstractC16544l.m18094g(savedStateHandle2, "savedStateHandle");
                            zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle2)).booleanValue();
                            if (c21902c3 != null) {
                                str15 = c21902c3.f69438c;
                            } else {
                                str15 = null;
                            }
                            voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                            voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                            voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                            voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                            voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                            c21902c4 = c21902c3;
                            z16 = z14;
                            str16 = str14;
                            c2532n7 = c2532n6;
                            voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                            if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                                return enumC19250a;
                            }
                            c21902c5 = c21902c4;
                            c2532n8 = c2532n7;
                            voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                            if (c21902c5 == null) {
                                i10 = 6;
                                r10 = 0;
                            } else {
                                c22081y2M22334b4 = c21902c5.m22334b();
                                if (c22081y2M22334b4 != null) {
                                    zM18089b4 = false;
                                } else {
                                    zM18089b4 = false;
                                }
                                if (zM18089b4 == z16) {
                                    i10 = 6;
                                    r10 = 0;
                                } else {
                                    i10 = 6;
                                    r10 = 0;
                                }
                            }
                            if (c21902c5 == null) {
                                z17 = false;
                            } else {
                                c22081y2M22334b3 = c21902c5.m22334b();
                                if (c22081y2M22334b3 != null) {
                                    zM18089b3 = false;
                                } else {
                                    zM18089b3 = false;
                                }
                                if (zM18089b3 == z16) {
                                    z17 = z16;
                                } else {
                                    z17 = false;
                                }
                            }
                            if (z17) {
                                AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                            }
                            if (c21902c5 != null) {
                                c22081y2M22334b2 = c21902c5.m22334b();
                                if (c22081y2M22334b2 != null) {
                                    zM18089b2 = false;
                                } else {
                                    zM18089b2 = false;
                                }
                                if (zM18089b2 == z16) {
                                    z18 = z16;
                                }
                            }
                            if (z18) {
                                AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                            }
                            return c17296c;
                        } catch (Throwable th2) {
                            th = th2;
                            c5317a4 = c5317a3;
                            c5317a4.m5875a();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c5317a3 = c5317aM5877a2;
                        c5317a4 = c5317a3;
                        c5317a4.m5875a();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
                break;
            case 1:
                boolean z19 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                c2532n1 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                c5317aM5877a = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                EnumC22033m2 enumC22033m11 = (EnumC22033m2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                EnumC3062D enumC3062D9 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                VoiceModeViewModelImpl voiceModeViewModelImpl9 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                z10 = z19;
                voiceModeViewModelImpl8 = voiceModeViewModelImpl9;
                enumC22033m3 = enumC22033m11;
                enumC3062D2 = enumC3062D9;
                c3694b = (C3694b) objM3221t4;
                C2207t0 c2207t2 = voiceModeViewModelImpl8.f39984k.f56349b;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl8;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D2;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317aM5877a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n1;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z10;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 2;
                objM3221t = AbstractC2124C.m3221t(c2207t2, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl2 = voiceModeViewModelImpl8;
                enumC3062D3 = enumC3062D2;
                z11 = z10;
                c3694b2 = c3694b;
                c5317a = c5317aM5877a;
                objM3221t4 = objM3221t;
                enumC22033m4 = enumC22033m3;
                c2532n2 = c2532n1;
                c4688oM21453a = ((C20909b) objM3221t4).m21453a();
                voiceModeViewModelImpl2.m14397m(new VoiceModeViewModelImpl$connectImpl$2(voiceModeViewModelImpl2, c3694b2));
                c17263k = EnumC17264l.f55058o0;
                C1970n c1970n3 = voiceModeViewModelImpl2.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c17263k;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 3;
                objM3221t4 = AbstractC2124C.m3221t(c1970n3, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t4 == enumC19250a) {
                    return enumC19250a;
                }
                Application application2 = voiceModeViewModelImpl2.f39991r;
                c17263k.getClass();
                enumC17264lM18970a = C17263k.m18970a((C1699d) objM3221t4, application2);
                InterfaceC2184i interfaceC2184i2 = voiceModeViewModelImpl2.f39992s.f41802f;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264lM18970a;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 4;
                objM3221t2 = AbstractC2124C.m3221t(interfaceC2184i2, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t2 == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl3 = voiceModeViewModelImpl2;
                enumC3062D4 = enumC3062D3;
                enumC22033m5 = enumC22033m4;
                c5317a2 = c5317a;
                c2532n3 = c2532n2;
                c3694b3 = c3694b2;
                c4688o = c4688oM21453a;
                enumC17264l = enumC17264lM18970a;
                objM3221t4 = objM3221t2;
                c21891a = (C21891A) objM3221t4;
                str = c3694b3.f11227l;
                if (str == null) {
                    C16961l c16961l2 = voiceModeViewModelImpl3.f39993t;
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl3;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D4;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m5;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n3;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b3;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a;
                    voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 5;
                    objM18593d = c16961l2.m18593d(voiceModeViewModelImpl$connectImpl$1);
                    if (objM18593d == enumC19250a) {
                        return enumC19250a;
                    }
                    str = (String) objM18593d;
                    if (str == null) {
                        c21891a2 = c21891a;
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = null;
                    } else {
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = str;
                        c21891a2 = c21891a;
                    }
                } else {
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = str;
                    c21891a2 = c21891a;
                }
                enumC17264l2 = enumC17264l;
                voiceModeViewModelImpl4 = voiceModeViewModelImpl3;
                c4688o2 = c4688o;
                voiceModeViewModelImpl4.m14397m(new VoiceModeViewModelImpl$connectImpl$3(voiceModeViewModelImpl4, str2));
                if (AbstractC16544l.m18089b(str2, "straw")) {
                    voiceModeViewModelImpl4.f39994u.m14817a(VoiceModeViewModelImpl$connectImpl$4.f40097Y);
                }
                c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68240s0, c5317a2);
                c5317aM5877a2.m5876b();
                str3 = c3694b4.f11216a;
                if (str3 == null) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                c21936l0 = (C21936L0) voiceModeViewModelImpl4.f39976J.getValue();
                if (c21936l0 != null) {
                    str5 = c21936l0.f69488a;
                    break;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = null;
                } else {
                    str6 = str5;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl4;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D5;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o2;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l2;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a2;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = str2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c5317aM5877a2;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 6;
                c5317a3 = c5317aM5877a2;
                String str19 = str6;
                enumC3062D6 = enumC3062D5;
                enumC22033m7 = enumC22033m6;
                c5317a5 = c5317a2;
                objM14380s = voiceModeViewModelImpl4.m14380s(str4, str19, enumC22033m6, str2, voiceModeViewModelImpl$connectImpl$1);
                if (objM14380s == enumC19250a) {
                    return enumC19250a;
                }
                c21891a3 = c21891a2;
                objM3221t4 = objM14380s;
                str7 = str2;
                enumC17264l3 = enumC17264l2;
                c4688o3 = c4688o2;
                c2532n5 = c2532n4;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl4;
                enumC3062D7 = enumC3062D6;
                c5317a4 = c5317a3;
                enumC22033m8 = enumC22033m7;
                c5317a6 = c5317a5;
                c21902c2 = (C21902C2) objM3221t4;
                c5317a4.m5875a();
                if (c21902c2 != null) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        c22081y2 = (C22081y2) next;
                        if (c22081y2 == null) {
                        }
                        break;
                    } while (enumC22033m8 != ((C22081y2) next).f69803b);
                    c22081y2 = (C22081y2) next;
                    if (c22081y2 == null) {
                    }
                    break;
                }
                if (c21902c2 != null) {
                    c2529m1 = null;
                } else {
                    c2529m1 = null;
                }
                C1970n c1970n4 = voiceModeViewModelImpl5.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                objM3221t3 = AbstractC2124C.m3221t(c1970n4, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t3 == enumC19250a) {
                    return enumC19250a;
                }
                z12 = z11;
                c21902c3 = c21902c2;
                c5317a7 = c5317a6;
                objM3221t4 = objM3221t3;
                str8 = str7;
                enumC3062D8 = enumC3062D7;
                C3694b c3694b7 = c3694b4;
                c2532n6 = c2532n5;
                c3694b5 = c3694b7;
                c1699d = (C1699d) objM3221t4;
                if (c21891a3.m22330i()) {
                    z13 = false;
                } else {
                    c22038o = c21891a3.f69415a;
                    if (c22038o != null) {
                        enumC22034n = c22038o.f69716f;
                    } else {
                        enumC22034n = null;
                    }
                    if (enumC22034n == EnumC22034n.f69698Z) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (c21902c3 == null) {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                } else {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                }
                if (c21902c3 != null) {
                    z14 = true;
                    if (!c21902c3.m22335c()) {
                    }
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle3 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle3, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle3)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                }
                z14 = true;
                z15 = false;
                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                str9 = c3694b5.f11216a;
                str10 = voiceModeViewModelImpl5.f39977K;
                str11 = c4688o3.f15253b;
                EnumC17264l.f55058o0.getClass();
                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                if (enumC17264l3 == EnumC17264l.Auto) {
                    str12 = null;
                } else {
                    str12 = enumC17264l3.f55064Y;
                }
                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                if (c21936l1 != null) {
                    str13 = c21936l1.f69488a;
                } else {
                    str13 = null;
                }
                if (c21902c3 != null) {
                    c22081y2M22334b = c21902c3.m22334b();
                    if (c22081y2M22334b != null) {
                        str17 = c22081y2M22334b.f69802a;
                    } else {
                        str17 = null;
                    }
                    str14 = str17;
                } else {
                    str14 = null;
                }
                if (c21902c3 != null) {
                    enumC22033m9 = EnumC22033m2.Standard;
                } else {
                    enumC22033m9 = EnumC22033m2.Standard;
                }
                enumC22033m10 = enumC22033m9;
                C5431w.f17746g.getClass();
                C11082S savedStateHandle4 = voiceModeViewModelImpl5.f39997x;
                AbstractC16544l.m18094g(savedStateHandle4, "savedStateHandle");
                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle4)).booleanValue();
                if (c21902c3 != null) {
                    str15 = c21902c3.f69438c;
                } else {
                    str15 = null;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                c21902c4 = c21902c3;
                z16 = z14;
                str16 = str14;
                c2532n7 = c2532n6;
                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                    return enumC19250a;
                }
                c21902c5 = c21902c4;
                c2532n8 = c2532n7;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            case 2:
                z11 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                C3694b c3694b8 = (C3694b) voiceModeViewModelImpl$connectImpl$1.f40084r0;
                C2532n1 c2532n9 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                C5317a c5317a8 = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                EnumC22033m2 enumC22033m12 = (EnumC22033m2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                EnumC3062D enumC3062D10 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                VoiceModeViewModelImpl voiceModeViewModelImpl10 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                enumC3062D3 = enumC3062D10;
                voiceModeViewModelImpl2 = voiceModeViewModelImpl10;
                c5317a = c5317a8;
                enumC22033m4 = enumC22033m12;
                c3694b2 = c3694b8;
                c2532n2 = c2532n9;
                c4688oM21453a = ((C20909b) objM3221t4).m21453a();
                voiceModeViewModelImpl2.m14397m(new VoiceModeViewModelImpl$connectImpl$2(voiceModeViewModelImpl2, c3694b2));
                c17263k = EnumC17264l.f55058o0;
                C1970n c1970n5 = voiceModeViewModelImpl2.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c17263k;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 3;
                objM3221t4 = AbstractC2124C.m3221t(c1970n5, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t4 == enumC19250a) {
                    return enumC19250a;
                }
                Application application3 = voiceModeViewModelImpl2.f39991r;
                c17263k.getClass();
                enumC17264lM18970a = C17263k.m18970a((C1699d) objM3221t4, application3);
                InterfaceC2184i interfaceC2184i3 = voiceModeViewModelImpl2.f39992s.f41802f;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264lM18970a;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 4;
                objM3221t2 = AbstractC2124C.m3221t(interfaceC2184i3, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t2 == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl3 = voiceModeViewModelImpl2;
                enumC3062D4 = enumC3062D3;
                enumC22033m5 = enumC22033m4;
                c5317a2 = c5317a;
                c2532n3 = c2532n2;
                c3694b3 = c3694b2;
                c4688o = c4688oM21453a;
                enumC17264l = enumC17264lM18970a;
                objM3221t4 = objM3221t2;
                c21891a = (C21891A) objM3221t4;
                str = c3694b3.f11227l;
                if (str == null) {
                    C16961l c16961l3 = voiceModeViewModelImpl3.f39993t;
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl3;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D4;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m5;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n3;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b3;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a;
                    voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 5;
                    objM18593d = c16961l3.m18593d(voiceModeViewModelImpl$connectImpl$1);
                    if (objM18593d == enumC19250a) {
                        return enumC19250a;
                    }
                    str = (String) objM18593d;
                    if (str == null) {
                        c21891a2 = c21891a;
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = null;
                    } else {
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = str;
                        c21891a2 = c21891a;
                    }
                } else {
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = str;
                    c21891a2 = c21891a;
                }
                enumC17264l2 = enumC17264l;
                voiceModeViewModelImpl4 = voiceModeViewModelImpl3;
                c4688o2 = c4688o;
                voiceModeViewModelImpl4.m14397m(new VoiceModeViewModelImpl$connectImpl$3(voiceModeViewModelImpl4, str2));
                if (AbstractC16544l.m18089b(str2, "straw")) {
                    voiceModeViewModelImpl4.f39994u.m14817a(VoiceModeViewModelImpl$connectImpl$4.f40097Y);
                }
                c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68240s0, c5317a2);
                c5317aM5877a2.m5876b();
                str3 = c3694b4.f11216a;
                if (str3 == null) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                c21936l0 = (C21936L0) voiceModeViewModelImpl4.f39976J.getValue();
                if (c21936l0 != null) {
                    str5 = c21936l0.f69488a;
                    break;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = null;
                } else {
                    str6 = str5;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl4;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D5;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o2;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l2;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a2;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = str2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c5317aM5877a2;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 6;
                c5317a3 = c5317aM5877a2;
                String str110 = str6;
                enumC3062D6 = enumC3062D5;
                enumC22033m7 = enumC22033m6;
                c5317a5 = c5317a2;
                objM14380s = voiceModeViewModelImpl4.m14380s(str4, str110, enumC22033m6, str2, voiceModeViewModelImpl$connectImpl$1);
                if (objM14380s == enumC19250a) {
                    return enumC19250a;
                }
                c21891a3 = c21891a2;
                objM3221t4 = objM14380s;
                str7 = str2;
                enumC17264l3 = enumC17264l2;
                c4688o3 = c4688o2;
                c2532n5 = c2532n4;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl4;
                enumC3062D7 = enumC3062D6;
                c5317a4 = c5317a3;
                enumC22033m8 = enumC22033m7;
                c5317a6 = c5317a5;
                c21902c2 = (C21902C2) objM3221t4;
                c5317a4.m5875a();
                if (c21902c2 != null) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        c22081y2 = (C22081y2) next;
                        if (c22081y2 == null) {
                        }
                        break;
                    } while (enumC22033m8 != ((C22081y2) next).f69803b);
                    c22081y2 = (C22081y2) next;
                    if (c22081y2 == null) {
                    }
                    break;
                }
                if (c21902c2 != null) {
                    c2529m1 = null;
                } else {
                    c2529m1 = null;
                }
                C1970n c1970n6 = voiceModeViewModelImpl5.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                objM3221t3 = AbstractC2124C.m3221t(c1970n6, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t3 == enumC19250a) {
                    return enumC19250a;
                }
                z12 = z11;
                c21902c3 = c21902c2;
                c5317a7 = c5317a6;
                objM3221t4 = objM3221t3;
                str8 = str7;
                enumC3062D8 = enumC3062D7;
                C3694b c3694b9 = c3694b4;
                c2532n6 = c2532n5;
                c3694b5 = c3694b9;
                c1699d = (C1699d) objM3221t4;
                if (c21891a3.m22330i()) {
                    z13 = false;
                } else {
                    c22038o = c21891a3.f69415a;
                    if (c22038o != null) {
                        enumC22034n = c22038o.f69716f;
                    } else {
                        enumC22034n = null;
                    }
                    if (enumC22034n == EnumC22034n.f69698Z) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (c21902c3 == null) {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                } else {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                }
                if (c21902c3 != null) {
                    z14 = true;
                    if (!c21902c3.m22335c()) {
                    }
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle5 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle5, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle5)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                }
                z14 = true;
                z15 = false;
                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                str9 = c3694b5.f11216a;
                str10 = voiceModeViewModelImpl5.f39977K;
                str11 = c4688o3.f15253b;
                EnumC17264l.f55058o0.getClass();
                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                if (enumC17264l3 == EnumC17264l.Auto) {
                    str12 = null;
                } else {
                    str12 = enumC17264l3.f55064Y;
                }
                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                if (c21936l1 != null) {
                    str13 = c21936l1.f69488a;
                } else {
                    str13 = null;
                }
                if (c21902c3 != null) {
                    c22081y2M22334b = c21902c3.m22334b();
                    if (c22081y2M22334b != null) {
                        str17 = c22081y2M22334b.f69802a;
                    } else {
                        str17 = null;
                    }
                    str14 = str17;
                } else {
                    str14 = null;
                }
                if (c21902c3 != null) {
                    enumC22033m9 = EnumC22033m2.Standard;
                } else {
                    enumC22033m9 = EnumC22033m2.Standard;
                }
                enumC22033m10 = enumC22033m9;
                C5431w.f17746g.getClass();
                C11082S savedStateHandle6 = voiceModeViewModelImpl5.f39997x;
                AbstractC16544l.m18094g(savedStateHandle6, "savedStateHandle");
                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle6)).booleanValue();
                if (c21902c3 != null) {
                    str15 = c21902c3.f69438c;
                } else {
                    str15 = null;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                c21902c4 = c21902c3;
                z16 = z14;
                str16 = str14;
                c2532n7 = c2532n6;
                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                    return enumC19250a;
                }
                c21902c5 = c21902c4;
                c2532n8 = c2532n7;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            case 3:
                z11 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                c17263k = (C17263k) voiceModeViewModelImpl$connectImpl$1.f40086t0;
                c4688oM21453a = (C4688o) voiceModeViewModelImpl$connectImpl$1.f40085s0;
                c3694b2 = (C3694b) voiceModeViewModelImpl$connectImpl$1.f40084r0;
                c2532n2 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                c5317a = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                enumC22033m4 = (EnumC22033m2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                enumC3062D3 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                voiceModeViewModelImpl2 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                Application application4 = voiceModeViewModelImpl2.f39991r;
                c17263k.getClass();
                enumC17264lM18970a = C17263k.m18970a((C1699d) objM3221t4, application4);
                InterfaceC2184i interfaceC2184i4 = voiceModeViewModelImpl2.f39992s.f41802f;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D3;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m4;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n2;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b2;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688oM21453a;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264lM18970a;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 4;
                objM3221t2 = AbstractC2124C.m3221t(interfaceC2184i4, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t2 == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl3 = voiceModeViewModelImpl2;
                enumC3062D4 = enumC3062D3;
                enumC22033m5 = enumC22033m4;
                c5317a2 = c5317a;
                c2532n3 = c2532n2;
                c3694b3 = c3694b2;
                c4688o = c4688oM21453a;
                enumC17264l = enumC17264lM18970a;
                objM3221t4 = objM3221t2;
                c21891a = (C21891A) objM3221t4;
                str = c3694b3.f11227l;
                if (str == null) {
                    C16961l c16961l4 = voiceModeViewModelImpl3.f39993t;
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl3;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D4;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m5;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n3;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b3;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a;
                    voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 5;
                    objM18593d = c16961l4.m18593d(voiceModeViewModelImpl$connectImpl$1);
                    if (objM18593d == enumC19250a) {
                        return enumC19250a;
                    }
                    str = (String) objM18593d;
                    if (str == null) {
                        c21891a2 = c21891a;
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = null;
                    } else {
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = str;
                        c21891a2 = c21891a;
                    }
                } else {
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = str;
                    c21891a2 = c21891a;
                }
                enumC17264l2 = enumC17264l;
                voiceModeViewModelImpl4 = voiceModeViewModelImpl3;
                c4688o2 = c4688o;
                voiceModeViewModelImpl4.m14397m(new VoiceModeViewModelImpl$connectImpl$3(voiceModeViewModelImpl4, str2));
                if (AbstractC16544l.m18089b(str2, "straw")) {
                    voiceModeViewModelImpl4.f39994u.m14817a(VoiceModeViewModelImpl$connectImpl$4.f40097Y);
                }
                c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68240s0, c5317a2);
                c5317aM5877a2.m5876b();
                str3 = c3694b4.f11216a;
                if (str3 == null) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                c21936l0 = (C21936L0) voiceModeViewModelImpl4.f39976J.getValue();
                if (c21936l0 != null) {
                    str5 = c21936l0.f69488a;
                    break;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = null;
                } else {
                    str6 = str5;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl4;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D5;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o2;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l2;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a2;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = str2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c5317aM5877a2;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 6;
                c5317a3 = c5317aM5877a2;
                String str111 = str6;
                enumC3062D6 = enumC3062D5;
                enumC22033m7 = enumC22033m6;
                c5317a5 = c5317a2;
                objM14380s = voiceModeViewModelImpl4.m14380s(str4, str111, enumC22033m6, str2, voiceModeViewModelImpl$connectImpl$1);
                if (objM14380s == enumC19250a) {
                    return enumC19250a;
                }
                c21891a3 = c21891a2;
                objM3221t4 = objM14380s;
                str7 = str2;
                enumC17264l3 = enumC17264l2;
                c4688o3 = c4688o2;
                c2532n5 = c2532n4;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl4;
                enumC3062D7 = enumC3062D6;
                c5317a4 = c5317a3;
                enumC22033m8 = enumC22033m7;
                c5317a6 = c5317a5;
                c21902c2 = (C21902C2) objM3221t4;
                c5317a4.m5875a();
                if (c21902c2 != null) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        c22081y2 = (C22081y2) next;
                        if (c22081y2 == null) {
                        }
                        break;
                    } while (enumC22033m8 != ((C22081y2) next).f69803b);
                    c22081y2 = (C22081y2) next;
                    if (c22081y2 == null) {
                    }
                    break;
                }
                if (c21902c2 != null) {
                    c2529m1 = null;
                } else {
                    c2529m1 = null;
                }
                C1970n c1970n7 = voiceModeViewModelImpl5.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                objM3221t3 = AbstractC2124C.m3221t(c1970n7, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t3 == enumC19250a) {
                    return enumC19250a;
                }
                z12 = z11;
                c21902c3 = c21902c2;
                c5317a7 = c5317a6;
                objM3221t4 = objM3221t3;
                str8 = str7;
                enumC3062D8 = enumC3062D7;
                C3694b c3694b10 = c3694b4;
                c2532n6 = c2532n5;
                c3694b5 = c3694b10;
                c1699d = (C1699d) objM3221t4;
                if (c21891a3.m22330i()) {
                    z13 = false;
                } else {
                    c22038o = c21891a3.f69415a;
                    if (c22038o != null) {
                        enumC22034n = c22038o.f69716f;
                    } else {
                        enumC22034n = null;
                    }
                    if (enumC22034n == EnumC22034n.f69698Z) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (c21902c3 == null) {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                } else {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                }
                if (c21902c3 != null) {
                    z14 = true;
                    if (!c21902c3.m22335c()) {
                    }
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle7 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle7, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle7)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                }
                z14 = true;
                z15 = false;
                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                str9 = c3694b5.f11216a;
                str10 = voiceModeViewModelImpl5.f39977K;
                str11 = c4688o3.f15253b;
                EnumC17264l.f55058o0.getClass();
                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                if (enumC17264l3 == EnumC17264l.Auto) {
                    str12 = null;
                } else {
                    str12 = enumC17264l3.f55064Y;
                }
                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                if (c21936l1 != null) {
                    str13 = c21936l1.f69488a;
                } else {
                    str13 = null;
                }
                if (c21902c3 != null) {
                    c22081y2M22334b = c21902c3.m22334b();
                    if (c22081y2M22334b != null) {
                        str17 = c22081y2M22334b.f69802a;
                    } else {
                        str17 = null;
                    }
                    str14 = str17;
                } else {
                    str14 = null;
                }
                if (c21902c3 != null) {
                    enumC22033m9 = EnumC22033m2.Standard;
                } else {
                    enumC22033m9 = EnumC22033m2.Standard;
                }
                enumC22033m10 = enumC22033m9;
                C5431w.f17746g.getClass();
                C11082S savedStateHandle8 = voiceModeViewModelImpl5.f39997x;
                AbstractC16544l.m18094g(savedStateHandle8, "savedStateHandle");
                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle8)).booleanValue();
                if (c21902c3 != null) {
                    str15 = c21902c3.f69438c;
                } else {
                    str15 = null;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                c21902c4 = c21902c3;
                z16 = z14;
                str16 = str14;
                c2532n7 = c2532n6;
                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                    return enumC19250a;
                }
                c21902c5 = c21902c4;
                c2532n8 = c2532n7;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            case 4:
                z11 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                EnumC17264l enumC17264l4 = (EnumC17264l) voiceModeViewModelImpl$connectImpl$1.f40086t0;
                C4688o c4688o4 = (C4688o) voiceModeViewModelImpl$connectImpl$1.f40085s0;
                C3694b c3694b11 = (C3694b) voiceModeViewModelImpl$connectImpl$1.f40084r0;
                C2532n1 c2532n10 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                C5317a c5317a9 = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                EnumC22033m2 enumC22033m13 = (EnumC22033m2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                EnumC3062D enumC3062D11 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                VoiceModeViewModelImpl voiceModeViewModelImpl11 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                voiceModeViewModelImpl3 = voiceModeViewModelImpl11;
                enumC3062D4 = enumC3062D11;
                enumC22033m5 = enumC22033m13;
                c5317a2 = c5317a9;
                c2532n3 = c2532n10;
                c3694b3 = c3694b11;
                c4688o = c4688o4;
                enumC17264l = enumC17264l4;
                c21891a = (C21891A) objM3221t4;
                str = c3694b3.f11227l;
                if (str == null) {
                    C16961l c16961l5 = voiceModeViewModelImpl3.f39993t;
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl3;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D4;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m5;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n3;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b3;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a;
                    voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 5;
                    objM18593d = c16961l5.m18593d(voiceModeViewModelImpl$connectImpl$1);
                    if (objM18593d == enumC19250a) {
                        return enumC19250a;
                    }
                    str = (String) objM18593d;
                    if (str == null) {
                        c21891a2 = c21891a;
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = null;
                    } else {
                        c3694b4 = c3694b3;
                        c2532n4 = c2532n3;
                        enumC22033m6 = enumC22033m5;
                        enumC3062D5 = enumC3062D4;
                        str2 = str;
                        c21891a2 = c21891a;
                    }
                } else {
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = str;
                    c21891a2 = c21891a;
                }
                enumC17264l2 = enumC17264l;
                voiceModeViewModelImpl4 = voiceModeViewModelImpl3;
                c4688o2 = c4688o;
                voiceModeViewModelImpl4.m14397m(new VoiceModeViewModelImpl$connectImpl$3(voiceModeViewModelImpl4, str2));
                if (AbstractC16544l.m18089b(str2, "straw")) {
                    voiceModeViewModelImpl4.f39994u.m14817a(VoiceModeViewModelImpl$connectImpl$4.f40097Y);
                }
                c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68240s0, c5317a2);
                c5317aM5877a2.m5876b();
                str3 = c3694b4.f11216a;
                if (str3 == null) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                c21936l0 = (C21936L0) voiceModeViewModelImpl4.f39976J.getValue();
                if (c21936l0 != null) {
                    str5 = c21936l0.f69488a;
                    break;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = null;
                } else {
                    str6 = str5;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl4;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D5;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o2;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l2;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a2;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = str2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c5317aM5877a2;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 6;
                c5317a3 = c5317aM5877a2;
                String str112 = str6;
                enumC3062D6 = enumC3062D5;
                enumC22033m7 = enumC22033m6;
                c5317a5 = c5317a2;
                objM14380s = voiceModeViewModelImpl4.m14380s(str4, str112, enumC22033m6, str2, voiceModeViewModelImpl$connectImpl$1);
                if (objM14380s == enumC19250a) {
                    return enumC19250a;
                }
                c21891a3 = c21891a2;
                objM3221t4 = objM14380s;
                str7 = str2;
                enumC17264l3 = enumC17264l2;
                c4688o3 = c4688o2;
                c2532n5 = c2532n4;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl4;
                enumC3062D7 = enumC3062D6;
                c5317a4 = c5317a3;
                enumC22033m8 = enumC22033m7;
                c5317a6 = c5317a5;
                c21902c2 = (C21902C2) objM3221t4;
                c5317a4.m5875a();
                if (c21902c2 != null) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        c22081y2 = (C22081y2) next;
                        if (c22081y2 == null) {
                        }
                        break;
                    } while (enumC22033m8 != ((C22081y2) next).f69803b);
                    c22081y2 = (C22081y2) next;
                    if (c22081y2 == null) {
                    }
                    break;
                }
                if (c21902c2 != null) {
                    c2529m1 = null;
                } else {
                    c2529m1 = null;
                }
                C1970n c1970n8 = voiceModeViewModelImpl5.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                objM3221t3 = AbstractC2124C.m3221t(c1970n8, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t3 == enumC19250a) {
                    return enumC19250a;
                }
                z12 = z11;
                c21902c3 = c21902c2;
                c5317a7 = c5317a6;
                objM3221t4 = objM3221t3;
                str8 = str7;
                enumC3062D8 = enumC3062D7;
                C3694b c3694b12 = c3694b4;
                c2532n6 = c2532n5;
                c3694b5 = c3694b12;
                c1699d = (C1699d) objM3221t4;
                if (c21891a3.m22330i()) {
                    z13 = false;
                } else {
                    c22038o = c21891a3.f69415a;
                    if (c22038o != null) {
                        enumC22034n = c22038o.f69716f;
                    } else {
                        enumC22034n = null;
                    }
                    if (enumC22034n == EnumC22034n.f69698Z) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (c21902c3 == null) {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                } else {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                }
                if (c21902c3 != null) {
                    z14 = true;
                    if (!c21902c3.m22335c()) {
                    }
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle9 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle9, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle9)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                }
                z14 = true;
                z15 = false;
                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                str9 = c3694b5.f11216a;
                str10 = voiceModeViewModelImpl5.f39977K;
                str11 = c4688o3.f15253b;
                EnumC17264l.f55058o0.getClass();
                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                if (enumC17264l3 == EnumC17264l.Auto) {
                    str12 = null;
                } else {
                    str12 = enumC17264l3.f55064Y;
                }
                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                if (c21936l1 != null) {
                    str13 = c21936l1.f69488a;
                } else {
                    str13 = null;
                }
                if (c21902c3 != null) {
                    c22081y2M22334b = c21902c3.m22334b();
                    if (c22081y2M22334b != null) {
                        str17 = c22081y2M22334b.f69802a;
                    } else {
                        str17 = null;
                    }
                    str14 = str17;
                } else {
                    str14 = null;
                }
                if (c21902c3 != null) {
                    enumC22033m9 = EnumC22033m2.Standard;
                } else {
                    enumC22033m9 = EnumC22033m2.Standard;
                }
                enumC22033m10 = enumC22033m9;
                C5431w.f17746g.getClass();
                C11082S savedStateHandle10 = voiceModeViewModelImpl5.f39997x;
                AbstractC16544l.m18094g(savedStateHandle10, "savedStateHandle");
                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle10)).booleanValue();
                if (c21902c3 != null) {
                    str15 = c21902c3.f69438c;
                } else {
                    str15 = null;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                c21902c4 = c21902c3;
                z16 = z14;
                str16 = str14;
                c2532n7 = c2532n6;
                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                    return enumC19250a;
                }
                c21902c5 = c21902c4;
                c2532n8 = c2532n7;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            case 5:
                z11 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                c21891a = (C21891A) voiceModeViewModelImpl$connectImpl$1.f40087u0;
                enumC17264l = (EnumC17264l) voiceModeViewModelImpl$connectImpl$1.f40086t0;
                c4688o = (C4688o) voiceModeViewModelImpl$connectImpl$1.f40085s0;
                c3694b3 = (C3694b) voiceModeViewModelImpl$connectImpl$1.f40084r0;
                c2532n3 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                c5317a2 = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                enumC22033m5 = (EnumC22033m2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                enumC3062D4 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                voiceModeViewModelImpl3 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                C1708m c1708m = (C1708m) objM3221t4;
                objM18593d = c1708m != null ? c1708m.f4890a : null;
                str = (String) objM18593d;
                if (str == null) {
                    c21891a2 = c21891a;
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = null;
                } else {
                    c3694b4 = c3694b3;
                    c2532n4 = c2532n3;
                    enumC22033m6 = enumC22033m5;
                    enumC3062D5 = enumC3062D4;
                    str2 = str;
                    c21891a2 = c21891a;
                }
                enumC17264l2 = enumC17264l;
                voiceModeViewModelImpl4 = voiceModeViewModelImpl3;
                c4688o2 = c4688o;
                voiceModeViewModelImpl4.m14397m(new VoiceModeViewModelImpl$connectImpl$3(voiceModeViewModelImpl4, str2));
                if (AbstractC16544l.m18089b(str2, "straw")) {
                    voiceModeViewModelImpl4.f39994u.m14817a(VoiceModeViewModelImpl$connectImpl$4.f40097Y);
                }
                c5317aM5877a2 = AbstractC21544c.m21827a().m5877a(EnumC21542a.f68240s0, c5317a2);
                c5317aM5877a2.m5876b();
                str3 = c3694b4.f11216a;
                if (str3 == null) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                c21936l0 = (C21936L0) voiceModeViewModelImpl4.f39976J.getValue();
                if (c21936l0 != null) {
                    str5 = c21936l0.f69488a;
                    break;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = null;
                } else {
                    str6 = str5;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl4;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D5;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = enumC22033m6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c5317a2;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c2532n4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = c4688o2;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = enumC17264l2;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = c21891a2;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = str2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c5317aM5877a2;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 6;
                c5317a3 = c5317aM5877a2;
                String str113 = str6;
                enumC3062D6 = enumC3062D5;
                enumC22033m7 = enumC22033m6;
                c5317a5 = c5317a2;
                objM14380s = voiceModeViewModelImpl4.m14380s(str4, str113, enumC22033m6, str2, voiceModeViewModelImpl$connectImpl$1);
                if (objM14380s == enumC19250a) {
                    return enumC19250a;
                }
                c21891a3 = c21891a2;
                objM3221t4 = objM14380s;
                str7 = str2;
                enumC17264l3 = enumC17264l2;
                c4688o3 = c4688o2;
                c2532n5 = c2532n4;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl4;
                enumC3062D7 = enumC3062D6;
                c5317a4 = c5317a3;
                enumC22033m8 = enumC22033m7;
                c5317a6 = c5317a5;
                c21902c2 = (C21902C2) objM3221t4;
                c5317a4.m5875a();
                if (c21902c2 != null) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        c22081y2 = (C22081y2) next;
                        if (c22081y2 == null) {
                        }
                        break;
                    } while (enumC22033m8 != ((C22081y2) next).f69803b);
                    c22081y2 = (C22081y2) next;
                    if (c22081y2 == null) {
                    }
                    break;
                }
                if (c21902c2 != null) {
                    c2529m1 = null;
                } else {
                    c2529m1 = null;
                }
                C1970n c1970n9 = voiceModeViewModelImpl5.f39986m.f41695r0;
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                objM3221t3 = AbstractC2124C.m3221t(c1970n9, voiceModeViewModelImpl$connectImpl$1);
                if (objM3221t3 == enumC19250a) {
                    return enumC19250a;
                }
                z12 = z11;
                c21902c3 = c21902c2;
                c5317a7 = c5317a6;
                objM3221t4 = objM3221t3;
                str8 = str7;
                enumC3062D8 = enumC3062D7;
                C3694b c3694b13 = c3694b4;
                c2532n6 = c2532n5;
                c3694b5 = c3694b13;
                c1699d = (C1699d) objM3221t4;
                if (c21891a3.m22330i()) {
                    z13 = false;
                } else {
                    c22038o = c21891a3.f69415a;
                    if (c22038o != null) {
                        enumC22034n = c22038o.f69716f;
                    } else {
                        enumC22034n = null;
                    }
                    if (enumC22034n == EnumC22034n.f69698Z) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (c21902c3 == null) {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                } else {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                }
                if (c21902c3 != null) {
                    z14 = true;
                    if (!c21902c3.m22335c()) {
                    }
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle11 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle11, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle11)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                }
                z14 = true;
                z15 = false;
                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                str9 = c3694b5.f11216a;
                str10 = voiceModeViewModelImpl5.f39977K;
                str11 = c4688o3.f15253b;
                EnumC17264l.f55058o0.getClass();
                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                if (enumC17264l3 == EnumC17264l.Auto) {
                    str12 = null;
                } else {
                    str12 = enumC17264l3.f55064Y;
                }
                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                if (c21936l1 != null) {
                    str13 = c21936l1.f69488a;
                } else {
                    str13 = null;
                }
                if (c21902c3 != null) {
                    c22081y2M22334b = c21902c3.m22334b();
                    if (c22081y2M22334b != null) {
                        str17 = c22081y2M22334b.f69802a;
                    } else {
                        str17 = null;
                    }
                    str14 = str17;
                } else {
                    str14 = null;
                }
                if (c21902c3 != null) {
                    enumC22033m9 = EnumC22033m2.Standard;
                } else {
                    enumC22033m9 = EnumC22033m2.Standard;
                }
                enumC22033m10 = enumC22033m9;
                C5431w.f17746g.getClass();
                C11082S savedStateHandle12 = voiceModeViewModelImpl5.f39997x;
                AbstractC16544l.m18094g(savedStateHandle12, "savedStateHandle");
                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle12)).booleanValue();
                if (c21902c3 != null) {
                    str15 = c21902c3.f69438c;
                } else {
                    str15 = null;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                c21902c4 = c21902c3;
                z16 = z14;
                str16 = str14;
                c2532n7 = c2532n6;
                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                    return enumC19250a;
                }
                c21902c5 = c21902c4;
                c2532n8 = c2532n7;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            case 6:
                z11 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                c5317a4 = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40089w0;
                str7 = (String) voiceModeViewModelImpl$connectImpl$1.f40088v0;
                C21891A c21891a4 = (C21891A) voiceModeViewModelImpl$connectImpl$1.f40087u0;
                EnumC17264l enumC17264l5 = (EnumC17264l) voiceModeViewModelImpl$connectImpl$1.f40086t0;
                C4688o c4688o5 = (C4688o) voiceModeViewModelImpl$connectImpl$1.f40085s0;
                C3694b c3694b14 = (C3694b) voiceModeViewModelImpl$connectImpl$1.f40084r0;
                c2532n5 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                c5317a6 = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                enumC22033m8 = (EnumC22033m2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                EnumC3062D enumC3062D12 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                try {
                    AbstractC9233X.m9807c(objM3221t4);
                    c21891a3 = c21891a4;
                    enumC3062D7 = enumC3062D12;
                    c3694b4 = c3694b14;
                    c4688o3 = c4688o5;
                    enumC17264l3 = enumC17264l5;
                    c21902c2 = (C21902C2) objM3221t4;
                    c5317a4.m5875a();
                    if (c21902c2 != null) {
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            c22081y2 = (C22081y2) next;
                            if (c22081y2 == null) {
                            }
                            break;
                        } while (enumC22033m8 != ((C22081y2) next).f69803b);
                        c22081y2 = (C22081y2) next;
                        if (c22081y2 == null) {
                        }
                        break;
                    }
                    if (c21902c2 != null) {
                        c2529m1 = null;
                    } else {
                        c2529m1 = null;
                    }
                    C1970n c1970n10 = voiceModeViewModelImpl5.f39986m.f41695r0;
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = enumC3062D7;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c5317a6;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = c2532n5;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = c3694b4;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = c4688o3;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = enumC17264l3;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = c21891a3;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = str7;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = c21902c2;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = c2529m1;
                    voiceModeViewModelImpl$connectImpl$1.f40090x0 = z11;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 7;
                    objM3221t3 = AbstractC2124C.m3221t(c1970n10, voiceModeViewModelImpl$connectImpl$1);
                    if (objM3221t3 == enumC19250a) {
                        return enumC19250a;
                    }
                    z12 = z11;
                    c21902c3 = c21902c2;
                    c5317a7 = c5317a6;
                    objM3221t4 = objM3221t3;
                    str8 = str7;
                    enumC3062D8 = enumC3062D7;
                    C3694b c3694b15 = c3694b4;
                    c2532n6 = c2532n5;
                    c3694b5 = c3694b15;
                    c1699d = (C1699d) objM3221t4;
                    if (c21891a3.m22330i()) {
                        z13 = false;
                    } else {
                        c22038o = c21891a3.f69415a;
                        if (c22038o != null) {
                            enumC22034n = c22038o.f69716f;
                        } else {
                            enumC22034n = null;
                        }
                        if (enumC22034n == EnumC22034n.f69698Z) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    }
                    if (c21902c3 == null) {
                        bool = c1699d.f4829c;
                        bool2 = Boolean.TRUE;
                        if (AbstractC16544l.m18089b(bool, bool2)) {
                            zM18089b = false;
                        } else {
                            zM18089b = false;
                        }
                    } else {
                        bool = c1699d.f4829c;
                        bool2 = Boolean.TRUE;
                        if (AbstractC16544l.m18089b(bool, bool2)) {
                            zM18089b = false;
                        } else {
                            zM18089b = false;
                        }
                    }
                    if (c21902c3 != null) {
                        z14 = true;
                        if (!c21902c3.m22335c()) {
                        }
                        voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                        str9 = c3694b5.f11216a;
                        str10 = voiceModeViewModelImpl5.f39977K;
                        str11 = c4688o3.f15253b;
                        EnumC17264l.f55058o0.getClass();
                        AbstractC16544l.m18094g(enumC17264l3, "<this>");
                        if (enumC17264l3 == EnumC17264l.Auto) {
                            str12 = null;
                        } else {
                            str12 = enumC17264l3.f55064Y;
                        }
                        c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                        if (c21936l1 != null) {
                            str13 = c21936l1.f69488a;
                        } else {
                            str13 = null;
                        }
                        if (c21902c3 != null) {
                            c22081y2M22334b = c21902c3.m22334b();
                            if (c22081y2M22334b != null) {
                                str17 = c22081y2M22334b.f69802a;
                            } else {
                                str17 = null;
                            }
                            str14 = str17;
                        } else {
                            str14 = null;
                        }
                        if (c21902c3 != null) {
                            enumC22033m9 = EnumC22033m2.Standard;
                        } else {
                            enumC22033m9 = EnumC22033m2.Standard;
                        }
                        enumC22033m10 = enumC22033m9;
                        C5431w.f17746g.getClass();
                        C11082S savedStateHandle13 = voiceModeViewModelImpl5.f39997x;
                        AbstractC16544l.m18094g(savedStateHandle13, "savedStateHandle");
                        zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle13)).booleanValue();
                        if (c21902c3 != null) {
                            str15 = c21902c3.f69438c;
                        } else {
                            str15 = null;
                        }
                        voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                        voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                        voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                        voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                        voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                        c21902c4 = c21902c3;
                        z16 = z14;
                        str16 = str14;
                        c2532n7 = c2532n6;
                        voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                        if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        c21902c5 = c21902c4;
                        c2532n8 = c2532n7;
                        voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                        if (c21902c5 == null) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            c22081y2M22334b4 = c21902c5.m22334b();
                            if (c22081y2M22334b4 != null) {
                                zM18089b4 = false;
                            } else {
                                zM18089b4 = false;
                            }
                            if (zM18089b4 == z16) {
                                i10 = 6;
                                r10 = 0;
                            } else {
                                i10 = 6;
                                r10 = 0;
                            }
                        }
                        if (c21902c5 == null) {
                            z17 = false;
                        } else {
                            c22081y2M22334b3 = c21902c5.m22334b();
                            if (c22081y2M22334b3 != null) {
                                zM18089b3 = false;
                            } else {
                                zM18089b3 = false;
                            }
                            if (zM18089b3 == z16) {
                                z17 = z16;
                            } else {
                                z17 = false;
                            }
                        }
                        if (z17) {
                            AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                        }
                        if (c21902c5 != null) {
                            c22081y2M22334b2 = c21902c5.m22334b();
                            if (c22081y2M22334b2 != null) {
                                zM18089b2 = false;
                            } else {
                                zM18089b2 = false;
                            }
                            if (zM18089b2 == z16) {
                                z18 = z16;
                            }
                        }
                        if (z18) {
                            AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                        }
                        return c17296c;
                    }
                    z14 = true;
                    z15 = false;
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle14 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle14, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle14)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                } catch (Throwable th5) {
                    th = th5;
                    c5317a4.m5875a();
                    throw th;
                }
            case 7:
                boolean z20 = voiceModeViewModelImpl$connectImpl$1.f40090x0;
                c2529m1 = (C2529m1) voiceModeViewModelImpl$connectImpl$1.f40089w0;
                C21902C2 c21902c6 = (C21902C2) voiceModeViewModelImpl$connectImpl$1.f40088v0;
                String str20 = (String) voiceModeViewModelImpl$connectImpl$1.f40087u0;
                c21891a3 = (C21891A) voiceModeViewModelImpl$connectImpl$1.f40086t0;
                enumC17264l3 = (EnumC17264l) voiceModeViewModelImpl$connectImpl$1.f40085s0;
                c4688o3 = (C4688o) voiceModeViewModelImpl$connectImpl$1.f40084r0;
                c3694b5 = (C3694b) voiceModeViewModelImpl$connectImpl$1.f40083q0;
                C2532n1 c2532n11 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40082p0;
                C5317a c5317a10 = (C5317a) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                EnumC3062D enumC3062D13 = (EnumC3062D) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                voiceModeViewModelImpl5 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                z12 = z20;
                c21902c3 = c21902c6;
                c5317a7 = c5317a10;
                enumC3062D8 = enumC3062D13;
                str8 = str20;
                c2532n6 = c2532n11;
                c1699d = (C1699d) objM3221t4;
                if (c21891a3.m22330i()) {
                    z13 = false;
                } else {
                    c22038o = c21891a3.f69415a;
                    if (c22038o != null) {
                        enumC22034n = c22038o.f69716f;
                    } else {
                        enumC22034n = null;
                    }
                    if (enumC22034n == EnumC22034n.f69698Z) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                }
                if (c21902c3 == null) {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                } else {
                    bool = c1699d.f4829c;
                    bool2 = Boolean.TRUE;
                    if (AbstractC16544l.m18089b(bool, bool2)) {
                        zM18089b = false;
                    } else {
                        zM18089b = false;
                    }
                }
                if (c21902c3 != null) {
                    z14 = true;
                    if (!c21902c3.m22335c()) {
                    }
                    voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                    str9 = c3694b5.f11216a;
                    str10 = voiceModeViewModelImpl5.f39977K;
                    str11 = c4688o3.f15253b;
                    EnumC17264l.f55058o0.getClass();
                    AbstractC16544l.m18094g(enumC17264l3, "<this>");
                    if (enumC17264l3 == EnumC17264l.Auto) {
                        str12 = null;
                    } else {
                        str12 = enumC17264l3.f55064Y;
                    }
                    c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                    if (c21936l1 != null) {
                        str13 = c21936l1.f69488a;
                    } else {
                        str13 = null;
                    }
                    if (c21902c3 != null) {
                        c22081y2M22334b = c21902c3.m22334b();
                        if (c22081y2M22334b != null) {
                            str17 = c22081y2M22334b.f69802a;
                        } else {
                            str17 = null;
                        }
                        str14 = str17;
                    } else {
                        str14 = null;
                    }
                    if (c21902c3 != null) {
                        enumC22033m9 = EnumC22033m2.Standard;
                    } else {
                        enumC22033m9 = EnumC22033m2.Standard;
                    }
                    enumC22033m10 = enumC22033m9;
                    C5431w.f17746g.getClass();
                    C11082S savedStateHandle15 = voiceModeViewModelImpl5.f39997x;
                    AbstractC16544l.m18094g(savedStateHandle15, "savedStateHandle");
                    zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle15)).booleanValue();
                    if (c21902c3 != null) {
                        str15 = c21902c3.f69438c;
                    } else {
                        str15 = null;
                    }
                    voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                    voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                    voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                    voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                    voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                    c21902c4 = c21902c3;
                    z16 = z14;
                    str16 = str14;
                    c2532n7 = c2532n6;
                    voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                    if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c21902c5 = c21902c4;
                    c2532n8 = c2532n7;
                    voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                    if (c21902c5 == null) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        c22081y2M22334b4 = c21902c5.m22334b();
                        if (c22081y2M22334b4 != null) {
                            zM18089b4 = false;
                        } else {
                            zM18089b4 = false;
                        }
                        if (zM18089b4 == z16) {
                            i10 = 6;
                            r10 = 0;
                        } else {
                            i10 = 6;
                            r10 = 0;
                        }
                    }
                    if (c21902c5 == null) {
                        z17 = false;
                    } else {
                        c22081y2M22334b3 = c21902c5.m22334b();
                        if (c22081y2M22334b3 != null) {
                            zM18089b3 = false;
                        } else {
                            zM18089b3 = false;
                        }
                        if (zM18089b3 == z16) {
                            z17 = z16;
                        } else {
                            z17 = false;
                        }
                    }
                    if (z17) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    if (c21902c5 != null) {
                        c22081y2M22334b2 = c21902c5.m22334b();
                        if (c22081y2M22334b2 != null) {
                            zM18089b2 = false;
                        } else {
                            zM18089b2 = false;
                        }
                        if (zM18089b2 == z16) {
                            z18 = z16;
                        }
                    }
                    if (z18) {
                        AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                    }
                    return c17296c;
                }
                z14 = true;
                z15 = false;
                voiceModeViewModelImpl5.m14397m(new VoiceModeViewModelImpl$connectImpl$7(enumC3062D8, c21902c3, z15, c2529m1));
                str9 = c3694b5.f11216a;
                str10 = voiceModeViewModelImpl5.f39977K;
                str11 = c4688o3.f15253b;
                EnumC17264l.f55058o0.getClass();
                AbstractC16544l.m18094g(enumC17264l3, "<this>");
                if (enumC17264l3 == EnumC17264l.Auto) {
                    str12 = null;
                } else {
                    str12 = enumC17264l3.f55064Y;
                }
                c21936l1 = (C21936L0) voiceModeViewModelImpl5.f39976J.getValue();
                if (c21936l1 != null) {
                    str13 = c21936l1.f69488a;
                } else {
                    str13 = null;
                }
                if (c21902c3 != null) {
                    c22081y2M22334b = c21902c3.m22334b();
                    if (c22081y2M22334b != null) {
                        str17 = c22081y2M22334b.f69802a;
                    } else {
                        str17 = null;
                    }
                    str14 = str17;
                } else {
                    str14 = null;
                }
                if (c21902c3 != null) {
                    enumC22033m9 = EnumC22033m2.Standard;
                } else {
                    enumC22033m9 = EnumC22033m2.Standard;
                }
                enumC22033m10 = enumC22033m9;
                C5431w.f17746g.getClass();
                C11082S savedStateHandle16 = voiceModeViewModelImpl5.f39997x;
                AbstractC16544l.m18094g(savedStateHandle16, "savedStateHandle");
                zBooleanValue = ((Boolean) C5431w.f17756q.m5892c(savedStateHandle16)).booleanValue();
                if (c21902c3 != null) {
                    str15 = c21902c3.f69438c;
                } else {
                    str15 = null;
                }
                voiceModeViewModelImpl$connectImpl$1.f40079Y = voiceModeViewModelImpl5;
                voiceModeViewModelImpl$connectImpl$1.f40080Z = c2532n6;
                voiceModeViewModelImpl$connectImpl$1.f40081o0 = c21902c3;
                voiceModeViewModelImpl$connectImpl$1.f40082p0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40083q0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40084r0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40085s0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40086t0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40087u0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40088v0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40089w0 = null;
                voiceModeViewModelImpl$connectImpl$1.f40078A0 = 8;
                c21902c4 = c21902c3;
                z16 = z14;
                str16 = str14;
                c2532n7 = c2532n6;
                voiceModeViewModelImpl6 = voiceModeViewModelImpl5;
                if (voiceModeViewModelImpl5.f39985l.m6174g(enumC3062D8, str9, c3694b5.f11218c, str10, str11, str12, str13, str8, str16, enumC22033m10, zM18089b, z15, zBooleanValue, z12, str15, c5317a7, voiceModeViewModelImpl$connectImpl$1) == enumC19250a) {
                    return enumC19250a;
                }
                c21902c5 = c21902c4;
                c2532n8 = c2532n7;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl6;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            case 8:
                C21902C2 c21902c7 = (C21902C2) voiceModeViewModelImpl$connectImpl$1.f40081o0;
                c2532n8 = (C2532n1) voiceModeViewModelImpl$connectImpl$1.f40080Z;
                voiceModeViewModelImpl7 = voiceModeViewModelImpl$connectImpl$1.f40079Y;
                AbstractC9233X.m9807c(objM3221t4);
                c21902c5 = c21902c7;
                z16 = true;
                if (c21902c5 == null) {
                    i10 = 6;
                    r10 = 0;
                } else {
                    c22081y2M22334b4 = c21902c5.m22334b();
                    if (c22081y2M22334b4 != null) {
                        zM18089b4 = false;
                    } else {
                        zM18089b4 = false;
                    }
                    if (zM18089b4 == z16) {
                        i10 = 6;
                        r10 = 0;
                    } else {
                        i10 = 6;
                        r10 = 0;
                    }
                }
                if (c21902c5 == null) {
                    z17 = false;
                } else {
                    c22081y2M22334b3 = c21902c5.m22334b();
                    if (c22081y2M22334b3 != null) {
                        zM18089b3 = false;
                    } else {
                        zM18089b3 = false;
                    }
                    if (zM18089b3 == z16) {
                        z17 = z16;
                    } else {
                        z17 = false;
                    }
                }
                if (z17) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Screen sharing capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                if (c21902c5 != null) {
                    c22081y2M22334b2 = c21902c5.m22334b();
                    if (c22081y2M22334b2 != null) {
                        zM18089b2 = false;
                    } else {
                        zM18089b2 = false;
                    }
                    if (zM18089b2 == z16) {
                        z18 = z16;
                    }
                }
                if (z18) {
                    AbstractC8160o6.m8731f(voiceModeViewModelImpl7.f39971E, "Image upload capability is enabled in voice status but not in statsig", r10, r10, i10);
                }
                return c17296c;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: o */
    public static final Object m14376o(VoiceModeViewModelImpl voiceModeViewModelImpl, String str, AbstractC19687c abstractC19687c) throws Throwable {
        VoiceModeViewModelImpl$refresh$1 voiceModeViewModelImpl$refresh$1;
        AbstractC21955Q1 abstractC21955Q1;
        C14459O c14459o;
        voiceModeViewModelImpl.getClass();
        if (abstractC19687c instanceof VoiceModeViewModelImpl$refresh$1) {
            voiceModeViewModelImpl$refresh$1 = (VoiceModeViewModelImpl$refresh$1) abstractC19687c;
            int i10 = voiceModeViewModelImpl$refresh$1.f40194q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeViewModelImpl$refresh$1.f40194q0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeViewModelImpl$refresh$1 = new VoiceModeViewModelImpl$refresh$1(voiceModeViewModelImpl, abstractC19687c);
            }
        } else {
            voiceModeViewModelImpl$refresh$1 = new VoiceModeViewModelImpl$refresh$1(voiceModeViewModelImpl, abstractC19687c);
        }
        Object objM3221t = voiceModeViewModelImpl$refresh$1.f40192o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeViewModelImpl$refresh$1.f40194q0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = voiceModeViewModelImpl$refresh$1.f40191Z;
                voiceModeViewModelImpl = (VoiceModeViewModelImpl) voiceModeViewModelImpl$refresh$1.f40190Y;
                AbstractC9233X.m9807c(objM3221t);
            } else if (i11 == 2) {
                voiceModeViewModelImpl = (VoiceModeViewModelImpl) voiceModeViewModelImpl$refresh$1.f40190Y;
                AbstractC9233X.m9807c(objM3221t);
                abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
                if (abstractC21955Q1 instanceof C21952P1) {
                    c14459o = voiceModeViewModelImpl.f39983j;
                    voiceModeViewModelImpl$refresh$1.f40190Y = abstractC21955Q1;
                    voiceModeViewModelImpl$refresh$1.f40194q0 = 3;
                    if (AbstractC8718u.m9434c(c14459o, voiceModeViewModelImpl$refresh$1) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM3221t);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(objM3221t);
        C2207t0 c2207t0 = voiceModeViewModelImpl.f39984k.f56349b;
        voiceModeViewModelImpl$refresh$1.f40190Y = voiceModeViewModelImpl;
        voiceModeViewModelImpl$refresh$1.f40191Z = str;
        voiceModeViewModelImpl$refresh$1.f40194q0 = 1;
        objM3221t = AbstractC2124C.m3221t(c2207t0, voiceModeViewModelImpl$refresh$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        C14459O c14459o2 = voiceModeViewModelImpl.f39983j;
        String str2 = ((C20909b) objM3221t).m21453a().f15253b;
        voiceModeViewModelImpl$refresh$1.f40190Y = voiceModeViewModelImpl;
        voiceModeViewModelImpl$refresh$1.f40191Z = null;
        voiceModeViewModelImpl$refresh$1.f40194q0 = 2;
        objM3221t = c14459o2.m15991t(str, str2, voiceModeViewModelImpl$refresh$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
        if (abstractC21955Q1 instanceof C21952P1) {
            c14459o = voiceModeViewModelImpl.f39983j;
            voiceModeViewModelImpl$refresh$1.f40190Y = abstractC21955Q1;
            voiceModeViewModelImpl$refresh$1.f40194q0 = 3;
            if (AbstractC8718u.m9434c(c14459o, voiceModeViewModelImpl$refresh$1) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: p */
    public static final Object m14377p(VoiceModeViewModelImpl voiceModeViewModelImpl, C3077j c3077j, AbstractC19687c abstractC19687c) {
        VoiceModeViewModelImpl$selectNewVoice$1 voiceModeViewModelImpl$selectNewVoice$1;
        C2532n1 c2532n1;
        VoiceModeViewModelImpl voiceModeViewModelImpl2 = voiceModeViewModelImpl;
        voiceModeViewModelImpl.getClass();
        if (abstractC19687c instanceof VoiceModeViewModelImpl$selectNewVoice$1) {
            voiceModeViewModelImpl$selectNewVoice$1 = (VoiceModeViewModelImpl$selectNewVoice$1) abstractC19687c;
            int i10 = voiceModeViewModelImpl$selectNewVoice$1.f40199q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeViewModelImpl$selectNewVoice$1.f40199q0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeViewModelImpl$selectNewVoice$1 = new VoiceModeViewModelImpl$selectNewVoice$1(voiceModeViewModelImpl2, abstractC19687c);
            }
        } else {
            voiceModeViewModelImpl$selectNewVoice$1 = new VoiceModeViewModelImpl$selectNewVoice$1(voiceModeViewModelImpl2, abstractC19687c);
        }
        VoiceModeViewModelImpl$selectNewVoice$1 voiceModeViewModelImpl$selectNewVoice$2 = voiceModeViewModelImpl$selectNewVoice$1;
        Object obj = voiceModeViewModelImpl$selectNewVoice$2.f40197o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeViewModelImpl$selectNewVoice$2.f40199q0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c2532n1 = (C2532n1) voiceModeViewModelImpl.m14391f();
            if (!c2532n1.f7878J && (!AbstractC2792U0.m3710a(c2532n1.f7895b) || !AbstractC16544l.m18089b(c3077j, c2532n1.f7877I))) {
                voiceModeViewModelImpl2.m14397m(VoiceModeViewModelImpl$selectNewVoice$2.f40200Y);
                String str = c3077j.f9279b;
                voiceModeViewModelImpl$selectNewVoice$2.f40195Y = voiceModeViewModelImpl2;
                voiceModeViewModelImpl$selectNewVoice$2.f40196Z = c2532n1;
                voiceModeViewModelImpl$selectNewVoice$2.f40199q0 = 1;
                if (voiceModeViewModelImpl2.f39993t.m18595f(str, voiceModeViewModelImpl$selectNewVoice$2) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 == 1) {
            C2532n1 c2532n2 = voiceModeViewModelImpl$selectNewVoice$2.f40196Z;
            VoiceModeViewModelImpl voiceModeViewModelImpl3 = voiceModeViewModelImpl$selectNewVoice$2.f40195Y;
            AbstractC9233X.m9807c(obj);
            c2532n1 = c2532n2;
            voiceModeViewModelImpl2 = voiceModeViewModelImpl3;
        } else if (i11 == 2) {
            voiceModeViewModelImpl2 = voiceModeViewModelImpl$selectNewVoice$2.f40195Y;
            AbstractC9233X.m9807c(obj);
            voiceModeViewModelImpl2.m14393h(new C2058g(C5431w.m5902f(C5431w.f17746g, EnumC5421r.f17710Z, null, true, false, 10), true));
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            voiceModeViewModelImpl2 = voiceModeViewModelImpl$selectNewVoice$2.f40195Y;
            AbstractC9233X.m9807c(obj);
        }
        voiceModeViewModelImpl2.m14397m(VoiceModeViewModelImpl$selectNewVoice$3.f40201Y);
        return c17296c;
        if (AbstractC2792U0.m3710a(c2532n1.f7895b)) {
            EnumC3068a enumC3068a = EnumC3068a.RecreateSession;
            voiceModeViewModelImpl$selectNewVoice$2.f40195Y = voiceModeViewModelImpl2;
            voiceModeViewModelImpl$selectNewVoice$2.f40196Z = null;
            voiceModeViewModelImpl$selectNewVoice$2.f40199q0 = 2;
            if (voiceModeViewModelImpl2.m14379r(enumC3068a, voiceModeViewModelImpl$selectNewVoice$2) == enumC19250a) {
                return enumC19250a;
            }
            voiceModeViewModelImpl2.m14393h(new C2058g(C5431w.m5902f(C5431w.f17746g, EnumC5421r.f17710Z, null, true, false, 10), true));
        } else {
            EnumC3062D enumC3062D = EnumC3062D.Voice;
            voiceModeViewModelImpl$selectNewVoice$2.f40195Y = voiceModeViewModelImpl2;
            voiceModeViewModelImpl$selectNewVoice$2.f40196Z = null;
            voiceModeViewModelImpl$selectNewVoice$2.f40199q0 = 3;
            if (voiceModeViewModelImpl2.m14378q(enumC3062D, null, false, false, voiceModeViewModelImpl$selectNewVoice$2) == enumC19250a) {
                return enumC19250a;
            }
        }
        voiceModeViewModelImpl2.m14397m(VoiceModeViewModelImpl$selectNewVoice$3.f40201Y);
        return c17296c;
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        InterfaceC6919c interfaceC6919c = this.f39979M;
        if (interfaceC6919c != null) {
            ArrayList arrayList = C6924h.f22195a;
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26117Z;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                interfaceC6919c.getCameraVersion();
                AbstractC22225a.f70470a.getClass();
                C16831c.m18567d(new Object[0]);
            }
            C6924h.f22195a.remove(interfaceC6919c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: q */
    public final Object m14378q(EnumC3062D enumC3062D, EnumC22033m2 enumC22033m2, boolean z6, boolean z10, AbstractC19687c abstractC19687c) {
        VoiceModeViewModelImpl$connect$1 voiceModeViewModelImpl$connect$1;
        EnumC22033m2 enumC22033m3;
        VoiceModeViewModelImpl voiceModeViewModelImpl;
        EnumC3062D enumC3062D2;
        boolean z11;
        boolean z12;
        Object objM3221t;
        C0564B0 c0564b0;
        Object objMo1272P;
        EnumC3062D enumC3062D3 = enumC3062D;
        if (abstractC19687c instanceof VoiceModeViewModelImpl$connect$1) {
            voiceModeViewModelImpl$connect$1 = (VoiceModeViewModelImpl$connect$1) abstractC19687c;
            int i10 = voiceModeViewModelImpl$connect$1.f40072r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeViewModelImpl$connect$1.f40072r0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeViewModelImpl$connect$1 = new VoiceModeViewModelImpl$connect$1(this, abstractC19687c);
            }
        } else {
            voiceModeViewModelImpl$connect$1 = new VoiceModeViewModelImpl$connect$1(this, abstractC19687c);
        }
        Object obj = voiceModeViewModelImpl$connect$1.f40070p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeViewModelImpl$connect$1.f40072r0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z13 = voiceModeViewModelImpl$connect$1.f40069o0;
                EnumC3062D enumC3062D4 = voiceModeViewModelImpl$connect$1.f40068Z;
                voiceModeViewModelImpl = voiceModeViewModelImpl$connect$1.f40067Y;
                AbstractC9233X.m9807c(obj);
                z12 = z13;
                enumC3062D3 = enumC3062D4;
                objM3221t = obj;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(obj);
        C2532n1 c2532n1 = (C2532n1) m14391f();
        if (z10 && enumC3062D3 == EnumC3062D.Voice) {
            mo14227j(new C2528m0(true));
            return c17296c;
        }
        if (AbstractC2792U0.m3711b(c2532n1.f7895b) && enumC22033m2 == null) {
            C21902C2 c21902c2 = c2532n1.f7897d;
            if (c21902c2 != null) {
                z11 = z6;
                voiceModeViewModelImpl = this;
                enumC3062D2 = enumC3062D3;
                enumC22033m3 = c21902c2.f69436a;
            } else {
                z11 = z6;
                voiceModeViewModelImpl = this;
                enumC3062D2 = enumC3062D3;
                enumC22033m3 = null;
            }
        } else if (enumC22033m2 == null) {
            voiceModeViewModelImpl$connect$1.f40067Y = this;
            voiceModeViewModelImpl$connect$1.f40068Z = enumC3062D3;
            z12 = z6;
            voiceModeViewModelImpl$connect$1.f40069o0 = z12;
            voiceModeViewModelImpl$connect$1.f40072r0 = 1;
            objM3221t = AbstractC2124C.m3221t(this.f39982i.f64176f, voiceModeViewModelImpl$connect$1);
            if (objM3221t == enumC19250a) {
                return enumC19250a;
            }
            voiceModeViewModelImpl = this;
        } else {
            enumC22033m3 = enumC22033m2;
            voiceModeViewModelImpl = this;
            enumC3062D2 = enumC3062D3;
            z11 = z6;
        }
        voiceModeViewModelImpl.f39970D.m7281a(voiceModeViewModelImpl.m14394i(new VoiceModeViewModelImpl$connect$2(voiceModeViewModelImpl, enumC3062D2, enumC22033m3, z11, null)));
        voiceModeViewModelImpl$connect$1.f40067Y = null;
        voiceModeViewModelImpl$connect$1.f40068Z = null;
        voiceModeViewModelImpl$connect$1.f40072r0 = 2;
        c0564b0 = voiceModeViewModelImpl.f39970D.f21949a;
        if (c0564b0 != null || (objMo1272P = c0564b0.mo1272P(voiceModeViewModelImpl$connect$1)) != enumC19250a) {
            objMo1272P = c17296c;
        }
        if (objMo1272P == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
        if (((C8285d) objM3221t).f25831i) {
            enumC3062D2 = enumC3062D3;
            z11 = z12;
            enumC22033m3 = EnumC22033m2.Standard;
        } else {
            enumC3062D2 = enumC3062D3;
            z11 = z12;
            enumC22033m3 = null;
        }
        voiceModeViewModelImpl.f39970D.m7281a(voiceModeViewModelImpl.m14394i(new VoiceModeViewModelImpl$connect$2(voiceModeViewModelImpl, enumC3062D2, enumC22033m3, z11, null)));
        voiceModeViewModelImpl$connect$1.f40067Y = null;
        voiceModeViewModelImpl$connect$1.f40068Z = null;
        voiceModeViewModelImpl$connect$1.f40072r0 = 2;
        c0564b0 = voiceModeViewModelImpl.f39970D.f21949a;
        if (c0564b0 != null) {
            objMo1272P = c17296c;
        } else {
            objMo1272P = c17296c;
        }
        if (objMo1272P == enumC19250a) {
            return enumC19250a;
        }
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b4 A[Catch: all -> 0x0034, TryCatch #3 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0041, B:60:0x00d5, B:25:0x0048, B:55:0x00a8, B:57:0x00b4), top: B:83:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Gi.a] */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.openai.viewmodel.BaseViewModel] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX INFO: renamed from: r */
    public final Object m14379r(EnumC3068a enumC3068a, AbstractC19687c abstractC19687c) throws Throwable {
        VoiceModeViewModelImpl$disconnect$1 voiceModeViewModelImpl$disconnect$1;
        VoiceModeViewModelImpl voiceModeViewModelImpl;
        ?? r10;
        VoiceModeViewModelImpl voiceModeViewModelImpl2;
        long jM8644j;
        C14459O c14459o;
        if (abstractC19687c instanceof VoiceModeViewModelImpl$disconnect$1) {
            voiceModeViewModelImpl$disconnect$1 = (VoiceModeViewModelImpl$disconnect$1) abstractC19687c;
            int i10 = voiceModeViewModelImpl$disconnect$1.f40107q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeViewModelImpl$disconnect$1.f40107q0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeViewModelImpl$disconnect$1 = new VoiceModeViewModelImpl$disconnect$1(this, abstractC19687c);
            }
        } else {
            voiceModeViewModelImpl$disconnect$1 = new VoiceModeViewModelImpl$disconnect$1(this, abstractC19687c);
        }
        Object obj = voiceModeViewModelImpl$disconnect$1.f40105o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeViewModelImpl$disconnect$1.f40107q0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    EnumC3068a enumC3068a2 = voiceModeViewModelImpl$disconnect$1.f40104Z;
                    voiceModeViewModelImpl = voiceModeViewModelImpl$disconnect$1.f40103Y;
                    try {
                        AbstractC9233X.m9807c(obj);
                        r10 = enumC3068a2;
                    } catch (Throwable th2) {
                        th = th2;
                        enumC3068a = voiceModeViewModelImpl;
                        enumC3068a.m14397m(VoiceModeViewModelImpl$disconnect$3.f40109Y);
                        throw th;
                    }
                } else if (i11 == 2) {
                    voiceModeViewModelImpl2 = voiceModeViewModelImpl$disconnect$1.f40103Y;
                    AbstractC9233X.m9807c(obj);
                    if (((C2532n1) voiceModeViewModelImpl2.m14391f()).f7892X == EnumC22033m2.Advanced) {
                        C21554a c21554a = C21555b.f68260Z;
                        jM8644j = AbstractC8128k6.m8644j(((Number) voiceModeViewModelImpl2.f39995v.m15477a(C13922c.f43972d)).intValue(), EnumC21557d.SECONDS);
                        voiceModeViewModelImpl$disconnect$1.f40103Y = voiceModeViewModelImpl2;
                        voiceModeViewModelImpl$disconnect$1.f40107q0 = 3;
                        if (AbstractC0575H.m1185n(jM8644j, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        c14459o = voiceModeViewModelImpl2.f39983j;
                        voiceModeViewModelImpl$disconnect$1.f40103Y = voiceModeViewModelImpl2;
                        voiceModeViewModelImpl$disconnect$1.f40107q0 = 4;
                        if (AbstractC8718u.m9434c(c14459o, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                } else if (i11 == 3) {
                    voiceModeViewModelImpl2 = voiceModeViewModelImpl$disconnect$1.f40103Y;
                    AbstractC9233X.m9807c(obj);
                    c14459o = voiceModeViewModelImpl2.f39983j;
                    voiceModeViewModelImpl$disconnect$1.f40103Y = voiceModeViewModelImpl2;
                    voiceModeViewModelImpl$disconnect$1.f40107q0 = 4;
                    if (AbstractC8718u.m9434c(c14459o, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    voiceModeViewModelImpl2 = voiceModeViewModelImpl$disconnect$1.f40103Y;
                    AbstractC9233X.m9807c(obj);
                }
                voiceModeViewModelImpl = voiceModeViewModelImpl2;
                voiceModeViewModelImpl.m14397m(VoiceModeViewModelImpl$disconnect$3.f40109Y);
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            try {
                m14397m(VoiceModeViewModelImpl$disconnect$2.f40108Y);
                C19864O c19864o = this.f39998y;
                try {
                    c19864o.getClass();
                    c19864o.m20781a(new C16482A(c19864o, 28));
                    try {
                        C0564B0 c0564b0 = this.f39970D.f21949a;
                        if (c0564b0 != null) {
                            c0564b0.mo1275e(null);
                        }
                        try {
                            C0564B0 c0564b1 = this.f39981O.f21949a;
                            if (c0564b1 != null) {
                                c0564b1.mo1275e(null);
                            }
                            C5784h0 c5784h0 = this.f39985l;
                            voiceModeViewModelImpl$disconnect$1.f40103Y = this;
                            voiceModeViewModelImpl$disconnect$1.f40104Z = enumC3068a;
                            voiceModeViewModelImpl$disconnect$1.f40107q0 = 1;
                            if (c5784h0.m6176i(enumC3068a, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                                return enumC19250a;
                            }
                            voiceModeViewModelImpl = this;
                            r10 = enumC3068a;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            enumC3068a = this;
                            enumC3068a.m14397m(VoiceModeViewModelImpl$disconnect$3.f40109Y);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
            if (r10 != EnumC3068a.RecreateSession) {
                C14459O c14459o2 = voiceModeViewModelImpl.f39983j;
                voiceModeViewModelImpl$disconnect$1.f40103Y = voiceModeViewModelImpl;
                voiceModeViewModelImpl$disconnect$1.f40104Z = null;
                voiceModeViewModelImpl$disconnect$1.f40107q0 = 2;
                if (AbstractC8718u.m9434c(c14459o2, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeViewModelImpl2 = voiceModeViewModelImpl;
                if (((C2532n1) voiceModeViewModelImpl2.m14391f()).f7892X == EnumC22033m2.Advanced) {
                    C21554a c21554a2 = C21555b.f68260Z;
                    jM8644j = AbstractC8128k6.m8644j(((Number) voiceModeViewModelImpl2.f39995v.m15477a(C13922c.f43972d)).intValue(), EnumC21557d.SECONDS);
                    voiceModeViewModelImpl$disconnect$1.f40103Y = voiceModeViewModelImpl2;
                    voiceModeViewModelImpl$disconnect$1.f40107q0 = 3;
                    if (AbstractC0575H.m1185n(jM8644j, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                        return enumC19250a;
                    }
                    c14459o = voiceModeViewModelImpl2.f39983j;
                    voiceModeViewModelImpl$disconnect$1.f40103Y = voiceModeViewModelImpl2;
                    voiceModeViewModelImpl$disconnect$1.f40107q0 = 4;
                    if (AbstractC8718u.m9434c(c14459o, voiceModeViewModelImpl$disconnect$1) == enumC19250a) {
                        return enumC19250a;
                    }
                }
                voiceModeViewModelImpl = voiceModeViewModelImpl2;
            }
            voiceModeViewModelImpl.m14397m(VoiceModeViewModelImpl$disconnect$3.f40109Y);
            return C17296C.f55119a;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: s */
    public final Object m14380s(String str, String str2, EnumC22033m2 enumC22033m2, String str3, AbstractC19687c abstractC19687c) throws NoSuchAlgorithmException {
        VoiceModeViewModelImpl$fetchVoiceStatus$1 voiceModeViewModelImpl$fetchVoiceStatus$1;
        VoiceModeViewModelImpl voiceModeViewModelImpl;
        if (abstractC19687c instanceof VoiceModeViewModelImpl$fetchVoiceStatus$1) {
            voiceModeViewModelImpl$fetchVoiceStatus$1 = (VoiceModeViewModelImpl$fetchVoiceStatus$1) abstractC19687c;
            int i10 = voiceModeViewModelImpl$fetchVoiceStatus$1.f40113p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeViewModelImpl$fetchVoiceStatus$1.f40113p0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeViewModelImpl$fetchVoiceStatus$1 = new VoiceModeViewModelImpl$fetchVoiceStatus$1(this, abstractC19687c);
            }
        } else {
            voiceModeViewModelImpl$fetchVoiceStatus$1 = new VoiceModeViewModelImpl$fetchVoiceStatus$1(this, abstractC19687c);
        }
        VoiceModeViewModelImpl$fetchVoiceStatus$1 voiceModeViewModelImpl$fetchVoiceStatus$2 = voiceModeViewModelImpl$fetchVoiceStatus$1;
        Object objM3715a = voiceModeViewModelImpl$fetchVoiceStatus$2.f40111Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeViewModelImpl$fetchVoiceStatus$2.f40113p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM3715a);
            voiceModeViewModelImpl$fetchVoiceStatus$2.f40110Y = this;
            voiceModeViewModelImpl$fetchVoiceStatus$2.f40113p0 = 1;
            objM3715a = this.f39989p.m3715a(str, str2, enumC22033m2, str3, voiceModeViewModelImpl$fetchVoiceStatus$2);
            if (objM3715a == enumC19250a) {
                return enumC19250a;
            }
            voiceModeViewModelImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            voiceModeViewModelImpl = voiceModeViewModelImpl$fetchVoiceStatus$2.f40110Y;
            AbstractC9233X.m9807c(objM3715a);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM3715a;
        if (!(abstractC6224C instanceof C6223B)) {
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                return null;
            }
            voiceModeViewModelImpl.m14397m(VoiceModeViewModelImpl$fetchVoiceStatus$2.f40114Y);
            return null;
        }
        C6223B c6223b = (C6223B) abstractC6224C;
        AbstractC8160o6.m8726a(voiceModeViewModelImpl.f39971E, "get voice status completed " + c6223b.f20258a, null, 6);
        return (C21902C2) c6223b.f20258a;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void mo14227j(InterfaceC2548v0 intent) {
        C22057s2 c22057s2M22333a;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C2542s0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C2472Q) {
            m14394i(new VoiceModeViewModelImpl$onIntent$2(intent, this, null));
            return;
        }
        boolean zEquals = intent.equals(C2483W.f7734a);
        C2479U c2479u = C2479U.f7725a;
        if (zEquals) {
            C2532n1 c2532n1 = (C2532n1) m14391f();
            if (c2532n1.f7873E && AbstractC2792U0.m3710a(c2532n1.f7895b)) {
                mo14227j(new C2528m0(false));
                return;
            } else {
                mo14227j(c2479u);
                return;
            }
        }
        if (intent.equals(c2479u)) {
            m14394i(new VoiceModeViewModelImpl$onIntent$3(this, null));
            return;
        }
        if (intent instanceof C2546u0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$4(intent, this, null));
            return;
        }
        if (intent instanceof C2544t0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$5(intent, this, null));
            return;
        }
        if (intent instanceof C2501d0) {
            m14397m(new VoiceModeViewModelImpl$onIntent$6(intent));
            return;
        }
        if (intent instanceof C2498c0) {
            m14397m(new VoiceModeViewModelImpl$onIntent$7(intent));
            return;
        }
        if (intent instanceof C2477T) {
            m14394i(new VoiceModeViewModelImpl$onIntent$8(intent, this, null));
            return;
        }
        if (intent.equals(C2513h0.f7813a)) {
            C21902C2 c21902c2 = ((C2532n1) m14391f()).f7897d;
            if (c21902c2 == null || (c22057s2M22333a = c21902c2.m22333a()) == null) {
                return;
            }
            m14397m(new VoiceModeViewModelImpl$onIntent$9$1(this, c22057s2M22333a));
            return;
        }
        if (intent.equals(C2481V.f7730a)) {
            m14397m(VoiceModeViewModelImpl$onIntent$10.f40120Y);
            return;
        }
        if (intent instanceof C2540r0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$11(intent, this, null));
            return;
        }
        boolean zEquals2 = intent.equals(C2534o0.f7921a);
        C6844a c6844a = this.f39981O;
        if (zEquals2) {
            c6844a.m7281a(m14394i(new VoiceModeViewModelImpl$onIntent$12(this, null)));
            return;
        }
        if (intent.equals(C2538q0.f7928a)) {
            c6844a.m7281a(m14394i(new VoiceModeViewModelImpl$onIntent$13(this, null)));
            return;
        }
        if (intent instanceof C2528m0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$14(intent, this, null));
            return;
        }
        if (intent instanceof C2495b0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$15(intent, this, null));
            return;
        }
        if (intent instanceof C2510g0) {
            m14394i(new VoiceModeViewModelImpl$onIntent$16(intent, this, null));
            return;
        }
        if (intent instanceof C2489Z) {
            this.f39980N.m7281a(m14394i(new VoiceModeViewModelImpl$onIntent$17(intent, this, null)));
            return;
        }
        if (intent instanceof C2531n0) {
            c6844a.m7281a(m14394i(new VoiceModeViewModelImpl$onIntent$18(intent, this, null)));
            return;
        }
        if (intent instanceof C2536p0) {
            c6844a.m7281a(m14394i(new VoiceModeViewModelImpl$onIntent$19(this, null)));
            return;
        }
        if (intent.equals(C2475S.f7714a)) {
            m14393h(new C2054c(this.f39977K));
            return;
        }
        if (intent instanceof C2504e0) {
            m14397m(new VoiceModeViewModelImpl$onIntent$20(intent));
            return;
        }
        if (intent instanceof C2485X) {
            m14397m(VoiceModeViewModelImpl$onIntent$21.f40162Y);
            return;
        }
        boolean zEquals3 = intent.equals(C2519j0.f7826a);
        C20883b0 c20883b0 = C20883b0.f66502c;
        InterfaceC20904w interfaceC20904w = this.f39996w;
        if (zEquals3) {
            C22057s2 c22057s2 = ((C2532n1) m14391f()).f7893Y;
            if (c22057s2 != null) {
                C2529m1 c2529m1 = new C2529m1(c22057s2);
                interfaceC20904w.mo21447a(c20883b0, c2529m1.f7863d);
                m14397m(new VoiceModeViewModelImpl$onIntent$23$1(c2529m1));
                return;
            }
            return;
        }
        if (intent instanceof C2525l0) {
            C2529m1 c2529m2 = new C2529m1(((C2525l0) intent).f7844a);
            interfaceC20904w.mo21447a(c20883b0, c2529m2.f7863d);
            m14397m(new VoiceModeViewModelImpl$onIntent$24$1(c2529m2));
            return;
        }
        if (intent instanceof C2522k0) {
            C2529m1 c2529m3 = new C2529m1(((C2522k0) intent).f7832a);
            interfaceC20904w.mo21447a(c20883b0, c2529m3.f7863d);
            m14397m(new VoiceModeViewModelImpl$onIntent$25$1(c2529m3));
            return;
        }
        if (intent.equals(C2492a0.f7766a)) {
            m14394i(new VoiceModeViewModelImpl$onIntent$26(this, null));
            return;
        }
        if (intent instanceof C2487Y) {
            m14382u(C20860F.f66385v, AbstractC17660E.m19258c(new C17309l("source", ((C2487Y) intent).f7746a.f66394Y)));
            return;
        }
        if (!(intent instanceof C2507f0)) {
            if (intent instanceof C2516i0) {
                m14382u(C20860F.f66374k, C17690x.f56481Y);
                m14397m(new VoiceModeViewModelImpl$onIntent$27(intent));
                return;
            }
            return;
        }
        C20860F c20860f = C20860F.f66373j;
        AbstractC16428g abstractC16428g = ((C2507f0) intent).f7802a;
        m14382u(c20860f, AbstractC17660E.m19258c(new C17309l("device", abstractC16428g.mo18009a())));
        C5801u c5801u = this.f39985l.f18870v;
        c5801u.getClass();
        if (!AbstractC16544l.m18089b(Looper.myLooper(), Looper.getMainLooper())) {
            c5801u.f18943h.post(new RunnableC3724c(c5801u, 10, abstractC16428g));
            return;
        }
        C16432k c16432k = c5801u.f18942g;
        if (c16432k != null) {
            c16432k.f50981j.m1013f("AudioSwitch", "Selected AudioDevice = " + abstractC16428g);
            c16432k.f50976e = abstractC16428g;
            c16432k.m18015c(false, abstractC16428g);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m14382u(AbstractC20882b abstractC20882b, Map map) {
        C5788j0 c5788j0 = (C5788j0) this.f39985l.f18863o.f6797Y.getValue();
        if (c5788j0 != null) {
            c5788j0.m6189b(abstractC20882b, map);
        }
    }
}
