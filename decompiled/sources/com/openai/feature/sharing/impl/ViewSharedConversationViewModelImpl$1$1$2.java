package com.openai.feature.sharing.impl;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p1042uh.C20263a0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p364Oh.C6240n;
import p571X9.AbstractC9233X;
import p576Xe.C9473F;
import p621Zd.C10281b;
import p621Zd.C10282c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sh.C19614c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.sharing.impl.ViewSharedConversationViewModelImpl$1$1$2", m20656f = "ViewSharedConversationViewModelImpl.kt", m20657l = {86}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ViewSharedConversationViewModelImpl$1$1$2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39835Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C9473F f39836Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f39837o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ViewSharedConversationViewModelImpl f39838p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewSharedConversationViewModelImpl$1$1$2(C9473F c9473f, String str, ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39836Z = c9473f;
        this.f39837o0 = str;
        this.f39838p0 = viewSharedConversationViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new ViewSharedConversationViewModelImpl$1$1$2(this.f39836Z, this.f39837o0, this.f39838p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewSharedConversationViewModelImpl$1$1$2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39835Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C9473F c9473f = this.f39836Z;
            String gizmoId = this.f39837o0;
            AbstractC16544l.m18094g(gizmoId, "gizmoId");
            C2025h c2025h = new C2025h(c9473f.f28512b.m7286b(new C19614c(gizmoId), new C6240n()), 8);
            this.f39835Y = 1;
            obj = AbstractC2124C.m3221t(c2025h, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        ViewSharedConversationViewModelImpl viewSharedConversationViewModelImpl = this.f39838p0;
        if (z6) {
            C20263a0 c20263a0 = (C20263a0) ((C21952P1) abstractC21955Q1).f69511a;
            C10282c.Companion.getClass();
            viewSharedConversationViewModelImpl.m14397m(new ViewSharedConversationViewModelImpl$1$1$2$1$1(C10281b.m10879a(c20263a0), c20263a0));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            viewSharedConversationViewModelImpl.m14397m(new ViewSharedConversationViewModelImpl$1$1$2$2$1(new C10282c(viewSharedConversationViewModelImpl.f39822k.getString(R.string.anonymous_gizmo), false, false, (String) null, false, 30)));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            C10282c.Companion.getClass();
            viewSharedConversationViewModelImpl.m14397m(new ViewSharedConversationViewModelImpl$1$1$2$1$1(null, null));
        }
        return C17296C.f55119a;
    }
}
