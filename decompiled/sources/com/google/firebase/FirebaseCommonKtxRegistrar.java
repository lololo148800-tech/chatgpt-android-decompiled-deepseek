package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import lb.InterfaceC16837a;
import lb.InterfaceC16838b;
import lb.InterfaceC16839c;
import lb.InterfaceC16840d;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0563B;
import p331N6.C5676a;
import p832jb.C16188h;
import p890mb.C17204a;
import p890mb.C17212i;
import p890mb.C17220q;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18067d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lmb/a;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C17204a> getComponents() {
        C5676a c5676aM18943b = C17204a.m18943b(new C17220q(InterfaceC16837a.class, AbstractC0563B.class));
        c5676aM18943b.m6108d(new C17212i(new C17220q(InterfaceC16837a.class, Executor.class), 1, 0));
        c5676aM18943b.f18435f = C16188h.f50244Z;
        C17204a c17204aM6109e = c5676aM18943b.m6109e();
        C5676a c5676aM18943b2 = C17204a.m18943b(new C17220q(InterfaceC16839c.class, AbstractC0563B.class));
        c5676aM18943b2.m6108d(new C17212i(new C17220q(InterfaceC16839c.class, Executor.class), 1, 0));
        c5676aM18943b2.f18435f = C16188h.f50245o0;
        C17204a c17204aM6109e2 = c5676aM18943b2.m6109e();
        C5676a c5676aM18943b3 = C17204a.m18943b(new C17220q(InterfaceC16838b.class, AbstractC0563B.class));
        c5676aM18943b3.m6108d(new C17212i(new C17220q(InterfaceC16838b.class, Executor.class), 1, 0));
        c5676aM18943b3.f18435f = C16188h.f50246p0;
        C17204a c17204aM6109e3 = c5676aM18943b3.m6109e();
        C5676a c5676aM18943b4 = C17204a.m18943b(new C17220q(InterfaceC16840d.class, AbstractC0563B.class));
        c5676aM18943b4.m6108d(new C17212i(new C17220q(InterfaceC16840d.class, Executor.class), 1, 0));
        c5676aM18943b4.f18435f = C16188h.f50247q0;
        return AbstractC17681o.m19382k(c17204aM6109e, c17204aM6109e2, c17204aM6109e3, c5676aM18943b4.m6109e());
    }
}
