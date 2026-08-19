package p1112xm;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xm.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21303g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21303g f67713Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC21303g[] f67714Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC21303g EF2;

    static {
        EnumC21303g enumC21303g = new EnumC21303g("TOP_DOWN", 0);
        EnumC21303g enumC21303g2 = new EnumC21303g("BOTTOM_UP", 1);
        f67713Y = enumC21303g2;
        EnumC21303g[] enumC21303gArr = {enumC21303g, enumC21303g2};
        f67714Z = enumC21303gArr;
        AbstractC7877E4.m8156j(enumC21303gArr);
    }

    public static EnumC21303g valueOf(String str) {
        return (EnumC21303g) Enum.valueOf(EnumC21303g.class, str);
    }

    public static EnumC21303g[] values() {
        return (EnumC21303g[]) f67714Z.clone();
    }
}
