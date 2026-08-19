package p305M3;

import java.util.ArrayList;
import java.util.Collections;
import p001A.C0013G0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: M3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5294n {

    /* JADX INFO: renamed from: h */
    public static final C0013G0 f17450h = new C0013G0(12);

    /* JADX INFO: renamed from: i */
    public static final C0013G0 f17451i = new C0013G0(13);

    /* JADX INFO: renamed from: a */
    public final int f17452a;

    /* JADX INFO: renamed from: e */
    public int f17456e;

    /* JADX INFO: renamed from: f */
    public int f17457f;

    /* JADX INFO: renamed from: g */
    public int f17458g;

    /* JADX INFO: renamed from: c */
    public final C5293m[] f17454c = new C5293m[5];

    /* JADX INFO: renamed from: b */
    public final ArrayList f17453b = new ArrayList();

    /* JADX INFO: renamed from: d */
    public int f17455d = -1;

    public C5294n(int i10) {
        this.f17452a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m5833a(int i10, float f10) {
        C5293m c5293m;
        int i11 = this.f17455d;
        ArrayList arrayList = this.f17453b;
        if (i11 != 1) {
            Collections.sort(arrayList, f17450h);
            this.f17455d = 1;
        }
        int i12 = this.f17458g;
        C5293m[] c5293mArr = this.f17454c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f17458g = i13;
            c5293m = c5293mArr[i13];
        } else {
            c5293m = new C5293m();
        }
        int i14 = this.f17456e;
        this.f17456e = i14 + 1;
        c5293m.f17447a = i14;
        c5293m.f17448b = i10;
        c5293m.f17449c = f10;
        arrayList.add(c5293m);
        this.f17457f += i10;
        while (true) {
            int i15 = this.f17457f;
            int i16 = this.f17452a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            C5293m c5293m2 = (C5293m) arrayList.get(0);
            int i18 = c5293m2.f17448b;
            if (i18 <= i17) {
                this.f17457f -= i18;
                arrayList.remove(0);
                int i19 = this.f17458g;
                if (i19 < 5) {
                    this.f17458g = i19 + 1;
                    c5293mArr[i19] = c5293m2;
                }
            } else {
                c5293m2.f17448b = i18 - i17;
                this.f17457f -= i17;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m5834b() {
        int i10 = this.f17455d;
        ArrayList arrayList = this.f17453b;
        if (i10 != 0) {
            Collections.sort(arrayList, f17451i);
            this.f17455d = 0;
        }
        float f10 = 0.5f * this.f17457f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            C5293m c5293m = (C5293m) arrayList.get(i12);
            i11 += c5293m.f17448b;
            if (i11 >= f10) {
                return c5293m.f17449c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((C5293m) AbstractC17792x.m19532o(1, arrayList)).f17449c;
    }
}
