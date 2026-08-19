package com.openai.feature.onboarding.impl.viewmodel;

import bg.C11422v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import ng.C17613d;
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
import p115E9.AbstractC2359a;
import p523V9.AbstractC8160o6;
import p544W9.AbstractC8458C2;
import p571X9.AbstractC9233X;
import p623Zf.C10327w;
import p623Zf.EnumC10304F;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.onboarding.impl.viewmodel.CollectEmailViewModelLoggedOutImpl$onIntent$2", m20656f = "CollectEmailViewModelImpl.kt", m20657l = {53, 55, 61}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CollectEmailViewModelLoggedOutImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public Object f39068Y;

    /* JADX INFO: renamed from: Z */
    public CollectEmailViewModelLoggedOutImpl f39069Z;

    /* JADX INFO: renamed from: o0 */
    public int f39070o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ CollectEmailViewModelLoggedOutImpl f39071p0;

    /* JADX INFO: renamed from: com.openai.feature.onboarding.impl.viewmodel.CollectEmailViewModelLoggedOutImpl$onIntent$2$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lng/d;", "invoke", "(Lng/d;)Lng/d;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124501 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C124501 f39072Y = new C124501();

        public C124501() {
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
    public CollectEmailViewModelLoggedOutImpl$onIntent$2(CollectEmailViewModelLoggedOutImpl collectEmailViewModelLoggedOutImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39071p0 = collectEmailViewModelLoggedOutImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new CollectEmailViewModelLoggedOutImpl$onIntent$2(this.f39071p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((CollectEmailViewModelLoggedOutImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC10304F enumC10304F;
        CollectEmailViewModelLoggedOutImpl collectEmailViewModelLoggedOutImpl;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39070o0;
        CollectEmailViewModelLoggedOutImpl collectEmailViewModelLoggedOutImpl2 = this.f39071p0;
        if (i10 != 0) {
            if (i10 == 1) {
                str = (String) this.f39068Y;
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                collectEmailViewModelLoggedOutImpl2 = (CollectEmailViewModelLoggedOutImpl) this.f39068Y;
                AbstractC9233X.m9807c(obj);
                collectEmailViewModelLoggedOutImpl2.m14397m(CollectEmailViewModelLoggedOutImpl$onIntent$2$2$2.f39074Y);
                enumC10304F = EnumC10304F.f30591o0;
                this.f39068Y = enumC10304F;
                this.f39069Z = collectEmailViewModelLoggedOutImpl2;
                this.f39070o0 = 3;
                obj = collectEmailViewModelLoggedOutImpl2.f39062i.m12787b(this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                collectEmailViewModelLoggedOutImpl = collectEmailViewModelLoggedOutImpl2;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collectEmailViewModelLoggedOutImpl = this.f39069Z;
                enumC10304F = (EnumC10304F) this.f39068Y;
                AbstractC9233X.m9807c(obj);
            }
            collectEmailViewModelLoggedOutImpl.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F, (C10327w) obj), true));
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        collectEmailViewModelLoggedOutImpl2.f39065l.mo21447a(C20877X.f66462B, C17690x.f56481Y);
        collectEmailViewModelLoggedOutImpl2.m14397m(C124501.f39072Y);
        str = ((C17613d) collectEmailViewModelLoggedOutImpl2.m14391f()).f56369a;
        this.f39068Y = str;
        this.f39070o0 = 1;
        obj = collectEmailViewModelLoggedOutImpl2.f39062i.m12789d(str, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof C21952P1) {
            C11422v c11422v = collectEmailViewModelLoggedOutImpl2.f39062i;
            CollectEmailViewModelLoggedOutImpl$onIntent$2$2$1 collectEmailViewModelLoggedOutImpl$onIntent$2$2$1 = new CollectEmailViewModelLoggedOutImpl$onIntent$2$2$1(str);
            this.f39068Y = collectEmailViewModelLoggedOutImpl2;
            this.f39070o0 = 2;
            if (c11422v.m12791f(collectEmailViewModelLoggedOutImpl$onIntent$2$2$1, this) == enumC19250a) {
                return enumC19250a;
            }
            collectEmailViewModelLoggedOutImpl2.m14397m(CollectEmailViewModelLoggedOutImpl$onIntent$2$2$2.f39074Y);
            enumC10304F = EnumC10304F.f30591o0;
            this.f39068Y = enumC10304F;
            this.f39069Z = collectEmailViewModelLoggedOutImpl2;
            this.f39070o0 = 3;
            obj = collectEmailViewModelLoggedOutImpl2.f39062i.m12787b(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            collectEmailViewModelLoggedOutImpl = collectEmailViewModelLoggedOutImpl2;
            collectEmailViewModelLoggedOutImpl.m14393h(new C2058g(AbstractC2359a.m3444c(enumC10304F, (C10327w) obj), true));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(collectEmailViewModelLoggedOutImpl2.f39066m, "Failed to send email verification code", abstractC21933K1.f69485a, 4);
            collectEmailViewModelLoggedOutImpl2.m14397m(new CollectEmailViewModelLoggedOutImpl$onIntent$2$3$1(abstractC21933K1));
            collectEmailViewModelLoggedOutImpl2.m14393h(new C2059h(AbstractC8458C2.m9074b(abstractC21933K1, collectEmailViewModelLoggedOutImpl2.f39064k, collectEmailViewModelLoggedOutImpl2.f39063j, null)));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            collectEmailViewModelLoggedOutImpl2.m14397m(CollectEmailViewModelLoggedOutImpl$onIntent$2$4$1.f39076Y);
        }
        return C17296C.f55119a;
    }
}
