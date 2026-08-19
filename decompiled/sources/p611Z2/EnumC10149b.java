package p611Z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z2.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC10149b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC10149b f30074Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC10149b f30075Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC10149b f30076o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC10149b f30077p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC10149b[] f30078q0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10149b EF9;

    static {
        EnumC10149b enumC10149b = new EnumC10149b("PENALTY_LOG", 0);
        EnumC10149b enumC10149b2 = new EnumC10149b("PENALTY_DEATH", 1);
        EnumC10149b enumC10149b3 = new EnumC10149b("DETECT_FRAGMENT_REUSE", 2);
        f30074Y = enumC10149b3;
        EnumC10149b enumC10149b4 = new EnumC10149b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f30075Z = enumC10149b4;
        EnumC10149b enumC10149b5 = new EnumC10149b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f30076o0 = enumC10149b5;
        EnumC10149b enumC10149b6 = new EnumC10149b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC10149b enumC10149b7 = new EnumC10149b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC10149b enumC10149b8 = new EnumC10149b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC10149b enumC10149b9 = new EnumC10149b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f30077p0 = enumC10149b9;
        f30078q0 = new EnumC10149b[]{enumC10149b, enumC10149b2, enumC10149b3, enumC10149b4, enumC10149b5, enumC10149b6, enumC10149b7, enumC10149b8, enumC10149b9};
    }

    public static EnumC10149b valueOf(String str) {
        return (EnumC10149b) Enum.valueOf(EnumC10149b.class, str);
    }

    public static EnumC10149b[] values() {
        return (EnumC10149b[]) f30078q0.clone();
    }
}
