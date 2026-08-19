package p661b7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b7.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11255b {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11255b f34098Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC11255b f34099Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC11255b f34100o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC11255b[] f34101p0;

    static {
        EnumC11255b enumC11255b = new EnumC11255b("USER", 0);
        f34098Y = enumC11255b;
        EnumC11255b enumC11255b2 = new EnumC11255b("MAINTAINER", 1);
        f34099Z = enumC11255b2;
        EnumC11255b enumC11255b3 = new EnumC11255b("TELEMETRY", 2);
        f34100o0 = enumC11255b3;
        f34101p0 = new EnumC11255b[]{enumC11255b, enumC11255b2, enumC11255b3};
    }

    public static EnumC11255b valueOf(String str) {
        return (EnumC11255b) Enum.valueOf(EnumC11255b.class, str);
    }

    public static EnumC11255b[] values() {
        return (EnumC11255b[]) f34101p0.clone();
    }
}
