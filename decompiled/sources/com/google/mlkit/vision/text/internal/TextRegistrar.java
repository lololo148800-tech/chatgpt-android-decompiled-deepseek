package com.google.mlkit.vision.text.internal;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p331N6.C5676a;
import p501Ub.C7602d;
import p501Ub.C7604f;
import p594Y9.AbstractC9950q;
import p594Y9.C9938o;
import p594Y9.C9998y;
import p748fc.C13611c;
import p748fc.C13614f;
import p748fc.C13615g;
import p890mb.C17204a;
import p890mb.C17212i;

/* JADX INFO: loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C5676a c5676aM18942a = C17204a.m18942a(C13615g.class);
        c5676aM18942a.m6108d(C17212i.m18950a(C7604f.class));
        c5676aM18942a.f18435f = C13611c.f42999p0;
        C17204a c17204aM6109e = c5676aM18942a.m6109e();
        C5676a c5676aM18942a2 = C17204a.m18942a(C13614f.class);
        c5676aM18942a2.m6108d(C17212i.m18950a(C13615g.class));
        c5676aM18942a2.m6108d(C17212i.m18950a(C7602d.class));
        c5676aM18942a2.f18435f = C13611c.f43000q0;
        Object[] objArr = {c17204aM6109e, c5676aM18942a2.m6109e()};
        for (int i10 = 0; i10 < 2; i10++) {
            C9938o c9938o = AbstractC9950q.f29506Z;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        C9938o c9938o2 = AbstractC9950q.f29506Z;
        return new C9998y(2, objArr);
    }
}
