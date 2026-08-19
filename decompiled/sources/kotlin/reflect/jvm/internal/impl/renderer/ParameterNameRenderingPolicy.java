package kotlin.reflect.jvm.internal.impl.renderer;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ParameterNameRenderingPolicy {
    public static final ParameterNameRenderingPolicy ALL;
    public static final ParameterNameRenderingPolicy NONE;
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ ParameterNameRenderingPolicy[] f52842Y;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        ALL = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        ONLY_NON_SYNTHESIZED = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy("NONE", 2);
        NONE = parameterNameRenderingPolicy3;
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArr = {parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
        f52842Y = parameterNameRenderingPolicyArr;
        AbstractC7877E4.m8156j(parameterNameRenderingPolicyArr);
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) f52842Y.clone();
    }
}
