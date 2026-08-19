package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p331N6.C5676a;
import p522V8.InterfaceC7839f;
import p523V9.AbstractC7950N5;
import p543W8.C8440a;
import p593Y8.C9691r;
import p849k7.C16349b;
import p890mb.C17204a;
import p890mb.C17212i;
import p890mb.C17220q;
import p890mb.InterfaceC17205b;
import p922ob.InterfaceC18035a;
import p922ob.InterfaceC18036b;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7839f lambda$getComponents$0(InterfaceC17205b interfaceC17205b) {
        C9691r.m10283b((Context) interfaceC17205b.mo12555a(Context.class));
        return C9691r.m10282a().m10284c(C8440a.f26278f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7839f lambda$getComponents$1(InterfaceC17205b interfaceC17205b) {
        C9691r.m10283b((Context) interfaceC17205b.mo12555a(Context.class));
        return C9691r.m10282a().m10284c(C8440a.f26278f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC7839f lambda$getComponents$2(InterfaceC17205b interfaceC17205b) {
        C9691r.m10283b((Context) interfaceC17205b.mo12555a(Context.class));
        return C9691r.m10282a().m10284c(C8440a.f26277e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C17204a> getComponents() {
        C5676a c5676aM18942a = C17204a.m18942a(InterfaceC7839f.class);
        c5676aM18942a.f18432c = LIBRARY_NAME;
        c5676aM18942a.m6108d(C17212i.m18950a(Context.class));
        c5676aM18942a.f18435f = new C16349b(13);
        C17204a c17204aM6109e = c5676aM18942a.m6109e();
        C5676a c5676aM18943b = C17204a.m18943b(new C17220q(InterfaceC18035a.class, InterfaceC7839f.class));
        c5676aM18943b.m6108d(C17212i.m18950a(Context.class));
        c5676aM18943b.f18435f = new C16349b(14);
        C17204a c17204aM6109e2 = c5676aM18943b.m6109e();
        C5676a c5676aM18943b2 = C17204a.m18943b(new C17220q(InterfaceC18036b.class, InterfaceC7839f.class));
        c5676aM18943b2.m6108d(C17212i.m18950a(Context.class));
        c5676aM18943b2.f18435f = new C16349b(15);
        return Arrays.asList(c17204aM6109e, c17204aM6109e2, c5676aM18943b2.m6109e(), AbstractC7950N5.m8239a(LIBRARY_NAME, "18.2.0"));
    }
}
