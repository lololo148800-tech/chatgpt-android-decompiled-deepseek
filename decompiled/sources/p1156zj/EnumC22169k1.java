package p1156zj;

import livekit.org.webrtc.PeerConnectionFactory;
import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zj.k1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22169k1 {

    /* JADX INFO: renamed from: Y */
    public static final EnumC22169k1 f70146Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC22169k1 f70147Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC22169k1 f70148o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC22169k1[] f70149p0;

    static {
        EnumC22169k1 enumC22169k1 = new EnumC22169k1("Disabled", 0);
        f70146Y = enumC22169k1;
        EnumC22169k1 enumC22169k2 = new EnumC22169k1(PeerConnectionFactory.TRIAL_ENABLED, 1);
        f70147Z = enumC22169k2;
        EnumC22169k1 enumC22169k3 = new EnumC22169k1("Hidden", 2);
        f70148o0 = enumC22169k3;
        EnumC22169k1[] enumC22169k1Arr = {enumC22169k1, enumC22169k2, enumC22169k3};
        f70149p0 = enumC22169k1Arr;
        AbstractC7877E4.m8156j(enumC22169k1Arr);
    }

    public static EnumC22169k1 valueOf(String str) {
        return (EnumC22169k1) Enum.valueOf(EnumC22169k1.class, str);
    }

    public static EnumC22169k1[] values() {
        return (EnumC22169k1[]) f70149p0.clone();
    }
}
