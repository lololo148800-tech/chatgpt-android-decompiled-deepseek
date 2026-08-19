package com.openai.feature.conversations.impl.voicefeedback;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p1111xl.C21296a;
import p148Fi.C2837l0;
import p148Fi.C2854t0;
import p172Gi.C3083p;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p432Rh.C6889b;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceFeedbackDetailsViewModelImpl$1$response$1", m20656f = "VoiceFeedbackDetailsViewModel.kt", m20657l = {47}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, m18067d2 = {"", "<anonymous parameter 0>", "", "previousException", "LOh/C;", "LGi/p;", "<anonymous>", "(ILjava/lang/Throwable;)LOh/C;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceFeedbackDetailsViewModelImpl$1$response$1 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f38098Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Throwable f38099Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceFeedbackDetailsViewModelImpl f38100o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFeedbackDetailsViewModelImpl$1$response$1(VoiceFeedbackDetailsViewModelImpl voiceFeedbackDetailsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f38100o0 = voiceFeedbackDetailsViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        VoiceFeedbackDetailsViewModelImpl$1$response$1 voiceFeedbackDetailsViewModelImpl$1$response$1 = new VoiceFeedbackDetailsViewModelImpl$1$response$1(this.f38100o0, (InterfaceC18770c) obj3);
        voiceFeedbackDetailsViewModelImpl$1$response$1.f38099Z = (Throwable) obj2;
        return voiceFeedbackDetailsViewModelImpl$1$response$1.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38098Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            Throwable th2 = this.f38099Z;
            VoiceFeedbackDetailsViewModelImpl voiceFeedbackDetailsViewModelImpl = this.f38100o0;
            if (th2 != null) {
                AbstractC8160o6.m8726a(voiceFeedbackDetailsViewModelImpl.f38094k, "Failed to fetch options. Retrying", th2, 4);
            }
            C2854t0 c2854t0 = voiceFeedbackDetailsViewModelImpl.f38092i;
            this.f38098Y = 1;
            c2854t0.getClass();
            InterfaceC3777y interfaceC3777yM18075c = null;
            C2837l0 c2837l0 = new C2837l0(2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C3083p.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C3083p.class);
            } catch (Throwable unused) {
            }
            C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
            C6889b c6889b = c2854t0.f8612a;
            c6889b.getClass();
            obj = AbstractC9144I.m9690b(c6889b, c21296a, c2837l0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }
}
