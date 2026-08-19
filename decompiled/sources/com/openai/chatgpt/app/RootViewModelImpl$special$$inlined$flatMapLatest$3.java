package com.openai.chatgpt.app;

import android.gov.nist.javax.sip.parser.TokenNames;
import gd.C14005w2;
import gd.InterfaceC13849E;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p092Dc.C1996m;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.chatgpt.app.RootViewModelImpl$special$$inlined$flatMapLatest$3", m20656f = "RootViewModelImpl.kt", m20657l = {189}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m18067d2 = {TokenNames.f32017R, TokenNames.f32019T, "LDn/j;", "it", "Lmm/C;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class RootViewModelImpl$special$$inlined$flatMapLatest$3 extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f37219Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ InterfaceC2186j f37220Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37221o0;

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RootViewModelImpl$special$$inlined$flatMapLatest$3 rootViewModelImpl$special$$inlined$flatMapLatest$3 = new RootViewModelImpl$special$$inlined$flatMapLatest$3(3, (InterfaceC18770c) obj3);
        rootViewModelImpl$special$$inlined$flatMapLatest$3.f37220Z = (InterfaceC2186j) obj;
        rootViewModelImpl$special$$inlined$flatMapLatest$3.f37221o0 = obj2;
        return rootViewModelImpl$special$$inlined$flatMapLatest$3.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2153Q0 c2153q0M3204c;
        InterfaceC13849E interfaceC13849EMo3166d;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37219Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = this.f37220Z;
            C1996m c1996m = (C1996m) this.f37221o0;
            if (c1996m == null || (interfaceC13849EMo3166d = c1996m.mo3166d()) == null || (c2153q0M3204c = ((C14005w2) interfaceC13849EMo3166d).f44087e) == null) {
                c2153q0M3204c = AbstractC2124C.m3204c(null);
            }
            this.f37219Y = 1;
            if (AbstractC2124C.m3217p(interfaceC2186j, c2153q0M3204c, this) == enumC19250a) {
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
