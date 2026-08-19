package com.google.mlkit.vision.common.internal;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p331N6.C5676a;
import p544W9.AbstractC8561T4;
import p544W9.C8549R4;
import p544W9.C8573V4;
import p664bc.AbstractC11336c;
import p664bc.C11337d;
import p890mb.C17204a;
import p890mb.C17212i;

/* JADX INFO: loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C5676a c5676aM18942a = C17204a.m18942a(C11337d.class);
        c5676aM18942a.m6108d(new C17212i(2, 0, AbstractC11336c.class));
        c5676aM18942a.f18435f = C11337d.f34276o0;
        Object[] objArr = {c5676aM18942a.m6109e()};
        for (int i10 = 0; i10 < 1; i10++) {
            C8549R4 c8549r4 = AbstractC8561T4.f26389Z;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        C8549R4 c8549r5 = AbstractC8561T4.f26389Z;
        return new C8573V4(1, objArr);
    }
}
