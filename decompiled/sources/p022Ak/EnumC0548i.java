package p022Ak;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ak.i */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0548i {

    /* JADX INFO: renamed from: Y */
    public static final EnumC0548i f1748Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC0548i f1749Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC0548i[] f1750o0;

    static {
        EnumC0548i enumC0548i = new EnumC0548i("Manual", 0);
        f1748Y = enumC0548i;
        EnumC0548i enumC0548i2 = new EnumC0548i("Auto", 1);
        f1749Z = enumC0548i2;
        EnumC0548i[] enumC0548iArr = {enumC0548i, enumC0548i2};
        f1750o0 = enumC0548iArr;
        AbstractC7877E4.m8156j(enumC0548iArr);
    }

    public static EnumC0548i valueOf(String str) {
        return (EnumC0548i) Enum.valueOf(EnumC0548i.class, str);
    }

    public static EnumC0548i[] values() {
        return (EnumC0548i[]) f1750o0.clone();
    }
}
