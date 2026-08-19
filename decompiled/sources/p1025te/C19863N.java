package p1025te;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1042uh.C20263a0;
import p1071w0.AbstractC20734X;
import p1155zi.C21999e0;
import p350O1.C6045C;
import p523V9.AbstractC7845A4;
import p909nm.C17690x;

/* JADX INFO: renamed from: te.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C19863N {

    /* JADX INFO: renamed from: a */
    public final C6045C f62954a;

    /* JADX INFO: renamed from: b */
    public final boolean f62955b;

    /* JADX INFO: renamed from: c */
    public final Map f62956c;

    /* JADX INFO: renamed from: d */
    public final C20263a0 f62957d;

    /* JADX INFO: renamed from: e */
    public final boolean f62958e;

    /* JADX INFO: renamed from: f */
    public final AbstractC7845A4 f62959f;

    /* JADX INFO: renamed from: g */
    public final C19872c f62960g;

    /* JADX INFO: renamed from: h */
    public final C21999e0 f62961h;

    public C19863N(C6045C input, boolean z6, Map attachments, C20263a0 c20263a0, boolean z10, AbstractC7845A4 pendingImage, C19872c c19872c, C21999e0 c21999e0) {
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(attachments, "attachments");
        AbstractC16544l.m18094g(pendingImage, "pendingImage");
        this.f62954a = input;
        this.f62955b = z6;
        this.f62956c = attachments;
        this.f62957d = c20263a0;
        this.f62958e = z10;
        this.f62959f = pendingImage;
        this.f62960g = c19872c;
        this.f62961h = c21999e0;
    }

    /* JADX INFO: renamed from: a */
    public static C19863N m20780a(C19863N c19863n, C6045C c6045c, boolean z6, Map map, C20263a0 c20263a0, boolean z10, AbstractC7845A4 abstractC7845A4, C19872c c19872c, C21999e0 c21999e0, int i10) {
        C6045C input = (i10 & 1) != 0 ? c19863n.f62954a : c6045c;
        boolean z11 = (i10 & 2) != 0 ? c19863n.f62955b : z6;
        Map attachments = (i10 & 4) != 0 ? c19863n.f62956c : map;
        C20263a0 c20263a1 = (i10 & 8) != 0 ? c19863n.f62957d : c20263a0;
        boolean z12 = (i10 & 16) != 0 ? c19863n.f62958e : z10;
        AbstractC7845A4 pendingImage = (i10 & 32) != 0 ? c19863n.f62959f : abstractC7845A4;
        C19872c c19872c2 = (i10 & 64) != 0 ? c19863n.f62960g : c19872c;
        C21999e0 c21999e1 = (i10 & 128) != 0 ? c19863n.f62961h : c21999e0;
        c19863n.getClass();
        AbstractC16544l.m18094g(input, "input");
        AbstractC16544l.m18094g(attachments, "attachments");
        AbstractC16544l.m18094g(pendingImage, "pendingImage");
        return new C19863N(input, z11, attachments, c20263a1, z12, pendingImage, c19872c2, c21999e1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19863N)) {
            return false;
        }
        C19863N c19863n = (C19863N) obj;
        return AbstractC16544l.m18089b(this.f62954a, c19863n.f62954a) && this.f62955b == c19863n.f62955b && AbstractC16544l.m18089b(this.f62956c, c19863n.f62956c) && AbstractC16544l.m18089b(this.f62957d, c19863n.f62957d) && this.f62958e == c19863n.f62958e && AbstractC16544l.m18089b(this.f62959f, c19863n.f62959f) && AbstractC16544l.m18089b(this.f62960g, c19863n.f62960g) && AbstractC16544l.m18089b(this.f62961h, c19863n.f62961h);
    }

    public final int hashCode() {
        int iM21250u = AbstractC20734X.m21250u(((this.f62954a.hashCode() * 31) + (this.f62955b ? 1231 : 1237)) * 31, 31, this.f62956c);
        C20263a0 c20263a0 = this.f62957d;
        int iHashCode = (this.f62959f.hashCode() + ((((iM21250u + (c20263a0 == null ? 0 : c20263a0.hashCode())) * 31) + (this.f62958e ? 1231 : 1237)) * 31)) * 31;
        C19872c c19872c = this.f62960g;
        int iHashCode2 = (iHashCode + (c19872c == null ? 0 : c19872c.hashCode())) * 31;
        C21999e0 c21999e0 = this.f62961h;
        return iHashCode2 + (c21999e0 != null ? c21999e0.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C19863N(C6045C c6045c, Map map, C20263a0 c20263a0, int i10) {
        this((i10 & 1) != 0 ? new C6045C(0L, "", 6) : c6045c, false, (i10 & 4) != 0 ? C17690x.f56481Y : map, (i10 & 8) != 0 ? null : c20263a0, false, C19869U.f62999a, null, null);
    }
}
