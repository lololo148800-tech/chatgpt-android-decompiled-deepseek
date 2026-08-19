package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.w0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C22071w0 implements InterfaceC21915G {
    public static final C22067v0 Companion = new C22067v0();

    /* JADX INFO: renamed from: i */
    public static final KSerializer[] f69773i = {AbstractC11153a0.m12383f("com.openai.types.ImageOperationType", EnumC21968V0.values()), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC21968V0 f69774a;

    /* JADX INFO: renamed from: b */
    public final String f69775b;

    /* JADX INFO: renamed from: c */
    public final String f69776c;

    /* JADX INFO: renamed from: d */
    public final String f69777d;

    /* JADX INFO: renamed from: e */
    public final String f69778e;

    /* JADX INFO: renamed from: f */
    public final String f69779f;

    /* JADX INFO: renamed from: g */
    public final String f69780g;

    /* JADX INFO: renamed from: h */
    public final String f69781h;

    public C22071w0(int i10, EnumC21968V0 enumC21968V0, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (24 != (i10 & 24)) {
            AbstractC11153a0.m12389l(i10, 24, C22063u0.f69764a.getDescriptor());
            throw null;
        }
        this.f69774a = (i10 & 1) == 0 ? EnumC21968V0.Transformation : enumC21968V0;
        if ((i10 & 2) == 0) {
            this.f69775b = null;
        } else {
            this.f69775b = str;
        }
        if ((i10 & 4) == 0) {
            this.f69776c = null;
        } else {
            this.f69776c = str2;
        }
        this.f69777d = str3;
        this.f69778e = str4;
        if ((i10 & 32) == 0) {
            this.f69779f = null;
        } else {
            this.f69779f = str5;
        }
        if ((i10 & 64) == 0) {
            this.f69780g = null;
        } else {
            this.f69780g = str6;
        }
        if ((i10 & 128) == 0) {
            this.f69781h = null;
        } else {
            this.f69781h = str7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22071w0)) {
            return false;
        }
        C22071w0 c22071w0 = (C22071w0) obj;
        if (this.f69774a != c22071w0.f69774a) {
            return false;
        }
        String str = this.f69775b;
        String str2 = c22071w0.f69775b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f69776c;
        String str4 = c22071w0.f69776c;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        if (!zM18089b2 || !AbstractC16544l.m18089b(this.f69777d, c22071w0.f69777d) || !AbstractC16544l.m18089b(this.f69778e, c22071w0.f69778e) || !AbstractC16544l.m18089b(this.f69779f, c22071w0.f69779f) || !AbstractC16544l.m18089b(this.f69780g, c22071w0.f69780g)) {
            return false;
        }
        String str5 = this.f69781h;
        String str6 = c22071w0.f69781h;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3;
    }

    public final int hashCode() {
        int iHashCode = this.f69774a.hashCode() * 31;
        String str = this.f69775b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f69776c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69777d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f69778e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f69779f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f69780g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f69781h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C22071w0(EnumC21968V0 enumC21968V0, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
        str2 = (i10 & 4) != 0 ? null : str2;
        str5 = (i10 & 32) != 0 ? null : str5;
        str6 = (i10 & 64) != 0 ? null : str6;
        str7 = (i10 & 128) != 0 ? null : str7;
        this.f69774a = enumC21968V0;
        this.f69775b = str;
        this.f69776c = str2;
        this.f69777d = str3;
        this.f69778e = str4;
        this.f69779f = str5;
        this.f69780g = str6;
        this.f69781h = str7;
    }
}
