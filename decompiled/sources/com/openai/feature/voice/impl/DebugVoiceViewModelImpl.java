package com.openai.feature.voice.impl;

import androidx.lifecycle.ViewModel;
import com.openai.voice.debug.DebugVoiceViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p098Di.InterfaceC2053b;
import p1155zi.AbstractC22035n0;
import p1155zi.C22011h0;
import p1155zi.C22031m0;
import p148Fi.AbstractC2841n;
import p148Fi.C2769I0;
import p148Fi.C2770J;
import p148Fi.C2807b0;
import p148Fi.C2833k;
import p148Fi.C2855u;
import p172Gi.C3071d;
import p246Ji.C4365e;
import p341Ni.C5784h0;
import p341Ni.InterfaceC5798r;
import p528Vg.C8285d;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/voice/impl/DebugVoiceViewModelImpl;", "Lcom/openai/voice/debug/DebugVoiceViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DebugVoiceViewModelImpl extends DebugVoiceViewModel {

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJi/e;", "Lzi/h0;", "it", "invoke-mRA7E-s", "(LJi/e;Ljava/lang/String;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125241 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125241 f39944Y = new C125241();

        public C125241() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            String it = ((C22011h0) obj2).f69652a;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C4365e.m5168e(setOnEach, null, it, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388605);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJi/e;", "LFi/I0;", "it", "invoke", "(LJi/e;LFi/I0;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125252 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125252 f39945Y = new C125252();

        public C125252() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            C2769I0 it = (C2769I0) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C4365e.m5168e(setOnEach, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC17680n.m19362l0(setOnEach.f14218t, it), null, null, null, 7864319);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJi/e;", "", "it", "invoke", "(LJi/e;Ljava/lang/String;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125263 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125263 f39946Y = new C125263();

        public C125263() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            String it = (String) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C4365e.m5168e(setOnEach, null, null, null, null, null, null, null, null, null, null, it, null, null, null, null, null, null, null, null, null, 8384511);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJi/e;", "LGi/d;", "request", "invoke", "(LJi/e;LGi/d;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125274 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125274 f39947Y = new C125274();

        public C125274() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            C3071d request = (C3071d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(request, "request");
            AbstractC22035n0 abstractC22035n0 = request.f9265h;
            C22031m0 c22031m0 = abstractC22035n0 instanceof C22031m0 ? (C22031m0) abstractC22035n0 : null;
            String str = c22031m0 != null ? c22031m0.f69690b : null;
            String str2 = str == null ? "" : str;
            String str3 = request.f9264g;
            if (str3 == null) {
                str3 = null;
            }
            String str4 = str3 == null ? "" : str3;
            String str5 = request.f9263f;
            String str6 = str5 == null ? "" : str5;
            String str7 = request.f9262e;
            String str8 = str7 != null ? str7 : null;
            return C4365e.m5168e(setOnEach, null, null, str4, str8 == null ? "" : str8, request.f9259b, str6, str2, null, null, null, null, null, null, null, null, null, null, null, null, request, 4194179);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$5 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJi/e;", "LFi/n;", "message", "invoke", "(LJi/e;LFi/n;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125285 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125285 f39948Y = new C125285();

        public C125285() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            AbstractC2841n message = (AbstractC2841n) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(message, "message");
            if (message instanceof C2833k) {
                return C4365e.m5168e(setOnEach, null, ((C2833k) message).f8569a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388605);
            }
            if (message instanceof C2855u) {
                return C4365e.m5168e(setOnEach, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC17680n.m19361k0(((C2855u) message).f8619a, setOnEach.f14219u), null, null, 7340031);
            }
            return message instanceof C2807b0 ? C4365e.m5168e(setOnEach, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC17680n.m19362l0(setOnEach.f14220v, message), null, 6291455) : setOnEach;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$6 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LJi/e;", "", "", "", "it", "invoke", "(LJi/e;Ljava/util/Map;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125296 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125296 f39949Y = new C125296();

        public C125296() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            Map it = (Map) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(it.size()));
            for (Map.Entry entry : it.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry + " ms");
            }
            return C4365e.m5168e(setOnEach, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, null, null, null, null, null, null, 8388095);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$7 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.DebugVoiceViewModelImpl$7", m20656f = "DebugVoiceViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"LNi/r;", "connectionState", "LFi/J;", "remoteState", "Lmm/C;", "<anonymous>", "(LNi/r;LFi/J;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125307 extends AbstractC19694j implements InterfaceC1440o {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ InterfaceC5798r f39950Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ C2770J f39951Z;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$7$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LJi/e;", "invoke", "(LJi/e;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C2770J f39953Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ InterfaceC5798r f39954Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C2770J c2770j, InterfaceC5798r interfaceC5798r) {
                super(1);
                this.f39953Y = c2770j;
                this.f39954Z = interfaceC5798r;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C4365e setState = (C4365e) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C2770J c2770j = this.f39953Y;
                return C4365e.m5168e(setState, null, null, null, null, null, null, null, c2770j.f8478a, this.f39954Z, null, null, null, null, null, null, AbstractC17680n.m19362l0(setState.f14217s, c2770j), null, null, null, null, 8126079);
            }
        }

        public C125307(InterfaceC18770c interfaceC18770c) {
            super(3, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1440o
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C125307 c125307 = DebugVoiceViewModelImpl.this.new C125307((InterfaceC18770c) obj3);
            c125307.f39950Y = (InterfaceC5798r) obj;
            c125307.f39951Z = (C2770J) obj2;
            C17296C c17296c = C17296C.f55119a;
            c125307.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            DebugVoiceViewModelImpl.this.m14397m(new AnonymousClass1(this.f39951Z, this.f39950Y));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$8 */
    @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.DebugVoiceViewModelImpl$8", m20656f = "DebugVoiceViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"", "roomId", "remote", "Lmm/C;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125318 extends AbstractC19694j implements InterfaceC1440o {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ String f39955Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ String f39956Z;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ C5784h0 f39958p0;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$8$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LJi/e;", "invoke", "(LJi/e;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C5784h0 f39959Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ String f39960Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ String f39961o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C5784h0 c5784h0, String str, String str2) {
                super(1);
                this.f39959Y = c5784h0;
                this.f39960Z = str;
                this.f39961o0 = str2;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C4365e setState = (C4365e) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return C4365e.m5168e(setState, this.f39960Z, null, null, null, null, null, null, null, null, null, null, this.f39959Y.f18871w.f15400y.f18994a, this.f39961o0, null, null, null, null, null, null, null, 8364030);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125318(C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
            super(3, interfaceC18770c);
            this.f39958p0 = c5784h0;
        }

        @Override // p049Bm.InterfaceC1440o
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C125318 c125318 = DebugVoiceViewModelImpl.this.new C125318(this.f39958p0, (InterfaceC18770c) obj3);
            c125318.f39955Y = (String) obj;
            c125318.f39956Z = (String) obj2;
            C17296C c17296c = C17296C.f55119a;
            c125318.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            DebugVoiceViewModelImpl.this.m14397m(new AnonymousClass1(this.f39958p0, this.f39955Y, this.f39956Z));
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.DebugVoiceViewModelImpl$9 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJi/e;", "LVg/d;", "settings", "invoke", "(LJi/e;LVg/d;)LJi/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125329 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125329 f39962Y = new C125329();

        public C125329() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4365e setOnEach = (C4365e) obj;
            C8285d settings = (C8285d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(settings, "settings");
            return C4365e.m5168e(setOnEach, null, null, null, null, null, null, null, null, null, null, null, null, null, settings.f25823a.name(), String.valueOf(settings.f25826d), null, null, null, null, null, 8290303);
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }
}
