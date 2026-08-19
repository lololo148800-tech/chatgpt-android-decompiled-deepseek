package co;

import ao.C11196w;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p003A1.C0295v;

/* JADX INFO: renamed from: co.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C11824n {

    /* JADX INFO: renamed from: a */
    public final C11196w f35833a;

    /* JADX INFO: renamed from: b */
    public boolean f35834b;

    public C11824n(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        this.f35833a = new C11196w(descriptor, new C0295v(2, this, C11824n.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 8));
    }
}
