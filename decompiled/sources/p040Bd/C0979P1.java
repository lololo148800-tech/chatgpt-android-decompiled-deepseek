package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.org.webrtc.MediaStreamTrack;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.P1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0979P1 extends AbstractC1142p {
    public static final C0949K1 Companion = new C0949K1();

    /* JADX INFO: renamed from: h */
    public static final KSerializer[] f2759h = {null, null, null, EnumC0973O1.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a */
    public final Integer f2760a;

    /* JADX INFO: renamed from: b */
    public final Integer f2761b;

    /* JADX INFO: renamed from: c */
    public final String f2762c;

    /* JADX INFO: renamed from: d */
    public final EnumC0973O1 f2763d;

    /* JADX INFO: renamed from: e */
    public final String f2764e;

    /* JADX INFO: renamed from: f */
    public final String f2765f;

    /* JADX INFO: renamed from: g */
    public final String f2766g;

    public C0979P1(int i10, Integer num, Integer num2, String str, EnumC0973O1 enumC0973O1, String str2, String str3, String str4) {
        if (63 != (i10 & 63)) {
            AbstractC11153a0.m12389l(i10, 63, C0943J1.f2707a.getDescriptor());
            throw null;
        }
        this.f2760a = num;
        this.f2761b = num2;
        this.f2762c = str;
        this.f2763d = enumC0973O1;
        this.f2764e = str2;
        this.f2765f = str3;
        if ((i10 & 64) == 0) {
            this.f2766g = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else {
            this.f2766g = str4;
        }
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: b */
    public final Integer mo1960b() {
        return this.f2761b;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: c */
    public final Integer mo1961c() {
        return this.f2760a;
    }

    @Override // p040Bd.AbstractC0985Q1
    /* JADX INFO: renamed from: d */
    public final String mo1962d() {
        return this.f2766g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0979P1)) {
            return false;
        }
        C0979P1 c0979p1 = (C0979P1) obj;
        return AbstractC16544l.m18089b(this.f2760a, c0979p1.f2760a) && AbstractC16544l.m18089b(this.f2761b, c0979p1.f2761b) && AbstractC16544l.m18089b(this.f2762c, c0979p1.f2762c) && this.f2763d == c0979p1.f2763d && AbstractC16544l.m18089b(this.f2764e, c0979p1.f2764e) && AbstractC16544l.m18089b(this.f2765f, c0979p1.f2765f) && AbstractC16544l.m18089b(this.f2766g, c0979p1.f2766g);
    }

    public final int hashCode() {
        Integer num = this.f2760a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f2761b;
        int iHashCode2 = (this.f2763d.hashCode() + AbstractC0168G.m527p((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f2762c)) * 31;
        String str = this.f2764e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2765f;
        return this.f2766g.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
