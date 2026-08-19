package p281L3;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import bb.AbstractC11293S;

/* JADX INFO: renamed from: L3.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4923j implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4928o f16056a;

    public C4923j(C4928o c4928o) {
        this.f16056a = c4928o;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z6) {
        C4928o c4928o = this.f16056a;
        AbstractC11293S abstractC11293S = C4928o.f16085i;
        c4928o.m5539d();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z6) {
        C4928o c4928o = this.f16056a;
        AbstractC11293S abstractC11293S = C4928o.f16085i;
        c4928o.m5539d();
    }
}
