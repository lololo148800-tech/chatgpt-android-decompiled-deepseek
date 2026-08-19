package com.openai.feature.onboarding.impl.viewmodel;

import android.content.Context;
import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1149zc.AbstractC21864z;
import p571X9.AbstractC9233X;
import p905nd.C17589q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel$logout$1", m20656f = "VerifyEmailLinkViewModel.kt", m20657l = {151}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VerifyEmailLinkViewModel$logout$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39303Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VerifyEmailLinkViewModel f39304Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f39305o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyEmailLinkViewModel$logout$1(VerifyEmailLinkViewModel verifyEmailLinkViewModel, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39304Z = verifyEmailLinkViewModel;
        this.f39305o0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new VerifyEmailLinkViewModel$logout$1(this.f39304Z, this.f39305o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((VerifyEmailLinkViewModel$logout$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39303Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC21864z abstractC21864z = this.f39304Z.f39285l;
            this.f39303Y = 1;
            if (((C17589q) abstractC21864z).m19224j(this.f39305o0, this) == enumC19250a) {
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
