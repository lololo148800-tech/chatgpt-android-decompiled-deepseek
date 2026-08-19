package com.openai.feature.auth.impl;

import androidx.lifecycle.ViewModel;
import com.openai.auth.AuthMismatchViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2053b;
import p1149zc.C21853o;
import p1149zc.C21855q;
import p1149zc.InterfaceC21856r;
import p1155zi.C21988b1;
import p1155zi.C22038o;
import p1155zi.C22050r;
import p1155zi.C22062u;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13158l;
import p948pi.C18418a;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/auth/impl/AuthMismatchViewModelImpl;", "Lcom/openai/auth/AuthMismatchViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AuthMismatchViewModelImpl extends AuthMismatchViewModel {

    /* JADX INFO: renamed from: com.openai.feature.auth.impl.AuthMismatchViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.AuthMismatchViewModelImpl$1", m20656f = "AuthMismatchViewModelImpl.kt", m20657l = {38}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Lzi/b1;", "mismatchAuth", "Lmm/l;", "Lzi/u;", "<anonymous>", "(Lzi/b1;)Lmm/l;"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122221 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public int f37250Y;

        /* JADX INFO: renamed from: Z */
        public /* synthetic */ Object f37251Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ C13158l f37252o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122221(C13158l c13158l, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37252o0 = c13158l;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122221 c122221 = new C122221(this.f37252o0, interfaceC18770c);
            c122221.f37251Z = obj;
            return c122221;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C122221) create((C21988b1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            C21988b1 c21988b1;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f37250Y;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C21988b1 c21988b2 = (C21988b1) this.f37251Z;
                this.f37251Z = c21988b2;
                this.f37250Y = 1;
                Object objM14823d = this.f37252o0.m14823d(this);
                if (objM14823d == enumC19250a) {
                    return enumC19250a;
                }
                c21988b1 = c21988b2;
                obj = objM14823d;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c21988b1 = (C21988b1) this.f37251Z;
                AbstractC9233X.m9807c(obj);
            }
            return new C17309l(c21988b1, (C22062u) obj);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.auth.impl.AuthMismatchViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Lzc/r;", "Lmm/l;", "Lzi/b1;", "Lzi/u;", "<name for destructuring parameter 0>", "invoke", "(Lzc/r;Lmm/l;)Lzc/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122232 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C18418a f37253Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122232(C18418a c18418a) {
            super(2);
            this.f37253Y = c18418a;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            InterfaceC21856r setOnEach = (InterfaceC21856r) obj;
            C17309l c17309l = (C17309l) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(c17309l, "<name for destructuring parameter 0>");
            C21988b1 c21988b1 = (C21988b1) c17309l.f55136Y;
            C22062u c22062u = (C22062u) c17309l.f55137Z;
            C21853o c21853o = C21853o.f69321a;
            if (c22062u == null) {
                return c21853o;
            }
            String value = this.f37253Y.f58775c;
            AbstractC16544l.m18094g(value, "value");
            Object obj3 = c22062u.f69762a.get(new C22050r(value));
            if (obj3 == null) {
                return c21853o;
            }
            C22038o c22038o = (C22038o) obj3;
            return new C21855q(c21988b1.f69615a, c22038o.f69715e, c22038o.f69721k, c22038o.f69711a);
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }
}
