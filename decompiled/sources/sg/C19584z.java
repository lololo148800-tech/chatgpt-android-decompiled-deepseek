package sg;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11181o0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;
import p909nm.C17690x;

/* JADX INFO: renamed from: sg.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19584z {
    public static final C19583y Companion = new C19583y();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f62183e;

    /* JADX INFO: renamed from: a */
    public final C19539C f62184a;

    /* JADX INFO: renamed from: b */
    public final String f62185b;

    /* JADX INFO: renamed from: c */
    public final String f62186c;

    /* JADX INFO: renamed from: d */
    public final Map f62187d;

    static {
        C11181o0 c11181o0 = C11181o0.f33827a;
        f62183e = new KSerializer[]{null, null, null, new C11131E(c11181o0, c11181o0, 1)};
    }

    public /* synthetic */ C19584z(int i10, C19539C c19539c, String str, String str2, Map map) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C19582x.f62182a.getDescriptor());
            throw null;
        }
        this.f62184a = c19539c;
        this.f62185b = str;
        this.f62186c = str2;
        if ((i10 & 8) == 0) {
            this.f62187d = C17690x.f56481Y;
        } else {
            this.f62187d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19584z)) {
            return false;
        }
        C19584z c19584z = (C19584z) obj;
        return AbstractC16544l.m18089b(this.f62184a, c19584z.f62184a) && AbstractC16544l.m18089b(this.f62185b, c19584z.f62185b) && AbstractC16544l.m18089b(this.f62186c, c19584z.f62186c) && AbstractC16544l.m18089b(this.f62187d, c19584z.f62187d);
    }

    public final int hashCode() {
        int iHashCode = this.f62184a.hashCode() * 31;
        String str = this.f62185b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f62186c;
        return this.f62187d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C19584z(C19539C c19539c, String str, String str2, Map map) {
        this.f62184a = c19539c;
        this.f62185b = str;
        this.f62186c = str2;
        this.f62187d = map;
    }
}
