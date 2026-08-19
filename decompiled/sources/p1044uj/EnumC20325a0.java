package p1044uj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: uj.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20325a0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20325a0 f64263Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20325a0 f64264Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC20325a0[] f64265o0;

    static {
        EnumC20325a0 enumC20325a0 = new EnumC20325a0("Prompt", 0);
        f64263Y = enumC20325a0;
        EnumC20325a0 enumC20325a1 = new EnumC20325a0("Review", 1);
        f64264Z = enumC20325a1;
        EnumC20325a0[] enumC20325a0Arr = {enumC20325a0, enumC20325a1};
        f64265o0 = enumC20325a0Arr;
        AbstractC7877E4.m8156j(enumC20325a0Arr);
    }

    public static EnumC20325a0 valueOf(String str) {
        return (EnumC20325a0) Enum.valueOf(EnumC20325a0.class, str);
    }

    public static EnumC20325a0[] values() {
        return (EnumC20325a0[]) f64265o0.clone();
    }
}
