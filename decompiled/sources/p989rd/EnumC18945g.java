package p989rd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: rd.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18945g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18945g f60490Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18945g f60491Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18945g f60492o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18945g[] f60493p0;

    static {
        EnumC18945g enumC18945g = new EnumC18945g("MoveToProject", 0);
        f60490Y = enumC18945g;
        EnumC18945g enumC18945g2 = new EnumC18945g("MoveToMainList", 1);
        f60491Z = enumC18945g2;
        EnumC18945g enumC18945g3 = new EnumC18945g("None", 2);
        f60492o0 = enumC18945g3;
        EnumC18945g[] enumC18945gArr = {enumC18945g, enumC18945g2, enumC18945g3};
        f60493p0 = enumC18945gArr;
        AbstractC7877E4.m8156j(enumC18945gArr);
    }

    public static EnumC18945g valueOf(String str) {
        return (EnumC18945g) Enum.valueOf(EnumC18945g.class, str);
    }

    public static EnumC18945g[] values() {
        return (EnumC18945g[]) f60493p0.clone();
    }
}
