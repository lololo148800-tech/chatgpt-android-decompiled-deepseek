package p230J1;

import android.text.StaticLayout;
import p053C.AbstractC1466a;

/* JADX INFO: renamed from: J1.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4193t {
    /* JADX INFO: renamed from: a */
    public static final boolean m4887a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: b */
    public static final void m4888b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(AbstractC1466a.m2087g().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
