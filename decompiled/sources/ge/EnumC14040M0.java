package ge;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ge.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC14040M0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14040M0 f44139Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14040M0 f44140Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14040M0 f44141o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14040M0[] f44142p0;

    static {
        EnumC14040M0 enumC14040M0 = new EnumC14040M0("Input", 0);
        f44139Y = enumC14040M0;
        EnumC14040M0 enumC14040M1 = new EnumC14040M0("Starter", 1);
        f44140Z = enumC14040M1;
        EnumC14040M0 enumC14040M2 = new EnumC14040M0("Gizmo", 2);
        f44141o0 = enumC14040M2;
        EnumC14040M0[] enumC14040M0Arr = {enumC14040M0, enumC14040M1, enumC14040M2};
        f44142p0 = enumC14040M0Arr;
        AbstractC7877E4.m8156j(enumC14040M0Arr);
    }

    public static EnumC14040M0 valueOf(String str) {
        return (EnumC14040M0) Enum.valueOf(EnumC14040M0.class, str);
    }

    public static EnumC14040M0[] values() {
        return (EnumC14040M0[]) f44142p0.clone();
    }
}
