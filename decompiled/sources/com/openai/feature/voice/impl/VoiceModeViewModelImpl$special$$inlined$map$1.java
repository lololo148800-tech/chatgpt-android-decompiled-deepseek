package com.openai.feature.voice.impl;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p103Dn.C2207t0;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1091wn.AbstractC21031l;
import p216Id.C3694b;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p926of.C18164a0;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18067d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LDn/i;", "kotlinx-coroutines-core"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class VoiceModeViewModelImpl$special$$inlined$map$1 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2207t0 f40212Y;

    /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$1$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public final class C125692<T> implements InterfaceC2186j {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC2186j f40213Y;

        /* JADX INFO: renamed from: com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$1$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$special$$inlined$map$1$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public final class AnonymousClass1 extends AbstractC19687c {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f40214Y;

            /* JADX INFO: renamed from: Z */
            public int f40215Z;

            public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                super(interfaceC18770c);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                this.f40214Y = obj;
                this.f40215Z |= Integer.MIN_VALUE;
                return C125692.this.mo395a(null, this);
            }
        }

        public C125692(InterfaceC2186j interfaceC2186j) {
            this.f40213Y = interfaceC2186j;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p103Dn.InterfaceC2186j
        /* JADX INFO: renamed from: a */
        public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
            AnonymousClass1 anonymousClass1;
            if (interfaceC18770c instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                int i10 = anonymousClass1.f40215Z;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f40215Z = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
            }
            Object obj2 = anonymousClass1.f40214Y;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i11 = anonymousClass1.f40215Z;
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                List list = ((C3694b) obj).f11224i;
                AbstractC16544l.m18094g(list, "<this>");
                List listM21499w = AbstractC21031l.m21499w(AbstractC21031l.m21495s(AbstractC21031l.m21487k(AbstractC21031l.m21496t(AbstractC17680n.m19329H(list), C18164a0.f57931Z), C18164a0.f57932o0), C18164a0.f57933p0));
                anonymousClass1.f40215Z = 1;
                if (this.f40213Y.mo395a(listM21499w, anonymousClass1) == enumC19250a) {
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

    public VoiceModeViewModelImpl$special$$inlined$map$1(C2207t0 c2207t0) {
        this.f40212Y = c2207t0;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d = this.f40212Y.mo3141d(new C125692(interfaceC2186j), interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }
}
