package p344Nl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Nl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5835g {
    public static final C5834f Companion;

    /* JADX INFO: renamed from: Y */
    public static final EnumC5835g f19059Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC5835g f19060Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC5835g f19061o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC5835g f19062p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC5835g f19063q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC5835g[] f19064r0;

    static {
        EnumC5835g enumC5835g = new EnumC5835g("EXCELLENT", 0);
        f19059Y = enumC5835g;
        EnumC5835g enumC5835g2 = new EnumC5835g("GOOD", 1);
        f19060Z = enumC5835g2;
        EnumC5835g enumC5835g3 = new EnumC5835g("POOR", 2);
        f19061o0 = enumC5835g3;
        EnumC5835g enumC5835g4 = new EnumC5835g("UNKNOWN", 3);
        f19062p0 = enumC5835g4;
        EnumC5835g enumC5835g5 = new EnumC5835g("LOST", 4);
        f19063q0 = enumC5835g5;
        EnumC5835g[] enumC5835gArr = {enumC5835g, enumC5835g2, enumC5835g3, enumC5835g4, enumC5835g5};
        f19064r0 = enumC5835gArr;
        AbstractC7877E4.m8156j(enumC5835gArr);
        Companion = new C5834f();
    }

    public static EnumC5835g valueOf(String str) {
        return (EnumC5835g) Enum.valueOf(EnumC5835g.class, str);
    }

    public static EnumC5835g[] values() {
        return (EnumC5835g[]) f19064r0.clone();
    }
}
