package p273Kl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Kl.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4807x0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4807x0 f15673Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4807x0 f15674Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC4807x0 f15675o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC4807x0 f15676p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC4807x0[] f15677q0;

    static {
        EnumC4807x0 enumC4807x0 = new EnumC4807x0("CONNECTING", 0);
        f15673Y = enumC4807x0;
        EnumC4807x0 enumC4807x1 = new EnumC4807x0("CONNECTED", 1);
        f15674Z = enumC4807x1;
        EnumC4807x0 enumC4807x2 = new EnumC4807x0("DISCONNECTED", 2);
        f15675o0 = enumC4807x2;
        EnumC4807x0 enumC4807x3 = new EnumC4807x0("RECONNECTING", 3);
        f15676p0 = enumC4807x3;
        EnumC4807x0[] enumC4807x0Arr = {enumC4807x0, enumC4807x1, enumC4807x2, enumC4807x3};
        f15677q0 = enumC4807x0Arr;
        AbstractC7877E4.m8156j(enumC4807x0Arr);
    }

    public static EnumC4807x0 valueOf(String str) {
        return (EnumC4807x0) Enum.valueOf(EnumC4807x0.class, str);
    }

    public static EnumC4807x0[] values() {
        return (EnumC4807x0[]) f15677q0.clone();
    }
}
