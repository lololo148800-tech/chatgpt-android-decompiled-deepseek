package kotlin.reflect.jvm.internal.impl.renderer;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class PropertyAccessorRenderingPolicy {
    public static final PropertyAccessorRenderingPolicy DEBUG;
    public static final PropertyAccessorRenderingPolicy NONE;
    public static final PropertyAccessorRenderingPolicy PRETTY;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] f52843Y;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PRETTY = propertyAccessorRenderingPolicy;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        DEBUG = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy("NONE", 2);
        NONE = propertyAccessorRenderingPolicy3;
        PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArr = {propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
        f52843Y = propertyAccessorRenderingPolicyArr;
        AbstractC7877E4.m8156j(propertyAccessorRenderingPolicyArr);
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f52843Y.clone();
    }
}
