package com.openai.feature.licenses.impl;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import nf.C17604c;
import nf.C17605d;
import p098Di.InterfaceC2053b;
import p571X9.AbstractC9327m3;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/licenses/impl/LicensesViewModelImpl;", "Lcom/openai/feature/licenses/impl/LicensesViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LicensesViewModelImpl extends LicensesViewModel {
    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C17605d intent = (C17605d) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C17605d) {
            m14392g(new C17604c(intent.f56358a.f56365d));
        }
    }
}
