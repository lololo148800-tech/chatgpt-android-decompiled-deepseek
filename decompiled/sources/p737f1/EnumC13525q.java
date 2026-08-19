package p737f1;

import p025An.C0644w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f1.q */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13525q {

    /* JADX INFO: renamed from: Y */
    public static final EnumC13525q f42807Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC13525q f42808Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC13525q f42809o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC13525q[] f42810p0;

    static {
        EnumC13525q enumC13525q = new EnumC13525q("Active", 0);
        f42807Y = enumC13525q;
        EnumC13525q enumC13525q2 = new EnumC13525q("ActiveParent", 1);
        f42808Z = enumC13525q2;
        EnumC13525q enumC13525q3 = new EnumC13525q("Captured", 2);
        EnumC13525q enumC13525q4 = new EnumC13525q("Inactive", 3);
        f42809o0 = enumC13525q4;
        f42810p0 = new EnumC13525q[]{enumC13525q, enumC13525q2, enumC13525q3, enumC13525q4};
    }

    public static EnumC13525q valueOf(String str) {
        return (EnumC13525q) Enum.valueOf(EnumC13525q.class, str);
    }

    public static EnumC13525q[] values() {
        return (EnumC13525q[]) f42810p0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15074a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return true;
            }
            if (iOrdinal != 3) {
                throw new C0644w();
            }
        }
        return false;
    }
}
