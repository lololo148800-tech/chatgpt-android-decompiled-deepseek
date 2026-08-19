package com.openai.feature.messages.impl.audio;

import android.app.Application;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.chatgpt.R;
import com.openai.feature.messages.audio.MessageAudioViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.statsig.androidsdk.StatsigLoggerKt;
import gd.C13890S;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import mm.C17314q;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p092Dc.C1991h;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p103Dn.C2146N;
import p103Dn.C2207t0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1061vb.C20513d;
import p1063vf.C20597e;
import p1063vf.C20599g;
import p1063vf.C20600h;
import p1063vf.C20603k;
import p1081wc.AbstractC20882b;
import p1081wc.C20895n;
import p1081wc.InterfaceC20904w;
import p1155zi.C21984a1;
import p148Fi.AbstractC2792U0;
import p148Fi.C2864y0;
import p153Fn.AbstractC2935m;
import p201Hn.C3516e;
import p216Id.AbstractC3693a;
import p216Id.C3694b;
import p403Qd.AbstractC6659u;
import p427Rc.C6844a;
import p479Td.C7320F;
import p479Td.C7351f0;
import p479Td.EnumC7359j0;
import p480Te.C7392q;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p787he.C14459O;
import p873lh.C16961l;
import p876lm.InterfaceC17068a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import pf.C18387c;
import pf.C18388d;
import pf.C18389e;
import pf.C18390f;
import pf.C18391g;
import pf.C18392h;
import pf.C18398n;
import pf.C18406v;
import pf.C18407w;
import pf.InterfaceC18393i;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/messages/impl/audio/MessageAudioViewModelImpl;", "Lcom/openai/feature/messages/audio/MessageAudioViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageAudioViewModelImpl extends MessageAudioViewModel {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f38657s = 0;

    /* JADX INFO: renamed from: i */
    public final Application f38658i;

    /* JADX INFO: renamed from: j */
    public final C20513d f38659j;

    /* JADX INFO: renamed from: k */
    public final C1991h f38660k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC17068a f38661l;

    /* JADX INFO: renamed from: m */
    public final C16961l f38662m;

    /* JADX INFO: renamed from: n */
    public final C7392q f38663n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC20904w f38664o;

    /* JADX INFO: renamed from: p */
    public final C17314q f38665p;

    /* JADX INFO: renamed from: q */
    public final C6844a f38666q;

    /* JADX INFO: renamed from: r */
    public final C2864y0 f38667r;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "it", "Lzi/a1;", "invoke-QoIGnKM", "(LTd/f0;)Ljava/lang/String;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123964 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123964 f38668Y = new C123964();

        public C123964() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C7351f0 it = (C7351f0) obj;
            AbstractC16544l.m18094g(it, "it");
            return new C21984a1(it.f23286a);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$5 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$5", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTd/f0;", "message", "Lmm/C;", "<anonymous>", "(LTd/f0;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123975 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38669Y;

        public C123975(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C123975 c123975 = MessageAudioViewModelImpl.this.new C123975(interfaceC18770c);
            c123975.f38669Y = obj;
            return c123975;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C123975 c123975 = (C123975) create((C7351f0) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c123975.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            C7351f0 c7351f0 = (C7351f0) this.f38669Y;
            int i10 = MessageAudioViewModelImpl.f38657s;
            MessageAudioViewModelImpl messageAudioViewModelImpl = MessageAudioViewModelImpl.this;
            if (((C18398n) messageAudioViewModelImpl.m14391f()).f58692g && ((C18398n) messageAudioViewModelImpl.m14391f()).f58693h && ((C18398n) messageAudioViewModelImpl.m14391f()).f58686a) {
                MessageAudioViewModelImpl.m14308q(messageAudioViewModelImpl, C20895n.f66594e, c7351f0.f23286a, null, 12);
                messageAudioViewModelImpl.m14309n().m21193a();
                messageAudioViewModelImpl.f38666q.m7281a(messageAudioViewModelImpl.m14394i(new MessageAudioViewModelImpl$playAudioMessage$1(messageAudioViewModelImpl, c7351f0, null)));
            }
            return C17296C.f55119a;
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/audio/MessageAudioViewModelImpl$Companion;", "", "()V", "ReadOutLoudEvent", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {

        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/messages/impl/audio/MessageAudioViewModelImpl$Companion$ReadOutLoudEvent;", "", "<init>", "()V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public static final class ReadOutLoudEvent {

            /* JADX INFO: renamed from: a */
            public static final ReadOutLoudEvent f38671a = new ReadOutLoudEvent();

            /* JADX INFO: renamed from: b */
            public static final Set f38672b = AbstractC17678l.m19293P(new AbstractC20882b[]{C20895n.f66598i, C20895n.f66594e, C20895n.f66597h, C20895n.f66596g, C20895n.f66595f, C20895n.f66592c});

            private ReadOutLoudEvent() {
            }
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAudioViewModelImpl(Application application, C20513d c20513d, C1991h c1991h, InterfaceC17068a provider, C16961l c16961l, C7392q c7392q, InterfaceC20904w interfaceC20904w, C14459O c14459o, InterfaceC13849E interfaceC13849E) {
        super(new C18398n(false, (1790 & 2) != 0 ? "" : null, 0L, false, false, null, false, false, ((C14005w2) interfaceC13849E).m15481a(C13890S.f43940c), true, (1790 & 1024) != 0 ? C18398n.f58685l : null));
        AbstractC16544l.m18094g(provider, "provider");
        this.f38658i = application;
        this.f38659j = c20513d;
        this.f38660k = c1991h;
        this.f38661l = provider;
        this.f38662m = c16961l;
        this.f38663n = c7392q;
        this.f38664o = interfaceC20904w;
        this.f38665p = AbstractC9227W.m9800c(new MessageAudioViewModelImpl$_audioPlayer$1(this));
        this.f38666q = new C6844a();
        this.f38667r = AbstractC2792U0.m3712c("MessageAudioViewModel");
        if (((C18398n) m14391f()).f58694i) {
            final C2207t0 c2207t0 = c14459o.f45526y;
            final C2146N c2146n = new C2146N(new InterfaceC2184i() { // from class: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$1

                /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$1$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C124042<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f38708Y;

                    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$1$2", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f38709Y;

                        /* JADX INFO: renamed from: Z */
                        public int f38710Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f38709Y = obj;
                            this.f38710Z |= Integer.MIN_VALUE;
                            return C124042.this.mo395a(null, this);
                        }
                    }

                    public C124042(InterfaceC2186j interfaceC2186j) {
                        this.f38708Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f38710Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f38710Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f38709Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f38710Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            AbstractC6659u abstractC6659uM4404d = AbstractC3693a.m4404d(((C3694b) obj).f11224i);
                            anonymousClass1.f38710Z = 1;
                            if (this.f38708Y.mo395a(abstractC6659uM4404d, anonymousClass1) == enumC19250a) {
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
                    Object objMo3141d = c2207t0.mo3141d(new C124042(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            }, 2);
            final InterfaceC2184i interfaceC2184iM3215n = AbstractC2124C.m3215n(new InterfaceC2184i() { // from class: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$2

                /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$2$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C124052<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f38713Y;

                    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$map$2$2", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f38714Y;

                        /* JADX INFO: renamed from: Z */
                        public int f38715Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f38714Y = obj;
                            this.f38715Z |= Integer.MIN_VALUE;
                            return C124052.this.mo395a(null, this);
                        }
                    }

                    public C124052(InterfaceC2186j interfaceC2186j) {
                        this.f38713Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f38715Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f38715Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f38714Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f38715Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            C7351f0 c7351f0M7172d = ((AbstractC6659u) obj).m7172d();
                            anonymousClass1.f38715Z = 1;
                            if (this.f38713Y.mo395a(c7351f0M7172d, anonymousClass1) == enumC19250a) {
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
                    Object objMo3141d = c2146n.mo3141d(new C124052(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            });
            AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3216o(new InterfaceC2184i() { // from class: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$filter$1

                /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$filter$1$2 */
                @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                public final class C124032<T> implements InterfaceC2186j {

                    /* JADX INFO: renamed from: Y */
                    public final /* synthetic */ InterfaceC2186j f38703Y;

                    /* JADX INFO: renamed from: com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
                    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl$special$$inlined$filter$1$2", m20656f = "MessageAudioViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
                    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    public final class AnonymousClass1 extends AbstractC19687c {

                        /* JADX INFO: renamed from: Y */
                        public /* synthetic */ Object f38704Y;

                        /* JADX INFO: renamed from: Z */
                        public int f38705Z;

                        public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                            super(interfaceC18770c);
                        }

                        @Override // sm.AbstractC19685a
                        public final Object invokeSuspend(Object obj) {
                            this.f38704Y = obj;
                            this.f38705Z |= Integer.MIN_VALUE;
                            return C124032.this.mo395a(null, this);
                        }
                    }

                    public C124032(InterfaceC2186j interfaceC2186j) {
                        this.f38703Y = interfaceC2186j;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // p103Dn.InterfaceC2186j
                    /* JADX INFO: renamed from: a */
                    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
                        AnonymousClass1 anonymousClass1;
                        if (interfaceC18770c instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                            int i10 = anonymousClass1.f38705Z;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f38705Z = i10 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                        }
                        Object obj2 = anonymousClass1.f38704Y;
                        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                        int i11 = anonymousClass1.f38705Z;
                        if (i11 == 0) {
                            AbstractC9233X.m9807c(obj2);
                            C7351f0 c7351f0 = (C7351f0) obj;
                            if (c7351f0.f23273I) {
                                if (c7351f0.f23290e == EnumC7359j0.f23344o0 && c7351f0.f23280P && (c7351f0.f23291f instanceof C7320F)) {
                                    anonymousClass1.f38705Z = 1;
                                    if (this.f38703Y.mo395a(obj, anonymousClass1) == enumC19250a) {
                                        return enumC19250a;
                                    }
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
                    Object objMo3141d = interfaceC2184iM3215n.mo3141d(new C124032(interfaceC2186j), interfaceC18770c);
                    return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
                }
            }, C123964.f38668Y, AbstractC2124C.f6495b), 5, new C123975(null)), ViewModelKt.m12143a(this));
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m14308q(MessageAudioViewModelImpl messageAudioViewModelImpl, AbstractC20882b abstractC20882b, String str, String str2, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        messageAudioViewModelImpl.m14311p(abstractC20882b, str, str2, false);
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        if (this.f38665p.isInitialized()) {
            m14309n().m21193a();
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC18393i intent = (InterfaceC18393i) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C18389e) {
            if (((C18389e) intent).f58669a) {
                m14309n().m21193a();
                return;
            }
            C20603k c20603kM14309n = m14309n();
            C20513d c20513d = c20603kM14309n.f65367a;
            C3516e c3516e = AbstractC0593T.f1824a;
            c20603kM14309n.f65376j.m7281a(AbstractC0575H.m1156D(c20603kM14309n.f65368b, AbstractC2935m.f8797a, null, new C20597e(c20603kM14309n, null), 2));
            return;
        }
        if (intent instanceof C18387c) {
            Application application = this.f38658i;
            boolean z6 = ((C18387c) intent).f58667a;
            String string = z6 ? application.getString(R.string.message_auto_read_enable) : application.getString(R.string.message_auto_read_disable);
            AbstractC16544l.m18091d(string);
            m14308q(this, C20895n.f66592c, String.valueOf(z6), null, 12);
            m14397m(new MessageAudioViewModelImpl$onIntent$1(intent));
            m14393h(new C2060i(string));
            return;
        }
        if (intent instanceof C18392h) {
            C20603k c20603kM14309n2 = m14309n();
            C20513d c20513d2 = c20603kM14309n2.f65367a;
            C3516e c3516e2 = AbstractC0593T.f1824a;
            c20603kM14309n2.f65376j.m7281a(AbstractC0575H.m1156D(c20603kM14309n2.f65368b, AbstractC2935m.f8797a, null, new C20599g(c20603kM14309n2, ((C18392h) intent).f58673a, null), 2));
            return;
        }
        if (intent instanceof C18388d) {
            m14308q(this, C20895n.f66597h, null, null, 14);
            m14394i(new MessageAudioViewModelImpl$onIntent$2(this, null));
            return;
        }
        if (intent instanceof C18391g) {
            C20895n c20895n = C20895n.f66598i;
            C7351f0 c7351f0 = ((C18391g) intent).f58672a;
            m14308q(this, c20895n, c7351f0.f23286a, c7351f0.f23288c, 8);
            m14309n().m21193a();
            this.f38666q.m7281a(m14394i(new MessageAudioViewModelImpl$playAudioMessage$1(this, c7351f0, null)));
            return;
        }
        if (intent instanceof C18390f) {
            C18390f c18390f = (C18390f) intent;
            m14311p(C20895n.f66593d, c18390f.f58671b, c18390f.f58670a.f23288c, true);
            m14394i(new MessageAudioViewModelImpl$onIntent$3(this, intent, null));
        }
    }

    /* JADX INFO: renamed from: n */
    public final C20603k m14309n() {
        return (C20603k) this.f38665p.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.openai.feature.messages.impl.audio.MessageAudioViewModelImpl] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.openai.viewmodel.BaseViewModel] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: o */
    public final Object m14310o(Uri uri, boolean z6, AbstractC19687c abstractC19687c) throws Throwable {
        MessageAudioViewModelImpl$playAudioUrl$1 messageAudioViewModelImpl$playAudioUrl$1;
        List list;
        ?? r10;
        MessageAudioViewModelImpl messageAudioViewModelImpl;
        if (abstractC19687c instanceof MessageAudioViewModelImpl$playAudioUrl$1) {
            messageAudioViewModelImpl$playAudioUrl$1 = (MessageAudioViewModelImpl$playAudioUrl$1) abstractC19687c;
            int i10 = messageAudioViewModelImpl$playAudioUrl$1.f38700p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                messageAudioViewModelImpl$playAudioUrl$1.f38700p0 = i10 - Integer.MIN_VALUE;
            } else {
                messageAudioViewModelImpl$playAudioUrl$1 = new MessageAudioViewModelImpl$playAudioUrl$1(this, abstractC19687c);
            }
        } else {
            messageAudioViewModelImpl$playAudioUrl$1 = new MessageAudioViewModelImpl$playAudioUrl$1(this, abstractC19687c);
        }
        Object objM21195a = messageAudioViewModelImpl$playAudioUrl$1.f38698Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = messageAudioViewModelImpl$playAudioUrl$1.f38700p0;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    MessageAudioViewModelImpl messageAudioViewModelImpl2 = messageAudioViewModelImpl$playAudioUrl$1.f38697Y;
                    AbstractC9233X.m9807c(objM21195a);
                    messageAudioViewModelImpl = messageAudioViewModelImpl2;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MessageAudioViewModelImpl messageAudioViewModelImpl3 = messageAudioViewModelImpl$playAudioUrl$1.f38697Y;
                    AbstractC9233X.m9807c(objM21195a);
                    uri = messageAudioViewModelImpl3;
                }
                list = (List) objM21195a;
                r10 = uri;
                r10.m14397m(new MessageAudioViewModelImpl$playAudioUrl$2(list));
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(objM21195a);
            C20603k c20603kM14309n = m14309n();
            c20603kM14309n.getClass();
            AbstractC16544l.m18094g(uri, "uri");
            C3516e c3516e = AbstractC0593T.f1824a;
            c20603kM14309n.f65376j.m7281a(AbstractC0575H.m1156D(c20603kM14309n.f65368b, AbstractC2935m.f8797a, null, new C20600h(c20603kM14309n, uri, z6, null), 2));
            C20603k c20603kM14309n2 = m14309n();
            String string = uri.toString();
            AbstractC16544l.m18093f(string, "toString(...)");
            messageAudioViewModelImpl$playAudioUrl$1.f38697Y = this;
            messageAudioViewModelImpl$playAudioUrl$1.f38700p0 = 1;
            objM21195a = c20603kM14309n2.f65369c.m21195a(string, messageAudioViewModelImpl$playAudioUrl$1);
            if (objM21195a == enumC19250a) {
                return enumC19250a;
            }
            messageAudioViewModelImpl = this;
            String str = (String) objM21195a;
            Application application = messageAudioViewModelImpl.f38658i;
            C20513d c20513d = messageAudioViewModelImpl.f38659j;
            C18407w c18407w = new C18407w(application, c20513d);
            messageAudioViewModelImpl$playAudioUrl$1.f38697Y = messageAudioViewModelImpl;
            messageAudioViewModelImpl$playAudioUrl$1.f38700p0 = 2;
            c20513d.getClass();
            objM21195a = AbstractC0575H.m1168P(AbstractC0593T.f1824a, new C18406v(c18407w, str, null), messageAudioViewModelImpl$playAudioUrl$1);
            uri = messageAudioViewModelImpl;
            if (objM21195a == enumC19250a) {
                return enumC19250a;
            }
            list = (List) objM21195a;
            r10 = uri;
        } catch (Exception e10) {
            AbstractC8160o6.m8727b(uri.f38667r, "Failed to extract waveform", e10, 4);
            list = C18398n.f58685l;
            r10 = uri;
        }
        r10.m14397m(new MessageAudioViewModelImpl$playAudioUrl$2(list));
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: p */
    public final void m14311p(AbstractC20882b abstractC20882b, String str, String str2, boolean z6) {
        C17309l c17309l = new C17309l("is_audio_asset_pointer", Boolean.valueOf(z6));
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Map mapM19244f = AbstractC17659D.m19244f(c17309l, new C17309l("conversation_id", str2));
        InterfaceC20904w interfaceC20904w = this.f38664o;
        if (str != null) {
            interfaceC20904w.mo21448b(abstractC20882b, str, mapM19244f);
        } else {
            interfaceC20904w.mo21447a(abstractC20882b, mapM19244f);
        }
        Companion.ReadOutLoudEvent.f38671a.getClass();
        if (AbstractC17680n.m19333J(Companion.ReadOutLoudEvent.f38672b, abstractC20882b)) {
            AbstractC8160o6.m8731f(this.f38667r, abstractC20882b.toString(), null, null, 6);
        }
    }
}
