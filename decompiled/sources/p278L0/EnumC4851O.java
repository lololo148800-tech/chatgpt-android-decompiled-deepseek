package p278L0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: L0.O */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4851O {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4851O f15799Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4851O f15800Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC4851O f15801o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC4851O[] f15802p0;

    static {
        EnumC4851O enumC4851O = new EnumC4851O("Focused", 0);
        f15799Y = enumC4851O;
        EnumC4851O enumC4851O2 = new EnumC4851O("UnfocusedEmpty", 1);
        f15800Z = enumC4851O2;
        EnumC4851O enumC4851O3 = new EnumC4851O("UnfocusedNotEmpty", 2);
        f15801o0 = enumC4851O3;
        f15802p0 = new EnumC4851O[]{enumC4851O, enumC4851O2, enumC4851O3};
    }

    public static EnumC4851O valueOf(String str) {
        return (EnumC4851O) Enum.valueOf(EnumC4851O.class, str);
    }

    public static EnumC4851O[] values() {
        return (EnumC4851O[]) f15802p0.clone();
    }
}
