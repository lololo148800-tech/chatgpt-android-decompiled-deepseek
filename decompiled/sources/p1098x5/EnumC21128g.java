package p1098x5;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x5.g */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21128g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21128g f67128Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21128g f67129Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC21128g[] f67130o0;

    static {
        EnumC21128g enumC21128g = new EnumC21128g("FILL", 0);
        f67128Y = enumC21128g;
        EnumC21128g enumC21128g2 = new EnumC21128g("FIT", 1);
        f67129Z = enumC21128g2;
        EnumC21128g[] enumC21128gArr = {enumC21128g, enumC21128g2};
        f67130o0 = enumC21128gArr;
        AbstractC7877E4.m8156j(enumC21128gArr);
    }

    public static EnumC21128g valueOf(String str) {
        return (EnumC21128g) Enum.valueOf(EnumC21128g.class, str);
    }

    public static EnumC21128g[] values() {
        return (EnumC21128g[]) f67130o0.clone();
    }
}
