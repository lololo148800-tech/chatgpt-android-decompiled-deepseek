package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2121A0;
import p103Dn.InterfaceC2211v0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;", "", "<init>", "()V", "Lmm/C;", "cancelRunningInquiries", "LAn/F;", "coroutineScope", "LAn/F;", "LDn/v0;", "Lcom/withpersona/sdk2/inquiry/InquiryActivityEvent;", "_eventFlow", "LDn/v0;", "LDn/A0;", "getEventFlow", "()LDn/A0;", "eventFlow", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryActivityBroadcastManager {
    public static final InquiryActivityBroadcastManager INSTANCE = new InquiryActivityBroadcastManager();
    private static final InterfaceC0571F coroutineScope = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));
    private static final InterfaceC2211v0 _eventFlow = AbstractC2124C.m3203b(0, 0, null, 7);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1 */
    @InterfaceC19689e(m20655c = "com.withpersona.sdk2.inquiry.InquiryActivityBroadcastManager$cancelRunningInquiries$1", m20656f = "InquiryActivityBroadcastManager.kt", m20657l = {19}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    public static final class C128561 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128561(InterfaceC18770c<? super C128561> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return new C128561(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128561) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InterfaceC2211v0 interfaceC2211v0 = InquiryActivityBroadcastManager._eventFlow;
                InquiryActivityEvent.CancelInquiry cancelInquiry = InquiryActivityEvent.CancelInquiry.INSTANCE;
                this.label = 1;
                if (interfaceC2211v0.mo395a(cancelInquiry, this) == enumC19250a) {
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

    private InquiryActivityBroadcastManager() {
    }

    public final void cancelRunningInquiries() {
        AbstractC0575H.m1156D(coroutineScope, null, null, new C128561(null), 3);
    }

    public final InterfaceC2121A0 getEventFlow() {
        return _eventFlow;
    }
}
