package com.openai.feature.conversations.impl.voicefeedback;

import gd.C13839A1;
import gd.C13869K1;
import gd.C14005w2;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p072Ci.C1699d;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1081wc.C20860F;
import p1155zi.C22011h0;
import p1155zi.EnumC21946N2;
import p148Fi.C2854t0;
import p172Gi.C3061C;
import p172Gi.C3086s;
import p172Gi.EnumC3089v;
import p427Rc.C6852i;
import p571X9.AbstractC9233X;
import p909nm.C17689w;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import re.AbstractC18967t;
import re.C18953f;
import re.C18954g;
import re.C18964q;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$2", m20656f = "VoiceEndedViewModel.kt", m20657l = {113, 126}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceEndedViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public C3061C f38048Y;

    /* JADX INFO: renamed from: Z */
    public int f38049Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceEndedViewModelImpl f38050o0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$2$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$2$1", m20656f = "VoiceEndedViewModel.kt", m20657l = {115, 116}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123501 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38051Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ VoiceEndedViewModelImpl f38052Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123501(VoiceEndedViewModelImpl voiceEndedViewModelImpl, InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
            this.f38052Z = voiceEndedViewModelImpl;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return new C123501(this.f38052Z, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123501) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38051Y;
            VoiceEndedViewModelImpl voiceEndedViewModelImpl = this.f38052Z;
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC9233X.m9807c(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
            AbstractC9233X.m9807c(obj);
            C6852i c6852i = voiceEndedViewModelImpl.f38037l.f34301c;
            this.f38051Y = 1;
            obj = AbstractC2124C.m3221t(c6852i, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            String str = ((C22011h0) obj).f69652a;
            C2854t0 c2854t0 = voiceEndedViewModelImpl.f38038m;
            C3086s c3086s = new C3086s(str, EnumC3089v.f9298Z, C17689w.f56480Y, null);
            this.f38051Y = 2;
            if (c2854t0.m3716b(c3086s, this) == enumC19250a) {
                return enumC19250a;
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$2$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123512 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123512 f38053Y = new C123512();

        public C123512() {
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
    public VoiceEndedViewModelImpl$onIntent$2(VoiceEndedViewModelImpl voiceEndedViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38050o0 = voiceEndedViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceEndedViewModelImpl$onIntent$2(this.f38050o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceEndedViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C3061C c3061cMo20277e;
        C3061C c3061c;
        C1699d c1699d;
        boolean zM18089b;
        Boolean bool;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38049Z;
        VoiceEndedViewModelImpl voiceEndedViewModelImpl = this.f38050o0;
        EnumC21946N2 enumC21946N2 = null;
        if (i10 != 0) {
            if (i10 == 1) {
                c3061cMo20277e = this.f38048Y;
                AbstractC9233X.m9807c(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3061c = this.f38048Y;
                AbstractC9233X.m9807c(obj);
            }
            c1699d = (C1699d) obj;
            zM18089b = AbstractC16544l.m18089b(c1699d.f4829c, Boolean.FALSE);
            boolean zM15481a = ((C14005w2) voiceEndedViewModelImpl.f38034i).m15481a(C13869K1.f43907c);
            boolean zM15481a2 = ((C14005w2) voiceEndedViewModelImpl.f38034i).m15481a(C13839A1.f43875c);
            if (!zM18089b) {
                bool = c1699d.f4830d;
                Boolean bool2 = c1699d.f4831e;
                if (bool == null || bool2 != null) {
                    if (AbstractC16544l.m18089b(bool, Boolean.TRUE) && bool2 == null && zM15481a2 && c3061c != null && c3061c.f9234f) {
                        enumC21946N2 = EnumC21946N2.f69498o0;
                    }
                } else if (zM15481a && zM15481a2) {
                    enumC21946N2 = EnumC21946N2.f69499p0;
                } else if (zM15481a) {
                    enumC21946N2 = EnumC21946N2.f69497Z;
                }
            }
            if (enumC21946N2 != null) {
                voiceEndedViewModelImpl.m14392g(new C18954g(enumC21946N2));
            } else {
                voiceEndedViewModelImpl.m14392g(C18953f.f60508a);
            }
            voiceEndedViewModelImpl.m14397m(C123512.f38053Y);
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        c3061cMo20277e = ((AbstractC18967t) voiceEndedViewModelImpl.m14391f()).mo20277e();
        if (c3061cMo20277e != null) {
            C20860F c20860f = C20860F.f66382s;
            this.f38048Y = c3061cMo20277e;
            this.f38049Z = 1;
            if (voiceEndedViewModelImpl.m14273n(c3061cMo20277e, c20860f, C17690x.f56481Y, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        voiceEndedViewModelImpl.m14394i(new C123501(voiceEndedViewModelImpl, null));
        C1970n c1970n = voiceEndedViewModelImpl.f38036k.f41695r0;
        this.f38048Y = c3061cMo20277e;
        this.f38049Z = 2;
        obj = AbstractC2124C.m3221t(c1970n, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        c3061c = c3061cMo20277e;
        c1699d = (C1699d) obj;
        zM18089b = AbstractC16544l.m18089b(c1699d.f4829c, Boolean.FALSE);
        boolean zM15481a3 = ((C14005w2) voiceEndedViewModelImpl.f38034i).m15481a(C13869K1.f43907c);
        boolean zM15481a4 = ((C14005w2) voiceEndedViewModelImpl.f38034i).m15481a(C13839A1.f43875c);
        if (!zM18089b) {
            bool = c1699d.f4830d;
            Boolean bool3 = c1699d.f4831e;
            if (bool == null) {
                if (AbstractC16544l.m18089b(bool, Boolean.TRUE)) {
                    enumC21946N2 = EnumC21946N2.f69498o0;
                }
            } else if (AbstractC16544l.m18089b(bool, Boolean.TRUE)) {
                enumC21946N2 = EnumC21946N2.f69498o0;
            }
        }
        if (enumC21946N2 != null) {
            voiceEndedViewModelImpl.m14392g(new C18954g(enumC21946N2));
        } else {
            voiceEndedViewModelImpl.m14392g(C18953f.f60508a);
        }
        voiceEndedViewModelImpl.m14397m(C123512.f38053Y);
        return C17296C.f55119a;
    }
}
