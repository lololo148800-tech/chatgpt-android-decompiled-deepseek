package p1140z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z1.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21705m0 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC21705m0 f68877Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC21705m0 f68878Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC21705m0 f68879o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC21705m0[] f68880p0;

    static {
        EnumC21705m0 enumC21705m0 = new EnumC21705m0("ContinueTraversal", 0);
        f68877Y = enumC21705m0;
        EnumC21705m0 enumC21705m1 = new EnumC21705m0("SkipSubtreeAndContinueTraversal", 1);
        f68878Z = enumC21705m1;
        EnumC21705m0 enumC21705m2 = new EnumC21705m0("CancelTraversal", 2);
        f68879o0 = enumC21705m2;
        f68880p0 = new EnumC21705m0[]{enumC21705m0, enumC21705m1, enumC21705m2};
    }

    public static EnumC21705m0 valueOf(String str) {
        return (EnumC21705m0) Enum.valueOf(EnumC21705m0.class, str);
    }

    public static EnumC21705m0[] values() {
        return (EnumC21705m0[]) f68880p0.clone();
    }
}
