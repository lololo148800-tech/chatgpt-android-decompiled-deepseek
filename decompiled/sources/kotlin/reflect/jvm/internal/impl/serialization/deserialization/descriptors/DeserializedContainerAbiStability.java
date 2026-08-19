package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class DeserializedContainerAbiStability {
    public static final DeserializedContainerAbiStability STABLE;
    public static final DeserializedContainerAbiStability UNSTABLE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ DeserializedContainerAbiStability[] f53091Y;

    static {
        DeserializedContainerAbiStability deserializedContainerAbiStability = new DeserializedContainerAbiStability("STABLE", 0);
        STABLE = deserializedContainerAbiStability;
        DeserializedContainerAbiStability deserializedContainerAbiStability2 = new DeserializedContainerAbiStability("UNSTABLE", 1);
        UNSTABLE = deserializedContainerAbiStability2;
        DeserializedContainerAbiStability[] deserializedContainerAbiStabilityArr = {deserializedContainerAbiStability, deserializedContainerAbiStability2};
        f53091Y = deserializedContainerAbiStabilityArr;
        AbstractC7877E4.m8156j(deserializedContainerAbiStabilityArr);
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) f53091Y.clone();
    }
}
