package vg;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20615b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20615b f65422Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20615b f65423Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20615b f65424o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC20615b f65425p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC20615b f65426q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC20615b f65427r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC20615b[] f65428s0;

    static {
        EnumC20615b enumC20615b = new EnumC20615b("Loading", 0);
        f65422Y = enumC20615b;
        EnumC20615b enumC20615b2 = new EnumC20615b("Cancelled", 1);
        f65423Z = enumC20615b2;
        EnumC20615b enumC20615b3 = new EnumC20615b("Error", 2);
        f65424o0 = enumC20615b3;
        EnumC20615b enumC20615b4 = new EnumC20615b("Declined", 3);
        f65425p0 = enumC20615b4;
        EnumC20615b enumC20615b5 = new EnumC20615b("NeedsReview", 4);
        f65426q0 = enumC20615b5;
        EnumC20615b enumC20615b6 = new EnumC20615b("Completed", 5);
        f65427r0 = enumC20615b6;
        EnumC20615b[] enumC20615bArr = {enumC20615b, enumC20615b2, enumC20615b3, enumC20615b4, enumC20615b5, enumC20615b6};
        f65428s0 = enumC20615bArr;
        AbstractC7877E4.m8156j(enumC20615bArr);
    }

    public static EnumC20615b valueOf(String str) {
        return (EnumC20615b) Enum.valueOf(EnumC20615b.class, str);
    }

    public static EnumC20615b[] values() {
        return (EnumC20615b[]) f65428s0.clone();
    }
}
