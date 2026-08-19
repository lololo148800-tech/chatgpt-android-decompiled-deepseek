package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeFlexibility {
    public static final JavaTypeFlexibility FLEXIBLE_LOWER_BOUND;
    public static final JavaTypeFlexibility FLEXIBLE_UPPER_BOUND;
    public static final JavaTypeFlexibility INFLEXIBLE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ JavaTypeFlexibility[] f51967Y;

    static {
        JavaTypeFlexibility javaTypeFlexibility = new JavaTypeFlexibility("INFLEXIBLE", 0);
        INFLEXIBLE = javaTypeFlexibility;
        JavaTypeFlexibility javaTypeFlexibility2 = new JavaTypeFlexibility("FLEXIBLE_UPPER_BOUND", 1);
        FLEXIBLE_UPPER_BOUND = javaTypeFlexibility2;
        JavaTypeFlexibility javaTypeFlexibility3 = new JavaTypeFlexibility("FLEXIBLE_LOWER_BOUND", 2);
        FLEXIBLE_LOWER_BOUND = javaTypeFlexibility3;
        JavaTypeFlexibility[] javaTypeFlexibilityArr = {javaTypeFlexibility, javaTypeFlexibility2, javaTypeFlexibility3};
        f51967Y = javaTypeFlexibilityArr;
        AbstractC7877E4.m8156j(javaTypeFlexibilityArr);
    }

    public static JavaTypeFlexibility valueOf(String str) {
        return (JavaTypeFlexibility) Enum.valueOf(JavaTypeFlexibility.class, str);
    }

    public static JavaTypeFlexibility[] values() {
        return (JavaTypeFlexibility[]) f51967Y.clone();
    }
}
