package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import lb.InterfaceC16837a;
import lb.InterfaceC16838b;
import p083D3.C1864b;
import p1061vb.C20513d;
import p1061vb.InterfaceC20514e;
import p1125yb.C21397c;
import p1125yb.InterfaceC21398d;
import p331N6.C5676a;
import p523V9.AbstractC7950N5;
import p832jb.C16187g;
import p849k7.C16349b;
import p890mb.C17204a;
import p890mb.C17212i;
import p890mb.C17220q;
import p890mb.InterfaceC17205b;
import p904nb.ExecutorC17552i;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC21398d lambda$getComponents$0(InterfaceC17205b interfaceC17205b) {
        return new C21397c((C16187g) interfaceC17205b.mo12555a(C16187g.class), interfaceC17205b.mo12569o(InterfaceC20514e.class), (ExecutorService) interfaceC17205b.mo12534C(new C17220q(InterfaceC16837a.class, ExecutorService.class)), new ExecutorC17552i((Executor) interfaceC17205b.mo12534C(new C17220q(InterfaceC16838b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C17204a> getComponents() {
        C5676a c5676aM18942a = C17204a.m18942a(InterfaceC21398d.class);
        c5676aM18942a.f18432c = LIBRARY_NAME;
        c5676aM18942a.m6108d(C17212i.m18950a(C16187g.class));
        c5676aM18942a.m6108d(new C17212i(0, 1, InterfaceC20514e.class));
        c5676aM18942a.m6108d(new C17212i(new C17220q(InterfaceC16837a.class, ExecutorService.class), 1, 0));
        c5676aM18942a.m6108d(new C17212i(new C17220q(InterfaceC16838b.class, Executor.class), 1, 0));
        c5676aM18942a.f18435f = new C16349b(18);
        C17204a c17204aM6109e = c5676aM18942a.m6109e();
        C20513d c20513d = new C20513d();
        C5676a c5676aM18942a2 = C17204a.m18942a(C20513d.class);
        c5676aM18942a2.f18431b = 1;
        c5676aM18942a2.f18435f = new C1864b(c20513d);
        return Arrays.asList(c17204aM6109e, c5676aM18942a2.m6109e(), AbstractC7950N5.m8239a(LIBRARY_NAME, "17.2.0"));
    }
}
