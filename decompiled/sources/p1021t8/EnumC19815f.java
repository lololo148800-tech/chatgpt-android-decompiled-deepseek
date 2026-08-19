package p1021t8;

import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t8.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC19815f {

    /* JADX INFO: renamed from: Y */
    public static final EnumC19815f f62864Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC19815f f62865Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC19815f f62866o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC19815f f62867p0;

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ EnumC19815f[] f62868q0;

    static {
        EnumC19815f enumC19815f = new EnumC19815f("DATADOG", 0);
        f62864Y = enumC19815f;
        EnumC19815f enumC19815f2 = new EnumC19815f("B3", 1);
        f62865Z = enumC19815f2;
        EnumC19815f enumC19815f3 = new EnumC19815f(VjclRfeKsMflo.ikAJqieVzv, 2);
        f62866o0 = enumC19815f3;
        EnumC19815f enumC19815f4 = new EnumC19815f("TRACECONTEXT", 3);
        f62867p0 = enumC19815f4;
        f62868q0 = new EnumC19815f[]{enumC19815f, enumC19815f2, enumC19815f3, enumC19815f4};
    }

    public static EnumC19815f valueOf(String str) {
        return (EnumC19815f) Enum.valueOf(EnumC19815f.class, str);
    }

    public static EnumC19815f[] values() {
        return (EnumC19815f[]) f62868q0.clone();
    }
}
