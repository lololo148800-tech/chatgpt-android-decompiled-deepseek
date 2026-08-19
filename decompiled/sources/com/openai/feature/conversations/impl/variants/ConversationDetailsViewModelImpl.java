package com.openai.feature.conversations.impl.variants;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16533a;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p015Ad.C0431f;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1081wc.C20858D;
import p1081wc.InterfaceC20904w;
import p216Id.AbstractC3693a;
import p216Id.C3694b;
import p216Id.InterfaceC3698f;
import p403Qd.C6636i;
import p403Qd.C6657s0;
import p523V9.AbstractC8042a0;
import p571X9.AbstractC9315k3;
import p787he.C14459O;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p909nm.C17690x;
import p964qe.C18690c;
import p964qe.C18691d;
import p964qe.C18698k;
import p964qe.InterfaceC18692e;
import sm.InterfaceC19693i;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/variants/ConversationDetailsViewModelImpl;", "Lcom/openai/feature/conversations/impl/variants/VariantsInStreamViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationDetailsViewModelImpl extends VariantsInStreamViewModel {

    /* JADX INFO: renamed from: i */
    public final C14459O f38014i;

    /* JADX INFO: renamed from: j */
    public final C0431f f38015j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC20904w f38016k;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.variants.ConversationDetailsViewModelImpl$1 */
    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    final /* synthetic */ class C123421 extends C16533a implements InterfaceC1439n, InterfaceC19693i {
        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C6636i c6636i = (C6636i) obj;
            ConversationDetailsViewModelImpl conversationDetailsViewModelImpl = (ConversationDetailsViewModelImpl) this.f51270Y;
            conversationDetailsViewModelImpl.getClass();
            C6657s0 c6657s0 = c6636i != null ? c6636i.f21398t : null;
            String strM7170b = c6657s0 != null ? c6657s0.m7170b() : null;
            if (strM7170b != null) {
                ArrayList arrayListM8414b = AbstractC8042a0.m8414b(c6636i, strM7170b);
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arrayListM8414b, 10));
                Iterator it = arrayListM8414b.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC3693a.m4403c(conversationDetailsViewModelImpl.f38015j.m1088b((List) it.next())));
                }
                conversationDetailsViewModelImpl.m14397m(new ConversationDetailsViewModelImpl$handleConversationUpdate$2(c6657s0, arrayList));
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.variants.ConversationDetailsViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lqe/k;", "LId/b;", "it", "invoke", "(Lqe/k;LId/b;)Lqe/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123432 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123432 f38017Y = new C123432();

        public C123432() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C18698k setOnEach = (C18698k) obj;
            C3694b it = (C3694b) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C18698k.m20041e(setOnEach, it.f11220e instanceof InterfaceC3698f, false, null, null, 14);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConversationDetailsViewModelImpl(C14459O c14459o, C0431f c0431f, InterfaceC20904w interfaceC20904w) {
        C17689w c17689w = C17689w.f56480Y;
        super(new C18698k(true, false, c17689w, c17689w));
        this.f38014i = c14459o;
        this.f38015j = c0431f;
        this.f38016k = interfaceC20904w;
        interfaceC20904w.mo21447a(C20858D.f66348f, C17690x.f56481Y);
        AbstractC2124C.m3226y(new C1970n(c14459o.f45521t, 5, new C123421(2, 4, ConversationDetailsViewModelImpl.class, this, "handleConversationUpdate", "handleConversationUpdate(Lcom/openai/feature/conversations/domain/conversation/Conversation;)V")), ViewModelKt.m12143a(this));
        m14396l(C123432.f38017Y, c14459o.f45526y);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC18692e intent = (InterfaceC18692e) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C18690c) {
            m14394i(new ConversationDetailsViewModelImpl$onIntent$1(this, intent, null));
        } else if (intent instanceof C18691d) {
            m14397m(new ConversationDetailsViewModelImpl$onIntent$2(intent));
        }
    }
}
