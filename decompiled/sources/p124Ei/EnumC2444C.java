package p124Ei;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ei.C */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2444C {

    /* JADX INFO: renamed from: Y */
    public static final EnumC2444C f7593Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC2444C f7594Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC2444C[] f7595o0;

    static {
        EnumC2444C enumC2444C = new EnumC2444C("BottomButtons", 0);
        f7593Y = enumC2444C;
        EnumC2444C enumC2444C2 = new EnumC2444C("SideButtons", 1);
        f7594Z = enumC2444C2;
        EnumC2444C[] enumC2444CArr = {enumC2444C, enumC2444C2};
        f7595o0 = enumC2444CArr;
        AbstractC7877E4.m8156j(enumC2444CArr);
    }

    public static EnumC2444C valueOf(String str) {
        return (EnumC2444C) Enum.valueOf(EnumC2444C.class, str);
    }

    public static EnumC2444C[] values() {
        return (EnumC2444C[]) f7595o0.clone();
    }
}
