package p508Uj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Uj.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7699g {

    /* JADX INFO: renamed from: Y */
    public static final EnumC7699g f24247Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC7699g[] f24248Z;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC7699g EF2;

    static {
        EnumC7699g enumC7699g = new EnumC7699g("AuthenticationError", 0);
        EnumC7699g enumC7699g2 = new EnumC7699g("Unknown", 1);
        f24247Y = enumC7699g2;
        EnumC7699g[] enumC7699gArr = {enumC7699g, enumC7699g2};
        f24248Z = enumC7699gArr;
        AbstractC7877E4.m8156j(enumC7699gArr);
    }

    public static EnumC7699g valueOf(String str) {
        return (EnumC7699g) Enum.valueOf(EnumC7699g.class, str);
    }

    public static EnumC7699g[] values() {
        return (EnumC7699g[]) f24248Z.clone();
    }
}
