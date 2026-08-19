package p736f0;

import com.google.protobuf.AbstractC12107L1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17690x;

/* JADX INFO: renamed from: f0.U */
/* JADX INFO: loaded from: classes.dex */
public final class C13482U {

    /* JADX INFO: renamed from: a */
    public final C13469G f42660a;

    /* JADX INFO: renamed from: b */
    public final C13480S f42661b;

    /* JADX INFO: renamed from: c */
    public final C13501s f42662c;

    /* JADX INFO: renamed from: d */
    public final C13473K f42663d;

    /* JADX INFO: renamed from: e */
    public final boolean f42664e;

    /* JADX INFO: renamed from: f */
    public final Map f42665f;

    public C13482U(C13469G c13469g, C13480S c13480s, C13501s c13501s, C13473K c13473k, boolean z6, Map map) {
        this.f42660a = c13469g;
        this.f42661b = c13480s;
        this.f42662c = c13501s;
        this.f42663d = c13473k;
        this.f42664e = z6;
        this.f42665f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13482U)) {
            return false;
        }
        C13482U c13482u = (C13482U) obj;
        return AbstractC16544l.m18089b(this.f42660a, c13482u.f42660a) && AbstractC16544l.m18089b(this.f42661b, c13482u.f42661b) && AbstractC16544l.m18089b(this.f42662c, c13482u.f42662c) && AbstractC16544l.m18089b(this.f42663d, c13482u.f42663d) && this.f42664e == c13482u.f42664e && AbstractC16544l.m18089b(this.f42665f, c13482u.f42665f);
    }

    public final int hashCode() {
        C13469G c13469g = this.f42660a;
        int iHashCode = (c13469g == null ? 0 : c13469g.hashCode()) * 31;
        C13480S c13480s = this.f42661b;
        int iHashCode2 = (iHashCode + (c13480s == null ? 0 : c13480s.hashCode())) * 31;
        C13501s c13501s = this.f42662c;
        int iHashCode3 = (iHashCode2 + (c13501s == null ? 0 : c13501s.hashCode())) * 31;
        C13473K c13473k = this.f42663d;
        return this.f42665f.hashCode() + ((((iHashCode3 + (c13473k != null ? c13473k.hashCode() : 0)) * 31) + (this.f42664e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionData(fade=");
        sb2.append(this.f42660a);
        sb2.append(", slide=");
        sb2.append(this.f42661b);
        sb2.append(", changeSize=");
        sb2.append(this.f42662c);
        sb2.append(", scale=");
        sb2.append(this.f42663d);
        sb2.append(", hold=");
        sb2.append(this.f42664e);
        sb2.append(", effectsMap=");
        return AbstractC12107L1.m13827r(sb2, this.f42665f, ')');
    }

    public /* synthetic */ C13482U(C13469G c13469g, C13480S c13480s, C13501s c13501s, C13473K c13473k, boolean z6, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : c13469g, (i10 & 2) != 0 ? null : c13480s, (i10 & 4) != 0 ? null : c13501s, (i10 & 8) == 0 ? c13473k : null, (i10 & 16) != 0 ? false : z6, (i10 & 32) != 0 ? C17690x.f56481Y : linkedHashMap);
    }
}
