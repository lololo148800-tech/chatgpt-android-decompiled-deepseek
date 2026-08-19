package p273Kl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Kl.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4795r0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4795r0 f15640Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC4795r0[] f15641Z;

    static {
        EnumC4795r0 enumC4795r0 = new EnumC4795r0("DEFAULT", 0);
        f15640Y = enumC4795r0;
        EnumC4795r0[] enumC4795r0Arr = {enumC4795r0, new EnumC4795r0("FORCE_SOFT_RECONNECT", 1), new EnumC4795r0("FORCE_FULL_RECONNECT", 2)};
        f15641Z = enumC4795r0Arr;
        AbstractC7877E4.m8156j(enumC4795r0Arr);
    }

    public static EnumC4795r0 valueOf(String str) {
        return (EnumC4795r0) Enum.valueOf(EnumC4795r0.class, str);
    }

    public static EnumC4795r0[] values() {
        return (EnumC4795r0[]) f15641Z.clone();
    }
}
