package com.openai.feature.onboarding.impl.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17613d;
import p017Af.C0491v;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2058g;
import p098Di.C2059h;
import p1081wc.C20877X;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p318Mh.C5398f0;
import p364Oh.AbstractC6224C;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.CollectEmailViewModelLoggedInImpl$onIntent$2", m20656f = "CollectEmailViewModelImpl.kt", m20657l = {106}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CollectEmailViewModelLoggedInImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public String f39051Y;

    /* JADX INFO: renamed from: Z */
    public int f39052Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ CollectEmailViewModelLoggedInImpl f39053o0;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.CollectEmailViewModelLoggedInImpl$onIntent$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/d;", "invoke", "(Lng/d;)Lng/d;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124491 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124491 f39054Y = new C124491();

        public C124491() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17613d setState = (C17613d) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17613d.m19227e(setState, null, false, C21917G1.f69468a, 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectEmailViewModelLoggedInImpl$onIntent$2(CollectEmailViewModelLoggedInImpl collectEmailViewModelLoggedInImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39053o0 = collectEmailViewModelLoggedInImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new CollectEmailViewModelLoggedInImpl$onIntent$2(this.f39053o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((CollectEmailViewModelLoggedInImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String email;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39052Z;
        CollectEmailViewModelLoggedInImpl collectEmailViewModelLoggedInImpl = this.f39053o0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            collectEmailViewModelLoggedInImpl.f39048l.mo21447a(C20877X.f66462B, C17690x.f56481Y);
            collectEmailViewModelLoggedInImpl.m14397m(C124491.f39054Y);
            String str = ((C17613d) collectEmailViewModelLoggedInImpl.m14391f()).f56369a;
            this.f39051Y = str;
            this.f39052Z = 1;
            Object objM13041g = collectEmailViewModelLoggedInImpl.f39045i.f34429a.m13041g(str, this);
            if (objM13041g == enumC19250a) {
                return enumC19250a;
            }
            email = str;
            obj = objM13041g;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            email = this.f39051Y;
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1M6735b = ((AbstractC6224C) obj).m6735b();
        if (abstractC21955Q1M6735b instanceof C21952P1) {
            collectEmailViewModelLoggedInImpl.m14397m(CollectEmailViewModelLoggedInImpl$onIntent$2$2$1.f39055Y);
            C5398f0 c5398f0 = C5398f0.f17661h;
            c5398f0.getClass();
            AbstractC16544l.m18094g(email, "email");
            collectEmailViewModelLoggedInImpl.m14393h(new C2058g(c5398f0.m5885a(new C0491v(email, 25)), true));
        } else if (abstractC21955Q1M6735b instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1M6735b;
            AbstractC8160o6.m8727b(collectEmailViewModelLoggedInImpl.f39049m, "Failed to send email verification code", abstractC21933K1.f69485a, 4);
            collectEmailViewModelLoggedInImpl.m14397m(new CollectEmailViewModelLoggedInImpl$onIntent$2$3$1(abstractC21933K1));
            collectEmailViewModelLoggedInImpl.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, collectEmailViewModelLoggedInImpl.f39047k, collectEmailViewModelLoggedInImpl.f39046j, null)));
        } else {
            if (!(abstractC21955Q1M6735b instanceof C21929J1)) {
                throw new C0644w();
            }
            collectEmailViewModelLoggedInImpl.m14397m(CollectEmailViewModelLoggedInImpl$onIntent$2$4$1.f39057Y);
        }
        return C17296C.f55119a;
    }
}
