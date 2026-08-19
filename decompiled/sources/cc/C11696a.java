package cc;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import p310M9.C5311e;
import p571X9.C9127F0;
import p571X9.C9132G;
import p571X9.C9197Q4;
import p571X9.C9208S4;
import p571X9.C9244Y4;
import p571X9.C9370t4;

/* JADX INFO: renamed from: cc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11696a {

    /* JADX INFO: renamed from: a */
    public final Rect f35480a;

    /* JADX INFO: renamed from: b */
    public int f35481b;

    /* JADX INFO: renamed from: c */
    public final float f35482c;

    /* JADX INFO: renamed from: d */
    public final float f35483d;

    /* JADX INFO: renamed from: e */
    public final float f35484e;

    /* JADX INFO: renamed from: f */
    public final float f35485f;

    /* JADX INFO: renamed from: g */
    public final float f35486g;

    /* JADX INFO: renamed from: h */
    public final float f35487h;

    /* JADX INFO: renamed from: i */
    public final SparseArray f35488i = new SparseArray();

    /* JADX INFO: renamed from: j */
    public final SparseArray f35489j = new SparseArray();

    public C11696a(C9127F0 c9127f0) {
        float f10 = c9127f0.f27894o0;
        float f11 = c9127f0.f27896q0 / 2.0f;
        float f12 = c9127f0.f27897r0 / 2.0f;
        float f13 = c9127f0.f27895p0;
        this.f35480a = new Rect((int) (f10 - f11), (int) (f13 - f12), (int) (f10 + f11), (int) (f13 + f12));
        this.f35481b = c9127f0.f27893Z;
        for (C9370t4 c9370t4 : c9127f0.f27901v0) {
            if (m13029a(c9370t4.f28229p0)) {
                PointF pointF = new PointF(c9370t4.f28227Z, c9370t4.f28228o0);
                SparseArray sparseArray = this.f35488i;
                int i10 = c9370t4.f28229p0;
                sparseArray.put(i10, new C11700e(i10, pointF));
            }
        }
        for (C9132G c9132g : c9127f0.f27905z0) {
            int i11 = c9132g.f27908Z;
            if (i11 <= 15 && i11 > 0) {
                PointF[] pointFArr = c9132g.f27907Y;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j10 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j10 > 2147483647L ? Integer.MAX_VALUE : (int) j10);
                Collections.addAll(arrayList, pointFArr);
                this.f35489j.put(i11, new C11697b(i11, arrayList));
            }
        }
        this.f35485f = c9127f0.f27900u0;
        this.f35486g = c9127f0.f27898s0;
        this.f35487h = c9127f0.f27899t0;
        this.f35484e = c9127f0.f27904y0;
        this.f35483d = c9127f0.f27902w0;
        this.f35482c = c9127f0.f27903x0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13029a(int i10) {
        return i10 == 0 || i10 == 1 || i10 == 7 || i10 == 3 || i10 == 9 || i10 == 4 || i10 == 10 || i10 == 5 || i10 == 11 || i10 == 6;
    }

    public final String toString() {
        C5311e c5311e = new C5311e("Face", 17);
        c5311e.m5851F(this.f35480a, "boundingBox");
        c5311e.m5850E(this.f35481b, "trackingId");
        c5311e.m5847B("rightEyeOpenProbability", this.f35482c);
        c5311e.m5847B("leftEyeOpenProbability", this.f35483d);
        c5311e.m5847B("smileProbability", this.f35484e);
        c5311e.m5847B("eulerX", this.f35485f);
        c5311e.m5847B("eulerY", this.f35486g);
        c5311e.m5847B("eulerZ", this.f35487h);
        C5311e c5311e2 = new C5311e("Landmarks", 17);
        for (int i10 = 0; i10 <= 11; i10++) {
            if (m13029a(i10)) {
                c5311e2.m5851F((C11700e) this.f35488i.get(i10), AbstractC10763a.m11048f(i10, "landmark_"));
            }
        }
        c5311e.m5851F(c5311e2.toString(), "landmarks");
        C5311e c5311e3 = new C5311e("Contours", 17);
        for (int i11 = 1; i11 <= 15; i11++) {
            c5311e3.m5851F((C11697b) this.f35489j.get(i11), AbstractC10763a.m11048f(i11, "Contour_"));
        }
        c5311e.m5851F(c5311e3.toString(), "contours");
        return c5311e.toString();
    }

    public C11696a(C9208S4 c9208s4) {
        this.f35480a = c9208s4.f28002Z;
        this.f35481b = c9208s4.f28001Y;
        for (C9244Y4 c9244y4 : c9208s4.f28010v0) {
            if (m13029a(c9244y4.f28030Y)) {
                SparseArray sparseArray = this.f35488i;
                int i10 = c9244y4.f28030Y;
                sparseArray.put(i10, new C11700e(i10, c9244y4.f28031Z));
            }
        }
        for (C9197Q4 c9197q4 : c9208s4.f28011w0) {
            int i11 = c9197q4.f27985Y;
            if (i11 <= 15 && i11 > 0) {
                ArrayList arrayList = c9197q4.f27986Z;
                arrayList.getClass();
                this.f35489j.put(i11, new C11697b(i11, new ArrayList(arrayList)));
            }
        }
        this.f35485f = c9208s4.f28005q0;
        this.f35486g = c9208s4.f28004p0;
        this.f35487h = -c9208s4.f28003o0;
        this.f35484e = c9208s4.f28008t0;
        this.f35483d = c9208s4.f28006r0;
        this.f35482c = c9208s4.f28007s0;
    }
}
