package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p1155zi.EnumC22033m2;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.l1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2838l1 {
    public static final C2835k1 Companion = new C2835k1();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f8577g = {null, null, null, EnumC22033m2.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a */
    public final String f8578a;

    /* JADX INFO: renamed from: b */
    public final String f8579b;

    /* JADX INFO: renamed from: c */
    public final String f8580c;

    /* JADX INFO: renamed from: d */
    public final EnumC22033m2 f8581d;

    /* JADX INFO: renamed from: e */
    public final int f8582e;

    /* JADX INFO: renamed from: f */
    public final String f8583f;

    public /* synthetic */ C2838l1(int i10, String str, String str2, String str3, EnumC22033m2 enumC22033m2, int i11, String str4) {
        if (62 != (i10 & 62)) {
            AbstractC11153a0.m12389l(i10, 62, C2832j1.f8568a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f8578a = null;
        } else {
            this.f8578a = str;
        }
        this.f8579b = str2;
        this.f8580c = str3;
        this.f8581d = enumC22033m2;
        this.f8582e = i11;
        this.f8583f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2838l1)) {
            return false;
        }
        C2838l1 c2838l1 = (C2838l1) obj;
        return AbstractC16544l.m18089b(this.f8578a, c2838l1.f8578a) && AbstractC16544l.m18089b(this.f8579b, c2838l1.f8579b) && AbstractC16544l.m18089b(this.f8580c, c2838l1.f8580c) && this.f8581d == c2838l1.f8581d && this.f8582e == c2838l1.f8582e && AbstractC16544l.m18089b(this.f8583f, c2838l1.f8583f);
    }

    public final int hashCode() {
        String str = this.f8578a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8579b;
        int iM527p = AbstractC0168G.m527p((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f8580c);
        EnumC22033m2 enumC22033m2 = this.f8581d;
        int iHashCode2 = (((iM527p + (enumC22033m2 == null ? 0 : enumC22033m2.hashCode())) * 31) + this.f8582e) * 31;
        String str3 = this.f8583f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C2838l1(String str, String str2, String nonce, EnumC22033m2 enumC22033m2, int i10, String str3) {
        AbstractC16544l.m18094g(nonce, "nonce");
        this.f8578a = str;
        this.f8579b = str2;
        this.f8580c = nonce;
        this.f8581d = enumC22033m2;
        this.f8582e = i10;
        this.f8583f = str3;
    }
}
