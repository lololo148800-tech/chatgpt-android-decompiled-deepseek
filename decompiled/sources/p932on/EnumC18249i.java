package p932on;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: on.i */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC18249i {

    /* JADX INFO: renamed from: Y */
    public static final EnumC18249i f58134Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC18249i f58135Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC18249i f58136o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC18249i[] f58137p0;

    static {
        EnumC18249i enumC18249i = new EnumC18249i("NOT_COMPUTED", 0);
        f58134Y = enumC18249i;
        EnumC18249i enumC18249i2 = new EnumC18249i("COMPUTING", 1);
        f58135Z = enumC18249i2;
        EnumC18249i enumC18249i3 = new EnumC18249i("RECURSION_WAS_DETECTED", 2);
        f58136o0 = enumC18249i3;
        f58137p0 = new EnumC18249i[]{enumC18249i, enumC18249i2, enumC18249i3};
    }

    public static EnumC18249i valueOf(String str) {
        return (EnumC18249i) Enum.valueOf(EnumC18249i.class, str);
    }

    public static EnumC18249i[] values() {
        return (EnumC18249i[]) f58137p0.clone();
    }
}
