package gd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gd.D */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13846D {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13846D f43882Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13846D f43883Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC13846D[] f43884o0;

    static {
        EnumC13846D enumC13846D = new EnumC13846D("Uninitialized", 0);
        f43882Y = enumC13846D;
        EnumC13846D enumC13846D2 = new EnumC13846D("Ready", 1);
        f43883Z = enumC13846D2;
        EnumC13846D[] enumC13846DArr = {enumC13846D, enumC13846D2};
        f43884o0 = enumC13846DArr;
        AbstractC7877E4.m8156j(enumC13846DArr);
    }

    public static EnumC13846D valueOf(String str) {
        return (EnumC13846D) Enum.valueOf(EnumC13846D.class, str);
    }

    public static EnumC13846D[] values() {
        return (EnumC13846D[]) f43884o0.clone();
    }
}
