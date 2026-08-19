package com.openai.feature.whisper.impl;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.feature.whisper.WhisperViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mh.C17257e;
import mh.C17258f;
import mh.C17259g;
import mh.C17260h;
import mh.C17261i;
import mh.C17272t;
import mh.C17275w;
import mh.C17278z;
import mh.InterfaceC17262j;
import mh.InterfaceC17277y;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p548Wd.p549VF.zakks;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p906nh.C17625g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/whisper/impl/WhisperViewModelImpl;", "Lcom/openai/feature/whisper/WhisperViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class WhisperViewModelImpl extends WhisperViewModel {

    /* JADX INFO: renamed from: i */
    public final C17625g f40325i;

    /* JADX INFO: renamed from: com.openai.feature.whisper.impl.WhisperViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.whisper.impl.WhisperViewModelImpl$1", m20656f = "WhisperViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lmh/y;", "state", "Lmm/C;", "<anonymous>", "(Lmh/y;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125831 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f40326Y;

        /* JADX INFO: renamed from: com.openai.feature.whisper.impl.WhisperViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmh/z;", "invoke", "(Lmh/z;)Lmh/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public static final AnonymousClass1 f40328Y = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C17278z setState = (C17278z) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return new C17278z(C17272t.f55079c);
            }
        }

        /* JADX INFO: renamed from: com.openai.feature.whisper.impl.WhisperViewModelImpl$1$2, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmh/z;", "invoke", "(Lmh/z;)Lmh/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass2 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ InterfaceC17277y f40329Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC17277y interfaceC17277y) {
                super(1);
                this.f40329Y = interfaceC17277y;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C17278z setState = (C17278z) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                String str = zakks.tdrnJsF;
                InterfaceC17277y interfaceC17277y = this.f40329Y;
                AbstractC16544l.m18094g(interfaceC17277y, str);
                return new C17278z(interfaceC17277y);
            }
        }

        public C125831(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C125831 c125831 = WhisperViewModelImpl.this.new C125831(interfaceC18770c);
            c125831.f40326Y = obj;
            return c125831;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C125831 c125831 = (C125831) create((InterfaceC17277y) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c125831.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            InterfaceC17277y interfaceC17277y = (InterfaceC17277y) this.f40326Y;
            boolean z6 = interfaceC17277y instanceof C17275w;
            WhisperViewModelImpl whisperViewModelImpl = WhisperViewModelImpl.this;
            if (z6) {
                whisperViewModelImpl.m14392g(new C17257e(((C17275w) interfaceC17277y).f55083a));
                whisperViewModelImpl.m14397m(AnonymousClass1.f40328Y);
            } else {
                whisperViewModelImpl.m14397m(new AnonymousClass2(interfaceC17277y));
            }
            return C17296C.f55119a;
        }
    }

    public WhisperViewModelImpl(C17625g c17625g) {
        super(new C17278z(C17272t.f55079c));
        this.f40325i = c17625g;
        m12139a(c17625g);
        AbstractC2124C.m3226y(new C1970n(c17625g.f56406r0, 5, new C125831(null)), ViewModelKt.m12143a(this));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC17262j intent = (InterfaceC17262j) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C17259g) {
            m14394i(new WhisperViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C17261i) {
            m14394i(new WhisperViewModelImpl$onIntent$2(this, null));
        } else if (intent.equals(C17260h.f55056a)) {
            m14394i(new WhisperViewModelImpl$onIntent$3(this, null));
        } else if (intent.equals(C17258f.f55054a)) {
            m14394i(new WhisperViewModelImpl$onIntent$4(this, null));
        }
    }
}
