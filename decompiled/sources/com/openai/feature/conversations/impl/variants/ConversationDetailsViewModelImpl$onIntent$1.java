package com.openai.feature.conversations.impl.variants;

import com.openai.chatgpt.R;
import java.util.List;
import kotlin.Metadata;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2056e;
import p098Di.C2059h;
import p098Di.C2060i;
import p1081wc.C20858D;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p787he.C14459O;
import p787he.C14497z;
import p909nm.C17690x;
import p964qe.C18690c;
import p964qe.C18698k;
import p964qe.InterfaceC18692e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.variants.ConversationDetailsViewModelImpl$onIntent$1", m20656f = "VariantsInStreamViewModel.kt", m20657l = {68}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationDetailsViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38020Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationDetailsViewModelImpl f38021Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18692e f38022o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationDetailsViewModelImpl$onIntent$1(ConversationDetailsViewModelImpl conversationDetailsViewModelImpl, InterfaceC18692e interfaceC18692e, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38021Z = conversationDetailsViewModelImpl;
        this.f38022o0 = interfaceC18692e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ConversationDetailsViewModelImpl$onIntent$1(this.f38021Z, this.f38022o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ConversationDetailsViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C2060i c2060i;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38020Y;
        InterfaceC18692e interfaceC18692e = this.f38022o0;
        ConversationDetailsViewModelImpl conversationDetailsViewModelImpl = this.f38021Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C18690c c18690c = (C18690c) interfaceC18692e;
            conversationDetailsViewModelImpl.f38016k.mo21448b(C20858D.f66347e, String.valueOf(c18690c.f59506a), C17690x.f56481Y);
            Integer num = c18690c.f59506a;
            List list = ((C18698k) conversationDetailsViewModelImpl.m14391f()).f59523d;
            this.f38020Y = 1;
            C14459O c14459o = conversationDetailsViewModelImpl.f38014i;
            c14459o.getClass();
            obj = c14459o.m15992u(new C14497z(c14459o, num, list, null), this);
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
        C2056e c2056e = C2056e.f6277a;
        if (z6) {
            conversationDetailsViewModelImpl.m14393h(c2056e);
            if (((C18690c) interfaceC18692e).f59506a != null) {
                c2060i = new C2060i(R.string.conversation_variants_confirmation);
                conversationDetailsViewModelImpl.m14393h(c2060i);
            }
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            conversationDetailsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            conversationDetailsViewModelImpl.m14393h(c2056e);
            if (((C18690c) interfaceC18692e).f59506a != null) {
                c2060i = new C2060i(R.string.conversation_variants_confirmation);
                conversationDetailsViewModelImpl.m14393h(c2060i);
            }
        }
        return C17296C.f55119a;
    }
}
