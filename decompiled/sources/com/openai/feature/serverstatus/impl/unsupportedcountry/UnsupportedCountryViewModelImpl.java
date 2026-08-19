package com.openai.feature.serverstatus.impl.unsupportedcountry;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p098Di.C2055d;
import p098Di.InterfaceC2053b;
import p170Gg.C3055c;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9339o3;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding.Container({@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class), @ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)})
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/unsupportedcountry/UnsupportedCountryViewModelImpl;", "Lcom/openai/feature/serverstatus/impl/unsupportedcountry/UnsupportedCountryViewModel;", "Companion", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UnsupportedCountryViewModelImpl extends UnsupportedCountryViewModel {

    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/serverstatus/impl/unsupportedcountry/UnsupportedCountryViewModelImpl$Companion;", "", "()V", "SUPPORTED_COUNTRIES_URL", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C3055c intent = (C3055c) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C3055c) {
            Intent intent2 = new Intent();
            AbstractC9186P.m9748b(intent2, "https://platform.openai.com/docs/supported-countries");
            m14393h(new C2055d(intent2));
        }
    }
}
