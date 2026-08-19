package androidx.compose.p650ui.viewinterop;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1140z1.AbstractC21672S;
import p563X1.ViewTreeObserverOnGlobalFocusChangeListenerC9035o;
import p635a1.AbstractC10458p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesElement;", "Lz1/S;", "LX1/o;", "<init>", "()V", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class FocusGroupPropertiesElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public static final FocusGroupPropertiesElement f32834Y = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new ViewTreeObserverOnGlobalFocusChangeListenerC9035o();
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return -1929324230;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo11197i(AbstractC10458p abstractC10458p) {
    }
}
