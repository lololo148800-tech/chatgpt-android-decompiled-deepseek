package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.protobuf.D1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12083D1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC12083D1 f36874Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC12083D1 f36875Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC12083D1 f36876o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC12083D1 f36877p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC12083D1 f36878q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC12083D1 f36879r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC12083D1 f36880s0;

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ EnumC12083D1[] f36881t0;

    static {
        EnumC12083D1 enumC12083D1 = new EnumC12083D1("NULL_VALUE", 0);
        f36874Y = enumC12083D1;
        EnumC12083D1 enumC12083D2 = new EnumC12083D1("NUMBER_VALUE", 1);
        f36875Z = enumC12083D2;
        EnumC12083D1 enumC12083D3 = new EnumC12083D1("STRING_VALUE", 2);
        f36876o0 = enumC12083D3;
        EnumC12083D1 enumC12083D4 = new EnumC12083D1("BOOL_VALUE", 3);
        f36877p0 = enumC12083D4;
        EnumC12083D1 enumC12083D5 = new EnumC12083D1("STRUCT_VALUE", 4);
        f36878q0 = enumC12083D5;
        EnumC12083D1 enumC12083D6 = new EnumC12083D1("LIST_VALUE", 5);
        f36879r0 = enumC12083D6;
        EnumC12083D1 enumC12083D7 = new EnumC12083D1("KIND_NOT_SET", 6);
        f36880s0 = enumC12083D7;
        f36881t0 = new EnumC12083D1[]{enumC12083D1, enumC12083D2, enumC12083D3, enumC12083D4, enumC12083D5, enumC12083D6, enumC12083D7};
    }

    public static EnumC12083D1 valueOf(String str) {
        return (EnumC12083D1) java.lang.Enum.valueOf(EnumC12083D1.class, str);
    }

    public static EnumC12083D1[] values() {
        return (EnumC12083D1[]) f36881t0.clone();
    }
}
