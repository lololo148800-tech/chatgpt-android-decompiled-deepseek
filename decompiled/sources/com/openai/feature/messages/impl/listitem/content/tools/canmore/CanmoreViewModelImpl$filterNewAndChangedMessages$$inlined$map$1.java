package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p103Dn.C2146N;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p1155zi.C21984a1;
import p479Td.C7351f0;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18067d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LDn/i;", "kotlinx-coroutines-core"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1 implements InterfaceC2184i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2146N f38885Y;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1$2 */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public final class C124332<T> implements InterfaceC2186j {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC2186j f38886Y;

        /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1$2", m20656f = "CanmoreViewModel.kt", m20657l = {StatsigLoggerKt.MAX_EVENTS}, m20658m = "emit")
        @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
        public final class AnonymousClass1 extends AbstractC19687c {

            /* JADX INFO: renamed from: Y */
            public /* synthetic */ Object f38887Y;

            /* JADX INFO: renamed from: Z */
            public int f38888Z;

            public AnonymousClass1(InterfaceC18770c interfaceC18770c) {
                super(interfaceC18770c);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                this.f38887Y = obj;
                this.f38888Z |= Integer.MIN_VALUE;
                return C124332.this.mo395a(null, this);
            }
        }

        public C124332(InterfaceC2186j interfaceC2186j) {
            this.f38886Y = interfaceC2186j;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p103Dn.InterfaceC2186j
        /* JADX INFO: renamed from: a */
        public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
            AnonymousClass1 anonymousClass1;
            if (interfaceC18770c instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) interfaceC18770c;
                int i10 = anonymousClass1.f38888Z;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f38888Z = i10 - Integer.MIN_VALUE;
                } else {
                    anonymousClass1 = new AnonymousClass1(interfaceC18770c);
                }
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC18770c);
            }
            Object obj2 = anonymousClass1.f38887Y;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i11 = anonymousClass1.f38888Z;
            if (i11 == 0) {
                AbstractC9233X.m9807c(obj2);
                C17309l c17309l = (C17309l) obj;
                List list = (List) c17309l.f55136Y;
                List list2 = (List) c17309l.f55137Z;
                if (list != null) {
                    List listM19337M = AbstractC17680n.m19337M(1, list);
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19337M, 10));
                    Iterator<T> it = listM19337M.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C21984a1(((C7351f0) it.next()).f23286a));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (T t10 : list2) {
                        C7351f0 c7351f0 = (C7351f0) t10;
                        if (!arrayList.contains(new C21984a1(c7351f0.f23286a)) && (c7351f0.f23293h.m7782a() || c7351f0.f23290e.m7783a())) {
                            arrayList2.add(t10);
                        }
                    }
                    list2 = arrayList2;
                }
                anonymousClass1.f38888Z = 1;
                if (this.f38886Y.mo395a(list2, anonymousClass1) == enumC19250a) {
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

    public CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1(C2146N c2146n) {
        this.f38885Y = c2146n;
    }

    @Override // p103Dn.InterfaceC2184i
    /* JADX INFO: renamed from: d */
    public final Object mo3141d(InterfaceC2186j interfaceC2186j, InterfaceC18770c interfaceC18770c) {
        Object objMo3141d = this.f38885Y.mo3141d(new C124332(interfaceC2186j), interfaceC18770c);
        return objMo3141d == EnumC19250a.f61036Y ? objMo3141d : C17296C.f55119a;
    }
}
