package com.openai.feature.voice.impl;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2055d;
import p098Di.C2059h;
import p103Dn.AbstractC2124C;
import p1081wc.C20860F;
import p124Ei.C2477T;
import p124Ei.InterfaceC2548v0;
import p129En.C2604o;
import p360Od.C6172d;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p403Qd.C6636i;
import p479Td.C7351f0;
import p523V9.AbstractC8160o6;
import p550We.C8833n;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p575Xd.InterfaceC9461t;
import p576Xe.C9473F;
import p594Y9.AbstractC9985v4;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$8", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {406, 407}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$8 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40179Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40180Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2548v0 f40181o0;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$8$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "it", "Lmm/C;", "invoke", "(LTd/f0;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125641 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ VoiceModeViewModelImpl f40182Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$8$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$8$1$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {418}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public int f40183Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ VoiceModeViewModelImpl f40184Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ C7351f0 f40185o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VoiceModeViewModelImpl voiceModeViewModelImpl, C7351f0 c7351f0, InterfaceC18770c interfaceC18770c) {
                super(1, interfaceC18770c);
                this.f40184Z = voiceModeViewModelImpl;
                this.f40185o0 = c7351f0;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
                return new AnonymousClass1(this.f40184Z, this.f40185o0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                return ((AnonymousClass1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.f40183Y;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40184Z;
                    voiceModeViewModelImpl.f39996w.mo21447a(C20860F.f66367d, C17690x.f56481Y);
                    StringBuilder sb2 = new StringBuilder("Relay message to webrtc data stream : ");
                    C7351f0 c7351f0 = this.f40185o0;
                    sb2.append(c7351f0);
                    AbstractC8160o6.m8726a(voiceModeViewModelImpl.f39971E, sb2.toString(), null, 6);
                    this.f40183Y = 1;
                    if (voiceModeViewModelImpl.f39985l.m6180m(c7351f0, this) == enumC19250a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125641(VoiceModeViewModelImpl voiceModeViewModelImpl) {
            super(1);
            this.f40182Y = voiceModeViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C7351f0 it = (C7351f0) obj;
            AbstractC16544l.m18094g(it, "it");
            VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40182Y;
            voiceModeViewModelImpl.m14394i(new AnonymousClass1(voiceModeViewModelImpl, it, null));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$8$2 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LWe/n;", "it", "Lmm/C;", "invoke", "(LWe/n;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125652 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ VoiceModeViewModelImpl f40186Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125652(VoiceModeViewModelImpl voiceModeViewModelImpl) {
            super(1);
            this.f40186Y = voiceModeViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C8833n it = (C8833n) obj;
            AbstractC16544l.m18094g(it, "it");
            VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40186Y;
            voiceModeViewModelImpl.f39996w.mo21447a(C20860F.f66369f, C17690x.f56481Y);
            Intent intent = new Intent();
            AbstractC9186P.m9748b(intent, it.f27023a);
            voiceModeViewModelImpl.m14393h(new C2055d(intent));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$8$3 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LOh/w;", "it", "Lmm/C;", "invoke", "(LOh/w;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125663 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ VoiceModeViewModelImpl f40187Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125663(VoiceModeViewModelImpl voiceModeViewModelImpl) {
            super(1);
            this.f40187Y = voiceModeViewModelImpl;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC6249w it = (AbstractC6249w) obj;
            AbstractC16544l.m18094g(it, "it");
            VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40187Y;
            voiceModeViewModelImpl.f39996w.mo21447a(C20860F.f66368e, C17690x.f56481Y);
            voiceModeViewModelImpl.m14393h(new C2059h(AbstractC6224C.m6734a(it)));
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$8(InterfaceC2548v0 interfaceC2548v0, VoiceModeViewModelImpl voiceModeViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40180Z = voiceModeViewModelImpl;
        this.f40181o0 = interfaceC2548v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$onIntent$8(this.f40181o0, this.f40180Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeViewModelImpl$onIntent$8) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM3221t;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40179Y;
        C17296C c17296c = C17296C.f55119a;
        VoiceModeViewModelImpl voiceModeViewModelImpl = this.f40180Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
                objM3221t = obj;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
        }
        AbstractC9233X.m9807c(obj);
        voiceModeViewModelImpl.f39996w.mo21447a(C20860F.f66366c, C17690x.f56481Y);
        C2604o c2604o = voiceModeViewModelImpl.f39983j.f45521t;
        this.f40179Y = 1;
        objM3221t = AbstractC2124C.m3221t(c2604o, this);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        C6636i c6636i = (C6636i) objM3221t;
        if (c6636i == null) {
            return c17296c;
        }
        C2477T c2477t = (C2477T) this.f40181o0;
        C6172d c6172d = c2477t.f7720a;
        InterfaceC9461t interfaceC9461t = c2477t.f7721b;
        C9473F c9473f = (C9473F) voiceModeViewModelImpl.f39975I.getValue();
        AbstractC16544l.m18093f(c9473f, "access$getGizmosRepository(...)");
        C125641 c125641 = new C125641(voiceModeViewModelImpl);
        C125652 c125652 = new C125652(voiceModeViewModelImpl);
        C125663 c125663 = new C125663(voiceModeViewModelImpl);
        this.f40179Y = 2;
        return AbstractC9985v4.m10624a(c6172d, interfaceC9461t, c6636i.f21379a, c9473f, c6636i.f21389k, voiceModeViewModelImpl.f39996w, c125641, c125652, c125663, this) == enumC19250a ? enumC19250a : c17296c;
    }
}
