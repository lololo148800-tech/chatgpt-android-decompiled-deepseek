package ye;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p324Mn.C5551u;
import p479Td.C7320F;

/* JADX INFO: renamed from: ye.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C21523l {

    /* JADX INFO: renamed from: a */
    public final String f68155a;

    /* JADX INFO: renamed from: b */
    public final int f68156b;

    /* JADX INFO: renamed from: c */
    public final String f68157c;

    /* JADX INFO: renamed from: d */
    public final String f68158d;

    /* JADX INFO: renamed from: e */
    public final String f68159e;

    /* JADX INFO: renamed from: f */
    public final C7320F f68160f;

    /* JADX INFO: renamed from: g */
    public final C5551u f68161g;

    /* JADX INFO: renamed from: h */
    public final EnumC21524m f68162h;

    public C21523l(String textdocId, int i10, String str, String title, String type, C7320F c7320f, C5551u createdAt, EnumC21524m enumC21524m) {
        AbstractC16544l.m18094g(textdocId, "textdocId");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(createdAt, "createdAt");
        this.f68155a = textdocId;
        this.f68156b = i10;
        this.f68157c = str;
        this.f68158d = title;
        this.f68159e = type;
        this.f68160f = c7320f;
        this.f68161g = createdAt;
        this.f68162h = enumC21524m;
    }

    /* JADX INFO: renamed from: a */
    public static C21523l m21795a(C21523l c21523l, C7320F c7320f, EnumC21524m enumC21524m) {
        String textdocId = c21523l.f68155a;
        int i10 = c21523l.f68156b;
        String str = c21523l.f68157c;
        String title = c21523l.f68158d;
        String type = c21523l.f68159e;
        C5551u createdAt = c21523l.f68161g;
        c21523l.getClass();
        AbstractC16544l.m18094g(textdocId, "textdocId");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(createdAt, "createdAt");
        return new C21523l(textdocId, i10, str, title, type, c7320f, createdAt, enumC21524m);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0028  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21523l)) {
            return false;
        }
        C21523l c21523l = (C21523l) obj;
        if (!AbstractC16544l.m18089b(this.f68155a, c21523l.f68155a) || this.f68156b != c21523l.f68156b) {
            return false;
        }
        String str = this.f68157c;
        String str2 = c21523l.f68157c;
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
        return zM18089b && AbstractC16544l.m18089b(this.f68158d, c21523l.f68158d) && AbstractC16544l.m18089b(this.f68159e, c21523l.f68159e) && AbstractC16544l.m18089b(this.f68160f, c21523l.f68160f) && AbstractC16544l.m18089b(this.f68161g, c21523l.f68161g) && this.f68162h == c21523l.f68162h;
    }

    public final int hashCode() {
        int iHashCode = ((this.f68155a.hashCode() * 31) + this.f68156b) * 31;
        String str = this.f68157c;
        return this.f68162h.hashCode() + ((this.f68161g.f18004Y.hashCode() + ((this.f68160f.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f68158d), 31, this.f68159e)) * 31)) * 31);
    }

    public final String toString() {
        return "█";
    }
}
