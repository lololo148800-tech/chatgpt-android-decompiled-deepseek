package p837ji;

import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ji.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16219h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1436k f50331a;

    public C16219h(InterfaceC1436k onMarkerSelect) {
        AbstractC16544l.m18094g(onMarkerSelect, "onMarkerSelect");
        this.f50331a = onMarkerSelect;
    }

    @JavascriptInterface
    public final void notifyMarkerSelect(String id2) {
        AbstractC16544l.m18094g(id2, "id");
        this.f50331a.invoke(id2);
    }
}
