package com.openai.feature.oauth.impl;

import kotlin.Metadata;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p577Xf.C9506e;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.oauth.impl.AipOauthViewModelImpl$1$2$1", m20656f = "AipOauthViewModel.kt", m20657l = {69}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AipOauthViewModelImpl$1$2$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39025Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AipOauthViewModelImpl f39026Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AipOauthViewModelImpl$1$2$1(AipOauthViewModelImpl aipOauthViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39026Z = aipOauthViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new AipOauthViewModelImpl$1$2$1(this.f39026Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((AipOauthViewModelImpl$1$2$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39025Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            long j10 = AipOauthViewModelKt.f39030a;
            this.f39025Y = 1;
            if (AbstractC0575H.m1185n(j10, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        this.f39026Z.m14392g(C9506e.f28625a);
        return C17296C.f55119a;
    }
}
