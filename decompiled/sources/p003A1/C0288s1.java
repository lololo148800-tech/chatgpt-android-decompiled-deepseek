package p003A1;

import android.view.RenderNode;

/* JADX INFO: renamed from: A1.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0288s1 {

    /* JADX INFO: renamed from: a */
    public static final C0288s1 f1040a = new C0288s1();

    /* JADX INFO: renamed from: a */
    public final int m867a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public final int m868b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public final void m869c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m870d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}
