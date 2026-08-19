package p575Xd;

import p523V9.AbstractC7877E4;
import p959q8.C18639a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Xd.F */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9437F {

    /* JADX INFO: renamed from: Y */
    public static final C18639a f28422Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC9437F f28423Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC9437F f28424o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC9437F f28425p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC9437F f28426q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC9437F[] f28427r0;

    static {
        EnumC9437F enumC9437F = new EnumC9437F("Search", 0);
        f28423Z = enumC9437F;
        EnumC9437F enumC9437F2 = new EnumC9437F("Quote", 1);
        f28424o0 = enumC9437F2;
        EnumC9437F enumC9437F3 = new EnumC9437F("Back", 2);
        f28425p0 = enumC9437F3;
        EnumC9437F enumC9437F4 = new EnumC9437F("Click", 3);
        f28426q0 = enumC9437F4;
        EnumC9437F[] enumC9437FArr = {enumC9437F, enumC9437F2, enumC9437F3, enumC9437F4};
        f28427r0 = enumC9437FArr;
        AbstractC7877E4.m8156j(enumC9437FArr);
        f28422Y = new C18639a(19);
    }

    public static EnumC9437F valueOf(String str) {
        return (EnumC9437F) Enum.valueOf(EnumC9437F.class, str);
    }

    public static EnumC9437F[] values() {
        return (EnumC9437F[]) f28427r0.clone();
    }
}
