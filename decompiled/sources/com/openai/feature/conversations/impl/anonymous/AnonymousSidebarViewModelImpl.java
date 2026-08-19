package com.openai.feature.conversations.impl.anonymous;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p1081wc.C20889h;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p318Mh.C5391c;
import p318Mh.C5407k;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9315k3;
import p679ce.AbstractC11715f;
import p679ce.C11711b;
import p679ce.C11712c;
import p679ce.C11713d;
import p679ce.C11714e;
import p679ce.C11719j;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/conversations/impl/anonymous/AnonymousSidebarViewModelImpl;", "Lcom/openai/feature/conversations/impl/anonymous/AnonymousSidebarViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AnonymousSidebarViewModelImpl extends AnonymousSidebarViewModel {

    /* JADX INFO: renamed from: i */
    public final AbstractC21864z f37542i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f37543j;

    public AnonymousSidebarViewModelImpl(AbstractC21864z abstractC21864z, InterfaceC20904w interfaceC20904w) {
        super(C11719j.f35536a);
        this.f37542i = abstractC21864z;
        this.f37543j = interfaceC20904w;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        AbstractC11715f intent = (AbstractC11715f) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C11711b) {
            this.f37543j.mo21447a(C20889h.f66547c, AbstractC0168G.m535x("entry_point", ((C11711b) intent).f35526a.f35525Y));
            m14394i(new AnonymousSidebarViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent.equals(C11714e.f35529a)) {
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, "https://openai.com/terms/");
            m14393h(new C2055d(intent2));
        } else if (intent.equals(C11712c.f35527a)) {
            Intent intent3 = new Intent();
            AbstractC9186P.m9748b(intent3, "https://openai.com/privacy/");
            m14393h(new C2055d(intent3));
        } else if (intent.equals(C11713d.f35528a)) {
            C5407k c5407k = C5407k.f17679h;
            c5407k.getClass();
            m14393h(new C2058g(c5407k.m5885a(C5391c.f17646Z), true));
        }
    }
}
