package com.openai.feature.onboarding.impl.viewmodel;

import androidx.lifecycle.ViewModel;
import bg.C11422v;
import com.openai.feature.onboarding.viewmodel.CollectEmailViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import ng.C17610a;
import ng.C17611b;
import ng.C17613d;
import ng.InterfaceC17612c;
import p092Dc.C1991h;
import p098Di.InterfaceC2053b;
import p1081wc.C20877X;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC21895B;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9339o3;
import p909nm.C17690x;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/onboarding/impl/viewmodel/CollectEmailViewModelLoggedOutImpl;", "Lcom/openai/feature/onboarding/viewmodel/CollectEmailViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CollectEmailViewModelLoggedOutImpl extends CollectEmailViewModel {

    /* JADX INFO: renamed from: i */
    public final C11422v f39062i;

    /* JADX INFO: renamed from: j */
    public final EnumC21895B f39063j;

    /* JADX INFO: renamed from: k */
    public final C1991h f39064k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC20904w f39065l;

    /* JADX INFO: renamed from: m */
    public final C3430e f39066m;

    public CollectEmailViewModelLoggedOutImpl(C1991h c1991h, C11422v c11422v, InterfaceC20904w interfaceC20904w, EnumC21895B enumC21895B) {
        super(new C17613d());
        this.f39062i = c11422v;
        this.f39063j = enumC21895B;
        this.f39064k = c1991h;
        this.f39065l = interfaceC20904w;
        this.f39066m = AbstractC8168p6.m8749b("CollectEmailViewModel", null);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC17612c intent = (InterfaceC17612c) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C17611b) {
            this.f39065l.mo21447a(C20877X.f66474k, C17690x.f56481Y);
            m14397m(new CollectEmailViewModelLoggedOutImpl$onIntent$1(intent));
        } else if (intent instanceof C17610a) {
            m14394i(new CollectEmailViewModelLoggedOutImpl$onIntent$2(this, null));
        }
    }
}
