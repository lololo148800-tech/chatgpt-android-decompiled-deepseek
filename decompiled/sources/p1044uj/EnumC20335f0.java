package p1044uj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: uj.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20335f0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20335f0 f64296Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20335f0 f64297Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20335f0 f64298o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC20335f0 f64299p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC20335f0[] f64300q0;

    static {
        EnumC20335f0 enumC20335f0 = new EnumC20335f0("CreateDocument", 0);
        f64296Y = enumC20335f0;
        EnumC20335f0 enumC20335f1 = new EnumC20335f0("UploadFiles", 1);
        f64297Z = enumC20335f1;
        EnumC20335f0 enumC20335f2 = new EnumC20335f0("DeleteFiles", 2);
        f64298o0 = enumC20335f2;
        EnumC20335f0 enumC20335f3 = new EnumC20335f0("ReadyToSubmit", 3);
        f64299p0 = enumC20335f3;
        EnumC20335f0[] enumC20335f0Arr = {enumC20335f0, enumC20335f1, enumC20335f2, enumC20335f3};
        f64300q0 = enumC20335f0Arr;
        AbstractC7877E4.m8156j(enumC20335f0Arr);
    }

    public static EnumC20335f0 valueOf(String str) {
        return (EnumC20335f0) Enum.valueOf(EnumC20335f0.class, str);
    }

    public static EnumC20335f0[] values() {
        return (EnumC20335f0[]) f64300q0.clone();
    }
}
