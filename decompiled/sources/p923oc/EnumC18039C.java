package p923oc;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oc.C */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC18039C {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18039C f57586Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18039C f57587Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18039C f57588o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18039C[] f57589p0;

    static {
        EnumC18039C enumC18039C = new EnumC18039C("LEFT", 0);
        f57586Y = enumC18039C;
        EnumC18039C enumC18039C2 = new EnumC18039C("CENTER", 1);
        f57587Z = enumC18039C2;
        EnumC18039C enumC18039C3 = new EnumC18039C("RIGHT", 2);
        f57588o0 = enumC18039C3;
        EnumC18039C[] enumC18039CArr = {enumC18039C, enumC18039C2, enumC18039C3};
        f57589p0 = enumC18039CArr;
        AbstractC7877E4.m8156j(enumC18039CArr);
    }

    public static EnumC18039C valueOf(String str) {
        return (EnumC18039C) Enum.valueOf(EnumC18039C.class, str);
    }

    public static EnumC18039C[] values() {
        return (EnumC18039C[]) f57589p0.clone();
    }
}
