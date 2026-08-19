package p232J3;

import bb.AbstractC11278C;
import bb.C11294T;
import p1016t3.C19765O;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: J3.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4227a0 {

    /* JADX INFO: renamed from: d */
    public static final C4227a0 f13814d = new C4227a0(new C19765O[0]);

    /* JADX INFO: renamed from: a */
    public final int f13815a;

    /* JADX INFO: renamed from: b */
    public final C11294T f13816b;

    /* JADX INFO: renamed from: c */
    public int f13817c;

    static {
        AbstractC20817s.m21425z(0);
    }

    public C4227a0(C19765O... c19765oArr) {
        this.f13816b = AbstractC11278C.m12692u(c19765oArr);
        this.f13815a = c19765oArr.length;
        int i10 = 0;
        while (true) {
            C11294T c11294t = this.f13816b;
            if (i10 >= c11294t.size()) {
                return;
            }
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < c11294t.size(); i12++) {
                if (((C19765O) c11294t.get(i10)).equals(c11294t.get(i12))) {
                    AbstractC20800b.m21325m("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C19765O m4999a(int i10) {
        return (C19765O) this.f13816b.get(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4227a0.class != obj.getClass()) {
            return false;
        }
        C4227a0 c4227a0 = (C4227a0) obj;
        return this.f13815a == c4227a0.f13815a && this.f13816b.equals(c4227a0.f13816b);
    }

    public final int hashCode() {
        if (this.f13817c == 0) {
            this.f13817c = this.f13816b.hashCode();
        }
        return this.f13817c;
    }
}
