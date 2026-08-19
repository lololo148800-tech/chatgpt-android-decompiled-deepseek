package com.google.mlkit.vision.face.internal;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p331N6.C5676a;
import p501Ub.C7602d;
import p501Ub.C7604f;
import p571X9.AbstractC9353r;
import p571X9.C9341p;
import p571X9.C9377v;
import p704dc.C13062c;
import p704dc.C13063d;
import p704dc.C13067h;
import p890mb.C17204a;
import p890mb.C17212i;

/* JADX INFO: loaded from: classes.dex */
public class FaceRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C5676a c5676aM18942a = C17204a.m18942a(C13063d.class);
        c5676aM18942a.m6108d(C17212i.m18950a(C7604f.class));
        c5676aM18942a.f18435f = C13067h.f41508Z;
        C17204a c17204aM6109e = c5676aM18942a.m6109e();
        C5676a c5676aM18942a2 = C17204a.m18942a(C13062c.class);
        c5676aM18942a2.m6108d(C17212i.m18950a(C13063d.class));
        c5676aM18942a2.m6108d(C17212i.m18950a(C7602d.class));
        c5676aM18942a2.f18435f = C13067h.f41509o0;
        Object[] objArr = {c17204aM6109e, c5676aM18942a2.m6109e()};
        for (int i10 = 0; i10 < 2; i10++) {
            C9341p c9341p = AbstractC9353r.f28193Z;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        C9341p c9341p2 = AbstractC9353r.f28193Z;
        return new C9377v(2, objArr);
    }
}
