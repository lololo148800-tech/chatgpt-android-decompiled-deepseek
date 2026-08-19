package com.openai.feature.voice.impl.settings;

import androidx.lifecycle.ViewModel;
import com.openai.voice.settings.VoiceModeSettingsViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13861I;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;
import p072Ci.C1708m;
import p072Ci.EnumC1702g;
import p086D6.C1970n;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20862H;
import p1081wc.InterfaceC20904w;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21952P1;
import p1155zi.EnumC22026l;
import p148Fi.C2786R0;
import p172Gi.C3077j;
import p294Li.C5095q;
import p294Li.C5096r;
import p294Li.C5097s;
import p294Li.C5098t;
import p294Li.C5100v;
import p294Li.InterfaceC5099u;
import p523V9.AbstractC8033Y5;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13133K;
import p708dh.C13141T;
import p811ih.C15000g;
import p873lh.C16961l;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/voice/impl/settings/VoiceModeSettingsViewModelImpl;", "Lcom/openai/voice/settings/VoiceModeSettingsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeSettingsViewModelImpl extends VoiceModeSettingsViewModel {

    /* JADX INFO: renamed from: i */
    public final C16961l f40268i;

    /* JADX INFO: renamed from: j */
    public final C13141T f40269j;

    /* JADX INFO: renamed from: k */
    public final C13133K f40270k;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.settings.VoiceModeSettingsViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.settings.VoiceModeSettingsViewModelImpl$1", m20656f = "VoiceModeSettingsViewModelImpl.kt", m20657l = {42}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125751 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f40271Y;

        public C125751(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return VoiceModeSettingsViewModelImpl.this.new C125751(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C125751) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f40271Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                this.f40271Y = 1;
                if (VoiceModeSettingsViewModelImpl.m14385n(VoiceModeSettingsViewModelImpl.this, this) == enumC19250a) {
                    return enumC19250a;
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

    public VoiceModeSettingsViewModelImpl(C15000g c15000g, InterfaceC20904w interfaceC20904w, C16961l c16961l, C13141T c13141t, C13133K c13133k) {
        super(new C5100v(C21917G1.f69468a, null, null, false, c15000g.m16135b(EnumC22026l.AdvancedVoice, C13861I.f43899c)));
        this.f40268i = c16961l;
        this.f40269j = c13141t;
        this.f40270k = c13133k;
        m14394i(new C125751(null));
        interfaceC20904w.mo21447a(C20862H.f66405m, C17690x.f56481Y);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14385n(VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl, AbstractC19687c abstractC19687c) {
        VoiceModeSettingsViewModelImpl$updateOptions$1 voiceModeSettingsViewModelImpl$updateOptions$1;
        VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl2;
        boolean z6;
        C2786R0 c2786r0;
        C17296C c17296c;
        AbstractC21955Q1 abstractC21955Q1;
        C2786R0 c2786r1;
        AbstractC21955Q1 abstractC21955Q2;
        VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl3;
        voiceModeSettingsViewModelImpl.getClass();
        if (abstractC19687c instanceof VoiceModeSettingsViewModelImpl$updateOptions$1) {
            voiceModeSettingsViewModelImpl$updateOptions$1 = (VoiceModeSettingsViewModelImpl$updateOptions$1) abstractC19687c;
            int i10 = voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeSettingsViewModelImpl$updateOptions$1 = new VoiceModeSettingsViewModelImpl$updateOptions$1(voiceModeSettingsViewModelImpl, abstractC19687c);
            }
        } else {
            voiceModeSettingsViewModelImpl$updateOptions$1 = new VoiceModeSettingsViewModelImpl$updateOptions$1(voiceModeSettingsViewModelImpl, abstractC19687c);
        }
        Object objM3221t = voiceModeSettingsViewModelImpl$updateOptions$1.f40288p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0;
        C17296C c17296c2 = C17296C.f55119a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                voiceModeSettingsViewModelImpl = voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y;
                AbstractC9233X.m9807c(objM3221t);
            } else {
                if (i11 == 2) {
                    z6 = voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0;
                    voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y;
                    AbstractC9233X.m9807c(objM3221t);
                    c2786r0 = (C2786R0) objM3221t;
                    if (c2786r0 != null) {
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0 = z6;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 3;
                        if (voiceModeSettingsViewModelImpl2.m14386o(c2786r0, z6, voiceModeSettingsViewModelImpl$updateOptions$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        c17296c = c17296c2;
                    } else {
                        c17296c = null;
                    }
                    if (c17296c == null) {
                        voiceModeSettingsViewModelImpl2.m14397m(VoiceModeSettingsViewModelImpl$updateOptions$3.f40291Y);
                    }
                    C16961l c16961l = voiceModeSettingsViewModelImpl2.f40268i;
                    voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
                    voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0 = z6;
                    voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 4;
                    objM3221t = c16961l.m18594e(voiceModeSettingsViewModelImpl$updateOptions$1);
                    if (objM3221t == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
                    if (abstractC21955Q1 instanceof C21952P1) {
                        c2786r1 = (C2786R0) ((C21952P1) abstractC21955Q1).f69511a;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40286Z = (C21952P1) abstractC21955Q1;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 5;
                        if (voiceModeSettingsViewModelImpl2.m14386o(c2786r1, z6, voiceModeSettingsViewModelImpl$updateOptions$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC21955Q2 = abstractC21955Q1;
                        voiceModeSettingsViewModelImpl3 = voiceModeSettingsViewModelImpl2;
                    }
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$updateOptions$5$1((AbstractC21933K1) abstractC21955Q1));
                    }
                    return c17296c2;
                }
                if (i11 == 3) {
                    z6 = voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0;
                    voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y;
                    AbstractC9233X.m9807c(objM3221t);
                    c17296c = c17296c2;
                    if (c17296c == null) {
                        voiceModeSettingsViewModelImpl2.m14397m(VoiceModeSettingsViewModelImpl$updateOptions$3.f40291Y);
                    }
                    C16961l c16961l2 = voiceModeSettingsViewModelImpl2.f40268i;
                    voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
                    voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0 = z6;
                    voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 4;
                    objM3221t = c16961l2.m18594e(voiceModeSettingsViewModelImpl$updateOptions$1);
                    if (objM3221t == enumC19250a) {
                        return enumC19250a;
                    }
                    abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
                    if (abstractC21955Q1 instanceof C21952P1) {
                        c2786r1 = (C2786R0) ((C21952P1) abstractC21955Q1).f69511a;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40286Z = (C21952P1) abstractC21955Q1;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 5;
                        if (voiceModeSettingsViewModelImpl2.m14386o(c2786r1, z6, voiceModeSettingsViewModelImpl$updateOptions$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC21955Q2 = abstractC21955Q1;
                        voiceModeSettingsViewModelImpl3 = voiceModeSettingsViewModelImpl2;
                    }
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$updateOptions$5$1((AbstractC21933K1) abstractC21955Q1));
                    }
                    return c17296c2;
                }
                if (i11 == 4) {
                    z6 = voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0;
                    voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y;
                    AbstractC9233X.m9807c(objM3221t);
                    abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
                    if (abstractC21955Q1 instanceof C21952P1) {
                        c2786r1 = (C2786R0) ((C21952P1) abstractC21955Q1).f69511a;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40286Z = (C21952P1) abstractC21955Q1;
                        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 5;
                        if (voiceModeSettingsViewModelImpl2.m14386o(c2786r1, z6, voiceModeSettingsViewModelImpl$updateOptions$1) == enumC19250a) {
                            return enumC19250a;
                        }
                        abstractC21955Q2 = abstractC21955Q1;
                        voiceModeSettingsViewModelImpl3 = voiceModeSettingsViewModelImpl2;
                    }
                    if (abstractC21955Q1 instanceof AbstractC21933K1) {
                        voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$updateOptions$5$1((AbstractC21933K1) abstractC21955Q1));
                    }
                    return c17296c2;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC21955Q2 = voiceModeSettingsViewModelImpl$updateOptions$1.f40286Z;
                voiceModeSettingsViewModelImpl3 = voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y;
                AbstractC9233X.m9807c(objM3221t);
            }
            abstractC21955Q1 = abstractC21955Q2;
            voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl3;
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$updateOptions$5$1((AbstractC21933K1) abstractC21955Q1));
            }
            return c17296c2;
        }
        AbstractC9233X.m9807c(objM3221t);
        C1970n c1970n = voiceModeSettingsViewModelImpl.f40270k.f41697b;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 1;
        objM3221t = AbstractC2124C.m3221t(c1970n, voiceModeSettingsViewModelImpl$updateOptions$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        C1705j c1705j = (C1705j) objM3221t;
        if (c1705j.f4886s && c1705j.f4887t) {
            z10 = false;
        }
        C16961l c16961l3 = voiceModeSettingsViewModelImpl.f40268i;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0 = z10;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 2;
        objM3221t = AbstractC2124C.m3221t(c16961l3.f54438Z.f64176f, voiceModeSettingsViewModelImpl$updateOptions$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl;
        z6 = z10;
        c2786r0 = (C2786R0) objM3221t;
        if (c2786r0 != null) {
            voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
            voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0 = z6;
            voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 3;
            if (voiceModeSettingsViewModelImpl2.m14386o(c2786r0, z6, voiceModeSettingsViewModelImpl$updateOptions$1) == enumC19250a) {
                return enumC19250a;
            }
            c17296c = c17296c2;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            voiceModeSettingsViewModelImpl2.m14397m(VoiceModeSettingsViewModelImpl$updateOptions$3.f40291Y);
        }
        C16961l c16961l4 = voiceModeSettingsViewModelImpl2.f40268i;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40287o0 = z6;
        voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 4;
        objM3221t = c16961l4.m18594e(voiceModeSettingsViewModelImpl$updateOptions$1);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        abstractC21955Q1 = (AbstractC21955Q1) objM3221t;
        if (abstractC21955Q1 instanceof C21952P1) {
            c2786r1 = (C2786R0) ((C21952P1) abstractC21955Q1).f69511a;
            voiceModeSettingsViewModelImpl$updateOptions$1.f40285Y = voiceModeSettingsViewModelImpl2;
            voiceModeSettingsViewModelImpl$updateOptions$1.f40286Z = (C21952P1) abstractC21955Q1;
            voiceModeSettingsViewModelImpl$updateOptions$1.f40290r0 = 5;
            if (voiceModeSettingsViewModelImpl2.m14386o(c2786r1, z6, voiceModeSettingsViewModelImpl$updateOptions$1) == enumC19250a) {
                return enumC19250a;
            }
            abstractC21955Q2 = abstractC21955Q1;
            voiceModeSettingsViewModelImpl3 = voiceModeSettingsViewModelImpl2;
            abstractC21955Q1 = abstractC21955Q2;
            voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl3;
        }
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$updateOptions$5$1((AbstractC21933K1) abstractC21955Q1));
        }
        return c17296c2;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC5099u intent = (InterfaceC5099u) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C5098t) {
            m14397m(new VoiceModeSettingsViewModelImpl$onIntent$2(intent));
            return;
        }
        if (intent instanceof C5095q) {
            m14394i(new VoiceModeSettingsViewModelImpl$onIntent$3(this, null));
            return;
        }
        if (intent.equals(C5097s.f16668a)) {
            m14394i(new VoiceModeSettingsViewModelImpl$onIntent$4(this, null));
        } else if (intent.equals(C5096r.f16667a)) {
            this.f40269j.m14818a(EnumC1702g.StrawSelection);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m14386o(C2786R0 c2786r0, boolean z6, AbstractC19687c abstractC19687c) {
        VoiceModeSettingsViewModelImpl$setOptions$1 voiceModeSettingsViewModelImpl$setOptions$1;
        VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl;
        String str;
        VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl2;
        if (abstractC19687c instanceof VoiceModeSettingsViewModelImpl$setOptions$1) {
            voiceModeSettingsViewModelImpl$setOptions$1 = (VoiceModeSettingsViewModelImpl$setOptions$1) abstractC19687c;
            int i10 = voiceModeSettingsViewModelImpl$setOptions$1.f40282q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                voiceModeSettingsViewModelImpl$setOptions$1.f40282q0 = i10 - Integer.MIN_VALUE;
            } else {
                voiceModeSettingsViewModelImpl$setOptions$1 = new VoiceModeSettingsViewModelImpl$setOptions$1(this, abstractC19687c);
            }
        } else {
            voiceModeSettingsViewModelImpl$setOptions$1 = new VoiceModeSettingsViewModelImpl$setOptions$1(this, abstractC19687c);
        }
        Object obj = voiceModeSettingsViewModelImpl$setOptions$1.f40280o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = voiceModeSettingsViewModelImpl$setOptions$1.f40282q0;
        Object objM18593d = null;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            for (Object obj2 : c2786r0.f8502a) {
                if (AbstractC8033Y5.m8383a((C3077j) obj2)) {
                    objM18593d = obj2;
                    break;
                }
            }
            C3077j c3077j = (C3077j) objM18593d;
            if (!z6 || c3077j == null) {
                voiceModeSettingsViewModelImpl$setOptions$1.f40278Y = this;
                voiceModeSettingsViewModelImpl$setOptions$1.f40279Z = c2786r0;
                voiceModeSettingsViewModelImpl$setOptions$1.f40282q0 = 1;
                objM18593d = this.f40268i.m18593d(voiceModeSettingsViewModelImpl$setOptions$1);
                if (objM18593d == enumC19250a) {
                    return enumC19250a;
                }
                voiceModeSettingsViewModelImpl = this;
            } else {
                str = c3077j.f9279b;
                voiceModeSettingsViewModelImpl2 = this;
            }
            voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$setOptions$2(c2786r0, str));
            return C17296C.f55119a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2786r0 = voiceModeSettingsViewModelImpl$setOptions$1.f40279Z;
        voiceModeSettingsViewModelImpl = voiceModeSettingsViewModelImpl$setOptions$1.f40278Y;
        AbstractC9233X.m9807c(obj);
        C1708m c1708m = (C1708m) obj;
        if (c1708m != null) {
            objM18593d = c1708m.f4890a;
        }
        voiceModeSettingsViewModelImpl2 = voiceModeSettingsViewModelImpl;
        str = (String) objM18593d;
        voiceModeSettingsViewModelImpl2.m14397m(new VoiceModeSettingsViewModelImpl$setOptions$2(c2786r0, str));
        return C17296C.f55119a;
    }
}
