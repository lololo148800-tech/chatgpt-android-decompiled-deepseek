package com.openai.feature.conversations.impl.voicefeedback;

import gd.C13905X;
import gd.C14005w2;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1081wc.C20860F;
import p172Gi.C3061C;
import p172Gi.EnumC3068a;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import re.AbstractC18967t;
import re.C18957j;
import re.C18964q;
import re.C18965r;
import re.C18966s;
import re.InterfaceC18962o;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$1", m20656f = "VoiceEndedViewModel.kt", m20657l = {94, 103}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceEndedViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public C3061C f38041Y;

    /* JADX INFO: renamed from: Z */
    public int f38042Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18962o f38043o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ VoiceEndedViewModelImpl f38044p0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123471 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C3061C f38045Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123471(C3061C c3061c) {
            super(1);
            this.f38045Y = c3061c;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return new C18965r(this.f38045Y);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$1$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123482 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C3061C f38046Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123482(C3061C c3061c) {
            super(1);
            this.f38046Y = c3061c;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return new C18966s(this.f38046Y);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$1$3 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123493 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123493 f38047Y = new C123493();

        public C123493() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18964q.f60519a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEndedViewModelImpl$onIntent$1(VoiceEndedViewModelImpl voiceEndedViewModelImpl, InterfaceC18770c interfaceC18770c, InterfaceC18962o interfaceC18962o) {
        super(1, interfaceC18770c);
        this.f38043o0 = interfaceC18962o;
        this.f38044p0 = voiceEndedViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceEndedViewModelImpl$onIntent$1(this.f38044p0, interfaceC18770c, this.f38043o0);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceEndedViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C3061C c3061c;
        C3061C c3061c2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38042Z;
        VoiceEndedViewModelImpl voiceEndedViewModelImpl = this.f38044p0;
        if (i10 != 0) {
            if (i10 == 1) {
                c3061c = this.f38041Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3061c2 = this.f38041Y;
                AbstractC9233X.m9807c(obj);
            }
            voiceEndedViewModelImpl.m14397m(new C123482(c3061c2));
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C3061C c3061c3 = ((C18957j) this.f38043o0).f60511a;
        C1970n c1970n = voiceEndedViewModelImpl.f38035j.f41697b;
        this.f38041Y = c3061c3;
        this.f38042Z = 1;
        Object objM3221t = AbstractC2124C.m3221t(c1970n, this);
        if (objM3221t == enumC19250a) {
            return enumC19250a;
        }
        c3061c = c3061c3;
        obj = objM3221t;
        boolean z6 = ((C1705j) obj).f4881n;
        boolean zM15481a = ((C14005w2) voiceEndedViewModelImpl.f38034i).m15481a(C13905X.f43955c);
        c3061c.getClass();
        if (c3061c.f9233e == EnumC3068a.AppBackgrounded && !z6) {
            voiceEndedViewModelImpl.m14397m(new C123471(c3061c));
        } else if (c3061c.f9229a == null || !zM15481a) {
            voiceEndedViewModelImpl.m14397m(C123493.f38047Y);
        } else {
            C20860F c20860f = C20860F.f66380q;
            this.f38041Y = c3061c;
            this.f38042Z = 2;
            if (voiceEndedViewModelImpl.m14273n(c3061c, c20860f, C17690x.f56481Y, this) == enumC19250a) {
                return enumC19250a;
            }
            c3061c2 = c3061c;
            voiceEndedViewModelImpl.m14397m(new C123482(c3061c2));
        }
        return C17296C.f55119a;
    }
}
