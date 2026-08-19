package p1062vd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vd.U */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20540U {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20540U f65165Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20540U f65166Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20540U f65167o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC20540U[] f65168p0;

    static {
        EnumC20540U enumC20540U = new EnumC20540U("Normal", 0);
        f65165Y = enumC20540U;
        EnumC20540U enumC20540U2 = new EnumC20540U("Unread", 1);
        f65166Z = enumC20540U2;
        EnumC20540U enumC20540U3 = new EnumC20540U("Streaming", 2);
        f65167o0 = enumC20540U3;
        EnumC20540U[] enumC20540UArr = {enumC20540U, enumC20540U2, enumC20540U3};
        f65168p0 = enumC20540UArr;
        AbstractC7877E4.m8156j(enumC20540UArr);
    }

    public static EnumC20540U valueOf(String str) {
        return (EnumC20540U) Enum.valueOf(EnumC20540U.class, str);
    }

    public static EnumC20540U[] values() {
        return (EnumC20540U[]) f65168p0.clone();
    }
}
