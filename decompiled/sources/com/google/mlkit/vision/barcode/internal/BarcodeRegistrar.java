package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p331N6.C5676a;
import p501Ub.C7602d;
import p501Ub.C7604f;
import p523V9.AbstractC7864D;
import p619Zb.C10270c;
import p619Zb.C10271d;
import p619Zb.C10272e;
import p890mb.C17204a;
import p890mb.C17212i;

/* JADX INFO: loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C5676a c5676aM18942a = C17204a.m18942a(C10272e.class);
        c5676aM18942a.m6108d(C17212i.m18950a(C7604f.class));
        c5676aM18942a.f18435f = C10270c.f30504Z;
        C17204a c17204aM6109e = c5676aM18942a.m6109e();
        C5676a c5676aM18942a2 = C17204a.m18942a(C10271d.class);
        c5676aM18942a2.m6108d(C17212i.m18950a(C10272e.class));
        c5676aM18942a2.m6108d(C17212i.m18950a(C7602d.class));
        c5676aM18942a2.f18435f = C10270c.f30505o0;
        return AbstractC7864D.m8142q(c17204aM6109e, c5676aM18942a2.m6109e());
    }
}
