package com.openai.chatgpt.app;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p092Dc.C1988e;
import p092Dc.C2005v;
import p103Dn.AbstractC2124C;
import p103Dn.InterfaceC2184i;
import p103Dn.InterfaceC2186j;
import p190Hc.InterfaceC3283d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.chatgpt.app.RootViewModelImpl$special$$inlined$flatMapLatest$1", m20656f = "RootViewModelImpl.kt", m20657l = {189}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m18067d2 = {TokenNames.f32017R, TokenNames.f32019T, "LDn/j;", "it", "Lmm/C;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class RootViewModelImpl$special$$inlined$flatMapLatest$1 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f37213Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ InterfaceC2186j f37214Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37215o0;

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RootViewModelImpl$special$$inlined$flatMapLatest$1 rootViewModelImpl$special$$inlined$flatMapLatest$1 = new RootViewModelImpl$special$$inlined$flatMapLatest$1(3, (InterfaceC18770c) obj3);
        rootViewModelImpl$special$$inlined$flatMapLatest$1.f37214Z = (InterfaceC2186j) obj;
        rootViewModelImpl$special$$inlined$flatMapLatest$1.f37215o0 = obj2;
        return rootViewModelImpl$special$$inlined$flatMapLatest$1.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37213Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = this.f37214Z;
            InterfaceC3283d interfaceC3283d = (InterfaceC3283d) this.f37215o0;
            InterfaceC2184i interfaceC2184iM3204c = interfaceC3283d instanceof C2005v ? ((C1988e) ((C2005v) interfaceC3283d).f6142j.get()).f5878d : AbstractC2124C.m3204c(null);
            this.f37213Y = 1;
            if (AbstractC2124C.m3217p(interfaceC2186j, interfaceC2184iM3204c, this) == enumC19250a) {
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
