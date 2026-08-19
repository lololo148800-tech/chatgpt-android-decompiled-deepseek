package p793ho;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.i1 */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14759i1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14759i1 f46158Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14759i1 f46159Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14759i1 f46160o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC14759i1[] f46161p0;

    static {
        EnumC14759i1 enumC14759i1 = new EnumC14759i1("PRESET", 0);
        f46158Y = enumC14759i1;
        EnumC14759i1 enumC14759i2 = new EnumC14759i1("ADVANCED", 1);
        f46159Z = enumC14759i2;
        EnumC14759i1 enumC14759i3 = new EnumC14759i1("OPTIONS_NOT_SET", 2);
        f46160o0 = enumC14759i3;
        f46161p0 = new EnumC14759i1[]{enumC14759i1, enumC14759i2, enumC14759i3};
    }

    public static EnumC14759i1 valueOf(String str) {
        return (EnumC14759i1) Enum.valueOf(EnumC14759i1.class, str);
    }

    public static EnumC14759i1[] values() {
        return (EnumC14759i1[]) f46161p0.clone();
    }
}
