package com.openai.feature.serverstatus.impl.sunset;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.C2055d;
import p098Di.InterfaceC2053b;
import p1026ti.C19995a;
import p122Eg.C2432a;
import p122Eg.C2436e;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9339o3;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding.Container({@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class), @ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)})
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/sunset/SunsetViewModelImpl;", "Lcom/openai/feature/serverstatus/impl/sunset/SunsetViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SunsetViewModelImpl extends SunsetViewModel {

    /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$1", m20656f = "SunsetViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lti/a;", "it", "Lmm/C;", "<anonymous>", "(Lti/a;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124761 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39460Y;

        /* JADX INFO: renamed from: com.openai.feature.serverstatus.impl.sunset.SunsetViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEg/e;", "invoke", "(LEg/e;)LEg/e;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C19995a f39462Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C19995a c19995a) {
                super(1);
                this.f39462Y = c19995a;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C2436e setState = (C2436e) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C19995a c19995a = this.f39462Y;
                return new C2436e(c19995a.f63309a, c19995a.f63310b, c19995a.f63311c);
            }
        }

        public C124761(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124761 c124761 = SunsetViewModelImpl.this.new C124761(interfaceC18770c);
            c124761.f39460Y = obj;
            return c124761;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124761 c124761 = (C124761) create((C19995a) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124761.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            SunsetViewModelImpl.this.m14397m(new AnonymousClass1((C19995a) this.f39460Y));
            return C17296C.f55119a;
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        String str;
        C2432a intent = (C2432a) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (!intent.equals(C2432a.f7561a) || (str = ((C2436e) this.f40343c.getValue()).f7574c) == null) {
            return;
        }
        Intent intent2 = new Intent();
        AbstractC9186P.m9748b(intent2, str);
        m14393h(new C2055d(intent2));
    }
}
