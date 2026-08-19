package com.openai.feature.messages.impl.messagefeedback;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.chatgpt.R;
import com.openai.feature.messages.impl.MessagesViewModelImplKt;
import com.openai.feature.messages.messagefeedback.MessageFeedbackViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13999v0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p025An.AbstractC0575H;
import p098Di.C2060i;
import p098Di.InterfaceC2053b;
import p1081wc.C20857C;
import p1081wc.C20886e;
import p1081wc.InterfaceC20904w;
import p1155zi.C21907E;
import p195Hh.C3430e;
import p218If.C3710a;
import p242Je.C4330c;
import p316Mf.C5341h;
import p316Mf.C5342i;
import p316Mf.C5343j;
import p316Mf.C5344k;
import p316Mf.C5345l;
import p316Mf.C5348o;
import p316Mf.InterfaceC5346m;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9315k3;
import p787he.C14459O;
import p909nm.AbstractC17660E;
import p926of.C18174k;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/messagefeedback/MessageFeedbackViewModelImpl;", "Lcom/openai/feature/messages/messagefeedback/MessageFeedbackViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class MessageFeedbackViewModelImpl extends MessageFeedbackViewModel {

    /* JADX INFO: renamed from: i */
    public final C4330c f38955i;

    /* JADX INFO: renamed from: j */
    public final C14459O f38956j;

    /* JADX INFO: renamed from: k */
    public final C3710a f38957k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f38958l;

    /* JADX INFO: renamed from: m */
    public final C3430e f38959m;

    /* JADX INFO: renamed from: n */
    public final boolean f38960n;

    public MessageFeedbackViewModelImpl(C4330c c4330c, C14459O c14459o, C3710a c3710a, InterfaceC20904w interfaceC20904w, InterfaceC13849E interfaceC13849E) {
        super(C5348o.f17573a);
        this.f38955i = c4330c;
        this.f38956j = c14459o;
        this.f38957k = c3710a;
        this.f38958l = interfaceC20904w;
        this.f38959m = AbstractC8168p6.m8749b("MessageFeedbackViewModelImpl", null);
        this.f38960n = ((C14005w2) interfaceC13849E).m15481a(C13999v0.f44072c);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC5346m intent = (InterfaceC5346m) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C5345l) {
            C5345l c5345l = (C5345l) intent;
            this.f38958l.mo21447a(C20857C.f66338t, MessagesViewModelImplKt.f38638a);
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new MessageFeedbackViewModelImpl$thumbsUpOrDown$1(this, c5345l.f17569c, c5345l.f17568b, c5345l.f17567a, null), 3);
            return;
        }
        if (intent instanceof C5344k) {
            m14397m(MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$1.f38962Y);
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new MessageFeedbackViewModelImpl$handleDetailedMessageFeedback$2(this, (C5344k) intent, null), 3);
        } else {
            if (intent instanceof C5343j) {
                m14320n(((C5343j) intent).f17562a, true);
                return;
            }
            if (intent instanceof C5342i) {
                m14320n(((C5342i) intent).f17561a, false);
            } else if (intent instanceof C5341h) {
                m14393h(new C2060i(R.string.conversation_thanks_for_feedback));
                m14397m(MessageFeedbackViewModelImpl$dismissDetailedMessageFeedback$1.f38961Y);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m14320n(C18174k c18174k, boolean z6) {
        C20886e c20886e = C20886e.f66522j;
        String str = c18174k.f57978a;
        String strM22337a = C21907E.m22337a(c18174k.f57980c);
        Map mapM19258c = AbstractC17660E.m19258c(new C17309l("liked", Boolean.valueOf(z6)));
        this.f38957k.m4414b(c20886e, str, c18174k.f57979b, c18174k.f57984g, c18174k.f57985h, strM22337a, c18174k.f57986i, mapM19258c);
        m14393h(new C2060i(R.string.conversation_thanks_for_feedback));
    }
}
