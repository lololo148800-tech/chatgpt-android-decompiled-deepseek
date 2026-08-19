package p530Vi;

import com.segment.analytics.kotlin.core.EventType$Companion;
import mm.EnumC17307j;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Vi.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC8319o {
    public static final EventType$Companion Companion;

    /* JADX INFO: renamed from: Y */
    public static final Object f25934Y;

    /* JADX INFO: renamed from: Z */
    public static final EnumC8319o f25935Z;

    /* JADX INFO: renamed from: o0 */
    public static final EnumC8319o f25936o0;

    /* JADX INFO: renamed from: p0 */
    public static final EnumC8319o f25937p0;

    /* JADX INFO: renamed from: q0 */
    public static final EnumC8319o f25938q0;

    /* JADX INFO: renamed from: r0 */
    public static final EnumC8319o f25939r0;

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ EnumC8319o[] f25940s0;

    static {
        EnumC8319o enumC8319o = new EnumC8319o("Track", 0);
        f25935Z = enumC8319o;
        EnumC8319o enumC8319o2 = new EnumC8319o("Screen", 1);
        f25936o0 = enumC8319o2;
        EnumC8319o enumC8319o3 = new EnumC8319o("Alias", 2);
        f25937p0 = enumC8319o3;
        EnumC8319o enumC8319o4 = new EnumC8319o("Identify", 3);
        f25938q0 = enumC8319o4;
        EnumC8319o enumC8319o5 = new EnumC8319o("Group", 4);
        f25939r0 = enumC8319o5;
        f25940s0 = new EnumC8319o[]{enumC8319o, enumC8319o2, enumC8319o3, enumC8319o4, enumC8319o5};
        Companion = new EventType$Companion();
        f25934Y = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C8318n.f25931Z);
    }

    public static EnumC8319o valueOf(String str) {
        return (EnumC8319o) Enum.valueOf(EnumC8319o.class, str);
    }

    public static EnumC8319o[] values() {
        return (EnumC8319o[]) f25940s0.clone();
    }
}
