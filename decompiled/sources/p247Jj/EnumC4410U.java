package p247Jj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Jj.U */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4410U {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4410U f14309Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4410U f14310Z;

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ EnumC4410U[] f14311o0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4410U EF3;

    static {
        EnumC4410U enumC4410U = new EnumC4410U("INQUIRY_COMPLETE", 0);
        EnumC4410U enumC4410U2 = new EnumC4410U("INQUIRY_CANCELED", 1);
        f14309Y = enumC4410U2;
        EnumC4410U enumC4410U3 = new EnumC4410U("INQUIRY_ERROR", 2);
        f14310Z = enumC4410U3;
        EnumC4410U[] enumC4410UArr = {enumC4410U, enumC4410U2, enumC4410U3};
        f14311o0 = enumC4410UArr;
        AbstractC7877E4.m8156j(enumC4410UArr);
    }

    public static EnumC4410U valueOf(String str) {
        return (EnumC4410U) Enum.valueOf(EnumC4410U.class, str);
    }

    public static EnumC4410U[] values() {
        return (EnumC4410U[]) f14311o0.clone();
    }
}
