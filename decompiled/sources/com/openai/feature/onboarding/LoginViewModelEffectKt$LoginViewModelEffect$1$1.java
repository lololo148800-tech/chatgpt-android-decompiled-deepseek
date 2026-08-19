package com.openai.feature.onboarding;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2215x0;
import p553Wh.C8870f;
import p571X9.AbstractC9209T;
import p571X9.AbstractC9233X;
import p623Zf.AbstractC10316l;
import p623Zf.C10314j;
import p623Zf.C10315k;
import p893n.AbstractActivityC17375g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.LoginViewModelEffectKt$LoginViewModelEffect$1$1", m20656f = "LoginViewModelEffect.kt", m20657l = {16}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class LoginViewModelEffectKt$LoginViewModelEffect$1$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f39032Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ LoginViewModel f39033Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractActivityC17375g f39034o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8870f f39035p0;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.LoginViewModelEffectKt$LoginViewModelEffect$1$1$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.onboarding.LoginViewModelEffectKt$LoginViewModelEffect$1$1$1", m20656f = "LoginViewModelEffect.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LZf/l;", "effect", "Lmm/C;", "<anonymous>", "(LZf/l;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124481 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39036Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ LoginViewModel f39037Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ AbstractActivityC17375g f39038o0;

        /* JADX INFO: renamed from: p0 */
        public final /* synthetic */ C8870f f39039p0;

        /* JADX INFO: renamed from: com.openai.feature.onboarding.LoginViewModelEffectKt$LoginViewModelEffect$1$1$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ AbstractC10316l f39040Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ AbstractActivityC17375g f39041Z;

            /* JADX INFO: renamed from: o0 */
            public final /* synthetic */ C8870f f39042o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AbstractC10316l abstractC10316l, AbstractActivityC17375g abstractActivityC17375g, C8870f c8870f) {
                super(0);
                this.f39040Y = abstractC10316l;
                this.f39041Z = abstractActivityC17375g;
                this.f39042o0 = c8870f;
            }

            @Override // p049Bm.InterfaceC1426a
            public final Object invoke() {
                Intent intent = ((C10314j) this.f39040Y).f30627d;
                if (intent != null) {
                    AbstractC9209T.m9776b(this.f39041Z, this.f39042o0, intent);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124481(LoginViewModel loginViewModel, AbstractActivityC17375g abstractActivityC17375g, C8870f c8870f, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f39037Z = loginViewModel;
            this.f39038o0 = abstractActivityC17375g;
            this.f39039p0 = c8870f;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124481 c124481 = new C124481(this.f39037Z, this.f39038o0, this.f39039p0, interfaceC18770c);
            c124481.f39036Y = obj;
            return c124481;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124481 c124481 = (C124481) create((AbstractC10316l) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124481.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            AbstractC10316l abstractC10316l = (AbstractC10316l) this.f39036Y;
            boolean z6 = abstractC10316l instanceof C10315k;
            AbstractActivityC17375g abstractActivityC17375g = this.f39038o0;
            if (z6) {
                C10315k c10315k = (C10315k) abstractC10316l;
                this.f39037Z.mo14321n(abstractActivityC17375g, c10315k.f30628a, c10315k.f30629b);
            } else if (abstractC10316l instanceof C10314j) {
                C10314j c10314j = (C10314j) abstractC10316l;
                String str = c10314j.f30624a;
                C8870f c8870f = this.f39039p0;
                c8870f.m9549a(str, c10314j.f30625b, c10314j.f30626c, new AnonymousClass1(abstractC10316l, abstractActivityC17375g, c8870f));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModelEffectKt$LoginViewModelEffect$1$1(LoginViewModel loginViewModel, AbstractActivityC17375g abstractActivityC17375g, C8870f c8870f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f39033Z = loginViewModel;
        this.f39034o0 = abstractActivityC17375g;
        this.f39035p0 = c8870f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new LoginViewModelEffectKt$LoginViewModelEffect$1$1(this.f39033Z, this.f39034o0, this.f39035p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginViewModelEffectKt$LoginViewModelEffect$1$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39032Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            LoginViewModel loginViewModel = this.f39033Z;
            C2215x0 c2215x0 = loginViewModel.f40347g;
            C124481 c124481 = new C124481(loginViewModel, this.f39034o0, this.f39035p0, null);
            this.f39032Y = 1;
            if (AbstractC2124C.m3212k(c2215x0, c124481, this) == enumC19250a) {
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
