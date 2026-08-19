package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p1037ub.InterfaceC20182b;
import p1061vb.InterfaceC20515f;
import p1080wb.InterfaceC20854a;
import p1125yb.InterfaceC21398d;
import p117Eb.C2386p;
import p167Gb.C3031b;
import p331N6.C5676a;
import p522V8.InterfaceC7839f;
import p523V9.AbstractC7950N5;
import p832jb.C16187g;
import p890mb.C17204a;
import p890mb.C17212i;
import p890mb.C17220q;
import p890mb.InterfaceC17205b;
import p922ob.InterfaceC18036b;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C17220q c17220q, InterfaceC17205b interfaceC17205b) {
        C16187g c16187g = (C16187g) interfaceC17205b.mo12555a(C16187g.class);
        if (interfaceC17205b.mo12555a(InterfaceC20854a.class) == null) {
            return new FirebaseMessaging(c16187g, interfaceC17205b.mo12569o(C3031b.class), interfaceC17205b.mo12569o(InterfaceC20515f.class), (InterfaceC21398d) interfaceC17205b.mo12555a(InterfaceC21398d.class), interfaceC17205b.mo12575t(c17220q), (InterfaceC20182b) interfaceC17205b.mo12555a(InterfaceC20182b.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C17204a> getComponents() {
        C17220q c17220q = new C17220q(InterfaceC18036b.class, InterfaceC7839f.class);
        C5676a c5676aM18942a = C17204a.m18942a(FirebaseMessaging.class);
        c5676aM18942a.f18432c = LIBRARY_NAME;
        c5676aM18942a.m6108d(C17212i.m18950a(C16187g.class));
        c5676aM18942a.m6108d(new C17212i(0, 0, InterfaceC20854a.class));
        c5676aM18942a.m6108d(new C17212i(0, 1, C3031b.class));
        c5676aM18942a.m6108d(new C17212i(0, 1, InterfaceC20515f.class));
        c5676aM18942a.m6108d(C17212i.m18950a(InterfaceC21398d.class));
        c5676aM18942a.m6108d(new C17212i(c17220q, 0, 1));
        c5676aM18942a.m6108d(C17212i.m18950a(InterfaceC20182b.class));
        c5676aM18942a.f18435f = new C2386p(c17220q, 0);
        if (!(c5676aM18942a.f18430a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        c5676aM18942a.f18430a = 1;
        return Arrays.asList(c5676aM18942a.m6109e(), AbstractC7950N5.m8239a(LIBRARY_NAME, "24.1.0"));
    }
}
