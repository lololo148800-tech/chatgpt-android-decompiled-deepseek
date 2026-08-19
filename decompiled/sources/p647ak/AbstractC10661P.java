package p647ak;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p949pj.AbstractC18478m0;
import p949pj.C18472j0;
import p949pj.C18474k0;
import p949pj.C18476l0;

/* JADX INFO: renamed from: ak.P */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10661P {
    /* JADX INFO: renamed from: a */
    public static final String m11004a(EnumC10723q enumC10723q) {
        int iOrdinal = enumC10723q.ordinal();
        if (iOrdinal == 0) {
            return "center";
        }
        if (iOrdinal == 1) {
            return "left";
        }
        if (iOrdinal == 2) {
            return "right";
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC10723q m11005b(AbstractC18478m0 abstractC18478m0) {
        AbstractC16544l.m18094g(abstractC18478m0, "<this>");
        if (abstractC18478m0 instanceof C18472j0) {
            return EnumC10723q.f31854Y;
        }
        if (abstractC18478m0 instanceof C18474k0) {
            return EnumC10723q.f31855Z;
        }
        if (abstractC18478m0 instanceof C18476l0) {
            return EnumC10723q.f31856o0;
        }
        throw new C0644w();
    }
}
