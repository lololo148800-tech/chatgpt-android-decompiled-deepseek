package p872lg;

import mm.EnumC17307j;
import p138F8.vJO.vRJidSveZHcTw;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import p582Xk.HXHG.TfazcFv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lg.i */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC16949i {
    public static final C16948h Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f54399Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC16949i f54400Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC16949i f54401o0;

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ EnumC16949i[] f54402p0;

    static {
        EnumC16949i enumC16949i = new EnumC16949i("Created", 0);
        f54400Z = enumC16949i;
        EnumC16949i enumC16949i2 = new EnumC16949i("Pending", 1);
        f54401o0 = enumC16949i2;
        EnumC16949i[] enumC16949iArr = {enumC16949i, enumC16949i2, new EnumC16949i("Completed", 2), new EnumC16949i(vRJidSveZHcTw.zbXdxgTji, 3), new EnumC16949i("Expired", 4), new EnumC16949i("NeedsReview", 5), new EnumC16949i("Approved", 6), new EnumC16949i(TfazcFv.GCmE, 7)};
        f54402p0 = enumC16949iArr;
        AbstractC7877E4.m8156j(enumC16949iArr);
        Companion = new C16948h();
        f54399Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C16947g.f54398Y);
    }

    public static EnumC16949i valueOf(String str) {
        return (EnumC16949i) Enum.valueOf(EnumC16949i.class, str);
    }

    public static EnumC16949i[] values() {
        return (EnumC16949i[]) f54402p0.clone();
    }
}
