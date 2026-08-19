package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeComponentPosition {
    public static final TypeComponentPosition FLEXIBLE_LOWER;
    public static final TypeComponentPosition FLEXIBLE_UPPER;
    public static final TypeComponentPosition INFLEXIBLE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ TypeComponentPosition[] f52005Y;

    static {
        TypeComponentPosition typeComponentPosition = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        FLEXIBLE_LOWER = typeComponentPosition;
        TypeComponentPosition typeComponentPosition2 = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        FLEXIBLE_UPPER = typeComponentPosition2;
        TypeComponentPosition typeComponentPosition3 = new TypeComponentPosition("INFLEXIBLE", 2);
        INFLEXIBLE = typeComponentPosition3;
        TypeComponentPosition[] typeComponentPositionArr = {typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
        f52005Y = typeComponentPositionArr;
        AbstractC7877E4.m8156j(typeComponentPositionArr);
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) f52005Y.clone();
    }
}
