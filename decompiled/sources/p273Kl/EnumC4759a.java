package p273Kl;

import p523V9.AbstractC7877E4;
import p582Xk.HXHG.TfazcFv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Kl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4759a {

    /* JADX INFO: renamed from: Y */
    public static final EnumC4759a f15524Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC4759a f15525Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC4759a f15526o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC4759a f15527p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC4759a f15528q0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ EnumC4759a[] f15529r0;

    static {
        EnumC4759a enumC4759a = new EnumC4759a(TfazcFv.wTaaw, 0);
        f15524Y = enumC4759a;
        EnumC4759a enumC4759a2 = new EnumC4759a("CONNECTED", 1);
        f15525Z = enumC4759a2;
        EnumC4759a enumC4759a3 = new EnumC4759a("DISCONNECTED", 2);
        f15526o0 = enumC4759a3;
        EnumC4759a enumC4759a4 = new EnumC4759a("RECONNECTING", 3);
        f15527p0 = enumC4759a4;
        EnumC4759a enumC4759a5 = new EnumC4759a("RESUMING", 4);
        f15528q0 = enumC4759a5;
        EnumC4759a[] enumC4759aArr = {enumC4759a, enumC4759a2, enumC4759a3, enumC4759a4, enumC4759a5};
        f15529r0 = enumC4759aArr;
        AbstractC7877E4.m8156j(enumC4759aArr);
    }

    public static EnumC4759a valueOf(String str) {
        return (EnumC4759a) Enum.valueOf(EnumC4759a.class, str);
    }

    public static EnumC4759a[] values() {
        return (EnumC4759a[]) f15529r0.clone();
    }
}
