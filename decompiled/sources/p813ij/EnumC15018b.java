package p813ij;

import kotlin.jvm.internal.AbstractC16526C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ij.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC15018b {

    /* JADX INFO: renamed from: Y */
    public static final C15017a f46713Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC15018b f46714Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC15018b f46715o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC15018b[] f46716p0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC15018b EF3;

    static {
        EnumC15018b enumC15018b = new EnumC15018b("None", 0);
        EnumC15018b enumC15018b2 = new EnumC15018b("First", 1);
        f46714Z = enumC15018b2;
        EnumC15018b enumC15018b3 = new EnumC15018b("Other", 2);
        f46715o0 = enumC15018b3;
        f46716p0 = new EnumC15018b[]{enumC15018b, enumC15018b2, enumC15018b3};
        f46713Y = new C15017a(AbstractC16526C.f51263a.mo5693b(EnumC15018b.class));
    }

    public static EnumC15018b valueOf(String str) {
        return (EnumC15018b) Enum.valueOf(EnumC15018b.class, str);
    }

    public static EnumC15018b[] values() {
        return (EnumC15018b[]) f46716p0.clone();
    }
}
