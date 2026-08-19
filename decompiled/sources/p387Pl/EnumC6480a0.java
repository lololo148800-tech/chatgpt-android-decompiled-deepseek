package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Pl.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6480a0 {
    public static final C6478Z Companion;

    /* JADX INFO: renamed from: Y */
    public static final EnumC6480a0 f21032Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC6480a0[] f21033Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC6480a0 EF3;

    static {
        EnumC6480a0 enumC6480a0 = new EnumC6480a0("LOW", 0);
        EnumC6480a0 enumC6480a1 = new EnumC6480a0("MEDIUM", 1);
        EnumC6480a0 enumC6480a2 = new EnumC6480a0("HIGH", 2);
        f21032Y = enumC6480a2;
        EnumC6480a0[] enumC6480a0Arr = {enumC6480a0, enumC6480a1, enumC6480a2};
        f21033Z = enumC6480a0Arr;
        AbstractC7877E4.m8156j(enumC6480a0Arr);
        Companion = new C6478Z();
    }

    public static EnumC6480a0 valueOf(String str) {
        return (EnumC6480a0) Enum.valueOf(EnumC6480a0.class, str);
    }

    public static EnumC6480a0[] values() {
        return (EnumC6480a0[]) f21033Z.clone();
    }
}
