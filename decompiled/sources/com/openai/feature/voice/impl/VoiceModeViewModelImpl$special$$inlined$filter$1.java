package com.openai.feature.voice.impl;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18067d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LDn/i;", "kotlinx-coroutines-core"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeViewModelImpl$special$$inlined$filter$1 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeViewModelImpl$special$$inlined$map$1 f40202Y;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$1$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public final class C125672<T> implements InterfaceC2186j {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC2186j f40203Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$1$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$filter$1$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public final class AnonymousClass1 extends AbstractC19687c {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f40204Y;

            /* JADX INFO: renamed from: Z */
            public int f40205Z;

            public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                super(interfaceC18770c);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                this.f40204Y = obj;
                this.f40205Z |= Integer.MIN_VALUE;
                return C125672.this.mo395a(null, this);
            }
        }

        public C125672(InterfaceC2186j interfaceC2186j) {
            this.f40203Y = interfaceC2186j;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p103Dn.InterfaceC2186j
        /* JADX INFO: renamed from: a */
        public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
            AnonymousClass1 anonymousClass1;
            if (interfaceC18770c instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                int i10 = anonymousClass1.f40205Z;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f40205Z = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
            }
            Object obj2 = anonymousClass1.f40204Y;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i11 = anonymousClass1.f40205Z;
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                if (!((List) obj).isEmpty()) {
                    anonymousClass1.f40205Z = 1;
                    if (this.f40203Y.mo395a(obj, anonymousClass1) == enumC19250a) {
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

    public VoiceModeViewModelImpl$special$$inlined$filter$1(VoiceModeViewModelImpl$special$$inlined$map$1 voiceModeViewModelImpl$special$$inlined$map$1) {
        this.f40202Y = voiceModeViewModelImpl$special$$inlined$map$1;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d = this.f40202Y.mo3141d(new C125672(interfaceC2186j), interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }
}
