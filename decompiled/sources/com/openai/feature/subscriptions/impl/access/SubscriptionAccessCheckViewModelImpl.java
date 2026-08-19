package com.openai.feature.subscriptions.impl.access;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.feature.subscriptions.access.SubscriptionAccessCheckViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p025An.C0644w;
import p098Di.C2056e;
import p098Di.InterfaceC2053b;
import p174Gk.uSfJ.HpucjswO;
import p318Mh.C5428u0;
import p571X9.AbstractC9327m3;
import p645ah.C10608b;
import p645ah.C10609c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/openai/feature/subscriptions/impl/access/SubscriptionAccessCheckViewModelImpl;", "Lcom/openai/feature/subscriptions/access/SubscriptionAccessCheckViewModel;", "Landroidx/lifecycle/S;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/S;)V", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriptionAccessCheckViewModelImpl extends SubscriptionAccessCheckViewModel {
    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C10608b intent = (C10608b) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (!intent.equals(C10608b.f31483a)) {
            throw new C0644w();
        }
        m14393h(C2056e.f6277a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionAccessCheckViewModelImpl(C11082S c11082s) {
        super(new C10609c((String) C5428u0.f17739h.m5892c(c11082s)));
        AbstractC16544l.m18094g(c11082s, HpucjswO.fkihItsjHYaALt);
        C5428u0.f17738g.getClass();
    }
}
