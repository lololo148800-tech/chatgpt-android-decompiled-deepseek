package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class DeprecationLevelValue {
    public static final DeprecationLevelValue ERROR;
    public static final DeprecationLevelValue HIDDEN;
    public static final DeprecationLevelValue WARNING;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ DeprecationLevelValue[] f52891Y;

    static {
        DeprecationLevelValue deprecationLevelValue = new DeprecationLevelValue("WARNING", 0);
        WARNING = deprecationLevelValue;
        DeprecationLevelValue deprecationLevelValue2 = new DeprecationLevelValue("ERROR", 1);
        ERROR = deprecationLevelValue2;
        DeprecationLevelValue deprecationLevelValue3 = new DeprecationLevelValue("HIDDEN", 2);
        HIDDEN = deprecationLevelValue3;
        DeprecationLevelValue[] deprecationLevelValueArr = {deprecationLevelValue, deprecationLevelValue2, deprecationLevelValue3};
        f52891Y = deprecationLevelValueArr;
        AbstractC7877E4.m8156j(deprecationLevelValueArr);
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f52891Y.clone();
    }
}
