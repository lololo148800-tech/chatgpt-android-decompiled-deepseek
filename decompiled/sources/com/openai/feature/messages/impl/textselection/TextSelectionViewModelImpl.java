package com.openai.feature.messages.impl.textselection;

import androidx.lifecycle.ViewModel;
import com.openai.feature.messages.impl.MessagesViewModelImplKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2053b;
import p1155zi.C21984a1;
import p204I1.C3590f;
import p243Jf.C4336f;
import p381Pe.C6394e;
import p381Pe.C6397h;
import p403Qd.C6636i;
import p479Td.AbstractC7343b0;
import p479Td.C7351f0;
import p571X9.AbstractC9315k3;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/textselection/TextSelectionViewModelImpl;", "Lcom/openai/feature/messages/impl/textselection/TextSelectionViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class TextSelectionViewModelImpl extends TextSelectionViewModel {

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.textselection.TextSelectionViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LJf/f;", "LQd/i;", "conversation", "invoke", "(LJf/f;LQd/i;)LJf/f;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124441 extends AbstractC16546n implements InterfaceC1439n {
        public C124441() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            AbstractC7343b0 abstractC7343b0;
            C6394e c6394e;
            C6397h c6397hM7031g;
            C4336f setOnEach = (C4336f) obj;
            C6636i c6636i = (C6636i) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            C3590f c3590fM14307b = null;
            C7351f0 c7351f0 = (c6636i == null || (c6394e = c6636i.f21399u) == null || (c6397hM7031g = c6394e.m7031g(new C21984a1(((C4336f) TextSelectionViewModelImpl.this.f40343c.getValue()).f14120a))) == null) ? null : (C7351f0) c6397hM7031g.f20822d;
            if (c7351f0 != null && (abstractC7343b0 = c7351f0.f23291f) != null) {
                c3590fM14307b = MessagesViewModelImplKt.m14307b(abstractC7343b0);
            }
            String messageId = setOnEach.f14120a;
            AbstractC16544l.m18094g(messageId, "messageId");
            return new C4336f(c3590fM14307b, messageId);
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
