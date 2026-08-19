package com.openai.chatgpt;

import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.Metadata;
import mm.C17296C;
import p006A4.C0349j;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2215x0;
import p229J0.EnumC3898D3;
import p537W0.C8410b;
import p553Wh.C8866b;
import p553Wh.C8870f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ug.C20218a;
import ug.C20219b;
import ug.InterfaceC20220c;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.chatgpt.MainActivityKt$RootViewModelEffectHandler$1$1", m20656f = "MainActivity.kt", m20657l = {462}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MainActivityKt$RootViewModelEffectHandler$1$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37134Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RootViewModel f37135Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8870f f37136o0;

    /* JADX INFO: renamed from: com.openai.chatgpt.MainActivityKt$RootViewModelEffectHandler$1$1$1 */
    @InterfaceC19689e(m20655c = "com.openai.chatgpt.MainActivityKt$RootViewModelEffectHandler$1$1$1", m20656f = "MainActivity.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lug/c;", "effect", "Lmm/C;", "<anonymous>", "(Lug/c;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122131 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37137Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ C8870f f37138Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122131(C8870f c8870f, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37138Z = c8870f;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122131 c122131 = new C122131(this.f37138Z, interfaceC18770c);
            c122131.f37137Y = obj;
            return c122131;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C122131 c122131 = (C122131) create((InterfaceC20220c) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c122131.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            InterfaceC20220c interfaceC20220c = (InterfaceC20220c) this.f37137Y;
            boolean z6 = interfaceC20220c instanceof C20218a;
            C8870f c8870f = this.f37138Z;
            if (z6) {
                c8870f.f27149b.m12192l(((C20218a) interfaceC20220c).f64011a);
            } else if (interfaceC20220c instanceof C20219b) {
                C8410b c8410b = new C8410b(new C0349j(((C20219b) interfaceC20220c).f64012a, 2, c8870f), true, 1845279862);
                EnumC3898D3 enumC3898D3 = EnumC3898D3.f11877Y;
                c8870f.getClass();
                AbstractC0575H.m1156D(c8870f.f27153f, null, null, new C8866b(true, c8870f, enumC3898D3, c8410b, null), 3);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityKt$RootViewModelEffectHandler$1$1(RootViewModel rootViewModel, C8870f c8870f, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37135Z = rootViewModel;
        this.f37136o0 = c8870f;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new MainActivityKt$RootViewModelEffectHandler$1$1(this.f37135Z, this.f37136o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((MainActivityKt$RootViewModelEffectHandler$1$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37134Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2215x0 c2215x0 = this.f37135Z.f40347g;
            C122131 c122131 = new C122131(this.f37136o0, null);
            this.f37134Y = 1;
            if (AbstractC2124C.m3212k(c2215x0, c122131, this) == enumC19250a) {
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
