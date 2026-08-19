package p247Jj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Jj.K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4392K0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4392K0 f14273Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4392K0 f14274Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC4392K0[] f14275o0;

    static {
        EnumC4392K0 enumC4392K0 = new EnumC4392K0("Background", 0);
        f14273Y = enumC4392K0;
        EnumC4392K0 enumC4392K1 = new EnumC4392K0("Blocking", 1);
        f14274Z = enumC4392K1;
        EnumC4392K0[] enumC4392K0Arr = {enumC4392K0, enumC4392K1};
        f14275o0 = enumC4392K0Arr;
        AbstractC7877E4.m8156j(enumC4392K0Arr);
    }

    public static EnumC4392K0 valueOf(String str) {
        return (EnumC4392K0) Enum.valueOf(EnumC4392K0.class, str);
    }

    public static EnumC4392K0[] values() {
        return (EnumC4392K0[]) f14275o0.clone();
    }
}
