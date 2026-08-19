package com.openai.feature.conversationhistory.impl.history;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1440o;
import p103Dn.AbstractC2124C;
import p103Dn.C2219z0;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$$inlined$flatMapLatest$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$listenForSearchQueries$$inlined$flatMapLatest$1", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {189}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m18067d2 = {TokenNames.f32017R, TokenNames.f32019T, "LDn/j;", "it", "Lmm/C;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class C12244x2ca04c6c extends AbstractC19694j implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public int f37416Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ InterfaceC2186j f37417Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f37418o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37419p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12244x2ca04c6c(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(3, interfaceC18770c);
        this.f37419p0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C12244x2ca04c6c c12244x2ca04c6c = new C12244x2ca04c6c(this.f37419p0, (InterfaceC18770c) obj3);
        c12244x2ca04c6c.f37417Z = (InterfaceC2186j) obj;
        c12244x2ca04c6c.f37418o0 = obj2;
        return c12244x2ca04c6c.invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37416Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC2186j interfaceC2186j = this.f37417Z;
            C2219z0 c2219z0 = new C2219z0(new GizmosAndHistoryViewModelImpl$listenForSearchQueries$2$1((String) this.f37418o0, this.f37419p0, null));
            this.f37416Y = 1;
            if (AbstractC2124C.m3217p(interfaceC2186j, c2219z0, this) == enumC19250a) {
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
