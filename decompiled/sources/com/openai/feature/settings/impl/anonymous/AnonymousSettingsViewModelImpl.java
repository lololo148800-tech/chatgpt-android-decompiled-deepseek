package com.openai.feature.settings.impl.anonymous;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p072Ci.C1705j;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p244Jg.C4337a;
import p244Jg.C4340d;
import p318Mh.C5431w;
import p571X9.AbstractC9327m3;
import p708dh.C13133K;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/anonymous/AnonymousSettingsViewModelImpl;", "Lcom/openai/feature/settings/impl/anonymous/AnonymousSettingsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AnonymousSettingsViewModelImpl extends AnonymousSettingsViewModel {

    /* JADX INFO: renamed from: i */
    public final C13133K f39488i;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.anonymous.AnonymousSettingsViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJg/d;", "LCi/j;", "it", "invoke", "(LJg/d;LCi/j;)LJg/d;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124791 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124791 f39489Y = new C124791();

        public C124791() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C4340d setOnEach = (C4340d) obj;
            C1705j it = (C1705j) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return new C4340d(!it.f4868a);
        }
    }

    public AnonymousSettingsViewModelImpl(C13133K c13133k) {
        super(new C4340d(false));
        this.f39488i = c13133k;
        m14396l(C124791.f39489Y, c13133k.f41697b);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C4337a intent = (C4337a) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C4337a) {
            this.f39488i.m14817a(new AnonymousSettingsViewModelImpl$onIntent$1(intent));
            m14393h(new C2058g(C5431w.m5902f(C5431w.f17746g, null, null, false, false, 15), true));
        }
    }
}
