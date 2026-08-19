package p1044uj;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: uj.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20327b0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC20327b0 f64267Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC20327b0 f64268Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC20327b0 f64269o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC20327b0 f64270p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC20327b0 f64271q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC20327b0[] f64272r0;

    static {
        EnumC20327b0 enumC20327b0 = new EnumC20327b0("None", 0);
        f64267Y = enumC20327b0;
        EnumC20327b0 enumC20327b1 = new EnumC20327b0("CheckCameraPermissions", 1);
        f64268Z = enumC20327b1;
        EnumC20327b0 enumC20327b2 = new EnumC20327b0("CameraRunning", 2);
        f64269o0 = enumC20327b2;
        EnumC20327b0 enumC20327b3 = new EnumC20327b0("SelectFileFromDocuments", 3);
        f64270p0 = enumC20327b3;
        EnumC20327b0 enumC20327b4 = new EnumC20327b0("SelectImageFromPhotoLibrary", 4);
        f64271q0 = enumC20327b4;
        EnumC20327b0[] enumC20327b0Arr = {enumC20327b0, enumC20327b1, enumC20327b2, enumC20327b3, enumC20327b4};
        f64272r0 = enumC20327b0Arr;
        AbstractC7877E4.m8156j(enumC20327b0Arr);
    }

    public static EnumC20327b0 valueOf(String str) {
        return (EnumC20327b0) Enum.valueOf(EnumC20327b0.class, str);
    }

    public static EnumC20327b0[] values() {
        return (EnumC20327b0[]) f64272r0.clone();
    }
}
