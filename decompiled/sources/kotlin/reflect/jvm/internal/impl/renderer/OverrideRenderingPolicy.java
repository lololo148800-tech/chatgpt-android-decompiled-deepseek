package kotlin.reflect.jvm.internal.impl.renderer;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class OverrideRenderingPolicy {
    public static final OverrideRenderingPolicy RENDER_OPEN;
    public static final OverrideRenderingPolicy RENDER_OPEN_OVERRIDE;
    public static final OverrideRenderingPolicy RENDER_OVERRIDE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ OverrideRenderingPolicy[] f52841Y;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        RENDER_OVERRIDE = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        RENDER_OPEN = overrideRenderingPolicy2;
        OverrideRenderingPolicy overrideRenderingPolicy3 = new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2);
        RENDER_OPEN_OVERRIDE = overrideRenderingPolicy3;
        OverrideRenderingPolicy[] overrideRenderingPolicyArr = {overrideRenderingPolicy, overrideRenderingPolicy2, overrideRenderingPolicy3};
        f52841Y = overrideRenderingPolicyArr;
        AbstractC7877E4.m8156j(overrideRenderingPolicyArr);
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f52841Y.clone();
    }
}
