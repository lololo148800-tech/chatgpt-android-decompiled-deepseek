package com.openai.feature.settings.impl.instructions;

import androidx.lifecycle.ViewModel;
import com.openai.viewmodel.BaseViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2053b;
import p1155zi.C21891A;
import p363Og.C6219w;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/feature/settings/impl/instructions/CustomInstructionsIntroductionViewModel;", "Lcom/openai/viewmodel/BaseViewModel;", "LOg/w;", "", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CustomInstructionsIntroductionViewModel extends BaseViewModel<C6219w, Object, Object> {

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsIntroductionViewModel$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.instructions.CustomInstructionsIntroductionViewModel$1", m20656f = "CustomInstructionsIntroductionViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lzi/A;", "it", "Lmm/C;", "<anonymous>", "(Lzi/A;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124861 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39583Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.instructions.CustomInstructionsIntroductionViewModel$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LOg/w;", "invoke", "(LOg/w;)LOg/w;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21891A f39585Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21891A c21891a) {
                super(1);
                this.f39585Y = c21891a;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6219w setState = (C6219w) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return new C6219w(this.f39585Y.m22331j());
            }
        }

        public C124861(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124861 c124861 = CustomInstructionsIntroductionViewModel.this.new C124861(interfaceC18770c);
            c124861.f39583Y = obj;
            return c124861;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124861 c124861 = (C124861) create((C21891A) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124861.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            CustomInstructionsIntroductionViewModel.this.m14397m(new AnonymousClass1((C21891A) this.f39583Y));
            return C17296C.f55119a;
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
