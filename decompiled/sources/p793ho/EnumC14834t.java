package p793ho;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ho.t */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC14834t {

    /* JADX INFO: renamed from: Y */
    public static final EnumC14834t f46304Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC14834t f46305Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC14834t f46306o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC14834t f46307p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC14834t f46308q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC14834t f46309r0;

    /* JADX INFO: renamed from: s0 */
    public static final EnumC14834t f46310s0;

    /* JADX INFO: renamed from: t0 */
    public static final EnumC14834t f46311t0;

    /* JADX INFO: renamed from: u0 */
    public static final /* synthetic */ EnumC14834t[] f46312u0;

    static {
        EnumC14834t enumC14834t = new EnumC14834t(TokenNames.REGISTER, 0);
        f46304Y = enumC14834t;
        EnumC14834t enumC14834t2 = new EnumC14834t("AVAILABILITY", 1);
        f46305Z = enumC14834t2;
        EnumC14834t enumC14834t3 = new EnumC14834t("UPDATE_WORKER", 2);
        f46306o0 = enumC14834t3;
        EnumC14834t enumC14834t4 = new EnumC14834t("UPDATE_JOB", 3);
        f46307p0 = enumC14834t4;
        EnumC14834t enumC14834t5 = new EnumC14834t("PING", 4);
        f46308q0 = enumC14834t5;
        EnumC14834t enumC14834t6 = new EnumC14834t("SIMULATE_JOB", 5);
        f46309r0 = enumC14834t6;
        EnumC14834t enumC14834t7 = new EnumC14834t("MIGRATE_JOB", 6);
        f46310s0 = enumC14834t7;
        EnumC14834t enumC14834t8 = new EnumC14834t("MESSAGE_NOT_SET", 7);
        f46311t0 = enumC14834t8;
        f46312u0 = new EnumC14834t[]{enumC14834t, enumC14834t2, enumC14834t3, enumC14834t4, enumC14834t5, enumC14834t6, enumC14834t7, enumC14834t8};
    }

    public static EnumC14834t valueOf(String str) {
        return (EnumC14834t) Enum.valueOf(EnumC14834t.class, str);
    }

    public static EnumC14834t[] values() {
        return (EnumC14834t[]) f46312u0.clone();
    }
}
