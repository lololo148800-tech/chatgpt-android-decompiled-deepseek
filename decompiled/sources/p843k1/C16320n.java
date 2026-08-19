package p843k1;

import android.view.RenderNode;

/* JADX INFO: renamed from: k1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C16320n {

    /* JADX INFO: renamed from: a */
    public static final C16320n f50623a = new C16320n();

    /* JADX INFO: renamed from: a */
    public final int m17914a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public final int m17915b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public final void m17916c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m17917d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
