package com.openai.feature.interstitial.impl;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.feature.interstitial.FeatureInterstitialViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p098Di.C2056e;
import p098Di.InterfaceC2053b;
import p1081wc.C20868N;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21974X0;
import p318Mh.C5374M;
import p571X9.AbstractC9327m3;
import p809if.C14978c;
import p809if.C14979d;
import p909nm.AbstractC17660E;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/interstitial/impl/FeatureInterstitialViewModelImpl;", "Lcom/openai/feature/interstitial/FeatureInterstitialViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FeatureInterstitialViewModelImpl extends FeatureInterstitialViewModel {

    /* JADX INFO: renamed from: i */
    public final InterfaceC20904w f38431i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureInterstitialViewModelImpl(C11082S c11082s, InterfaceC20904w interfaceC20904w) {
        super(new C14979d((EnumC21974X0) C5374M.f17624h.m5892c(c11082s)));
        C5374M.f17623g.getClass();
        this.f38431i = interfaceC20904w;
        interfaceC20904w.mo21447a(C20868N.f66433e, AbstractC17660E.m19258c(new C17309l("feature", ((C14979d) m14391f()).f46637a.f69565Y)));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C14978c intent = (C14978c) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C14978c.f46636a)) {
            this.f38431i.mo21447a(C20868N.f66431c, AbstractC0168G.m535x("feature", ((C14979d) m14391f()).f46637a.f69565Y));
            m14393h(C2056e.f6277a);
        }
    }
}
