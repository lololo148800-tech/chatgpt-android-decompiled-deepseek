package androidx.activity;

import androidx.lifecycle.SavedStateViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18067d2 = {"<anonymous>", "Landroidx/lifecycle/SavedStateViewModelFactory;", "invoke"}, m18068k = 3, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ComponentActivity$defaultViewModelProviderFactory$2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractActivityC10817a f32055Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivity$defaultViewModelProviderFactory$2(AbstractActivityC10817a abstractActivityC10817a) {
        super(0);
        this.f32055Y = abstractActivityC10817a;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        AbstractActivityC10817a abstractActivityC10817a = this.f32055Y;
        return new SavedStateViewModelFactory(abstractActivityC10817a.getApplication(), abstractActivityC10817a, abstractActivityC10817a.getIntent() != null ? abstractActivityC10817a.getIntent().getExtras() : null);
    }
}
