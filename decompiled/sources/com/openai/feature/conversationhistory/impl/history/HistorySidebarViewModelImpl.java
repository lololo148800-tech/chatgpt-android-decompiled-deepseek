package com.openai.feature.conversationhistory.impl.history;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p020Ai.C0515d;
import p049Bm.InterfaceC1439n;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p1062vd.C20542W;
import p1062vd.C20547a0;
import p318Mh.C5391c;
import p318Mh.C5410l0;
import p571X9.AbstractC9315k3;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversationhistory/impl/history/HistorySidebarViewModelImpl;", "Lcom/openai/feature/conversationhistory/impl/history/HistorySidebarViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class HistorySidebarViewModelImpl extends HistorySidebarViewModel {

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.HistorySidebarViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvd/a0;", "LAi/d;", "it", "invoke", "(Lvd/a0;LAi/d;)Lvd/a0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122521 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C122521 f37511Y = new C122521();

        public C122521() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C20547a0 setOnEach = (C20547a0) obj;
            C0515d it = (C0515d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return new C20547a0(it);
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C20542W intent = (C20542W) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C20542W.f65175a)) {
            C5410l0 c5410l0 = C5410l0.f17684g;
            c5410l0.getClass();
            m14393h(new C2058g(c5410l0.m5885a(C5391c.f17646Z), true));
        }
    }
}
