package p531Vj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vj.C */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8333C {

    /* JADX INFO: renamed from: Y */
    public static final EnumC8333C f25979Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8333C f25980Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8333C f25981o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC8333C[] f25982p0;

    static {
        EnumC8333C enumC8333C = new EnumC8333C("Success", 0);
        f25979Y = enumC8333C;
        EnumC8333C enumC8333C2 = new EnumC8333C("Failure", 1);
        f25980Z = enumC8333C2;
        EnumC8333C enumC8333C3 = new EnumC8333C("SettingsLaunched", 2);
        f25981o0 = enumC8333C3;
        EnumC8333C[] enumC8333CArr = {enumC8333C, enumC8333C2, enumC8333C3};
        f25982p0 = enumC8333CArr;
        AbstractC7877E4.m8156j(enumC8333CArr);
    }

    public static EnumC8333C valueOf(String str) {
        return (EnumC8333C) Enum.valueOf(EnumC8333C.class, str);
    }

    public static EnumC8333C[] values() {
        return (EnumC8333C[]) f25982p0.clone();
    }
}
