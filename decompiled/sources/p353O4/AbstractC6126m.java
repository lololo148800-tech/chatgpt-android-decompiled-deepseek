package p353O4;

import p499U9.AbstractC7589s;
import p979r2.C18864e;

/* JADX INFO: renamed from: O4.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6126m extends AbstractC6125l {

    /* JADX INFO: renamed from: a */
    public C18864e[] f19946a;

    /* JADX INFO: renamed from: b */
    public String f19947b;

    /* JADX INFO: renamed from: c */
    public int f19948c;

    public AbstractC6126m() {
        this.f19946a = null;
        this.f19948c = 0;
    }

    public C18864e[] getPathData() {
        return this.f19946a;
    }

    public String getPathName() {
        return this.f19947b;
    }

    public void setPathData(C18864e[] c18864eArr) {
        if (!AbstractC7589s.m7926a(this.f19946a, c18864eArr)) {
            this.f19946a = AbstractC7589s.m7930e(c18864eArr);
            return;
        }
        C18864e[] c18864eArr2 = this.f19946a;
        for (int i10 = 0; i10 < c18864eArr.length; i10++) {
            c18864eArr2[i10].f60091a = c18864eArr[i10].f60091a;
            int i11 = 0;
            while (true) {
                float[] fArr = c18864eArr[i10].f60092b;
                if (i11 < fArr.length) {
                    c18864eArr2[i10].f60092b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public AbstractC6126m(AbstractC6126m abstractC6126m) {
        this.f19946a = null;
        this.f19948c = 0;
        this.f19947b = abstractC6126m.f19947b;
        this.f19946a = AbstractC7589s.m7930e(abstractC6126m.f19946a);
    }
}
