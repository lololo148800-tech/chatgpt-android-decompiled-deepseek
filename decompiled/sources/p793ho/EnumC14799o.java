package p793ho;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.o */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14799o {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14799o f46253Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14799o f46254Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14799o f46255o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14799o f46256p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14799o f46257q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC14799o f46258r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC14799o[] f46259s0;

    static {
        EnumC14799o enumC14799o = new EnumC14799o(TokenNames.REGISTER, 0);
        f46253Y = enumC14799o;
        EnumC14799o enumC14799o2 = new EnumC14799o("AVAILABILITY", 1);
        f46254Z = enumC14799o2;
        EnumC14799o enumC14799o3 = new EnumC14799o("ASSIGNMENT", 2);
        f46255o0 = enumC14799o3;
        EnumC14799o enumC14799o4 = new EnumC14799o("TERMINATION", 3);
        f46256p0 = enumC14799o4;
        EnumC14799o enumC14799o5 = new EnumC14799o("PONG", 4);
        f46257q0 = enumC14799o5;
        EnumC14799o enumC14799o6 = new EnumC14799o("MESSAGE_NOT_SET", 5);
        f46258r0 = enumC14799o6;
        f46259s0 = new EnumC14799o[]{enumC14799o, enumC14799o2, enumC14799o3, enumC14799o4, enumC14799o5, enumC14799o6};
    }

    public static EnumC14799o valueOf(String str) {
        return (EnumC14799o) Enum.valueOf(EnumC14799o.class, str);
    }

    public static EnumC14799o[] values() {
        return (EnumC14799o[]) f46259s0.clone();
    }
}
