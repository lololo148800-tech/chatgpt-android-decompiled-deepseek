package p346Nn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nn.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC5897f0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC5897f0 f19226Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5897f0 f19227Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC5897f0 f19228o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC5897f0[] f19229p0;

    static {
        EnumC5897f0 enumC5897f0 = new EnumC5897f0("NONE", 0);
        f19226Y = enumC5897f0;
        EnumC5897f0 enumC5897f1 = new EnumC5897f0("ZERO", 1);
        f19227Z = enumC5897f1;
        EnumC5897f0 enumC5897f2 = new EnumC5897f0("SPACE", 2);
        f19228o0 = enumC5897f2;
        EnumC5897f0[] enumC5897f0Arr = {enumC5897f0, enumC5897f1, enumC5897f2};
        f19229p0 = enumC5897f0Arr;
        AbstractC7877E4.m8156j(enumC5897f0Arr);
    }

    public static EnumC5897f0 valueOf(String str) {
        return (EnumC5897f0) Enum.valueOf(EnumC5897f0.class, str);
    }

    public static EnumC5897f0[] values() {
        return (EnumC5897f0[]) f19229p0.clone();
    }
}
