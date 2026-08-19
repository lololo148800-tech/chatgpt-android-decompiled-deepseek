package p773h0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: h0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C14299o {

    /* JADX INFO: renamed from: a */
    public static final C14299o f44894a = new C14299o();

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m15591a(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m15592b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m15593c(EdgeEffect edgeEffect, float f10, float f11) {
        try {
            return edgeEffect.onPullDistance(f10, f11);
        } catch (Throwable unused) {
            edgeEffect.onPull(f10, f11);
            return 0.0f;
        }
    }
}
